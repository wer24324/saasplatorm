package com.audit.system.api.organize.domain.query;

import com.audit.system.api.organize.domain.po.SysUserPo;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 用户 数据查询对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserQuery extends SysUserPo {

    
    private static final long serialVersionUID = 1L;

    /** 岗位Id - 查询 */
    private Long postId;

    /** 部门Id - 查询 */
    private Long deptId;
}
