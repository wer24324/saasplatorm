package com.audit.file.api.feign.factory;

import com.audit.file.api.feign.RemoteFileManageService;
import com.audit.common.core.web.result.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 文件管理服务 降级处理
 *
 * @author zerozhang
 */
@Slf4j
@Component
public class RemoteFileManageFallbackFactory implements FallbackFactory<RemoteFileManageService> {

    @Override
    public RemoteFileManageService create(Throwable throwable) {
        log.error("文件管理服务调用失败:{}", throwable.getMessage());
        return (file, source) -> R.fail("存储文件记录失败:" + throwable.getMessage());
    }
}
