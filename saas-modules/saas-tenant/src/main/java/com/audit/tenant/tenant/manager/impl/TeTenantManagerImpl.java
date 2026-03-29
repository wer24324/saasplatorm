package com.audit.tenant.tenant.manager.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.audit.common.core.constant.basic.SqlConstants;
import com.audit.common.web.entity.manager.impl.BaseManagerImpl;
import com.audit.tenant.api.tenant.domain.dto.TeTenantDto;
import com.audit.tenant.api.tenant.domain.model.TeTenantConverter;
import com.audit.tenant.api.tenant.domain.po.TeTenantPo;
import com.audit.tenant.api.tenant.domain.query.TeTenantQuery;
import com.audit.tenant.tenant.manager.ITeTenantManager;
import com.audit.tenant.tenant.mapper.TeTenantMapper;
import org.springframework.stereotype.Component;

/**
 * 租户管理 数据封装层处理
 *
 * @author zerozhang
 */
@Component
public class TeTenantManagerImpl extends BaseManagerImpl<TeTenantQuery, TeTenantDto, TeTenantPo, TeTenantMapper, TeTenantConverter> implements ITeTenantManager {

    /**
     * 校验数据源策略是否被使用
     *
     * @param strategyId 数据源策略id
     * @return 结果
     */
    @Override
    public TeTenantDto checkStrategyExist(Long strategyId) {
        TeTenantPo tenant = baseMapper.selectOne(
                Wrappers.<TeTenantPo>query().lambda()
                        .eq(TeTenantPo::getStrategyId, strategyId)
                        .last(SqlConstants.LIMIT_ONE));
        return baseConverter.mapperDto(tenant);
    }
}
