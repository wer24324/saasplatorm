package com.audit.common.datasource.annotation;

import com.baomidou.dynamic.datasource.annotation.DS;

import java.lang.annotation.*;

import static com.audit.common.core.constant.basic.TenantConstants.ISOLATE;

/**
 * 租户策略源
 *
 * @author zerozhang
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@DS(ISOLATE)
public @interface Isolate {
}
