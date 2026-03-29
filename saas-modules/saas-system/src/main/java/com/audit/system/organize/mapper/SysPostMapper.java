package com.audit.system.organize.mapper;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.organize.domain.dto.SysPostDto;
import com.audit.system.api.organize.domain.po.SysPostPo;
import com.audit.system.api.organize.domain.query.SysPostQuery;

/**
 * 岗位管理 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysPostMapper extends BaseMapper<SysPostQuery, SysPostDto, SysPostPo> {
}
