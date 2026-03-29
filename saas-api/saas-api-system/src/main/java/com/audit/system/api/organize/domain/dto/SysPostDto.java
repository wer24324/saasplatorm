package com.audit.system.api.organize.domain.dto;

import com.audit.system.api.authority.domain.dto.SysRoleDto;
import com.audit.system.api.organize.domain.po.SysPostPo;
import com.audit.common.core.annotation.Excel;
import com.audit.common.core.annotation.Excel.Type;
import com.audit.common.core.annotation.Excels;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;

/**
 * 岗位 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysPostDto extends SysPostPo {

    
    private static final long serialVersionUID = 1L;

    /** 部门对象 */
    @Excels({
            @Excel(name = "部门名称", targetAttr = "deptName", type = Type.EXPORT),
            @Excel(name = "部门负责人", targetAttr = "leader", type = Type.EXPORT),
            @Excel(name = "部门编码(*)", targetAttr = "deptCode", type = Type.IMPORT)
    })
    private SysDeptDto dept;

    /** 角色对象 */
    private List<SysRoleDto> roles;

    /** 角色组 */
    private Long[] roleIds;

}
