package com.audit.system.organize.controller;

import com.audit.common.core.utils.TreeUtil;
import com.audit.common.core.web.result.AjaxResult;
import com.audit.common.security.annotation.Logical;
import com.audit.common.security.annotation.RequiresPermissions;
import com.audit.common.security.auth.Auth;
import com.audit.common.web.entity.controller.BasisController;
import com.audit.system.api.organize.domain.req.SysRoleUserReq;
import com.audit.system.organize.service.ISysOrganizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 组织管理 业务处理
 *
 * @author zerozhang
 */
@RestController
@RequestMapping("/organize")
public class SysOrganizeController extends BasisController {

    @Autowired
    private ISysOrganizeService organizeService;

    /**
     * 获取企业部门|岗位树
     */
    @GetMapping(value = "/organizeScope")
    @RequiresPermissions(value = {Auth.SYS_ROLE_ADD, Auth.SYS_ROLE_AUTH}, logical = Logical.OR)
    public AjaxResult getOrganizeScope() {
        return success(TreeUtil.buildTree(organizeService.selectOrganizeScope()));
    }

    /**
     * 获取下拉树列表
     */
    @GetMapping("/option")
    public AjaxResult option() {
        return success(organizeService.selectOrganizeTreeExDeptNode());
    }

    /**
     * 按条件获取角色下直接关联的用户，不含通过岗位，部门间接关联的用户
     */
    @PostMapping("/get-roleuser")
    public AjaxResult getRoleUser(@RequestBody SysRoleUserReq sysRoleUserReq) {
        return success(organizeService.getRoleUser(sysRoleUserReq));
    }
}
