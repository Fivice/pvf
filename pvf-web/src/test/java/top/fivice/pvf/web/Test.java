package top.fivice.pvf.web;

import org.springframework.boot.test.context.SpringBootTest;
import top.fivice.pvf.dao.mapper.user.SysRoleMapper;
import top.fivice.pvf.dao.mapper.user.SysUserRoleRelationMapper;
import top.fivice.pvf.dao.mapper.user.SysUserMapper;
import top.fivice.pvf.domain.userAndPermission.SysRole;
import top.fivice.pvf.domain.userAndPermission.SysUser;
import top.fivice.pvf.domain.userAndPermission.SysUserRoleRelation;
import top.fivice.pvf.service.user.SysUserService;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class Test {
    @Resource
    private SysUserMapper sysUserMapper;
    @Resource
    private SysUserRoleRelationMapper sysUserRoleRelationMapper;
    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private SysUserService sysUserService;

    @org.junit.jupiter.api.Test
    public void testSelect() {

        List<SysRole> list = sysRoleMapper.selectRoleByName(1);
        SysUser sysUser = sysUserService.selectSysUserByUserName("user");
    }

}
