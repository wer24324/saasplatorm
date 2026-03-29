package com.audit.system.file.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.system.file.domain.dto.SysFileDto;
import com.audit.system.file.domain.query.SysFileQuery;

/**
 * 文件管理 服务层
 *
 * @author zerozhang
 */
public interface ISysFileService extends IBaseService<SysFileQuery, SysFileDto> {

    /**
     * 新增文件记录
     *
     * @param file 文件记录对象
     * @return 结果
     */
    int insertToMaster(SysFileDto file);
}
