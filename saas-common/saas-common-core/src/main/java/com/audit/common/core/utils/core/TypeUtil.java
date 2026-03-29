package com.audit.common.core.utils.core;

import java.lang.reflect.Type;

/**
 * 类型工具类
 *
 * @author zerozhang
 */
public class TypeUtil extends cn.hutool.core.util.TypeUtil {

    /**
     * 获取class
     *
     * @return class
     */
    @SuppressWarnings("unchecked")
    public static <T> Class<T> getClazz(Type type, int index) {
        return (Class<T>)TypeUtil.getTypeArgument(type, index);
    }

}
