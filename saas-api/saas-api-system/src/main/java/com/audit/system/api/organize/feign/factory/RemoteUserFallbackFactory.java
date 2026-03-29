package com.audit.system.api.organize.feign.factory;

import com.audit.common.core.web.result.R;
import com.audit.system.api.organize.domain.dto.SysUserDto;
import com.audit.system.api.organize.feign.RemoteUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 用户服务 降级处理
 *
 * @author zerozhang
 */
@Slf4j
@Component
public class RemoteUserFallbackFactory implements FallbackFactory<RemoteUserService> {

    @Override
    public RemoteUserService create(Throwable throwable) {
        log.error("用户服务调用失败:{}", throwable.getMessage());
        return new RemoteUserService() {
            @Override
            public R<SysUserDto> addInner(SysUserDto user, Long enterpriseId, String sourceName, String source) {
                return R.fail("新增用户失败:" + throwable.getMessage());
            }
        };
    }
}
