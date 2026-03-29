package com.audit.system.monitor.service.impl;

import com.audit.common.web.entity.service.impl.BaseServiceImpl;
import com.audit.system.api.log.domain.dto.SysOperateLogDto;
import com.audit.system.api.log.domain.query.SysOperateLogQuery;
import com.audit.system.monitor.manager.ISysOperateLogManager;
import com.audit.system.monitor.service.ISysOperateLogService;
import org.springframework.stereotype.Service;

/**
 * 操作日志管理 服务层处理
 *
 * @author zerozhang
 */
@Service
public class SysOperateLogServiceImpl extends BaseServiceImpl<SysOperateLogQuery, SysOperateLogDto, ISysOperateLogManager> implements ISysOperateLogService {

    /**
     * 清空操作日志
     */
    @Override
    public void cleanOperateLog() {
        baseManager.cleanOperateLog();
    }
}
