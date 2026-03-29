package com.audit.job.api.domain.model;

import com.audit.job.api.domain.dto.SysJobLogDto;
import com.audit.job.api.domain.po.SysJobLogPo;
import com.audit.job.api.domain.query.SysJobLogQuery;
import com.audit.common.core.web.entity.model.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 调度日志 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysJobLogConverter extends BaseConverter<SysJobLogQuery, SysJobLogDto, SysJobLogPo> {
}
