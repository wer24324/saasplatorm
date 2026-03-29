package com.audit.system.monitor.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.system.api.log.domain.dto.SysOperateLogDto;
import com.audit.system.api.log.domain.query.SysOperateLogQuery;

/**
 * 操作日志管理 服务层
 *
 * @author zerozhang
 */
public interface ISysOperateLogService extends IBaseService<SysOperateLogQuery, SysOperateLogDto> {

    /**
     * 清空操作日志
     */
    void cleanOperateLog();
}
