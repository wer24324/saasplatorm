package com.audit.system.api.authority.domain.dto;

import com.audit.system.api.authority.domain.po.SysMenuPo;
import com.audit.common.core.annotation.Correlation;
import com.audit.common.core.constant.basic.OperateConstants;
import com.audit.common.core.constant.system.AuthorityConstants;
import com.audit.common.core.utils.core.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;



import static com.audit.system.api.authority.domain.merge.MergeGroup.MENU_SysModule_GROUP;

/**
 * 菜单 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysMenuDto extends SysMenuPo {

    
    private static final long serialVersionUID = 1L;

    /** 菜单全路径 */
    private String fullPath;

    /** 详情页激活的菜单 */
    private String currentActiveMenu;

    /** 模块信息 */
    @Correlation(groupName = MENU_SysModule_GROUP, keyType = OperateConstants.SubKeyType.RECEIVE)
    private SysModuleDto module;

    /**
     * 校验菜单类型是否为目录
     */
    public boolean isDir() {
        return StrUtil.equals(AuthorityConstants.MenuType.DIR.getCode(), getMenuType());
    }

    /**
     * 校验菜单类型是否为菜单
     */
    public boolean isMenu() {
        return StrUtil.equals(AuthorityConstants.MenuType.MENU.getCode(), getMenuType());
    }

    /**
     * 校验菜单类型是否为详情
     */
    public boolean isDetails() {
        return StrUtil.equals(AuthorityConstants.MenuType.DETAILS.getCode(), getMenuType());
    }

    /**
     * 校验页面类型是否为内链
     */
    public boolean isEmbedded() {
        return StrUtil.equals(AuthorityConstants.FrameType.EMBEDDED.getCode(), getFrameType());
    }

    /**
     * 校验页面类型是否为外链
     */
    public boolean isExternalLinks() {
        return StrUtil.equals(AuthorityConstants.FrameType.EXTERNAL_LINKS.getCode(), getFrameType());
    }


    /**
     * 移除详情菜单动态后缀
     */
    public String getDetailsSuffix() {
        return isDetails()
                ? StrUtil.sub(getPath(), 0, getPath().indexOf(StrUtil.COLON))
                : getPath();
    }
}
