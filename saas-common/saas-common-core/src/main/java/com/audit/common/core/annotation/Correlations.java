package com.audit.common.core.annotation;

import java.lang.annotation.*;

/**
 * 从属关联关系定义注解集
 *
 * @author zerozhang
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Correlations {

    Correlation[] value();
}
