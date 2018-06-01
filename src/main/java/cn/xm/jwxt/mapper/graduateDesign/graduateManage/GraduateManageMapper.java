package cn.xm.jwxt.mapper.graduateDesign.graduateManage;

import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.Gradeuatebaseinfo;
import cn.xm.jwxt.bean.graduateDesign.Teachergredesigntitle;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleFirstcheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitleSecondcheckinfo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 课题管理
 */
public interface GraduateManageMapper {

    /**
     * 获取学年，初始化菜单
     * @return
     * @throws SQLException
     */
    public List<String> selectYearNum() throws SQLException;

    /**添加毕设基本信息
     *
     * @param gradeuatebaseinfo
     * @return
     * @throws SQLException
     */
    public int insertGraduateInfo(Gradeuatebaseinfo gradeuatebaseinfo) throws SQLException;

    /**
     * 删除毕设基本信息
     * @param gradesignid
     * @return
     * @throws SQLException
     */
    public int deleteGraduateInfo(String gradesignid) throws SQLException;

    /**
     * 修改毕设基本信息
     * @param gradeuatebaseinfo
     * @return
     * @throws SQLException
     */
    public int updateGraduateInfo(Gradeuatebaseinfo gradeuatebaseinfo) throws SQLException;

    /**
     * 分页组合条件查询毕业基本信息,初始化表格
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String, String>> selectGraduateInfoByCondition(Map<String, String> condition) throws SQLException;

    /**
     * 获取专业，初始化菜单
     * @return
     * @throws SQLException
     */
    public List<TMajorBaseInfo> selectMajor() throws SQLException;
}
