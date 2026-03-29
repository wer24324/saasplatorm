package com.audit.system.api.organize.domain.model;

import com.audit.system.api.organize.domain.po.SysPostPo;
import com.audit.system.api.organize.domain.query.SysPostQuery;
import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.system.api.organize.domain.dto.SysPostDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 岗位 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysPostConverter extends BaseConverter<SysPostQuery, SysPostDto, SysPostPo> {
}
