package com.audit.job.api.domain.dto;

import com.audit.job.api.constant.MergeConstants;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.constant.basic.OperateConstants;
import com.audit.job.api.domain.po.SysJobPo;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;

/**
 * 调度任务 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysJobDto extends SysJobPo {

    
    private static final long serialVersionUID = 1L;

    /** 任务记录数据集合 */
    @Correlation(groupName = MergeConstants.JOB_LOG_GROUP, keyType = OperateConstants.SubKeyType.RECEIVE)
    private List<SysJobLogDto> subList;
}
