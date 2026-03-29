package com.audit.system.organize.domain.merge;

import com.baomidou.mybatisplus.annotation.TableName;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.annotation.Correlations;
import com.audit.common.core.constant.basic.OperateConstants;
import com.audit.common.core.web.tenant.base.TBasisEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



import static com.audit.system.api.organize.domain.merge.MergeGroup.POST_SysUserPostMerge_GROUP;
import static com.audit.system.api.organize.domain.merge.MergeGroup.USER_SysUserPostMerge_GROUP;

/**
 * 用户-岗位关联 持久化对象
 *
 * @author zerozhang
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("sys_user_post_merge")
public class SysUserPostMerge extends TBasisEntity {

    
    private static final long serialVersionUID = 1L;

    /** 用户Id */
    @Correlations({
            @Correlation(groupName = USER_SysUserPostMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN),
            @Correlation(groupName = POST_SysUserPostMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE)
    })
    private Long userId;

    /** 岗位Id */
    @Correlations({
            @Correlation(groupName = USER_SysUserPostMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_SLAVE),
            @Correlation(groupName = POST_SysUserPostMerge_GROUP, keyType = OperateConstants.SubKeyType.MERGE_MAIN)
    })
    private Long postId;

    public SysUserPostMerge(Long userId, Long postId) {
        this.userId = userId;
        this.postId = postId;
    }

}
