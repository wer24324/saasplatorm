package com.audit.system.api.log.domain.dto;

import com.audit.system.api.log.domain.po.SysOperateLogPo;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 操作日志 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysOperateLogDto extends SysOperateLogPo {

    
    private static final long serialVersionUID = 1L;

    /** 业务类型数组 */
    private Integer[] businessTypes;

}
