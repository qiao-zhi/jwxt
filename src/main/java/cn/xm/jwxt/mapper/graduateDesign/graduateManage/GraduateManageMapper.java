package cn.xm.jwxt.mapper.graduateDesign.graduateManage;

import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.Gradeuatebaseinfo;

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
     * @param graDesignID
     * @return
     * @throws SQLException
     */
    public int deleteGraduateInfo(String graDesignID) throws SQLException;

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

    /**
     * 根据用户id，查询专业id
     * @param userid
     * @return
     * @throws SQLException
     */
    public String selectMajorIDByUserID(String userid) throws SQLException;

    /**
     * 获取该专业，本学年的毕设数量
     * @param gradeuatebaseinfo
     * @return
     * @throws SQLException
     */
    public int selectMajorGraduateNum(Gradeuatebaseinfo gradeuatebaseinfo) throws SQLException;

    /**
     * 删除毕设前，查询，毕设下是否有课题
     * @param graDesignID
     * @return
     * @throws SQLException
     */
    public int selectTeacherTitleNum(String graDesignID) throws SQLException;
}
