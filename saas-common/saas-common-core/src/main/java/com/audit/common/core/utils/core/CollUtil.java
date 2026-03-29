package com.audit.common.core.utils.core;

import java.util.Collection;

/**
 * 集合工具类
 *
 * @author zerozhang
 */
public class CollUtil extends cn.hutool.core.collection.CollUtil {

    public static boolean isNotNull(Collection<?> collection) {
        return !isNull(collection);
    }

    public static boolean isNull(Collection<?> collection) {
        return collection == null;
    }
}
