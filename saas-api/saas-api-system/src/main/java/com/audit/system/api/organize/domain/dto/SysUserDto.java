package com.audit.system.api.organize.domain.dto;

import com.audit.system.api.authority.domain.dto.SysRoleDto;
import com.audit.system.api.organize.domain.merge.MergeGroup;
import com.audit.system.api.organize.domain.po.SysUserPo;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.constant.basic.OperateConstants;
import com.audit.common.core.constant.system.AuthorityConstants;
import com.audit.common.core.utils.core.StrUtil;
import com.audit.common.core.web.validate.V_A_E;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

import java.util.List;

/**
 * 用户 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserDto extends SysUserPo {

    
    private static final long serialVersionUID = 1L;

    /** 岗位对象 */
    @Correlation(groupName = MergeGroup.USER_SysUserPostMerge_GROUP, keyType = OperateConstants.SubKeyType.RECEIVE)
    private List<SysPostDto> posts;

    /** 角色对象 */
    private List<SysRoleDto> roles;

    /** 岗位组 */
    @NotEmpty(message = "归属岗位不能为空", groups = {V_A_E.class})
    @Correlation(groupName = MergeGroup.USER_SysUserPostMerge_GROUP, keyType = OperateConstants.SubKeyType.RECEIVE_ARR)
    private Long[] postIds;

    /** 角色组 */
    private Long[] roleIds;

    public boolean isNotAdmin() {
        return !isAdmin(this.getUserType());
    }

    public boolean isAdmin() {
        return isAdmin(this.getUserType());
    }

    public static boolean isNotAdmin(String userType) {
        return !isAdmin(userType);
    }

    public static boolean isAdmin(String userType) {
        return StrUtil.equals(AuthorityConstants.UserType.ADMIN.getCode(), userType);
    }

}
