package com.audit.system.monitor.controller;

import com.audit.common.core.web.result.AjaxResult;
import com.audit.common.core.web.result.R;
import com.audit.common.log.annotation.Log;
import com.audit.common.log.enums.BusinessType;
import com.audit.common.security.annotation.InnerAuth;
import com.audit.common.security.annotation.RequiresPermissions;
import com.audit.common.security.auth.Auth;
import com.audit.common.web.entity.controller.BaseController;
import com.audit.system.api.log.domain.dto.SysLoginLogDto;
import com.audit.system.api.log.domain.query.SysLoginLogQuery;
import com.audit.system.monitor.service.ISysLoginLogService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 访问日志管理 业务处理
 *
 * @author zerozhang
 */
@RestController
@RequestMapping("/loginLog")
public class SysLoginLogController extends BaseController<SysLoginLogQuery, SysLoginLogDto, ISysLoginLogService> {

    /** 定义节点名称 */
    @Override
    protected String getNodeName() {
        return "访问日志";
    }

    /**
     * 新增访问日志 | 内部调用
     */
    @InnerAuth
    @PostMapping
    public R<Boolean> addInner(@RequestBody SysLoginLogDto loginInfo) {
        baseService.insert(loginInfo);
        return R.ok();
    }

    /**
     * 查询系统访问记录列表
     */
    @Override
    @GetMapping("/list")
    @RequiresPermissions(Auth.SYS_LOGIN_LOG_LIST)
    public AjaxResult list(SysLoginLogQuery loginLog) {
        return super.list(loginLog);
    }

    /**
     * 系统访问记录导出
     */
    @Override
    @PostMapping("/export")
    @RequiresPermissions(Auth.SYS_LOGIN_LOG_EXPORT)
    @Log(title = "访问日志", businessType = BusinessType.EXPORT)
    public void export(HttpServletResponse response, SysLoginLogQuery loginLog) {
        super.export(response, loginLog);
    }

    /**
     * 系统访问记录批量删除
     */
    @Override
    @DeleteMapping("/batch/{idList}")
    @RequiresPermissions(Auth.SYS_LOGIN_LOG_DEL)
    @Log(title = "访问日志", businessType = BusinessType.DELETE)
    public AjaxResult batchRemove(@PathVariable List<Long> idList) {
        return super.batchRemove(idList);
    }

    /**
     * 系统访问记录清空
     */
    @DeleteMapping("/clean")
    @RequiresPermissions(Auth.SYS_LOGIN_LOG_DEL)
    @Log(title = "访问日志", businessType = BusinessType.CLEAN)
    public AjaxResult clean() {
        baseService.cleanLoginLog();
        return success();
    }

}
