package cn.xm.jwxt.mapper.graduateDesign.fileManage;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.Cencheckbaseinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckbaseinfoExample;
import cn.xm.jwxt.bean.graduateDesign.GdFileCheck;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface GDFileManageMapper {

    /**
     * 根据条件初始化提交文件审核界面
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String, String>> selectFileCheckinfoByCondition(Map<String,String> condition) throws SQLException;

    /**
     * 文件提交审核
     * @param gdFileCheck
     * @return
     * @throws SQLException
     */
    public boolean insertAuditInfo(List<GdFileCheck> gdFileCheck) throws SQLException;

    /**
     * 删除审核过的数据
     * @param studentTitleresultIDs 结果表id 数组
     */
    public void deleteHasAuditInfo(String[] studentTitleresultIDs) throws SQLException;
}