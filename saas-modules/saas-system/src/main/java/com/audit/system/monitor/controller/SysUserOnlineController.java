package com.audit.system.monitor.controller;

import com.audit.common.core.constant.basic.CacheConstants;
import com.audit.common.core.constant.basic.SecurityConstants;
import com.audit.common.core.utils.core.ArrayUtil;
import com.audit.common.core.utils.core.StrUtil;
import com.audit.common.core.web.result.AjaxResult;
import com.audit.common.log.annotation.Log;
import com.audit.common.log.enums.BusinessType;
import com.audit.common.redis.service.RedisService;
import com.audit.common.security.annotation.RequiresPermissions;
import com.audit.common.security.auth.Auth;
import com.audit.common.security.utils.SecurityUtils;
import com.audit.common.web.entity.controller.BasisController;
import com.audit.system.api.model.LoginUser;
import com.audit.system.monitor.domain.SysUserOnline;
import com.audit.system.monitor.service.ISysUserOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 在线用户监控
 *
 * @author zerozhang
 */
@RestController
@RequestMapping("/online")
public class SysUserOnlineController extends BasisController {

    @Autowired
    private ISysUserOnlineService userOnlineService;

    @Autowired
    private RedisService redisService;

    @GetMapping("/list")
    @RequiresPermissions(Auth.SYS_ONLINE_LIST)
    public AjaxResult list(String ipaddr, String userName) {
        Collection<String> keys = redisService.keys(CacheConstants.LOGIN_TOKEN_KEY + SecurityUtils.getEnterpriseId() + StrUtil.COLON + "*");
        List<SysUserOnline> userOnlineList = new ArrayList<>();
        for (String key : keys) {
            LoginUser loginUser = redisService.getCacheMapValue(key, SecurityConstants.BaseSecurity.LOGIN_USER.getCode());
            if (StrUtil.isNotEmpty(ipaddr) && StrUtil.isNotEmpty(userName)) {
                if (StrUtil.equals(ipaddr, loginUser.getIpaddr()) && StrUtil.equals(userName, loginUser.getUserName())) {
                    userOnlineList.add(userOnlineService.selectOnlineByInfo(ipaddr, userName, loginUser));
                }
            } else if (StrUtil.isNotEmpty(ipaddr)) {
                if (StrUtil.equals(ipaddr, loginUser.getIpaddr())) {
                    userOnlineList.add(userOnlineService.selectOnlineByIpaddr(ipaddr, loginUser));
                }
            } else if (StrUtil.isNotEmpty(userName)) {
                if (StrUtil.equals(userName, loginUser.getUserName())) {
                    userOnlineList.add(userOnlineService.selectOnlineByUserName(userName, loginUser));
                }
            } else {
                userOnlineList.add(userOnlineService.loginUserToUserOnline(loginUser));
            }
        }
        Collections.reverse(userOnlineList);
        userOnlineList.removeAll(Collections.singleton(null));
        return getDataTable(userOnlineList);
    }

    /**
     * 强退用户
     */
    @DeleteMapping("/batch/{idList}")
    @RequiresPermissions(Auth.SYS_ONLINE_FORCE_LOGOUT)
    @Log(title = "在线用户", businessType = BusinessType.FORCE)
    public AjaxResult forceLogout(@PathVariable List<String> idList) {
        if (ArrayUtil.isNotEmpty(idList))
            idList.forEach(id -> redisService.deleteObject(CacheConstants.LOGIN_TOKEN_KEY + id));
        return success();
    }
}
