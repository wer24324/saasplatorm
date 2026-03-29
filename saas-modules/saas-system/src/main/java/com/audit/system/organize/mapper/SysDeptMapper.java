package com.audit.system.organize.mapper;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.TreeMapper;
import com.audit.system.api.organize.domain.dto.SysDeptDto;
import com.audit.system.api.organize.domain.po.SysDeptPo;
import com.audit.system.api.organize.domain.query.SysDeptQuery;

/**
 * 部门管理 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysDeptMapper extends TreeMapper<SysDeptQuery, SysDeptDto, SysDeptPo> {
}
