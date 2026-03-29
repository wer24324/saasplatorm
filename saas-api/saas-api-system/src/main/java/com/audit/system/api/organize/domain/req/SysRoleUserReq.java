package com.audit.system.api.organize.domain.req;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询角色下所有用户（直接关联的用户，不是通过岗位，部门间接关联的）请求参数对象
 *
 * @author zerozhang
 */
@Data
@NoArgsConstructor
public class SysRoleUserReq {

    /** 角色id */
    private Long roleId;

    /** 角色名称模糊搜索 */
    private String roleNameLike;

    /** 角色code模糊搜索 */
    private String roleCodeLike;

    private Long offset = 0L;

    private Long size= 10L;
}
