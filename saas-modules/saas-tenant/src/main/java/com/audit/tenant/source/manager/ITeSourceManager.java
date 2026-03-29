package com.audit.tenant.source.manager;

import com.audit.common.web.entity.manager.IBaseManager;
import com.audit.tenant.api.source.domain.dto.TeSourceDto;
import com.audit.tenant.api.source.domain.query.TeSourceQuery;

/**
 * 数据源管理 数据封装层
 *
 * @author zerozhang
 */
public interface ITeSourceManager extends IBaseManager<TeSourceQuery, TeSourceDto> {
}
