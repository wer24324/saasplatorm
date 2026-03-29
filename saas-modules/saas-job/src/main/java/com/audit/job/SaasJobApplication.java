package com.audit.job;

import com.audit.common.security.annotation.EnableCustomConfig;
import com.audit.common.security.annotation.EnableRyFeignClients;
import com.audit.common.swagger.annotation.EnableCustomSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 定时任务
 *
 * @author zerozhang
 */
@EnableCustomConfig
@EnableCustomSwagger
@EnableRyFeignClients
@SpringBootApplication
public class SaasJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
