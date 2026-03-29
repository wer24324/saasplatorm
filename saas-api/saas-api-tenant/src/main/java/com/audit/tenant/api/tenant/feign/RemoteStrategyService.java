package com.audit.tenant.api.tenant.feign;

import com.audit.tenant.api.tenant.feign.factory.RemoteStrategyFallbackFactory;
import com.audit.common.core.constant.basic.SecurityConstants;
import com.audit.common.core.constant.basic.ServiceConstants;
import com.audit.common.core.web.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 源策略服务
 *
 * @author zerozhang
 */
@FeignClient(contextId = "remoteStrategyService", value = ServiceConstants.TENANT_SERVICE, fallbackFactory = RemoteStrategyFallbackFactory.class)
public interface RemoteStrategyService {

    /**
     * 刷新源策略缓存
     *
     * @param source 请求来源
     * @return 结果
     */
    @GetMapping("/strategy/inner/refresh")
    R<Boolean> refreshCache(@RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
