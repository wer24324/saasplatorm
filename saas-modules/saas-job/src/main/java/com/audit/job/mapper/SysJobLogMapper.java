package com.audit.job.mapper;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.job.api.domain.dto.SysJobLogDto;
import com.audit.job.api.domain.po.SysJobLogPo;
import com.audit.job.api.domain.query.SysJobLogQuery;


/**
 * 调度日志管理 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysJobLogMapper extends BaseMapper<SysJobLogQuery, SysJobLogDto, SysJobLogPo> {
}
