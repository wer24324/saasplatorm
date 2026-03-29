package com.audit.system.organize.mapper.merge;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BasicMapper;
import com.audit.system.organize.domain.merge.SysUserPostMerge;

/**
 * 用户-岗位关联 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysUserPostMergeMapper extends BasicMapper<SysUserPostMerge> {
}
