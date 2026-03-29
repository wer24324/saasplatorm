package com.audit.file.api.feign;

import com.audit.common.core.constant.basic.SecurityConstants;
import com.audit.common.core.constant.basic.ServiceConstants;
import com.audit.common.core.web.result.R;
import com.audit.file.api.domain.SysFile;
import com.audit.file.api.feign.factory.RemoteFileManageFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 文件管理服务
 *
 * @author zerozhang
 */
@FeignClient(contextId = "remoteFileManageService", value = ServiceConstants.SYSTEM_SERVICE, fallbackFactory = RemoteFileManageFallbackFactory.class)
public interface RemoteFileManageService {

    /**
     * 保存文件记录
     *
     * @param file         文件实体
     * @param source       请求来源
     * @return 结果
     */
    @PostMapping("/file")
    R<Boolean> saveFileLog(@RequestBody SysFile file, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);

}
