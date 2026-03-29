package com.audit.system.authority.service.impl;

import com.audit.common.datascope.annotation.DataScope;
import com.audit.common.web.entity.service.impl.BaseServiceImpl;
import com.audit.system.api.authority.domain.dto.SysModuleDto;
import com.audit.system.api.authority.domain.query.SysModuleQuery;
import com.audit.system.authority.manager.ISysModuleManager;
import com.audit.system.authority.service.ISysModuleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

import static com.audit.common.core.constant.basic.SecurityConstants.CREATE_BY;

/**
 * 模块管理 服务层处理
 *
 * @author zerozhang
 */
@Service
public class SysModuleServiceImpl extends BaseServiceImpl<SysModuleQuery, SysModuleDto, ISysModuleManager> implements ISysModuleService {

    /**
     * 当前用户首页可展示的模块路由
     *
     * @param roleIds 角色Ids
     * @return 模块集合
     */
    @Override
    public List<SysModuleDto> getRoutes(Set<Long> roleIds) {
        return baseManager.getRoutes(roleIds);
    }

    /**
     * 查询模块对象列表 | 数据权限 | 附加数据
     *
     * @param module 模块对象
     * @return 模块对象集合
     */
    @Override
    @DataScope(userAlias = CREATE_BY, mapperScope = {"SysModuleMapper"})
    public List<SysModuleDto> selectListScope(SysModuleQuery module) {
        return baseManager.selectList(module);
    }

}
