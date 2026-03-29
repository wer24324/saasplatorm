package com.audit.system.authority.mapper.merge;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BasicMapper;
import com.audit.system.authority.domain.merge.SysTenantModuleMerge;

/**
 * 租户-模块关联 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysTenantModuleMergeMapper extends BasicMapper<SysTenantModuleMerge> {
}
