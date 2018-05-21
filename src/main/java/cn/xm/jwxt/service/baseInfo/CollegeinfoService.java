package cn.xm.jwxt.service.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TCollegeBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface CollegeinfoService {

    /**
     * 添加学院信息
     * @param collegeBaseInfo
     * @return
     * @throws Exception
     */

    boolean addCollegeInfo(TCollegeBaseInfo collegeBaseInfo) throws Exception;

    /**
     * 根据学院ID批量修改学院信息
     * @param collegeid
     * @param collegeinfo
     * @return
     * @throws Exception
     */
    boolean updateCollegeInfoById(String collegeid, TCollegeBaseInfo collegeinfo) throws Exception;
    /**
     * 根据学院删除对应的学院信息
     * @param collegeid
     * @return
     * @throws Exception
     */
    boolean deleteCollegeInfoById(String collegeid) throws Exception;

    /**
     * 根据学院ID查询学院的所有信息
     * @param collegeid
     * @return
     * @throws Exception
     */
    TCollegeBaseInfo getCollegeInfoById(String collegeid) throws Exception;

    /**
     * 组合条件查询学院信息分页显示
     *
     * @param condition
     * @param currentPage
     * @param pageSize
     * @return
     * @throws Exception
     */
    PageInfo<TCollegeBaseInfo> findCollegeInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception;

    List<Map<String,Object>> findCollegeNameAndId() throws Exception;
}
