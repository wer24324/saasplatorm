package com.audit.system.api.dict.domain.dto;

import com.audit.system.api.dict.domain.po.SysConfigPo;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 参数配置 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysConfigDto extends SysConfigPo {

    
    private static final long serialVersionUID = 1L;

}
