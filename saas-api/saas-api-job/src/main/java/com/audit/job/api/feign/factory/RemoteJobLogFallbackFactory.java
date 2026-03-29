package com.audit.job.api.feign.factory;

import com.audit.job.api.domain.dto.SysJobLogDto;
import com.audit.common.core.web.result.R;
import com.audit.job.api.feign.RemoteJobLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 调度日志服务 降级处理
 *
 * @author zerozhang
 */
@Slf4j
@Component
public class RemoteJobLogFallbackFactory implements FallbackFactory<RemoteJobLogService> {

    @Override
    public RemoteJobLogService create(Throwable throwable) {
        log.error("调度日志服务调用失败:{}", throwable.getMessage());
        return new RemoteJobLogService() {
            @Override
            public R<Boolean> saveJobLog(SysJobLogDto jobLog, Long enterpriseId, String isLessor, String sourceName, String source) {
                return null;
            }
        };
    }
}
