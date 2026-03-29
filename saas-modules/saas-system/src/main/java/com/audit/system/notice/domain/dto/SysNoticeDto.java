package com.audit.system.notice.domain.dto;

import com.audit.system.notice.domain.po.SysNoticePo;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 通知公告 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysNoticeDto extends SysNoticePo {

    
    private static final long serialVersionUID = 1L;

}
