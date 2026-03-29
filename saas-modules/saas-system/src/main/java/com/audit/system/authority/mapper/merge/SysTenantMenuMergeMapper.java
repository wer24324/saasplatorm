package com.audit.system.authority.mapper.merge;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BasicMapper;
import com.audit.system.authority.domain.merge.SysTenantMenuMerge;

/**
 * 租户-菜单关联 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysTenantMenuMergeMapper extends BasicMapper<SysTenantMenuMerge> {
}
