package com.audit.gen.domain.model;

import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.gen.domain.dto.GenTableDto;
import com.audit.gen.domain.po.GenTablePo;
import com.audit.gen.domain.query.GenTableQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 业务 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GenTableConverter extends BaseConverter<GenTableQuery, GenTableDto, GenTablePo> {
}
