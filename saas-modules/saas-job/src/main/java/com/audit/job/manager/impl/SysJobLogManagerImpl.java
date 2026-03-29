package com.audit.job.manager.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.audit.common.web.entity.manager.impl.BaseManagerImpl;
import com.audit.job.api.domain.dto.SysJobLogDto;
import com.audit.job.api.domain.model.SysJobLogConverter;
import com.audit.job.api.domain.po.SysJobLogPo;
import com.audit.job.api.domain.query.SysJobLogQuery;
import com.audit.job.manager.ISysJobLogManager;
import com.audit.job.mapper.SysJobLogMapper;
import org.springframework.stereotype.Component;

/**
 * 调度任务日志管理 数据封装层处理
 *
 * @author zerozhang
 */
@Component
public class SysJobLogManagerImpl extends BaseManagerImpl<SysJobLogQuery, SysJobLogDto, SysJobLogPo, SysJobLogMapper, SysJobLogConverter> implements ISysJobLogManager {

    /**
     * 清空任务日志
     */
    @Override
    public void cleanLog() {
        baseMapper.delete(Wrappers.update());
    }
}
