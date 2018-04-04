package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursetypeinfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 课程类别service
 * @Author: qlq
 * @Description
 * @Date: 15:58 2018/4/3
 */
public interface CourseTypeInfoService {
    /**
     * 增加培训课程类别
     * @param coursetypeinfo
     * @return
     * @throws SQLException
     */
    public boolean addcourseTypeInfo(Coursetypeinfo coursetypeinfo)throws SQLException;

    /**
     * 删除培训课程类别(如果有下级不允许删除，删除的时候将课程也删除)
     * @param courseId
     * @return
     * @throws SQLException
     */
    public boolean deleteCourseTypeInfoById(int courseId)throws SQLException;
    public boolean updateCourseTypeInfoById(Coursetypeinfo coursetypeinfo)throws SQLException;
    public Coursetypeinfo getCourseTypeInfoByCourseId(Coursetypeinfo coursetypeinfo)throws SQLException;
    public List<Map<String,Object>> getCourseTypeInfos()throws SQLException;

}
