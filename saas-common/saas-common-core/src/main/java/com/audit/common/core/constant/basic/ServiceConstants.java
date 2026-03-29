package com.audit.common.core.constant.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 服务名称通用常量
 *
 * @author saas
 */
public class ServiceConstants {

    /** 认证服务的serviceId */
    public static final String AUTH_SERVICE = "saas-auth";

    /** 文件服务的serviceId */
    public static final String FILE_SERVICE = "saas-file";

    /** 系统模块的serviceId */
    public static final String SYSTEM_SERVICE = "saas-system";

    /** 租管模块的serviceId */
    public static final String TENANT_SERVICE = "saas-tenant";

    /** 定时任务模块的serviceId */
    public static final String JOB_SERVICE = "saas-job";

    /** 访问来源 */
    @Getter
    @AllArgsConstructor
    public enum FromSource {
        CLOUD("cloud", "vue2后台前端"),
        MULTI("multi", "vue3后台前端");

        private final String code;
        private final String info;

    }
}
