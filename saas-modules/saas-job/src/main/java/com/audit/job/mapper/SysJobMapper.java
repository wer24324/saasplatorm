package com.audit.job.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.job.api.domain.dto.SysJobDto;
import com.audit.job.api.domain.po.SysJobPo;
import com.audit.job.api.domain.query.SysJobQuery;

/**
 * 调度任务管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface SysJobMapper extends BaseMapper<SysJobQuery, SysJobDto, SysJobPo> {
}
