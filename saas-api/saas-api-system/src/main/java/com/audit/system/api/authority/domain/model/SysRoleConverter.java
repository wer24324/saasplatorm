package com.audit.system.api.authority.domain.model;

import com.audit.system.api.authority.domain.dto.SysRoleDto;
import com.audit.system.api.authority.domain.po.SysRolePo;
import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.system.api.authority.domain.query.SysRoleQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 角色 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysRoleConverter extends BaseConverter<SysRoleQuery, SysRoleDto, SysRolePo> {
}
