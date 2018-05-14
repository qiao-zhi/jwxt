package cn.xm.jwxt.mapper.system.custom;

import cn.xm.jwxt.bean.system.Logtable;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 22:32 2018/5/10
 */
public interface LogtableCustomMapper {
    /**
     * 分页查询日志信息
     * @param condition 组合条件
     * @return  日志集合
     * @throws SQLException
     */
    public List<Logtable> getLogtableFY(Map condition)throws SQLException;
}
