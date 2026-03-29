package com.audit.system.authority.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.authority.domain.dto.SysModuleDto;
import com.audit.system.api.authority.domain.po.SysModulePo;
import com.audit.system.api.authority.domain.query.SysModuleQuery;

/**
 * 角色管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface SysModuleMapper extends BaseMapper<SysModuleQuery, SysModuleDto, SysModulePo> {
}
