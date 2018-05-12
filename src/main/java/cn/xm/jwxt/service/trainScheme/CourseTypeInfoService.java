package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursetypeinfo;
import org.apache.ibatis.annotations.Param;

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
     * 根据上级类别编号查询下次要插入的最大的编号
     *
     * @param upTypeNum 上级typeNum
     * @param trainSchemeId 培养方案编号
     * @return  获取的结果
     * @throws Exception
     */
    public String getNextTypeNumByUpNum(String upTypeNum,String trainSchemeId) throws SQLException;

    /**
     * 增加培训课程类别(最后一个描述字段填写培养方案编号)
     * @param coursetypeinfo    需要添加的培养方案课程类别
     * @return
     * @throws SQLException
     */
    public boolean addcourseTypeInfo(Coursetypeinfo coursetypeinfo)throws SQLException;

    /**
     * 删除培训课程类别(根据培养方案编号和类别num删除)
     * @param trainSchemeId 培养方案编号
     * @param typeNum   类别num
     * @return
     * @throws SQLException
     */
    public boolean deleteCourseTypeInfoByTrainSchemeIdAndTypeNum(String trainSchemeId,String typeNum)throws SQLException;

    /**
     * 修改培养方案课程类别(主要是修改培养方案课程的名称)
     * @param coursetypeinfo    修改后的培养方案课程类别信息
     * @return
     * @throws SQLException
     */
    public boolean updateCourseTypeInfoById(Coursetypeinfo coursetypeinfo)throws SQLException;


    /**
     * 修改培养方案课程类别(主要是修改培养方案课程的名称)
     * @param trainSchemeId    培养方案编号
     * @param typeNum    修改后的培养方案课程类别编号
     * @param typeName    修改后的培养方案课程类别名称
     * @return
     * @throws SQLException
     */
    public boolean updateCurseTypeNameByTypeNumAndTrainSchemeId(String trainSchemeId,String typeNum,String typeName)throws  SQLException;

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
    public List<Coursetypeinfo> getTypeTreeByTrainSchemeId(String trainSchemeId)throws SQLException;

}
