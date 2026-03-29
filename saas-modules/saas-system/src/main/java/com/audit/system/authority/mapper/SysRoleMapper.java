package com.audit.system.authority.mapper;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.authority.domain.dto.SysRoleDto;
import com.audit.system.api.authority.domain.po.SysRolePo;
import com.audit.system.api.authority.domain.query.SysRoleQuery;

/**
 * 岗位管理 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysRoleMapper extends BaseMapper<SysRoleQuery, SysRoleDto, SysRolePo> {
}
