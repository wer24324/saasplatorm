package com.audit.gen.mapper;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.gen.domain.dto.GenTableColumnDto;
import com.audit.gen.domain.po.GenTableColumnPo;
import com.audit.gen.domain.query.GenTableColumnQuery;

import java.util.List;

/**
 * 业务字段管理 数据层
 *
 * @author zerozhang
 */
public interface GenTableColumnMapper extends BaseMapper<GenTableColumnQuery, GenTableColumnDto, GenTableColumnPo> {

    /**
     * 根据表名称查询数据库表列信息
     *
     * @param tableName 表名称
     * @return 数据库表列信息
     */
    @InterceptorIgnore(tenantLine = "1")
    List<GenTableColumnDto> selectDbTableColumnsByName(String tableName);

}
