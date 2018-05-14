package cn.xm.jwxt.service.workLoad;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface WorkLoadService {

    /**
     * 查询所有课程，课设，毕设
     * @param condition
     * @return
     */
    public List<Map<String, Object>> findAllWorkLoad(Map<String,Object> condition) throws SQLException;
}
