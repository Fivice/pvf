package top.fivice.pvf.service.user;

import top.fivice.pvf.domain.userAndPermission.SysPermission;

import java.util.List;

public interface SysPermissionService {
    /**
     * 通过用户Id返回用户权限列表
     * @param userId
     * @return
     */
    List<SysPermission> selectPermissionByUserId(int userId);
}
