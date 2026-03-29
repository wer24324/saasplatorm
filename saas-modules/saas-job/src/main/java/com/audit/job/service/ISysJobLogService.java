package com.audit.job.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.job.api.domain.dto.SysJobLogDto;
import com.audit.job.api.domain.query.SysJobLogQuery;

/**
 * 调度日志管理 服务层
 *
 * @author zerozhang
 */
public interface ISysJobLogService extends IBaseService<SysJobLogQuery, SysJobLogDto> {

    /**
     * 清空任务日志
     */
    public void cleanLog();
}
