package cn.xm.jwxt.mapper.graduateDesign.fileManage;

import cn.xm.jwxt.bean.graduateDesign.Cencheckbaseinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckbaseinfoExample;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface GDFileManageMapper {

    /**
     * 查询文件管理界面，表格信息
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String, String>> selectFileCheckinfoByCondition(Map<String,String> condition) throws SQLException;

    /**
     * 根据学生id，获取学生姓名
     * @param studentID
     * @return
     */
    public String selectStudentName(String studentID);

    /**
     * 根据教师id，获取教师姓名
     * @param teacherID
     * @return
     */
    public String selectTeacherName(String teacherID);


}