package com.audit.system.dict.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.dict.domain.dto.SysDictTypeDto;
import com.audit.system.api.dict.domain.po.SysDictTypePo;
import com.audit.system.api.dict.domain.query.SysDictTypeQuery;

/**
 * 字典类型管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface SysDictTypeMapper extends BaseMapper<SysDictTypeQuery, SysDictTypeDto, SysDictTypePo> {
}
