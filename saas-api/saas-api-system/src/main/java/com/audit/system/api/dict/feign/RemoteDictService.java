package com.audit.system.api.dict.feign;

import com.audit.common.core.constant.basic.SecurityConstants;
import com.audit.common.core.constant.basic.ServiceConstants;
import com.audit.common.core.web.result.R;
import com.audit.system.api.dict.feign.factory.RemoteDictFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 字典服务
 *
 * @author zerozhang
 */
@FeignClient(contextId = "remoteDictService", value = ServiceConstants.SYSTEM_SERVICE, fallbackFactory = RemoteDictFallbackFactory.class)
public interface RemoteDictService {

    /**
     * 刷新字典缓存
     *
     * @param source 请求来源
     * @return 结果
     */
    @GetMapping("/dict/type/inner/refresh")
    R<Boolean> refreshCache(@RequestHeader(SecurityConstants.FROM_SOURCE) String source);

}
