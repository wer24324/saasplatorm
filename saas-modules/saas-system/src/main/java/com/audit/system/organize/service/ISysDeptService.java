package com.audit.system.organize.service;

import com.audit.common.web.entity.service.ITreeService;
import com.audit.system.api.organize.domain.dto.SysDeptDto;
import com.audit.system.api.organize.domain.query.SysDeptQuery;

/**
 * 部门管理 服务层
 *
 * @author zerozhang
 */
public interface ISysDeptService extends ITreeService<SysDeptQuery, SysDeptDto> {

    /**
     * 新增部门 | 内部调用
     *
     * @param dept 部门对象
     * @return 结果
     */
    int addInner(SysDeptDto dept);

    /**
     * 校验部门编码是否唯一
     *
     * @param Id   部门Id
     * @param code 部门编码
     * @return 结果 | true/false 唯一/不唯一
     */
    boolean checkDeptCodeUnique(Long Id, String code);
}
