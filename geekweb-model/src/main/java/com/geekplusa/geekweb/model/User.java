package com.geekplusa.geekweb.model;

import com.geekplusa.geekweb.model.base.BaseModel;

import java.util.List;

/**
 * @program: geekweb
 * @description: ${description}
 * @author: weixd
 * @createTime: 2019-04-19 16:16
 **/
public class User extends BaseModel {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 联系电话
     */
    private String telphone;
    /**
     * 登陆次数
     */
    private String logicCount;
    /**
     * 上次登录时间
     */
    private String lastLoginTime;
    /**
     * 上次登录ip
     */
    private String lastLoginIp;
    /**
     * 角色id
     */
    private String roleId;
    /**
     * 用户所在部门id列表
     */
    private List<String> departmentIds;
    /**
     * 用户所在部门名称列表
     */
    private List<String> getDepartmentNames;


}
