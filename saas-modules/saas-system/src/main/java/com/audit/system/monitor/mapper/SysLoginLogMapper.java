package com.audit.system.monitor.mapper;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.log.domain.dto.SysLoginLogDto;
import com.audit.system.api.log.domain.po.SysLoginLogPo;
import com.audit.system.api.log.domain.query.SysLoginLogQuery;

/**
 * 访问日志管理 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysLoginLogMapper extends BaseMapper<SysLoginLogQuery, SysLoginLogDto, SysLoginLogPo> {
}
