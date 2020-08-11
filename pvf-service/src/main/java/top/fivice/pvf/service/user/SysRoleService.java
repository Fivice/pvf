package top.fivice.pvf.service.user;

import top.fivice.pvf.domain.userAndPermission.SysRole;

import java.util.List;

public interface SysRoleService {
    /**
     * 根据用户id获取用户角色信息
     * @param userId
     * @return
     */
    List<SysRole> selectSysRoleByUserId(int userId);
}
