package com.audit.system.monitor.service.impl;


import com.audit.common.web.entity.service.impl.BaseServiceImpl;
import com.audit.system.api.log.domain.dto.SysLoginLogDto;
import com.audit.system.api.log.domain.query.SysLoginLogQuery;
import com.audit.system.monitor.manager.ISysLoginLogManager;
import com.audit.system.monitor.service.ISysLoginLogService;
import org.springframework.stereotype.Service;

/**
 * 访问日志管理 服务层处理
 *
 * @author zerozhang
 */
@Service
public class SysLoginLogServiceImpl extends BaseServiceImpl<SysLoginLogQuery, SysLoginLogDto, ISysLoginLogManager> implements ISysLoginLogService {

    /**
     * 清空系统登录日志
     */
    @Override
    public void cleanLoginLog() {
        baseManager.cleanLoginLog();
    }
}
