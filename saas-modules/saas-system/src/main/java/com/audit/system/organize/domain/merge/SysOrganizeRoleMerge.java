package com.audit.system.organize.domain.merge;

import com.baomidou.mybatisplus.annotation.TableName;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.annotation.Correlations;
import com.audit.common.core.constant.basic.OperateConstants;
import com.audit.common.core.constant.system.OrganizeConstants;
import com.audit.common.core.web.tenant.base.TBasisEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



import static com.audit.system.api.authority.domain.merge.MergeGroup.*;
import static com.audit.system.api.organize.domain.merge.MergeGroup.*;

/**
 * 组织-角色关联（角色绑定） 持久化对象
 *
 * @author zerozhang
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("sys_organize_role_merge")
public class SysOrganizeRoleMerge extends TBasisEntity {


    private static final long serialVersionUID = 1L;

    /** 部门Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysOrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE),
            @Correlation(groupName = DEPT_OrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN)
    })
    private Long deptId;

    /** 岗位Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysOrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE),
            @Correlation(groupName = POST_OrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN)
    })
    private Long postId;

    /** 用户Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysOrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE),
            @Correlation(groupName = USER_OrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN)
    })
    private Long userId;

    /** 角色Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysOrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN),
            @Correlation(groupName = DEPT_OrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE),
            @Correlation(groupName = POST_OrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE),
            @Correlation(groupName = USER_OrganizeRoleMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE)
    })
    private Long roleId;

    public SysOrganizeRoleMerge(Long organizeId, Long roleId, OrganizeConstants.OrganizeType organizeType) {
        switch (organizeType) {
            case DEPT :
                this.deptId = organizeId;
                break;
            case POST :
                this.postId = organizeId;
                break;
            case USER :
                this.userId = organizeId;
                break;
            default:
        }
        this.roleId = roleId;
    }

}
