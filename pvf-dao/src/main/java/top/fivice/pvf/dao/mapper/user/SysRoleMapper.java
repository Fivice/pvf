package top.fivice.pvf.dao.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.fivice.pvf.domain.userAndPermission.SysRole;

import java.util.List;

public interface SysRoleMapper extends BaseMapper<SysRole> {
    List<SysRole> selectRoleByName(int userId);
}