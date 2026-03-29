package com.audit.common.datasource.processor;

import com.baomidou.dynamic.datasource.processor.DsProcessor;
import com.audit.common.datasource.utils.DSUtil;
import com.audit.common.security.utils.SecurityUtils;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import static com.audit.common.core.constant.basic.TenantConstants.ISOLATE;

/**
 * 租户库源策略
 *
 * @author zerozhang
 */
@Component
public class DsIsolateExpressionProcessor extends DsProcessor {

    @Override
    public boolean matches(String key) {
        return key.startsWith(ISOLATE);
    }

    @Override
    public String doDetermineDatasource(MethodInvocation invocation, String key) {
        return DSUtil.loadDs(SecurityUtils.getSourceName());
    }
}
