package com.audit.gen.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.gen.domain.dto.GenTableColumnDto;
import com.audit.gen.domain.query.GenTableColumnQuery;

import java.util.List;

/**
 * 业务字段管理 服务层
 *
 * @author zerozhang
 */
public interface IGenTableColumnService extends IBaseService<GenTableColumnQuery, GenTableColumnDto> {

    /**
     * 根据表名称查询数据库表列信息
     *
     * @param tableName 表名称
     * @return 数据库表列信息
     */
    List<GenTableColumnDto> selectDbTableColumnsByName(String tableName);
}
