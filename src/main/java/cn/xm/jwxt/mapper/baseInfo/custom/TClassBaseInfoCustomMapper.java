package cn.xm.jwxt.mapper.baseInfo.custom;

import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TClassBaseInfoCustomMapper {
    /**
     * 组合条件查询班级信息分页显示
     * @param condition
     * @return
     * @throws SQLException
     */

    List<Map<String,Object>> findClassInfoListByCondition(CommonQuery condition) throws SQLException;

    /**
     * 查询所有的班级名称和ID
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> findClassNameAndId() throws SQLException;



}