package com.audit.tenant.api.tenant.domain.model;

import com.audit.tenant.api.tenant.domain.dto.TeStrategyDto;
import com.audit.tenant.api.tenant.domain.query.TeStrategyQuery;
import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.tenant.api.tenant.domain.po.TeStrategyPo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 数据源策略 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TeStrategyConverter extends BaseConverter<TeStrategyQuery, TeStrategyDto, TeStrategyPo> {
}
