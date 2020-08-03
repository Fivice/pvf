package top.fivice.pvf.service.user;

import top.fivice.pvf.domain.userAndPermission.SysUser;

public interface UserService {
    SysUser getUser(String userName);
}
