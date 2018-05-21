package cn.xm.jwxt.mapper.baseInfo.custom;

import cn.xm.jwxt.bean.baseInfo.TCollegeBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TCollegeBaseInfoCustomMapper {


    /**
     * 组合条件查询学院信息分页显示
     * @param condition
     * @return
     * @throws SQLException
     */

    List<TCollegeBaseInfo> findCollegeInfoListByCondition(CommonQuery condition) throws SQLException;


    /**
     * 查询所有的学院名称和ID
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> findCollegeNameAndId() throws SQLException;
}
