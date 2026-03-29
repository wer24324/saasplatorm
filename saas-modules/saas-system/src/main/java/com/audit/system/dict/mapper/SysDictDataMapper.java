package com.audit.system.dict.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.dict.domain.dto.SysDictDataDto;
import com.audit.system.api.dict.domain.po.SysDictDataPo;
import com.audit.system.api.dict.domain.query.SysDictDataQuery;

/**
 * 字典数据管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface SysDictDataMapper extends BaseMapper<SysDictDataQuery, SysDictDataDto, SysDictDataPo> {
}
