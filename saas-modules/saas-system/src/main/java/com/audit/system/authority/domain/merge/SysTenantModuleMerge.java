package com.audit.system.authority.domain.merge;

import com.baomidou.mybatisplus.annotation.TableName;
import com.audit.common.core.web.tenant.base.TBasisEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



/**
 * 租户-模块关联 持久化对象
 *
 * @author zerozhang
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("sys_tenant_module_merge")
public class SysTenantModuleMerge extends TBasisEntity {


    private static final long serialVersionUID = 1L;

    /** 模块Id */
    private Long moduleId;

    public SysTenantModuleMerge(Long moduleId) {
        this.moduleId = moduleId;
    }

}
