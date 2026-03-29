package com.audit.common.core.web.tenant.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.audit.common.core.web.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * Base 租户基类
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TBaseEntity extends BaseEntity {

    
    private static final long serialVersionUID = 1L;

    /** 租户Id */
    @JsonIgnore
    @TableField(exist = false)
    protected Long enterpriseId;

}
