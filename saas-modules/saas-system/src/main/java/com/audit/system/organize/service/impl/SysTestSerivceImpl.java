package com.audit.system.organize.service.impl;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.system.api.organize.domain.req.SysRoleUserReq;
import com.audit.system.api.organize.domain.vo.SysRoleUserVO;
import com.audit.system.organize.manager.impl.SysOrganizeManager;
import com.audit.system.organize.mapper.SysTestMapper;
import com.audit.system.organize.service.ISysTestSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Isolate
public class SysTestSerivceImpl implements ISysTestSerivce {
    @Autowired
    private SysTestMapper sysTestMapper;
    @Override
    public List<SysRoleUserVO> getRoleUser(SysRoleUserReq sysRoleUserReq) {
        return sysTestMapper.getRoleUser(sysRoleUserReq);
    }
}
