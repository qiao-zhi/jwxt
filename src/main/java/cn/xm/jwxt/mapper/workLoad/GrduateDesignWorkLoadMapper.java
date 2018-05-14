package cn.xm.jwxt.mapper.workLoad;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface GrduateDesignWorkLoadMapper {

    /**
     *  查询毕设工作量信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> findGraduateDesignWork(Map<String,Object> condition) throws SQLException;

    /**
     *  根据 graDesignID 统计老师所带毕设学生数量
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public String findGraStuNum(String teacherTitleID) throws SQLException;

    /**
     *  查询详细的毕设工作量信息
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public Map<String,Object> findGraDesignDetail(String teacherTitleID) throws SQLException;

    /**
     *  查询具体的学生信息
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> findGraStu(String teacherTitleID) throws SQLException;
}
