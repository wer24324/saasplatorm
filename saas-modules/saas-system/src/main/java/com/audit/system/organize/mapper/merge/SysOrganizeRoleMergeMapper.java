package com.audit.system.organize.mapper.merge;

import com.audit.common.datasource.annotation.Isolate;
import com.audit.common.web.entity.mapper.BasicMapper;
import com.audit.system.api.organize.domain.req.SysRoleUserReq;
import com.audit.system.organize.domain.merge.SysOrganizeRoleMerge;
import com.audit.system.api.organize.domain.vo.SysRoleUserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 组织-角色关联（角色绑定） 数据层
 *
 * @author zerozhang
 */
@Isolate
public interface SysOrganizeRoleMergeMapper extends BasicMapper<SysOrganizeRoleMerge>
      {
    List<SysRoleUserVO> getRoleUser(@Param("sysRoleUserReq") SysRoleUserReq sysRoleUserReq);
}
