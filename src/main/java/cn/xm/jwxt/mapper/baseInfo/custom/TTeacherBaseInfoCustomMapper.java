package cn.xm.jwxt.mapper.baseInfo.custom;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.bean.baseInfo.custom.StudentClassInfo;
import cn.xm.jwxt.bean.baseInfo.custom.TeacherMajorInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TTeacherBaseInfoCustomMapper {


    /**
     * 组合条件查询教师信息分页显示
     * @param condition
     * @return
     * @throws SQLException
     */

    List<TeacherMajorInfo> findTeacherInfoListByCondition(CommonQuery condition) throws SQLException;


    /**
     * 查询所有的教师名称和ID
     * @return
     * @throws SQLException
     */
    List<Map<String,Object>> findTeacherNameAndId() throws SQLException;


    List <Map<String,Object>> findTeacherPositionaltitle() throws SQLException;

    /**
     * 批量插入教师信息
     * @param list
     * @return
     * @throws SQLException
     */
    int saveTeacherInfoList(List<TTeacherBaseInfo> list) throws SQLException;
    /**
     * 根据教师id查询教师信息（包括专业信息、学院信息）
     * @param teacherid
     * @return
     * @throws SQLException
     */
    TeacherMajorInfo getTeacherInfoById(String teacherid);


    //检查插入时的教师编号是否重复
    int checkTeacherNum(String teachernum)throws SQLException;
}
