package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;
import cn.xm.jwxt.bean.trainScheme.Trainpicture;
import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 完
 * @Author: qlq
 * @Description 培养方案基本信息Service
 * @Date: 12:17 2018/3/26
 */
public interface TrainschemeinfoService {

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
    public Map<String,Object> getMajorInfoByMajorCode(String majorCode)throws  SQLException;
    /**************E   获取专业信息******************/



    /**
     * 添加培养方案的基本信息(1.添加培养方案基本信息。2.添加培养方案的能力信息3.保存培养方案主要关系结构图)
     * @param trainschemeinfo   培养方案基本信息
     * @param trainningcapacitybaseinfos   培养方案基本信息
     * @param trainpicture   培养方案图片信息(在Action层调用utils保存文件之后传到service保存数据库)
     * @return  是否添加成功
     * @throws SQLException
     */
    public boolean addTrainschemeinfo(Trainschemeinfo trainschemeinfo, List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos, Trainpicture trainpicture)throws SQLException;


    /**
     * 根据培养方案ID删除培养方案基本信息(做标记，将idUse标记置为已经删除)
     * @param trainschemeinfoId
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainschemeinfoById(String trainschemeinfoId)throws SQLException;

    /**
     * 根据修改培养方案ID修改培养方案信息(主要是修改基本信息)
     * @param trainschemeinfo
     * @return
     * @throws SQLException
     */
    public boolean updateTrainschemeinfoById(Trainschemeinfo trainschemeinfo)throws SQLException;

    /**
     * 根据培养方案编号修改培养方案状态(0,1,2,3,4)
     * @param status    状态
     * @param trainSchemeinfoId 培养方案编号
     * @return
     * @throws SQLException
     */
    public boolean updateTrainschemeinfoStatusById(String status,String trainSchemeinfoId)throws SQLException;

    /**
     * 查询单个培养方案的详细信息(用于最后生成的大表格)
     * @param trainschemeinfoId
     * @return
     * @throws SQLException
     */
    public Map<String,Object> getTrainschemeinfoById(String trainschemeinfoId) throws SQLException;

    /**
     * 根据条件查询培养方案的基本信息，主要是查询培养方案的基本信息(用于分页查询)
     * @param condition 组合条件(首先必须增加的条件是isUse=1查询正在使用的培养方案)
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getTrainschemeinfoByCondition(Map<String,Object> condition)throws SQLException;


}
