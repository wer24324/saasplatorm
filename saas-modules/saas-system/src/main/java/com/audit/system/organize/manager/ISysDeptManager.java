package com.audit.system.organize.manager;

import com.audit.common.web.entity.manager.ITreeManager;
import com.audit.system.api.organize.domain.dto.SysDeptDto;
import com.audit.system.api.organize.domain.query.SysDeptQuery;

/**
 * 部门管理 数据封装层
 *
 * @author zerozhang
 */
public interface ISysDeptManager extends ITreeManager<SysDeptQuery, SysDeptDto> {

    /**
     * 校验部门编码是否唯一
     *
     * @param Id   部门Id
     * @param code 部门编码
     * @return 部门对象
     */
    SysDeptDto checkDeptCodeUnique(Long Id, String code);
}
