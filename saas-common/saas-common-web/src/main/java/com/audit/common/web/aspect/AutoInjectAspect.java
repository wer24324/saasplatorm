package com.audit.common.web.aspect;

import com.audit.common.core.utils.core.ArrayUtil;
import com.audit.common.core.utils.core.IdUtil;
import com.audit.common.core.utils.core.NumberUtil;
import com.audit.common.core.utils.core.ObjectUtil;
import com.audit.common.core.web.entity.base.BaseEntity;
import com.audit.common.core.web.entity.base.BasisEntity;
import com.audit.common.security.utils.base.BaseSecurityUtils;
import com.audit.common.web.annotation.AutoInject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 数据自动注入处理
 *
 * @author zerozhang
 */
@Slf4j
@Aspect
@Component
public class AutoInjectAspect {

    /**
     * 处理请求前执行
     *
     * @param joinPoint  切点
     * @param autoInject 数据自动注入注解
     */
    @Before(value = "@annotation(autoInject)")
    public void doAfterReturning(JoinPoint joinPoint, AutoInject autoInject) {
        handleAutoInject(joinPoint, autoInject);
    }

    /**
     * 数据注入操作
     *
     * @param joinPoint  切点
     * @param autoInject 数据自动注入注解
     */
    private void handleAutoInject(final JoinPoint joinPoint, AutoInject autoInject) {
        if (ArrayUtil.isEmpty(joinPoint.getArgs()))
            return;
        Object params = joinPoint.getArgs()[NumberUtil.Zero];
        if (params instanceof List) {
            List<?> list = (List<?>) params;
            list.forEach(item -> initAutoInject(item, autoInject));
        } else {
            initAutoInject(params, autoInject);
        }
    }

    /**
     * 赋值数据对象
     *
     * @param obj 数据对象
     */
    private void initAutoInject(Object obj, AutoInject autoInject) {
        if (obj instanceof BaseEntity ) {
            BaseEntity base = (BaseEntity) obj;
            if (autoInject.user()) {
                if (autoInject.isInsert()) {
                    base.setCreateBy(BaseSecurityUtils.getUserId());
                    base.setCreateName(BaseSecurityUtils.getUserName());
                } else {
                    base.setUpdateBy(BaseSecurityUtils.getUserId());
                    base.setUpdateName(BaseSecurityUtils.getUserName());
                }
            }
            if (autoInject.isInsert() && autoInject.key() && ObjectUtil.isNull(base.getId()))
                base.setId(IdUtil.getSnowflakeNextId());
        } else if (obj instanceof BasisEntity ) {
            BasisEntity basic = (BasisEntity)obj;
            if (autoInject.isInsert() && autoInject.key() && ObjectUtil.isNull(basic.getId()))
                basic.setId(IdUtil.getSnowflakeNextId());
        }
    }

}
