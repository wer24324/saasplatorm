package com.audit.tenant.tenant.manager.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.audit.common.core.constant.basic.SqlConstants;
import com.audit.common.web.entity.manager.impl.BaseManagerImpl;
import com.audit.tenant.api.tenant.domain.dto.TeStrategyDto;
import com.audit.tenant.api.tenant.domain.model.TeStrategyConverter;
import com.audit.tenant.api.tenant.domain.po.TeStrategyPo;
import com.audit.tenant.api.tenant.domain.query.TeStrategyQuery;
import com.audit.tenant.tenant.manager.ITeStrategyManager;
import com.audit.tenant.tenant.mapper.TeStrategyMapper;
import org.springframework.stereotype.Component;


/**
 * 数据源策略管理 数据封装层处理
 *
 * @author zerozhang
 */
@Component
public class TeStrategyManagerImpl extends BaseManagerImpl<TeStrategyQuery, TeStrategyDto, TeStrategyPo, TeStrategyMapper, TeStrategyConverter> implements ITeStrategyManager {

    /**
     * 校验数据源是否被使用
     *
     * @param sourceId 数据源id
     * @return 结果
     */
    @Override
    public TeStrategyDto checkSourceExist(Long sourceId) {
        TeStrategyPo strategy = baseMapper.selectOne(
                Wrappers.<TeStrategyPo>query().lambda()
                        .eq(TeStrategyPo::getSourceId, sourceId)
                        .last(SqlConstants.LIMIT_ONE));
        return baseConverter.mapperDto(strategy);
    }
}
