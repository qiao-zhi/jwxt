package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainschemecoursedesign;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 完
 * 培养方案课设service
 *
 * @Author: qlq
 * @Description
 * @Date: 13:07 2018/4/3
 */
public interface TrainSchemeCourseDesignService {
    /**
     * 批量添加添加培养方案课设信息
     * @param trainSchemeCourseDesigns  需要批量添加的培养方案课设信息
     * @return
     * @throws SQLException
     */
    public boolean addTrainSchemeCourseDesign(List<Trainschemecoursedesign> trainSchemeCourseDesigns)throws SQLException;

    /**
     * 根据培养方案课设ID删除培养方案课设信息(删除单个培养方案)
     * @param trainschemecoursedesignId 培养方案课设ID
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainSchemeCourseDesignById(String trainschemecoursedesignId)throws SQLException;

    /**
     * 根据培养方案编号删除培养方案课设信息
     * @param trainschemeId    培养方案编号
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainSchemeCourseDesignByTrainSchemeId(String trainschemeId)throws SQLException;

    /**
     * 根据培养方案课设ID修改培养方案课设信息(1.先删除2.再增加)
     * @param trainschemeId 培养方案编号
     * @param trainSchemeCourseDesigns 培养方案编号
     * @return
     * @throws SQLException
     */
    public boolean updateTrainSchemeCourseDesignById(String trainschemeId,List<Trainschemecoursedesign> trainSchemeCourseDesigns)throws SQLException;

    /**
     * 根据培养方案课设ID查询培养方案课设详细信息
     * @param trainschemecoursedesignId
     * @return
     * @throws SQLException
     */
    public Map<String,Object> getTrainschemecoursedesignById(String trainschemecoursedesignId)throws  SQLException;

    /**
     * 分页查询培养方案课设信息
     * @param condition 分页条件
     * @return 查到的培养方案课设信息
     * @throws SQLException
     */
    public List<Trainschemecoursedesign> getTrainschemecoursedesignByCondition(Map condition)throws SQLException;

}
