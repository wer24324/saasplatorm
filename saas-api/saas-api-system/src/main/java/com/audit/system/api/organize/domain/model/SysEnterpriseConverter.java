package com.audit.system.api.organize.domain.model;

import com.audit.system.api.organize.domain.po.SysEnterprisePo;
import com.audit.system.api.organize.domain.query.SysEnterpriseQuery;
import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.system.api.organize.domain.dto.SysEnterpriseDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 企业 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysEnterpriseConverter extends BaseConverter<SysEnterpriseQuery, SysEnterpriseDto, SysEnterprisePo> {
}
