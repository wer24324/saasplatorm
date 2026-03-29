package com.audit.job.api.domain.model;

import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.job.api.domain.dto.SysJobDto;
import com.audit.job.api.domain.po.SysJobPo;
import com.audit.job.api.domain.query.SysJobQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 调度任务 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysJobConverter extends BaseConverter<SysJobQuery, SysJobDto, SysJobPo> {
}
