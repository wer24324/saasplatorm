package com.audit.system.monitor.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.system.api.log.domain.dto.SysLoginLogDto;
import com.audit.system.api.log.domain.query.SysLoginLogQuery;

/**
 * 访问日志管理 服务层
 *
 * @author zerozhang
 */
public interface ISysLoginLogService extends IBaseService<SysLoginLogQuery, SysLoginLogDto> {

    /**
     * 清空系统登录日志
     */
    void cleanLoginLog();
}
