package com.audit.system.api.dict.feign;

import com.audit.system.api.dict.feign.factory.RemoteConfigFallbackFactory;
import com.audit.common.core.constant.basic.SecurityConstants;
import com.audit.common.core.constant.basic.ServiceConstants;
import com.audit.common.core.web.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 参数服务
 *
 * @author zerozhang
 */
@FeignClient(contextId = "remoteConfigService", value = ServiceConstants.SYSTEM_SERVICE, fallbackFactory = RemoteConfigFallbackFactory.class)
public interface RemoteConfigService {

    /**
     * 查询参数
     *
     * @param configCode 参数编码
     * @return 结果
     */
    @GetMapping("/config/innerCode/{configCode}")
    R<String> getCode(@PathVariable("configCode") String configCode);

    /**
     * 刷新参数缓存
     *
     * @param source 请求来源
     * @return 结果
     */
    @GetMapping("/config/inner/refresh")
    R<Boolean> refreshCache(@RequestHeader(SecurityConstants.FROM_SOURCE) String source);

}
