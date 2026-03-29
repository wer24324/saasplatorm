package com.audit.system.file.controller;

import com.audit.common.core.utils.core.StrUtil;
import com.audit.common.core.web.result.AjaxResult;
import com.audit.common.core.web.validate.V_A;
import com.audit.common.log.annotation.Log;
import com.audit.common.log.enums.BusinessType;
import com.audit.common.security.annotation.InnerAuth;
import com.audit.common.security.annotation.RequiresPermissions;
import com.audit.common.security.auth.Auth;
import com.audit.common.security.utils.base.BaseSecurityUtils;
import com.audit.common.web.entity.controller.BaseController;
import com.audit.system.file.domain.dto.SysFileDto;
import com.audit.system.file.domain.query.SysFileQuery;
import com.audit.system.file.service.ISysFileService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文件管理 业务处理
 *
 * @author zerozhang
 */
@RestController
@RequestMapping("/file")
public class SysFileController extends BaseController<SysFileQuery, SysFileDto, ISysFileService> {

    /** 定义节点名称 */
    @Override
    protected String getNodeName() {
        return "文件";
    }

    /**
     * 文件新增
     */
    @InnerAuth
    @PostMapping
    public AjaxResult addInner(@Validated({V_A.class}) @RequestBody SysFileDto file) {
        return toAjax(StrUtil.isEmpty(BaseSecurityUtils.getSourceName()) ? baseService.insertToMaster(file) : baseService.insert(file));
    }

    /**
     * 文件批量删除
     */
    @Override
    @DeleteMapping("/batch/{idList}")
    @RequiresPermissions(Auth.SYS_FILE_DEL)
    @Log(title = "文件管理", businessType = BusinessType.DELETE)
    public AjaxResult batchRemove(@PathVariable List<Long> idList) {
        return super.batchRemove(idList);
    }

}
