package cn.xm.jwxt.mapper.system;

import cn.xm.jwxt.bean.system.UserRole;
import cn.xm.jwxt.bean.system.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    int countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(Integer userroleid);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Integer userroleid);

    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}