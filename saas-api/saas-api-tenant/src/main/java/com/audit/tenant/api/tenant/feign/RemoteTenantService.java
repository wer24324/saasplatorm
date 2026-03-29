package com.audit.tenant.api.tenant.feign;

import com.alibaba.fastjson2.JSONObject;
import com.audit.tenant.api.tenant.feign.factory.RemoteTenantFallbackFactory;
import com.audit.common.core.constant.basic.SecurityConstants;
import com.audit.common.core.constant.basic.ServiceConstants;
import com.audit.common.core.web.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 租户服务
 *
 * @author zerozhang
 */
@FeignClient(contextId = "remoteTenantService", value = ServiceConstants.TENANT_SERVICE, fallbackFactory = RemoteTenantFallbackFactory.class)
public interface RemoteTenantService {

    /**
     * 注册租户信息
     *
     * @param register 注册信息 | 约定json内容tenant = tenant, dept = dept, post = post, user = user
     * @param source   请求来源
     * @return 结果
     */
    @PostMapping("/tenant/register")
    R<Boolean> registerTenantInfo(@RequestBody JSONObject register, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
