package com.audit.system.api.authority.domain.model;

import com.audit.system.api.authority.domain.dto.SysModuleDto;
import com.audit.system.api.authority.domain.po.SysModulePo;
import com.audit.system.api.authority.domain.query.SysModuleQuery;
import com.audit.common.core.web.entity.model.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 模块 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysModuleConverter extends BaseConverter<SysModuleQuery, SysModuleDto, SysModulePo> {
}
