package com.audit.common.core.annotation;

import com.audit.common.core.constant.basic.OperateConstants;

import java.lang.annotation.*;

/**
 * 从属关联关系定义注解
 *
 * @author zerozhang
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Correlation {

    /** 分组名称 */
    String groupName();

    /** 键关联类型 */
    OperateConstants.SubKeyType keyType();

}
