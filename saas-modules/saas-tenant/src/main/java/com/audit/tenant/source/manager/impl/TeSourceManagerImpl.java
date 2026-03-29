package com.audit.tenant.source.manager.impl;

import com.audit.common.core.utils.core.IdUtil;
import com.audit.common.web.entity.manager.impl.BaseManagerImpl;
import com.audit.tenant.api.source.domain.dto.TeSourceDto;
import com.audit.tenant.api.source.domain.model.TeSourceConverter;
import com.audit.tenant.api.source.domain.po.TeSourcePo;
import com.audit.tenant.api.source.domain.query.TeSourceQuery;
import com.audit.tenant.source.manager.ITeSourceManager;
import com.audit.tenant.source.mapper.TeSourceMapper;
import org.springframework.stereotype.Component;

/**
 * 数据源管理 数据封装层处理
 *
 * @author zerozhang
 */
@Component
public class TeSourceManagerImpl extends BaseManagerImpl<TeSourceQuery, TeSourceDto, TeSourcePo, TeSourceMapper, TeSourceConverter> implements ITeSourceManager {

    /**
     * 新增数据源对象
     *
     * @param source 数据源对象
     * @return 结果
     */
    @Override
    public int insert(TeSourceDto source) {
        source.setSlave(IdUtil.simpleUUID());
        return baseMapper.insert(source);
    }
}
