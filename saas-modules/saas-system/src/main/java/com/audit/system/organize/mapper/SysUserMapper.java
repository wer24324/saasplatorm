package com.audit.system.organize.mapper;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.organize.domain.dto.SysUserDto;
import com.audit.system.api.organize.domain.po.SysUserPo;
import com.audit.system.api.organize.domain.query.SysUserQuery;

/**
 * 用户管理 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysUserMapper extends BaseMapper<SysUserQuery, SysUserDto, SysUserPo> {
}
