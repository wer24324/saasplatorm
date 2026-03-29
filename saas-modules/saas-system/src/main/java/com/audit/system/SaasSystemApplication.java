package com.audit.system;

import com.audit.common.security.annotation.EnableCustomConfig;
import com.audit.common.security.annotation.EnableRyFeignClients;
import com.audit.common.swagger.annotation.EnableCustomSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统模块
 *
 * @author zerozhang
 */
@EnableCustomConfig
@EnableCustomSwagger
@EnableRyFeignClients
@SpringBootApplication
public class SaasSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
