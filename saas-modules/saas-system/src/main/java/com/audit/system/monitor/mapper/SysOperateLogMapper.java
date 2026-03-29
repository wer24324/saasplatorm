package com.audit.system.monitor.mapper;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.log.domain.dto.SysOperateLogDto;
import com.audit.system.api.log.domain.po.SysOperateLogPo;
import com.audit.system.api.log.domain.query.SysOperateLogQuery;

/**
 * 操作日志管理 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysOperateLogMapper extends BaseMapper<SysOperateLogQuery, SysOperateLogDto, SysOperateLogPo> {
}
