package com.audit.system.organize.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.system.api.organize.domain.dto.SysEnterpriseDto;
import com.audit.system.api.organize.domain.query.SysEnterpriseQuery;

/**
 * 企业管理 服务层
 *
 * @author zerozhang
 */
public interface ISysEnterpriseService extends IBaseService<SysEnterpriseQuery, SysEnterpriseDto> {

    /**
     * 根据名称查询状态正常企业对象
     *
     * @param name 名称
     * @return 企业对象
     */
    SysEnterpriseDto selectByName(String name);
}
