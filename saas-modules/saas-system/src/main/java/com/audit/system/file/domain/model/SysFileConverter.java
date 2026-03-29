package com.audit.system.file.domain.model;

import com.audit.common.core.web.entity.model.BaseConverter;
import com.audit.system.file.domain.dto.SysFileDto;
import com.audit.system.file.domain.po.SysFilePo;
import com.audit.system.file.domain.query.SysFileQuery;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * 文件 对象映射器
 *
 * @author zerozhang
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SysFileConverter extends BaseConverter<SysFileQuery, SysFileDto, SysFilePo> {
}
