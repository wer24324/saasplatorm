package com.audit.system.api.dict.domain.model;

import com.audit.system.api.dict.domain.dto.SysDictDataDto;
import com.audit.system.api.dict.domain.po.SysDictDataPo;
import com.audit.system.api.dict.domain.query.SysDictDataQuery;
import com.audit.common.core.web.entity.model.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 字典数据 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysDictDataConverter extends BaseConverter<SysDictDataQuery, SysDictDataDto, SysDictDataPo> {
}
