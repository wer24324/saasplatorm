package com.audit.system.dict.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.system.api.dict.domain.dto.SysDictTypeDto;
import com.audit.system.api.dict.domain.query.SysDictTypeQuery;

/**
 * 字典类型管理 服务层
 *
 * @author zerozhang
 */
public interface ISysDictTypeService extends IBaseService<SysDictTypeQuery, SysDictTypeDto> {

    /**
     * 校验字典编码是否唯一
     *
     * @param Id       字典类型Id
     * @param dictCode 字典类型编码
     * @return 结果 | true/false 唯一/不唯一
     */
    boolean checkDictCodeUnique(Long Id, String dictCode);
}
