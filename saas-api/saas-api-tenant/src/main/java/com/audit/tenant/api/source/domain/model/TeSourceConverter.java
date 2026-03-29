package com.audit.tenant.api.source.domain.model;

import com.audit.tenant.api.source.domain.dto.TeSourceDto;
import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.tenant.api.source.domain.po.TeSourcePo;
import com.audit.tenant.api.source.domain.query.TeSourceQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 数据源 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TeSourceConverter extends BaseConverter<TeSourceQuery, TeSourceDto, TeSourcePo> {
}
