package com.audit.system.api.model;

import com.audit.common.core.web.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 源策略 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Source extends BaseEntity {


    private static final long serialVersionUID = 1L;

    /** 源策略Id */
    Long sourceId;

    /** 主写源 */
    String master;

}
