package com.audit.file.api.feign.factory;

import com.audit.file.api.feign.RemoteFileService;
import com.audit.common.core.web.result.R;
import com.audit.file.api.domain.SysFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件服务 降级处理
 *
 * @author zerozhang
 */
@Slf4j
@Component
public class RemoteFileFallbackFactory implements FallbackFactory<RemoteFileService> {

    @Override
    public RemoteFileService create(Throwable throwable) {
        log.error("文件服务调用失败:{}", throwable.getMessage());
        return new RemoteFileService() {
            @Override
            public R<SysFile> upload(MultipartFile file) {
                return R.fail("上传文件失败:" + throwable.getMessage());
            }

            @Override
            public R<Boolean> delete(String url) {
                return R.fail("删除文件失败:" + throwable.getMessage());
            }
        };
    }
}
