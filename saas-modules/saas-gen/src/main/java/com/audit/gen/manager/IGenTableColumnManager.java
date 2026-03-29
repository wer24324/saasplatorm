package com.audit.gen.manager;

import com.audit.common.web.entity.manager.IBaseManager;
import com.audit.gen.domain.dto.GenTableColumnDto;
import com.audit.gen.domain.query.GenTableColumnQuery;

import java.util.List;

/**
 * 业务字段管理 数据封装层
 *
 * @author zerozhang
 */
public interface IGenTableColumnManager extends IBaseManager<GenTableColumnQuery, GenTableColumnDto> {

    /**
     * 根据表名称查询数据库表列信息
     *
     * @param tableName 表名称
     * @return 数据库表列信息
     */
    List<GenTableColumnDto> selectDbTableColumnsByName(String tableName);
}
