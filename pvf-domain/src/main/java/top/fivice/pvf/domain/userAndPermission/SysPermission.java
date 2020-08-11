package top.fivice.pvf.domain.userAndPermission;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
    * 权限表
    */
@TableName(value = "sys_permission")
public class SysPermission {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 权限code
     */
    @TableField(value = "permission_code")
    private String permissionCode;

    /**
     * 权限名
     */
    @TableField(value = "permission_name")
    private String permissionName;

    public static final String COL_ID = "id";

    public static final String COL_PERMISSION_CODE = "permission_code";

    public static final String COL_PERMISSION_NAME = "permission_name";

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限code
     *
     * @return permission_code - 权限code
     */
    public String getPermissionCode() {
        return permissionCode;
    }

    /**
     * 设置权限code
     *
     * @param permissionCode 权限code
     */
    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    /**
     * 获取权限名
     *
     * @return permission_name - 权限名
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 设置权限名
     *
     * @param permissionName 权限名
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}