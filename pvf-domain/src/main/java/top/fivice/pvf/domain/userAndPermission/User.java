package top.fivice.pvf.domain.userAndPermission;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @author wubin
 * 用户
 * 2020年7月31日09:40:44
 */
@TableName("sys_user")
public class User {
    //id int NOT NULL AUTO_INCREMENT,
    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private Integer id;
    //account varchar(32) COLLATE utf8mb4_general_ci NOT NULL COMMENT '账号',
    @TableField("account")
    private String account;
    //user_name varchar(32) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
    @TableField("user_name")
    private String userName;
    //password varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户密码',
    @TableField("password")
    private String password;
    //last_login_time datetime DEFAULT NULL COMMENT '上一次登录时间',
    @TableField("last_login_time")
    private Date lastLoginTime;
    //enabled tinyint(1) DEFAULT '1' COMMENT '账号是否可用。默认为1（可用）',
    @TableField("enabled")
    private Boolean enabled;
    //not_expired tinyint(1) DEFAULT '1' COMMENT '是否过期。默认为1（没有过期）',
    @TableField("not_expired")
    private Boolean accountNotExpired;
    //account_not_locked tinyint(1) DEFAULT '1' COMMENT '账号是否锁定。默认为1（没有锁定）',
    @TableField("account_not_locked")
    private Boolean accountNotLocked;
    //credentials_not_expired tinyint(1) DEFAULT '1' COMMENT '证书（密码）是否过期。默认为1（没有过期）',
    @TableField("credentials_not_expired")
    private Boolean credentialsNotExpired;
    //create_time datetime DEFAULT NULL COMMENT '创建时间',
    @TableField("create_time")
    private Date createTime;
    //update_time datetime DEFAULT NULL COMMENT '修改时间',
    @TableField("update_time")
    private Date updateTime;
    //create_user int DEFAULT NULL COMMENT '创建人',
    @TableField("create_user")
    private Integer createUser;
    //update_user int DEFAULT NULL COMMENT '修改人',
    @TableField("update_user")
    private  Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getAccountNotExpired() {
        return accountNotExpired;
    }

    public void setAccountNotExpired(Boolean accountNotExpired) {
        this.accountNotExpired = accountNotExpired;
    }

    public Boolean getAccountNotLocked() {
        return accountNotLocked;
    }

    public void setAccountNotLocked(Boolean accountNotLocked) {
        this.accountNotLocked = accountNotLocked;
    }

    public Boolean getCredentialsNotExpired() {
        return credentialsNotExpired;
    }

    public void setCredentialsNotExpired(Boolean credentialsNotExpired) {
        this.credentialsNotExpired = credentialsNotExpired;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}
