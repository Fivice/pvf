package top.fivice.pvf.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.fivice.pvf.dao.mapper.user.SysUserMapper;
import top.fivice.pvf.domain.userAndPermission.SysUser;
import top.fivice.pvf.service.user.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
    private final SysUserMapper sysUserMapper;

    @Autowired
    public SysUserServiceImpl(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }

    @Override
    public SysUser selectSysUserByUserName(String userName) {
        return sysUserMapper.selectUserByName(userName);
    }
}
