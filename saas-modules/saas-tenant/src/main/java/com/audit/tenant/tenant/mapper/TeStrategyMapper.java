package com.audit.tenant.tenant.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.tenant.api.tenant.domain.dto.TeStrategyDto;
import com.audit.tenant.api.tenant.domain.po.TeStrategyPo;
import com.audit.tenant.api.tenant.domain.query.TeStrategyQuery;

/**
 * 数据源策略管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface TeStrategyMapper extends BaseMapper<TeStrategyQuery, TeStrategyDto, TeStrategyPo> {
}
