package com.audit.system.dict.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.dict.domain.dto.SysConfigDto;
import com.audit.system.api.dict.domain.po.SysConfigPo;
import com.audit.system.api.dict.domain.query.SysConfigQuery;

/**
 * 参数配置管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface SysConfigMapper extends BaseMapper<SysConfigQuery, SysConfigDto, SysConfigPo> {
}
