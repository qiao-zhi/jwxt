package cn.xm.jwxt.mapper.baseInfo.custom;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.bean.baseInfo.custom.StudentClassInfo;
import cn.xm.jwxt.bean.baseInfo.custom.TeacherMajorInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TStudentBaseInfoCustomMapper {


    /**
     * 组合条件查询学生信息分页显示
     * @param condition
     * @return
     * @throws SQLException
     */

    List<StudentClassInfo> findStudentInfoListByCondition(CommonQuery condition) throws SQLException;

    /**
     * 查询所有的学生名称和ID
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> findStudentNameAndId() throws SQLException;

    /**
     * 批量插入学生信息
     * @param list
     * @return
     * @throws SQLException
     */
    int saveStudentInfoList(List<TStudentBaseInfo> list) throws SQLException;
    /**
     * 根据学生id查询学生信息（包括班级信息、专业信息、学院信息）
     * @param studentid
     * @return
     * @throws SQLException
     */

    StudentClassInfo getStudentInfoById(String studentid);
}



