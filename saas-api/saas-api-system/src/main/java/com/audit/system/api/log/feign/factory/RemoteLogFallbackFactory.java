package com.audit.system.api.log.feign.factory;

import com.audit.system.api.log.domain.dto.SysLoginLogDto;
import com.audit.system.api.log.domain.dto.SysOperateLogDto;
import com.audit.system.api.log.feign.RemoteLogService;
import com.audit.common.core.web.result.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 日志服务 降级处理
 *
 * @author zerozhang
 */
@Slf4j
@Component
public class RemoteLogFallbackFactory implements FallbackFactory<RemoteLogService> {

    @Override
    public RemoteLogService create(Throwable throwable) {
        log.error("日志服务调用失败:{}", throwable.getMessage());
        return new RemoteLogService() {
            @Override
            public R<Boolean> saveOperateLog(SysOperateLogDto operateLog, Long enterpriseId, String sourceName, String source) {
                return null;
            }

            @Override
            public R<Boolean> saveLoginInfo(SysLoginLogDto loginInfo, Long enterpriseId, String sourceName, String source) {
                return null;
            }
        };
    }
}
