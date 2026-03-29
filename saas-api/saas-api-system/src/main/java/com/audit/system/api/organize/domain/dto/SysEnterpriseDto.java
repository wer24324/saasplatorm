package com.audit.system.api.organize.domain.dto;

import com.audit.system.api.organize.domain.po.SysEnterprisePo;
import com.audit.common.core.constant.system.AuthorityConstants;
import com.audit.common.core.utils.core.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 企业 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysEnterpriseDto extends SysEnterprisePo {

    
    private static final long serialVersionUID = 1L;

    public boolean isAdmin() {
        return isAdmin(getIsLessor());
    }

    public static boolean isAdmin(String isLessor) {
        return StrUtil.equals(AuthorityConstants.TenantType.ADMIN.getCode(), isLessor);
    }

}
