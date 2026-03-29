package com.audit.system.api.organize.domain.vo;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.audit.common.core.annotation.Excel;
import com.audit.common.core.web.validate.V_A_E;
import com.audit.common.core.web.validate.V_CUS;
import com.audit.common.core.xss.Xss;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

/**
 * 根据角色查找直接关联的用户
 *
 * @author zerozhang
 */
@Data
@NoArgsConstructor
public class SysRoleUserVO {


    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 用户id
     */
    private Long id;


    /**
     * 用户编码
     */

    private String code;

    /**
     * 用户账号
     */

    private String userName;

    /**
     * 用户昵称
     */

    private String nickName;

    /**
     * 用户标识（00超级管理员）
     */

    private String userType;

    /**
     * 手机号码
     */

    private String phone;

    /**
     * 用户邮箱
     */

    private String email;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 个人简介
     */
    private String profile;

    /**
     * 密码
     */
    private String password;

    /**
     * 最后登录IP
     */
    private String loginIp;

    /**
     * 最后登录时间
     */
    private LocalDateTime loginDate;

    private Integer offset = 0;

    private Integer size = 10;

}
