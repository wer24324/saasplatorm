package com.audit.job.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.job.api.domain.dto.SysJobDto;
import com.audit.job.api.domain.query.SysJobQuery;
import org.quartz.SchedulerException;

/**
 * 调度任务管理 服务层
 *
 * @author zerozhang
 */
public interface ISysJobService extends IBaseService<SysJobQuery, SysJobDto> {

    /**
     * 暂停任务
     *
     * @param job 调度信息
     * @return 结果
     */
    int pauseJob(SysJobDto job) throws SchedulerException;

    /**
     * 恢复任务
     *
     * @param job 调度信息
     * @return 结果
     */
    int resumeJob(SysJobDto job) throws SchedulerException;

    /**
     * 立即运行任务
     *
     * @param id Id
     */
    boolean run(Long id) throws SchedulerException;

}
