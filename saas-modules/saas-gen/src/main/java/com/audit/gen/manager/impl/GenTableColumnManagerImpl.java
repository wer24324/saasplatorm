package com.audit.gen.manager.impl;

import com.audit.common.web.entity.manager.impl.BaseManagerImpl;
import com.audit.gen.domain.dto.GenTableColumnDto;
import com.audit.gen.domain.model.GenTableColumnConverter;
import com.audit.gen.domain.po.GenTableColumnPo;
import com.audit.gen.domain.query.GenTableColumnQuery;
import com.audit.gen.manager.IGenTableColumnManager;
import com.audit.gen.mapper.GenTableColumnMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 业务字段管理 数据封装层处理
 *
 * @author zerozhang
 */
@Component
public class GenTableColumnManagerImpl extends BaseManagerImpl<GenTableColumnQuery, GenTableColumnDto, GenTableColumnPo, GenTableColumnMapper, GenTableColumnConverter> implements IGenTableColumnManager {

    /**
     * 根据表名称查询数据库表列信息
     *
     * @param tableName 表名称
     * @return 数据库表列信息
     */
    @Override
    public List<GenTableColumnDto> selectDbTableColumnsByName(String tableName) {
        return baseMapper.selectDbTableColumnsByName(tableName);
    }
}
