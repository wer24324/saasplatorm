package com.audit.system.notice.domain.model;

import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.system.notice.domain.dto.SysNoticeDto;
import com.audit.system.notice.domain.po.SysNoticePo;
import com.audit.system.notice.domain.query.SysNoticeQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 通知公告 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysNoticeConverter extends BaseConverter<SysNoticeQuery, SysNoticeDto, SysNoticePo> {
}
