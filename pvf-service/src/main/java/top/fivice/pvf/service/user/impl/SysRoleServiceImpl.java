package top.fivice.pvf.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.fivice.pvf.dao.mapper.user.SysRoleMapper;
import top.fivice.pvf.domain.userAndPermission.SysRole;
import top.fivice.pvf.service.user.SysRoleService;

import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {
    private final SysRoleMapper sysRoleMapper;
    @Autowired
    public SysRoleServiceImpl(SysRoleMapper sysRoleMapper) {
        this.sysRoleMapper = sysRoleMapper;
    }

    @Override
    public List<SysRole> selectSysRoleByUserId(int userId) {
        return sysRoleMapper.selectRoleByName(userId);
    }
}
