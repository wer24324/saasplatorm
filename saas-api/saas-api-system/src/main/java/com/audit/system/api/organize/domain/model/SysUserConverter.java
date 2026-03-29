package com.audit.system.api.organize.domain.model;

import com.audit.system.api.organize.domain.po.SysUserPo;
import com.audit.system.api.organize.domain.query.SysUserQuery;
import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.system.api.organize.domain.dto.SysUserDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 用户 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysUserConverter extends BaseConverter<SysUserQuery, SysUserDto, SysUserPo> {
}
