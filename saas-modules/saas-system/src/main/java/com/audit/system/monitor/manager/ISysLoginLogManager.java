package com.audit.system.monitor.manager;

import com.audit.common.web.entity.manager.IBaseManager;
import com.audit.system.api.log.domain.dto.SysLoginLogDto;
import com.audit.system.api.log.domain.query.SysLoginLogQuery;

/**
 * 访问日志管理 数据封装层
 *
 * @author zerozhang
 */
public interface ISysLoginLogManager extends IBaseManager<SysLoginLogQuery, SysLoginLogDto> {

    /**
     * 清空系统登录日志
     */
    void cleanLoginLog();
}
