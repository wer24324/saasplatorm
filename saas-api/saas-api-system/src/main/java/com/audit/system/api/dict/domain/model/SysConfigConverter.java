package com.audit.system.api.dict.domain.model;

import com.audit.system.api.dict.domain.dto.SysConfigDto;
import com.audit.system.api.dict.domain.po.SysConfigPo;
import com.audit.system.api.dict.domain.query.SysConfigQuery;
import com.audit.common.core.web.entity.model.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 参数配置 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysConfigConverter extends BaseConverter<SysConfigQuery, SysConfigDto, SysConfigPo> {
}
