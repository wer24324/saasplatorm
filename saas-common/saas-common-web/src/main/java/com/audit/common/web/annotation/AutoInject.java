package com.audit.common.web.annotation;

import java.lang.annotation.*;

/**
 * 数据自动注入注解
 *
 * @author zerozhang
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoInject {

    /** 新增操作 */
    boolean isInsert() default true;

    /** 主键注入 */
    boolean key() default true;

    /** 用户注入 */
    boolean user() default true;
}
