package com.audit.system.api.organize.domain.dto;

import com.audit.system.api.authority.domain.dto.SysRoleDto;
import com.audit.system.api.organize.domain.merge.MergeGroup;
import com.audit.system.api.organize.domain.po.SysDeptPo;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.constant.basic.OperateConstants;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;

/**
 * 部门 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysDeptDto extends SysDeptPo {


    private static final long serialVersionUID = 1L;

    /** 角色对象 */
    private List<SysRoleDto> roles;

    /** 角色组 */
    private Long[] roleIds;

    /** 部门数据 */
    @Correlation(groupName = MergeGroup.DEPT_SysPost_GROUP, keyType = OperateConstants.SubKeyType.RECEIVE)
    private List<SysPostDto> subList;

}
