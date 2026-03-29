package com.audit.job.api.domain.query;

import com.audit.job.api.domain.po.SysJobLogPo;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 调度日志 数据查询对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysJobLogQuery extends SysJobLogPo {

    
    private static final long serialVersionUID = 1L;

}
