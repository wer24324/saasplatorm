package com.audit.gen.service.impl;

import com.audit.common.web.entity.service.impl.BaseServiceImpl;
import com.audit.gen.domain.dto.GenTableColumnDto;
import com.audit.gen.domain.query.GenTableColumnQuery;
import com.audit.gen.manager.impl.GenTableColumnManagerImpl;
import com.audit.gen.service.IGenTableColumnService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务字段管理 服务层实现
 *
 * @author zerozhang
 */
@Service
public class GenTableColumnServiceImpl extends BaseServiceImpl<GenTableColumnQuery, GenTableColumnDto, GenTableColumnManagerImpl> implements IGenTableColumnService {

    /**
     * 根据表名称查询数据库表列信息
     *
     * @param tableName 表名称
     * @return 数据库表列信息
     */
    @Override
    public List<GenTableColumnDto> selectDbTableColumnsByName(String tableName) {
        return baseManager.selectDbTableColumnsByName(tableName);
    }
}
