package com.audit.tenant.source.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.tenant.api.source.domain.dto.TeSourceDto;
import com.audit.tenant.api.source.domain.po.TeSourcePo;
import com.audit.tenant.api.source.domain.query.TeSourceQuery;

/**
 * 数据源管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface TeSourceMapper extends BaseMapper<TeSourceQuery, TeSourceDto, TeSourcePo> {
}
