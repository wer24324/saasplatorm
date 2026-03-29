package com.audit.system.organize.mapper.merge;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BasicMapper;
import com.audit.system.organize.domain.merge.SysRoleDeptMerge;

/**
 * 角色-部门关联（权限范围） 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysRoleDeptMergeMapper extends BasicMapper<SysRoleDeptMerge> {
}
