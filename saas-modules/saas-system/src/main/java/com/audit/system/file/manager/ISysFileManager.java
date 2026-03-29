package com.audit.system.file.manager;

import com.audit.common.web.entity.manager.IBaseManager;
import com.audit.system.file.domain.dto.SysFileDto;
import com.audit.system.file.domain.query.SysFileQuery;

/**
 * 文件管理 数据封装层
 *
 * @author zerozhang
 */
public interface ISysFileManager extends IBaseManager<SysFileQuery, SysFileDto> {
}
