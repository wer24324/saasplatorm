package com.audit.system.organize.mapper;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.system.api.organize.domain.req.SysRoleUserReq;
import com.audit.system.api.organize.domain.vo.SysRoleUserVO;
import com.audit.system.organize.domain.merge.SysOrganizeRoleMerge;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Isolate
public interface SysTestMapper extends BaseMapper<SysOrganizeRoleMerge> {
    List<SysRoleUserVO> getRoleUser(@Param("sysRoleUserReq") SysRoleUserReq sysRoleUserReq);
}
