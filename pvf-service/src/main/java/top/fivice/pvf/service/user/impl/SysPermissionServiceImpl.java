package top.fivice.pvf.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.fivice.pvf.dao.mapper.user.SysPermissionMapper;
import top.fivice.pvf.domain.userAndPermission.SysPermission;
import top.fivice.pvf.service.user.SysPermissionService;

import java.util.List;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    private final SysPermissionMapper sysPermissionMapper;

    @Autowired
    public SysPermissionServiceImpl(SysPermissionMapper sysPermissionMapper) {
        this.sysPermissionMapper = sysPermissionMapper;
    }

    @Override
    public List<SysPermission> selectPermissionByUserId(int userId) {
        return sysPermissionMapper.selectPermissionByUserId(userId);
    }
}
