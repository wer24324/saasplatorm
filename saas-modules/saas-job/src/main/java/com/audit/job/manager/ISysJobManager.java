package com.audit.job.manager;

import com.audit.common.web.entity.manager.IBaseManager;
import com.audit.job.api.domain.dto.SysJobDto;
import com.audit.job.api.domain.query.SysJobQuery;

import java.util.List;

/**
 * 调度任务管理 数据封装层
 *
 * @author zerozhang
 */
public interface ISysJobManager extends IBaseManager<SysJobQuery, SysJobDto> {

    /**
     * 项目启动时
     */
    List<SysJobDto> initScheduler();
}
