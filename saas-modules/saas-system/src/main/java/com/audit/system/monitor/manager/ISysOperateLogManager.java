package com.audit.system.monitor.manager;

import com.audit.common.web.entity.manager.IBaseManager;
import com.audit.system.api.log.domain.dto.SysOperateLogDto;
import com.audit.system.api.log.domain.query.SysOperateLogQuery;

/**
 * 操作日志管理 数据封装层
 *
 * @author zerozhang
 */
public interface ISysOperateLogManager extends IBaseManager<SysOperateLogQuery, SysOperateLogDto> {

    /**
     * 清空系统操作日志
     */
    void cleanOperateLog();
}
