package com.audit.gen.domain.model;

import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.gen.domain.dto.GenTableColumnDto;
import com.audit.gen.domain.po.GenTableColumnPo;
import com.audit.gen.domain.query.GenTableColumnQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 业务字段 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GenTableColumnConverter extends BaseConverter<GenTableColumnQuery, GenTableColumnDto, GenTableColumnPo> {
}
