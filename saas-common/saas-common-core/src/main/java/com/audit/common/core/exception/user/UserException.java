package com.audit.common.core.exception.user;

import com.audit.common.core.exception.base.BaseException;



/**
 * 用户信息异常类
 *
 * @author zerozhang
 */
public class UserException extends BaseException
{
    
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
