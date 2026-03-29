package com.audit.auth;

import com.audit.common.security.annotation.EnableRyFeignClients;
import com.audit.common.swagger.annotation.EnableCustomSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 认证授权中心
 *
 * @author zerozhang
 */
@EnableRyFeignClients
@EnableCustomSwagger
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SaasAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ ");
    }
}
