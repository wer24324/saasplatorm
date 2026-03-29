package com.audit.system.authority.domain.merge;

import com.baomidou.mybatisplus.annotation.TableName;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.annotation.Correlations;
import com.audit.common.core.constant.basic.OperateConstants;
import com.audit.common.core.web.tenant.base.TBasisEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



import static com.audit.system.api.authority.domain.merge.MergeGroup.MODULE_SysRoleModuleMerge_GROUP;
import static com.audit.system.api.authority.domain.merge.MergeGroup.ROLE_SysRoleModuleMerge_GROUP;

/**
 * 角色-模块关联 持久化对象
 *
 * @author zerozhang
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("sys_role_module_merge")
public class SysRoleModuleMerge extends TBasisEntity {

    
    private static final long serialVersionUID = 1L;

    /** 角色Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysRoleModuleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN),
            @Correlation(groupName = MODULE_SysRoleModuleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE)
    })
    private Long roleId;

    /** 模块Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysRoleModuleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE),
            @Correlation(groupName = MODULE_SysRoleModuleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN)
    })
    private Long moduleId;

    public SysRoleModuleMerge(Long roleId, Long moduleId) {
        this.roleId = roleId;
        this.moduleId = moduleId;
    }

}
