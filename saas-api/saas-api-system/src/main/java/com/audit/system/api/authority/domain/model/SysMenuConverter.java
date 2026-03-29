package com.audit.system.api.authority.domain.model;

import com.audit.system.api.authority.domain.dto.SysMenuDto;
import com.audit.system.api.authority.domain.po.SysMenuPo;
import com.audit.system.api.authority.domain.query.SysMenuQuery;
import com.audit.common.core.web.entity.model.TreeConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 菜单 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysMenuConverter extends TreeConverter<SysMenuQuery, SysMenuDto, SysMenuPo> {
}
