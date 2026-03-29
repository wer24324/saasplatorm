package com.audit.system.file.manager.impl;

import com.audit.common.web.entity.manager.impl.BaseManagerImpl;
import com.audit.system.file.domain.dto.SysFileDto;
import com.audit.system.file.domain.model.SysFileConverter;
import com.audit.system.file.domain.po.SysFilePo;
import com.audit.system.file.domain.query.SysFileQuery;
import com.audit.system.file.manager.ISysFileManager;
import com.audit.system.file.mapper.SysFileMapper;
import org.springframework.stereotype.Component;

/**
 * 文件管理 数据封装层处理
 *
 * @author zerozhang
 */
@Component
public class SysFileManager extends BaseManagerImpl<SysFileQuery, SysFileDto, SysFilePo, SysFileMapper, SysFileConverter> implements ISysFileManager {
}
