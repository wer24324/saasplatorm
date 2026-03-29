package com.audit.system.organize.service;

import com.audit.common.web.entity.service.IBaseService;
import com.audit.system.api.organize.domain.req.SysRoleUserReq;
import com.audit.system.api.organize.domain.vo.SysRoleUserVO;

import java.util.List;

public interface ISysTestSerivce  {
    List<SysRoleUserVO> getRoleUser(SysRoleUserReq sysRoleUserReq);
}
