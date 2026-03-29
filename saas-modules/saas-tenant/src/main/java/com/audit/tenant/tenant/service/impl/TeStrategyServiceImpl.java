package com.audit.tenant.tenant.service.impl;

import com.audit.common.cache.constant.CacheConstants;
import com.audit.common.core.constant.basic.DictConstants;
import com.audit.common.core.utils.core.ObjectUtil;
import com.audit.common.core.utils.core.StrUtil;
import com.audit.common.web.entity.service.impl.BaseServiceImpl;
import com.audit.tenant.api.tenant.domain.dto.TeStrategyDto;
import com.audit.tenant.api.tenant.domain.query.TeStrategyQuery;
import com.audit.tenant.tenant.manager.ITeStrategyManager;
import com.audit.tenant.tenant.service.ITeStrategyService;
import org.springframework.stereotype.Service;

/**
 * 数据源策略管理 服务层处理
 *
 * @author zerozhang
 */
@Service
public class TeStrategyServiceImpl extends BaseServiceImpl<TeStrategyQuery, TeStrategyDto, ITeStrategyManager> implements ITeStrategyService {

    /**
     * 缓存主键命名定义
     */
    @Override
    protected String getCacheKey() {
        return CacheConstants.CacheType.TE_STRATEGY_KEY.getCode();
    }

    /**
     * 校验数据源是否被使用
     *
     * @param sourceId 数据源id
     * @return 结果 | true/false 存在/不存在
     */
    @Override
    public boolean checkSourceExist(Long sourceId) {
        return ObjectUtil.isNotNull(baseManager.checkSourceExist(sourceId));
    }

    /**
     * 校验源策略是否为默认源策略
     *
     * @param id 源策略id
     * @return 结果 | true/false 是/不是
     */
    @Override
    public boolean checkIsDefault(Long id) {
        TeStrategyDto strategy = baseManager.selectById(id);
        return ObjectUtil.isNotNull(strategy) && StrUtil.equals(strategy.getIsDefault(), DictConstants.DicYesNo.YES.getCode());
    }

}
