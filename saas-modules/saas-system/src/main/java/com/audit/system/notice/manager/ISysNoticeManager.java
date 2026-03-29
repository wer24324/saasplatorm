package com.audit.system.notice.manager;

import com.audit.common.web.entity.manager.IBaseManager;
import com.audit.system.notice.domain.dto.SysNoticeDto;
import com.audit.system.notice.domain.query.SysNoticeQuery;

/**
 * 通知公告管理 数据封装层
 *
 * @author zerozhang
 */
public interface ISysNoticeManager extends IBaseManager<SysNoticeQuery, SysNoticeDto> {
}
