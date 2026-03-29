package com.audit.system.authority.domain.merge;

import com.baomidou.mybatisplus.annotation.TableName;
import com.audit.common.core.web.tenant.base.TBasisEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



/**
 * 租户-菜单关联 持久化对象
 *
 * @author zerozhang
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("sys_tenant_menu_merge")
public class SysTenantMenuMerge extends TBasisEntity {

    
    private static final long serialVersionUID = 1L;

    /** 菜单Id */
    private Long menuId;

    public SysTenantMenuMerge(Long menuId) {
        this.menuId = menuId;
    }

}
