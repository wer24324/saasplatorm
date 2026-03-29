package com.audit.system.organize.mapper;

import com.audit.common.datasource.annotation.Master;
import com.audit.common.web.entity.mapper.BaseMapper;
import com.audit.system.api.organize.domain.dto.SysEnterpriseDto;
import com.audit.system.api.organize.domain.po.SysEnterprisePo;
import com.audit.system.api.organize.domain.query.SysEnterpriseQuery;

/**
 * 企业管理 数据层
 *
 * @author zerozhang
 */
@Master
public interface SysEnterpriseMapper extends BaseMapper<SysEnterpriseQuery, SysEnterpriseDto, SysEnterprisePo> {
}
