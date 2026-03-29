package com.audit.auth.controller;

import com.audit.auth.service.SysLoginService;
import com.audit.auth.form.LoginBody;
import com.audit.auth.form.RegisterBody;
import com.audit.common.core.constant.basic.TenantConstants;
import com.audit.common.core.utils.JwtUtil;
import com.audit.common.core.utils.core.ObjectUtil;
import com.audit.common.core.utils.core.StrUtil;
import com.audit.common.core.web.result.AjaxResult;
import com.audit.common.security.auth.AuthUtil;
import com.audit.common.security.service.TokenService;
import com.audit.common.security.utils.SecurityUtils;
import com.audit.system.api.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * token 控制
 *
 * @author zerozhang
 */
@RestController
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private SysLoginService sysLoginService;

    @PostMapping("login")
    public AjaxResult login(@RequestBody LoginBody form) {
        // 用户登录
        LoginUser userInfo = sysLoginService.login(form.getEnterpriseName(), form.getUserName(), form.getPassword());
        // 获取登录token
        return AjaxResult.success(tokenService.createToken(userInfo));
    }

    @DeleteMapping("logout")
    public AjaxResult logout(HttpServletRequest request) {
        String token = SecurityUtils.getToken(request);
        if (StrUtil.isNotEmpty(token)) {
            LoginUser loginUser = tokenService.getLoginUser(request);
            String accountType = JwtUtil.getAccountType(token);
            // 删除用户缓存记录
            AuthUtil.logoutByToken(token, TenantConstants.AccountType.getByCode(accountType));
            if (ObjectUtil.isNotNull(loginUser)) {
                String sourceName = JwtUtil.getSourceName(token);
                Long enterpriseId = Long.valueOf(JwtUtil.getEnterpriseId(token));
                String enterpriseName = JwtUtil.getEnterpriseName(token);
                Long userId = Long.valueOf(JwtUtil.getUserId(token));
                String userName = JwtUtil.getUserName(token);
                String userNick = loginUser.getUser().getNickName();
                // 记录用户退出日志
                sysLoginService.logout(sourceName, enterpriseId, enterpriseName, userId, userName, userNick);
            }
        }
        return AjaxResult.success();
    }

    @PostMapping("refresh")
    public AjaxResult refresh(HttpServletRequest request) {
        tokenService.refreshToken(request);
        return AjaxResult.success();
    }

    @PostMapping("register")
    public AjaxResult register(@RequestBody RegisterBody registerBody) {
        // 用户注册
        sysLoginService.register(registerBody);
        return AjaxResult.success();
    }
}
