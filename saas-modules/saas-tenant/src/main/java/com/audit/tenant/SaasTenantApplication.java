package com.audit.tenant;

import com.audit.common.security.annotation.EnableCustomConfig;
import com.audit.common.security.annotation.EnableRyFeignClients;
import com.audit.common.swagger.annotation.EnableCustomSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 租户模块
 *
 * @author zerozhang
 */
@EnableCustomConfig
@EnableCustomSwagger
@EnableRyFeignClients
@SpringBootApplication
public class SaasTenantApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasTenantApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  租户管理模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
