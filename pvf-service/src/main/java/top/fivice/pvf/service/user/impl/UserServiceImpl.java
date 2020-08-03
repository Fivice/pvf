package top.fivice.pvf.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.fivice.pvf.dao.mapper.user.UserMapper;
import top.fivice.pvf.domain.userAndPermission.SysUser;
import top.fivice.pvf.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public SysUser getUser(String userName) {
        return null;
    }
}
