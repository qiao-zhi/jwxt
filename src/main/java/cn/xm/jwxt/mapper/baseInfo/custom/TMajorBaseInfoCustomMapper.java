package cn.xm.jwxt.mapper.baseInfo.custom;

import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TMajorBaseInfoCustomMapper {

    /**
     * 组合条件查询专业信息分页显示
     * @param condition
     * @return
     * @throws SQLException
     */

    List<TMajorBaseInfo> findMajorInfoListByCondition(CommonQuery condition) throws SQLException;

    /**
     * 查询所有的专业名称和ID
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> findMajorNameAndId() throws SQLException;
}
