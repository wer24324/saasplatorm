package com.audit.system.api.dict.domain.dto;

import com.audit.system.api.dict.domain.po.SysDictTypePo;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.constant.basic.OperateConstants;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;

import static com.audit.system.api.dict.domain.merge.MergeGroup.DICT_DATA_GROUP;

/**
 * 字典类型 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysDictTypeDto extends SysDictTypePo {

    
    private static final long serialVersionUID = 1L;

    /** 字典数据 */
    @Correlation(groupName = DICT_DATA_GROUP, keyType = OperateConstants.SubKeyType.RECEIVE)
    private List<SysDictDataDto> subList;

}
