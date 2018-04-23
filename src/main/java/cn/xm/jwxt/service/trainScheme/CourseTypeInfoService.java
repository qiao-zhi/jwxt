package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursetypeinfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 完
 * 培养方案课程类别service
 * @Author: qlq
 * @Description
 * @Date: 15:58 2018/4/3
 */
public interface CourseTypeInfoService {
    /**
     * 增加培训课程类别(最后一个描述字段填写培养方案编号)
     * @param coursetypeinfo    需要添加的培养方案课程类别
     * @return
     * @throws SQLException
     */
    public boolean addcourseTypeInfo(Coursetypeinfo coursetypeinfo)throws SQLException;

    /**
     * 删除培训课程类别(如果有下级不允许删除，删除的时候将对应的培养方案课程也删除)
     * @param courseId
     * @return
     * @throws SQLException
     */
    public boolean deleteCourseTypeInfoById(int courseId)throws SQLException;

    /**
     * 修改培养方案课程类别(主要是修改培养方案课程的名称)
     * @param coursetypeinfo    修改后的培养方案课程类别信息
     * @return
     * @throws SQLException
     */
    public boolean updateCourseTypeInfoById(Coursetypeinfo coursetypeinfo)throws SQLException;

    /**
     * 根据培养方案课程类别查询培养方案课程信息
     * @param coursetypeinfoID
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getCourseInfosByCourseTypeId(String  coursetypeinfoID)throws SQLException;

    /**
     * 根据培养方案编号查询培养方案课程类别树
     * @param trainSchemeId
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getTypeTreeByTrainSchemeId(String trainSchemeId)throws SQLException;

}
