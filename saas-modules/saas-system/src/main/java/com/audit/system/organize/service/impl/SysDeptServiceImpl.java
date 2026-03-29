package com.audit.system.organize.service.impl;

import com.audit.common.core.constant.basic.BaseConstants;
import com.audit.common.core.utils.core.ObjectUtil;
import com.audit.common.datascope.annotation.DataScope;
import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.service.impl.TreeServiceImpl;
import com.audit.system.api.organize.domain.dto.SysDeptDto;
import com.audit.system.api.organize.domain.query.SysDeptQuery;
import com.audit.system.organize.manager.ISysDeptManager;
import com.audit.system.organize.service.ISysDeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 部门管理 服务层处理
 *
 * @author zerozhang
 */
@Service
@Isolate
public class SysDeptServiceImpl extends TreeServiceImpl<SysDeptQuery, SysDeptDto, ISysDeptManager> implements ISysDeptService {

    /**
     * 新增部门 | 内部调用
     *
     * @param dept 部门对象
     * @return 结果
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int addInner(SysDeptDto dept) {
        return super.insert(dept);
    }

    /**
     * 查询部门对象列表 | 数据权限 | 附加数据
     *
     * @param dept 部门对象
     * @return 部门对象集合
     */
    @Override
    @DataScope(deptAlias = "id", mapperScope = {"SysDeptMapper"})
    public List<SysDeptDto> selectListScope(SysDeptQuery dept) {
        return baseManager.selectList(dept);
    }

    /**
     * 校验部门编码是否唯一
     *
     * @param Id   部门Id
     * @param code 部门编码
     * @return 结果 | true/false 唯一/不唯一
     */
    @Override
    public boolean checkDeptCodeUnique(Long Id, String code) {
        return ObjectUtil.isNotNull(baseManager.checkDeptCodeUnique(ObjectUtil.isNull(Id) ? BaseConstants.NONE_ID : Id, code));
    }

}
