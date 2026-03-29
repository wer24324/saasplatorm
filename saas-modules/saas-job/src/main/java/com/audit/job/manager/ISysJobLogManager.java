package com.audit.job.manager;

import com.audit.common.web.entity.manager.IBaseManager;
import com.audit.job.api.domain.dto.SysJobLogDto;
import com.audit.job.api.domain.query.SysJobLogQuery;

/**
 * 调度任务日志管理 数据封装层
 *
 * @author zerozhang
 */
public interface ISysJobLogManager extends IBaseManager<SysJobLogQuery, SysJobLogDto> {

    /**
     * 清空任务日志
     */
    void cleanLog();
}
