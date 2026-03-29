package com.audit.system.api.log.domain.query;

import com.audit.system.api.log.domain.po.SysOperateLogPo;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.time.LocalDateTime;

/**
 * 操作日志 数据查询对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysOperateLogQuery extends SysOperateLogPo {

    
    private static final long serialVersionUID = 1L;

    /** 操作时间 - 起始 */
    private LocalDateTime operateTimeStart;

    /** 操作时间 - 终止 */
    private LocalDateTime operateTimeEnd;

}
