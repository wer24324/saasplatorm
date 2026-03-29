package com.audit.system.notice.mapper;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.notice.domain.dto.SysNoticeDto;
import com.audit.system.notice.domain.po.SysNoticePo;
import com.audit.system.notice.domain.query.SysNoticeQuery;

/**
 * 通知公告管理 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysNoticeMapper extends BaseMapper<SysNoticeQuery, SysNoticeDto, SysNoticePo> {
}
