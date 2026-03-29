package com.audit.tenant.tenant.manager;

import com.audit.common.web.entity.manager.IBaseManager;
import com.audit.tenant.api.tenant.domain.dto.TeStrategyDto;
import com.audit.tenant.api.tenant.domain.query.TeStrategyQuery;


/**
 * 数据源策略管理 数据封装层
 *
 * @author zerozhang
 */
public interface ITeStrategyManager extends IBaseManager<TeStrategyQuery, TeStrategyDto> {

    /**
     * 校验数据源是否被使用
     *
     * @param sourceId 数据源id
     * @return 结果
     */
    TeStrategyDto checkSourceExist(Long sourceId);
}
