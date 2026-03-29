package com.audit.gen;

import com.audit.common.security.annotation.EnableCustomConfig;
import com.audit.common.security.annotation.EnableRyFeignClients;
import com.audit.common.swagger.annotation.EnableCustomSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成
 *
 * @author zerozhang
 */
@EnableCustomConfig
@EnableCustomSwagger
@EnableRyFeignClients
@SpringBootApplication
public class SaasGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
    }
}
