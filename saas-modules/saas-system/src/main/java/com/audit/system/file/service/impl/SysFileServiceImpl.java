package com.audit.system.file.service.impl;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.service.impl.BaseServiceImpl;
import com.audit.system.file.domain.dto.SysFileDto;
import com.audit.system.file.domain.query.SysFileQuery;
import com.audit.system.file.manager.ISysFileManager;
import com.audit.system.file.service.ISysFileService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件管理 服务层处理
 *
 * @author zerozhang
 */
@Isolate
@Service
public class SysFileServiceImpl extends BaseServiceImpl<SysFileQuery, SysFileDto, ISysFileManager> implements ISysFileService {

    /**
     * 查询文件对象列表 | 数据权限
     *
     * @param file 文件对象
     * @return 文件对象集合
     */
    @Override
    //@DataScope(userAlias = "createBy", mapperScope = {"SysFileMapper"})
    public List<SysFileDto> selectListScope(SysFileQuery file) {
        return baseManager.selectList(file);
    }

    /**
     * 新增文件记录
     *
     * @param file 文件记录对象
     * @return 结果
     */
    @Master
    @Override
    public int insertToMaster(SysFileDto file) {
        return super.insert(file);
    }
}
