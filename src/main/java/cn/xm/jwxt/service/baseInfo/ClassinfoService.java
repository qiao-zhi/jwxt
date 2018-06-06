package cn.xm.jwxt.service.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import com.github.pagehelper.PageInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ClassinfoService {


    /**
     * 添加班级信息
     * @param classBaseInfo
     * @return
     * @throws Exception
     */

    boolean addClassInfo(TClassBaseInfo classBaseInfo) throws Exception;

    /**
     * 根据班级ID批量修改班级信息
     * @return
     * @throws Exception
     */
    boolean updateClassById(String classId,TClassBaseInfo classInfo) throws Exception;
    /**
     * 根据班级ID删除对应的班级信息
     * @param classid
     * @return
     * @throws Exception
     */
    boolean deleteClassInfoById(String classid) throws Exception;



    /**
     * 根据班级ID查询班级基本信息
     *
     * @return
     * @throws Exception
     */
    TClassBaseInfo getClassInfoById(String classId) throws Exception;


    /**
     * 组合条件查询教师老师签名图片信息分页显示
     *
     * @param condition
     * @param currentPage
     * @param pageSize
     * @return
     * @throws Exception
     */
    PageInfo<Map<String,Object>> findClassInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception;


    List<Map<String,Object>> findClassNameAndId() throws Exception;




    /**************S    QLQ************/
    /**
     * 查询班级树
     * @param condition 组合条件
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getClassTrees(Map condition)throws SQLException;
    /**************E    QLQ************/

}


