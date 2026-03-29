package com.audit.system.api.model;

import com.audit.system.api.model.base.BaseLoginUser;
import com.audit.system.api.organize.domain.dto.SysUserDto;
import com.audit.common.core.constant.basic.TenantConstants;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.Map;

/**
 * 管理端 - 用户信息
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LoginUser extends BaseLoginUser<SysUserDto> {

    
    private static final long serialVersionUID = 1L;

    /** 数据权限 */
    private DataScope scope;

    /** 路由路径映射列表 */
    private Map<String, String> routeURL;

    /** 账户类型 */
    private TenantConstants.AccountType accountType = TenantConstants.AccountType.ADMIN;

    /** 初始化权限范围 */
    public DataScope getDataScope() {
        scope.setEnterpriseId(enterpriseId);
        scope.setUserId(userId);
        scope.setIsLessor(isLessor);
        scope.setUserType(userType);
        return scope;
    }

    /** 初始化路由路径映射列表 */
    public void initRouteURL() {
        routeURL = null;
    }

}
