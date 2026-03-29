package com.audit.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author zerozhang
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SaasGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  网关模块启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
