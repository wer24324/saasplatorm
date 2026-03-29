package com.audit.system.api.organize.domain.model;

import com.audit.system.api.organize.domain.po.SysDeptPo;
import com.audit.common.core.web.entity.model.TreeConverter;
import com.audit.system.api.organize.domain.dto.SysDeptDto;
import com.audit.system.api.organize.domain.query.SysDeptQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 部门 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysDeptConverter extends TreeConverter<SysDeptQuery, SysDeptDto, SysDeptPo> {
}
