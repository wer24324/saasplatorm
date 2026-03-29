package com.audit.common.log.service;

import com.audit.common.core.constant.basic.SecurityConstants;
import com.audit.system.api.log.domain.dto.SysOperateLogDto;
import com.audit.system.api.log.feign.RemoteLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步调用日志服务
 *
 * @author zerozhang
 */
@Service
public class AsyncLogService {

    @Autowired
    private RemoteLogService remoteLogService;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveOperateLog(SysOperateLogDto operateLog) throws Exception {
        remoteLogService.saveOperateLog(operateLog, operateLog.getEnterpriseId(), operateLog.getSourceName(), SecurityConstants.INNER);
    }
}
