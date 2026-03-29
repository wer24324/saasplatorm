package com.audit.system.authority.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.TreeMapper;
import com.audit.system.api.authority.domain.dto.SysMenuDto;
import com.audit.system.api.authority.domain.po.SysMenuPo;
import com.audit.system.api.authority.domain.query.SysMenuQuery;

/**
 * 菜单管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface SysMenuMapper extends TreeMapper<SysMenuQuery, SysMenuDto, SysMenuPo> {
}
