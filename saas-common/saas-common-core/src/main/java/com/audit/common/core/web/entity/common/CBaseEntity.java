package com.audit.common.core.web.entity.common;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.audit.common.core.constant.basic.DictConstants;
import com.audit.common.core.utils.core.StrUtil;
import com.audit.common.core.web.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * Base 混合基类
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CBaseEntity extends BaseEntity {

    
    private static final long serialVersionUID = 1L;

    /** 公共数据（Y是 N否） */
    @TableField(updateStrategy = FieldStrategy.NEVER)
    protected String isCommon;

    /** 校验是否为公共数据 */
    public boolean isCommon(){
        return StrUtil.equals(DictConstants.DicCommonPrivate.COMMON.getCode(), getIsCommon());
    }

    /** 校验是否非公共数据 */
    public boolean isNotCommon(){
        return !isCommon();
    }
}
