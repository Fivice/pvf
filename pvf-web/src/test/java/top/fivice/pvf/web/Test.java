package top.fivice.pvf.web;

import org.springframework.boot.test.context.SpringBootTest;
import top.fivice.pvf.dao.mapper.user.UserMapper;
import top.fivice.pvf.domain.userAndPermission.SysUser;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class Test {
    @Resource
    private UserMapper userMapper;

    @org.junit.jupiter.api.Test
    public void testSelect() {
       SysUser sysUser = userMapper.selectByName("user1");
    }

}
