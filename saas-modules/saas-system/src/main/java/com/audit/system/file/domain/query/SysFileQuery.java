package com.audit.system.file.domain.query;

import com.audit.system.file.domain.po.SysFilePo;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * 文件 数据查询对象
 *
 * @author zerozhang
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SysFileQuery extends SysFilePo {

    
    private static final long serialVersionUID = 1L;
}
