package com.audit.system.api.authority.domain.dto;

import com.audit.system.api.authority.domain.po.SysModulePo;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.constant.basic.OperateConstants;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;

import static com.audit.system.api.authority.domain.merge.MergeGroup.MODULE_SysMenu_GROUP;

/**
 * 模块 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysModuleDto extends SysModulePo {

    
    private static final long serialVersionUID = 1L;

    /** 菜单数据 */
    @Correlation(groupName = MODULE_SysMenu_GROUP, keyType = OperateConstants.SubKeyType.RECEIVE)
    private List<SysMenuDto> subList;
}
