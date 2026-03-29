package com.audit.system.notice.manager.impl;

import com.audit.common.web.entity.manager.impl.BaseManagerImpl;
import com.audit.system.notice.domain.dto.SysNoticeDto;
import com.audit.system.notice.domain.model.SysNoticeConverter;
import com.audit.system.notice.domain.po.SysNoticePo;
import com.audit.system.notice.domain.query.SysNoticeQuery;
import com.audit.system.notice.manager.ISysNoticeManager;
import com.audit.system.notice.mapper.SysNoticeMapper;
import org.springframework.stereotype.Component;

/**
 * 通知公告管理 数据封装层处理
 *
 * @author zerozhang
 */
@Component
public class SysNoticeManagerImpl extends BaseManagerImpl<SysNoticeQuery, SysNoticeDto, SysNoticePo, SysNoticeMapper, SysNoticeConverter> implements ISysNoticeManager {
}
