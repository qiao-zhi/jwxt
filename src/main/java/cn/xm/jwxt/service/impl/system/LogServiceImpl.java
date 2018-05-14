package cn.xm.jwxt.service.impl.system;

import cn.xm.jwxt.bean.system.Logtable;
import cn.xm.jwxt.mapper.system.LogtableMapper;
import cn.xm.jwxt.mapper.system.custom.LogtableCustomMapper;
import cn.xm.jwxt.service.system.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 20:22 2018/5/13
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogtableMapper logtableMapper;
    @Autowired
    private LogtableCustomMapper logtableCustomMapper;

    @Override
    public boolean addLogtable(Logtable logtable) throws SQLException {
        return logtableMapper.insert(logtable)>0?true:false;
    }

    @Override
    public List<Logtable> getLogtableFY(Map condition) throws SQLException {
        return logtableCustomMapper.getLogtableFY(condition);
    }
}
