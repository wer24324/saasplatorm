package com.audit.tenant.api.source.feign;

import com.audit.common.core.constant.basic.SecurityConstants;
import com.audit.common.core.constant.basic.ServiceConstants;
import com.audit.common.core.web.result.R;
import com.audit.tenant.api.source.feign.factory.RemoteSourceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 数据源服务
 *
 * @author zerozhang
 */
@FeignClient(contextId = "remoteSourceService", value = ServiceConstants.TENANT_SERVICE, fallbackFactory = RemoteSourceFallbackFactory.class)
public interface RemoteSourceService {

    /**
     * 刷新参数缓存
     *
     * @param source 请求来源
     * @return 结果
     */
    @GetMapping("/source/inner/refresh")
    R<Boolean> refreshCache(@RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
