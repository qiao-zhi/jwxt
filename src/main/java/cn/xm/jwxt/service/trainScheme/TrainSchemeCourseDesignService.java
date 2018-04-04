package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainschemecoursedesign;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 培养方案课设service
 *
 * @Author: qlq
 * @Description
 * @Date: 13:07 2018/4/3
 */
public interface TrainSchemeCourseDesignService {
    /**
     * 添加培养方案课设信息
     * @param trainschemecoursedesign
     * @return
     * @throws SQLException
     */
    public boolean addTrainSchemeCourseDesign(Trainschemecoursedesign trainschemecoursedesign)throws SQLException;

    /**
     * 根据培养方案课设ID删除培养方案课设信息
     * @param trainschemecoursedesignId 培养方案课设ID
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainSchemeCourseDesignById(String trainschemecoursedesignId)throws SQLException;

    /**
     * 根据培养方案课设ID修改培养方案课设信息
     * @param trainschemecoursedesign
     * @return
     * @throws SQLException
     */
    public boolean updateTrainSchemeCourseDesignById(Trainschemecoursedesign trainschemecoursedesign)throws SQLException;

    /**
     * 根据培养方案课设ID查询培养方案课设详细信息
     * @param trainschemecoursedesignId
     * @return
     * @throws SQLException
     */
    public Trainschemecoursedesign getTrainschemecoursedesignById(String trainschemecoursedesignId)throws  SQLException;

    /**
     * 分页查询培养方案课设信息
     * @param condition 分页条件
     * @return 查到的培养方案课设信息
     * @throws SQLException
     */
    public List<Trainschemecoursedesign> getTrainschemecoursedesignByCondition(Map condition)throws SQLException;
}
