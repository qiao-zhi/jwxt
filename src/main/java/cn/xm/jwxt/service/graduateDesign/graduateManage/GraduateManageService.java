package cn.xm.jwxt.service.graduateDesign.graduateManage;

import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.Gradeuatebaseinfo;

import java.util.List;
import java.util.Map;

public interface GraduateManageService {

    /**
     * 获取学年，初始化菜单
     *
     * @return
     * @throws Exception
     */
    public List<String> getYearNum() throws Exception;

    /**
     * 添加毕设基本信息
     *
     * @param gradeuatebaseinfo
     * @return
     */
    public Boolean addGraduateInfo(Gradeuatebaseinfo gradeuatebaseinfo) throws Exception;

    /**
     * 修改毕设基本信息
     * @param condition
     * @return
     * @throws Exception
     */
    public List<Map<String, String>> getGraduateInfoByCondition(Map<String, String> condition) throws Exception;

    /**
     * 删除毕设基本信息
     * @param gradesignid
     * @return
     * @throws Exception
     */
    public Boolean removeGraduateInfo(String gradesignid) throws Exception;

    /**
     * 分页组合条件查询毕业基本信息,初始化表格
     * @param gradeuatebaseinfo
     * @return
     * @throws Exception
     */
    public Boolean modifyGraduateInfo(Gradeuatebaseinfo gradeuatebaseinfo) throws Exception;

    /**
     * 获取专业，初始化菜单
     * @return
     * @throws Exception
     */
    public List<TMajorBaseInfo> getMajor() throws Exception;
}
