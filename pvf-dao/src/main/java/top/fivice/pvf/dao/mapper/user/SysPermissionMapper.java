package top.fivice.pvf.dao.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.fivice.pvf.domain.userAndPermission.SysPermission;

import java.util.List;

public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    List<SysPermission> selectPermissionByUserId(int userId);
}