package com.audit.common.security.auth;

import com.audit.common.security.auth.pool.GenPool;
import com.audit.common.security.auth.pool.JobPool;
import com.audit.common.security.auth.pool.SystemPool;
import com.audit.common.security.auth.pool.TenantPool;

/**
 * Token 权限标识常量
 *
 * @author zerozhang
 */
public class Auth implements SystemPool, JobPool, GenPool, TenantPool {
}
