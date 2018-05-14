package cn.xm.jwxt.service.workLoad;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface GrduateDesignWorkLoadService {

    /**
     *  查询毕设工作量
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> findGrduateDesignWorkLoad(Map<String,Object> condition) throws SQLException;

    /**
     * 查询教师毕设详细信息
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public Map<String,Object> findGraDesignDetail(String teacherTitleID) throws SQLException;
}
