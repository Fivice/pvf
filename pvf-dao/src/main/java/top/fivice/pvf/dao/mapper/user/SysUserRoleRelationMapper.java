package top.fivice.pvf.dao.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.fivice.pvf.domain.userAndPermission.SysUserRoleRelation;

import java.util.List;

public interface SysUserRoleRelationMapper extends BaseMapper<SysUserRoleRelation> {
    List<SysUserRoleRelation> selectByUserId(int userId);
}