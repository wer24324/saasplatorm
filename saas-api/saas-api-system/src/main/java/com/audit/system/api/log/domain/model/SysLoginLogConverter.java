package com.audit.system.api.log.domain.model;

import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.system.api.log.domain.dto.SysLoginLogDto;
import com.audit.system.api.log.domain.po.SysLoginLogPo;
import com.audit.system.api.log.domain.query.SysLoginLogQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 访问日志 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysLoginLogConverter extends BaseConverter<SysLoginLogQuery, SysLoginLogDto, SysLoginLogPo> {
}
