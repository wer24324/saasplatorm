package com.audit.system.authority.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.system.api.authority.domain.dto.SysModuleDto;
import com.audit.system.api.authority.domain.query.SysModuleQuery;

import java.util.List;
import java.util.Set;

/**
 * 模块管理 服务层
 *
 * @author zerozhang
 */
public interface ISysModuleService extends IBaseService<SysModuleQuery, SysModuleDto> {

    /**
     * 当前用户首页可展示的模块路由
     *
     * @param roleIds 角色Ids
     * @return 模块集合
     */
    List<SysModuleDto> getRoutes(Set<Long> roleIds);
}
