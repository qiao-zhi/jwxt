package cn.xm.jwxt.mapper.trainScheme.custom;

import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo;
import cn.xm.jwxt.bean.trainScheme.TrainschemeinfoExample;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 培养方案手写的mapper
 */
public interface TrainschemeinfoCustomMapper {

    /**************S   获取专业信息******************/
    /**
     * 获取所有的专业名称和专业代码
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getMajorNameAndCode()throws SQLException;

    /**
     * 根据专业代码获取专业信息用于添加培养方案的时候给专业信息赋值
     * @param majorCode
     * @return
     * @throws SQLException
     */
    public Map<String,Object> getMajorInfoByMajorCode(@Param("majorCode")String majorCode)throws  SQLException;
    /**************E   获取专业信息******************/

    /**
     * 分页查询培养方案信息
     * @param condition 培养方案条件
     * @return  分页查询的信息
     * @throws SQLException
     */
    public List<Map<String, Object>> getTrainschemeinfoByCondition(Map<String, Object> condition) throws SQLException;

    /**
     * 根据培养方案编号查询培养方案信息
     * @param trainschemeinfoId
     * @return
     * @throws SQLException
     */
    public Map<String, Object> getTrainschemeinfoById(@Param("trainschemeinfoId") String trainschemeinfoId) throws SQLException;

    /**
     * 根据培养编号删除
     * @param trainSchemeId
     * @return
     * @throws SQLException
     */
    public int deleteTrainSchemeById(@Param("trainSchemeId")String trainSchemeId)throws SQLException;
}