package top.fivice.pvf.service.user;

import top.fivice.pvf.domain.userAndPermission.SysUser;

public interface SysUserService {
    /**
     * 通过用户名获取用户信息
     * @param userName
     * @return
     */
    SysUser selectSysUserByUserName(String userName);
}
