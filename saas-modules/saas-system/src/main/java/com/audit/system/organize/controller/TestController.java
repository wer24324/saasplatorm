package com.audit.system.organize.controller;

import com.audit.common.core.web.result.AjaxResult;
import com.audit.system.api.organize.domain.req.SysRoleUserReq;
import com.audit.system.organize.service.ISysOrganizeService;
import com.audit.system.organize.service.ISysTestSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mytest")
public class TestController {
    @Autowired
    private ISysTestSerivce sysTestSerivce;
    /**
     * 按条件获取角色下直接关联的用户，不含通过岗位，部门间接关联的用户
     */
    @PostMapping("/get-mytest")
    public AjaxResult getRoleUser(@RequestBody SysRoleUserReq sysRoleUserReq) {
        return AjaxResult.success(sysTestSerivce.getRoleUser(sysRoleUserReq));
    }

}
