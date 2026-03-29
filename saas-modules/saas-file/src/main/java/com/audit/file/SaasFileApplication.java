package com.audit.file;

import com.audit.common.security.annotation.EnableRyFeignClients;
import com.audit.common.security.config.ApplicationConfig;
import com.audit.common.security.config.JacksonConfig;
import com.audit.common.security.feign.FeignAutoConfiguration;
import com.audit.common.swagger.annotation.EnableCustomSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * 文件服务
 *
 * @author zerozhang
 */
@EnableCustomSwagger
@EnableRyFeignClients
@Import({ApplicationConfig.class, FeignAutoConfiguration.class, JacksonConfig.class})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SaasFileApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasFileApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  文件服务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
    }
}
