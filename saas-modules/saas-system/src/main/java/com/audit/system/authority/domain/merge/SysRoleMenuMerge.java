package com.audit.system.authority.domain.merge;

import com.baomidou.mybatisplus.annotation.TableName;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.annotation.Correlations;
import com.audit.common.core.constant.basic.OperateConstants;
import com.audit.common.core.web.tenant.base.TBasisEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



import static com.audit.system.api.authority.domain.merge.MergeGroup.MENU_SysRoleMenuMerge_GROUP;
import static com.audit.system.api.authority.domain.merge.MergeGroup.ROLE_SysRoleMenuMerge_GROUP;

/**
 * 角色-菜单关联 持久化对象
 *
 * @author zerozhang
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("sys_role_menu_merge")
public class SysRoleMenuMerge extends TBasisEntity {

    
    private static final long serialVersionUID = 1L;

    /** 角色Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysRoleMenuMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN),
            @Correlation(groupName = MENU_SysRoleMenuMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE)
    })
    private Long roleId;

    /** 菜单Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysRoleMenuMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE),
            @Correlation(groupName = MENU_SysRoleMenuMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN)
    })
    private Long menuId;

    public SysRoleMenuMerge(Long roleId, Long menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

}
