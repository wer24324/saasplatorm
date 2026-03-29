package com.audit.common.core.utils;

import com.audit.common.core.utils.core.StrUtil;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 错误信息处理类。
 *
 * @author zerozhang
 */
public class ExceptionUtil {

    /**
     * 获取exception的详细错误信息。
     */
    public static String getExceptionMessage(Throwable e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw, true));
        return sw.toString();
    }

    public static String getRootErrorMessage(Exception e) {
        Throwable root = ExceptionUtils.getRootCause(e);
        root = (root == null ? e : root);
        if (root == null) {
            return StrUtil.EMPTY;
        }
        String msg = root.getMessage();
        if (msg == null) {
            return StrUtil.NULL;
        }
        return StrUtil.nullToEmpty(msg);
    }
}
