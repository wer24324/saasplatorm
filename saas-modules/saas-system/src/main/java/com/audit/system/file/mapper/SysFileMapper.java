package com.audit.system.file.mapper;

import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.file.domain.dto.SysFileDto;
import com.audit.system.file.domain.po.SysFilePo;
import com.audit.system.file.domain.query.SysFileQuery;

/**
 * 文件管理 数据层
 *
 * @author zerozhang
 */
public interface SysFileMapper extends BaseMapper<SysFileQuery, SysFileDto, SysFilePo> {
}
