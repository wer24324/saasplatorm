package com.audit.system.api.authority.feign;

import com.audit.system.api.authority.feign.factory.RemoteMenuFallbackFactory;
import com.audit.common.core.constant.basic.SecurityConstants;
import com.audit.common.core.constant.basic.ServiceConstants;
import com.audit.common.core.web.result.R;
import com.audit.system.api.authority.domain.dto.SysMenuDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 菜单服务
 *
 * @author zerozhang
 */
@FeignClient(contextId = "remoteMenuService", value = ServiceConstants.SYSTEM_SERVICE, fallbackFactory = RemoteMenuFallbackFactory.class)
public interface RemoteMenuService {

    /**
     * 根据Id获取菜单信息
     *
     * @param id     菜单Id
     * @param source 请求来源
     * @return 菜单对象
     */
    @GetMapping("/menu/inner/{id}")
    R<SysMenuDto> getInfoInner(@PathVariable("id") Long id, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
