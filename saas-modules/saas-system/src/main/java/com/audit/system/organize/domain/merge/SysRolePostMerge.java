package com.audit.system.organize.domain.merge;

import com.baomidou.mybatisplus.annotation.TableName;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.annotation.Correlations;
import com.audit.common.core.constant.basic.OperateConstants;
import com.audit.common.core.web.tenant.base.TBasisEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



import static com.audit.system.api.authority.domain.merge.MergeGroup.ROLE_SysRolePostMerge_GROUP;
import static com.audit.system.api.organize.domain.merge.MergeGroup.POST_SysRolePostMerge_GROUP;

/**
 * 角色-岗位关联（权限范围） 持久化对象
 *
 * @author zerozhang
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("sys_role_post_merge")
public class SysRolePostMerge extends TBasisEntity {

    
    private static final long serialVersionUID = 1L;

    /** 角色Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysRolePostMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN),
            @Correlation(groupName = POST_SysRolePostMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE)
    })
    private Long roleId;

    /** 岗位Id */
    @Correlations({
            @Correlation(groupName = ROLE_SysRolePostMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE),
            @Correlation(groupName = POST_SysRolePostMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN)
    })
    private Long postId;

    public SysRolePostMerge(Long roleId, Long postId) {
        this.roleId = roleId;
        this.postId = postId;
    }

}
