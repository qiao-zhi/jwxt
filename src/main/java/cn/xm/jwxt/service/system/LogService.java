package cn.xm.jwxt.service.system;

import cn.xm.jwxt.bean.system.Logtable;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 日志Service
 * @Date: 20:19 2018/5/13
 */
public interface LogService {

    /**
     * 增加日志
     * @param logtable  需要增加的日志实体
     * @return
     * @throws SQLException
     */
    public boolean addLogtable(Logtable logtable)throws SQLException;

    /**
     * 分页查询日志信息
     * @param condition 组合条件
     * @return  日志集合
     * @throws SQLException
     */
    public List<Logtable> getLogtableFY(Map condition)throws SQLException;
}
