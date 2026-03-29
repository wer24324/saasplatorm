package com.audit.tenant.tenant.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.tenant.api.tenant.domain.dto.TeTenantDto;
import com.audit.tenant.api.tenant.domain.po.TeTenantPo;
import com.audit.tenant.api.tenant.domain.query.TeTenantQuery;

/**
 * 租户管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface TeTenantMapper extends BaseMapper<TeTenantQuery, TeTenantDto, TeTenantPo> {
}
