package top.fivice.pvf.service.user.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
;
import org.springframework.stereotype.Service;
import top.fivice.pvf.domain.userAndPermission.SysPermission;
import top.fivice.pvf.domain.userAndPermission.SysUser;
import top.fivice.pvf.service.user.SysPermissionService;
import top.fivice.pvf.service.user.SysUserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private SysUserService sysUserService;
    @Resource
    private SysPermissionService sysPermissionService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //需要构造出 org.springframework.security.core.userdetails.User 对象并返回

        if (StringUtils.isBlank(userName)) {
            throw new RuntimeException("用户不能为空");
        }
        SysUser sysUser = sysUserService.selectSysUserByUserName(userName);
        if (sysUser == null) {
            throw new RuntimeException("用户不存在");
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        List<SysPermission> sysPermissions = sysPermissionService.selectPermissionByUserId(sysUser.getId());
        sysPermissions.forEach(sysPermission -> {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(sysPermission.getPermissionCode());
            grantedAuthorities.add(grantedAuthority);
        });
        return new User(sysUser.getAccount(),sysUser.getPassword(),sysUser.getEnabled(),sysUser.getAccountNotExpired(),sysUser.getCredentialsNotExpired(),sysUser.getAccountNotLocked(),grantedAuthorities);
    }
}
