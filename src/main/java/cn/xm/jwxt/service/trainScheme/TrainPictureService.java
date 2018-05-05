package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainpicture;

import java.sql.SQLException;
import java.util.List;

/**
 * 完
 * 培养方案图片service
 * @Author: qlq
 * @Description
 * @Date: 13:58 2018/4/3
 */
public interface TrainPictureService {
    /**
     * 增加培训方案图片
     * @param trainpicture  图片信息(1.图片保存到磁盘在控制层调用utils完成，2数据保存到数据库)
     * @return  是否成功
     * @throws SQLException
     */
    public boolean addTrainPicture(Trainpicture trainpicture)throws SQLException;

    /**
     * 删除培养方案图片
     * @param trainpictureId
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainPictureById(int trainpictureId)throws SQLException;

    /**
     * 根据培养方案编号删除培养方案图片
     * 1.先查出所有的信息，2.删掉本地的图片之后删除数据库信息
     * @param trainSchemeId 培养方案编号
     * @return  是否删除成功
     * @throws SQLException
     */
    public boolean deleteTrainPictureByTrainSchemeId(String trainSchemeId)throws SQLException;

    /**
     * 修改培养方案图片
     * @param trainpicture  修改过的培养方案信息
     * @return
     * @throws SQLException
     */
    public boolean updateTrainPictureById(Trainpicture trainpicture)throws SQLException;

    /**
     * 根据培养方案编号获取培养方案图片信息
     * @param trainschemeId
     * @return
     * @throws SQLException
     */
    public List<Trainpicture> getTrainPictureByTrainschemeId(String trainschemeId)throws SQLException;
}
