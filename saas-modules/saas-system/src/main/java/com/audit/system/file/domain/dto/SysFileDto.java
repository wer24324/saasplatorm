package com.audit.system.file.domain.dto;

import com.audit.system.file.domain.po.SysFilePo;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 文件 数据传输对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysFileDto extends SysFilePo {

    
    private static final long serialVersionUID = 1L;

}
