package com.audit.job.service.impl;

import com.audit.common.web.entity.service.impl.BaseServiceImpl;
import com.audit.job.api.domain.dto.SysJobLogDto;
import com.audit.job.api.domain.query.SysJobLogQuery;
import com.audit.job.manager.impl.SysJobLogManagerImpl;
import com.audit.job.service.ISysJobLogService;
import org.springframework.stereotype.Service;

/**
 * 调度日志管理 服务层处理
 *
 * @author zerozhang
 */
@Service
public class SysJobLogServiceImpl extends BaseServiceImpl<SysJobLogQuery, SysJobLogDto, SysJobLogManagerImpl> implements ISysJobLogService {

    /**
     * 清空任务日志
     */
    @Override
    public void cleanLog() {
        baseManager.cleanLog();
    }
}
