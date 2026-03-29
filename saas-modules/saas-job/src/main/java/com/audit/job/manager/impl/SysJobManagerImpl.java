package com.audit.job.manager.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.audit.common.core.constant.basic.OperateConstants;
import com.audit.common.web.annotation.TenantIgnore;
import com.audit.common.web.entity.domain.SlaveRelation;
import com.audit.common.web.entity.manager.impl.BaseManagerImpl;
import com.audit.job.api.domain.dto.SysJobDto;
import com.audit.job.api.domain.model.SysJobConverter;
import com.audit.job.api.domain.po.SysJobPo;
import com.audit.job.api.domain.query.SysJobQuery;
import com.audit.job.manager.ISysJobManager;
import com.audit.job.mapper.SysJobMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.audit.job.api.constant.MergeConstants.JOB_LOG_GROUP;

/**
 * 调度任务管理 数据封装层处理
 *
 * @author zerozhang
 */
@Component
public class SysJobManagerImpl extends BaseManagerImpl<SysJobQuery, SysJobDto, SysJobPo, SysJobMapper, SysJobConverter> implements ISysJobManager {

    /**
     * 初始化从属关联关系
     *
     * @return 关系对象集合
     */
    protected List<SlaveRelation> subRelationInit() {
        return new ArrayList(){{
            add(new SlaveRelation(JOB_LOG_GROUP, SysJobLogManagerImpl.class, OperateConstants.SubOperateLimit.ONLY_DEL));
        }};
    }

    /**
     * 项目启动时
     */
    @Override
    @TenantIgnore(tenantLine = true)
    public List<SysJobDto> initScheduler() {
        List<SysJobPo> jobList = baseMapper.selectList(Wrappers.query());
        return baseConverter.mapperDto(jobList);
    }

}
