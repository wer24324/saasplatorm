package com.audit.tenant.api.tenant.domain.model;

import com.audit.tenant.api.tenant.domain.dto.TeTenantDto;
import com.audit.tenant.api.tenant.domain.query.TeTenantQuery;
import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.tenant.api.tenant.domain.po.TeTenantPo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 租户 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TeTenantConverter extends BaseConverter<TeTenantQuery, TeTenantDto, TeTenantPo> {
}
