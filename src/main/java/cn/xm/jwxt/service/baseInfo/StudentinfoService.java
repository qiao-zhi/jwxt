package cn.xm.jwxt.service.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.bean.baseInfo.custom.StudentClassInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;


public interface StudentinfoService {

    /**
     * 添加学生信息
     * @param studentBaseInfo
     * @return
     * @throws Exception
     */

    boolean addStudentInfo(TStudentBaseInfo studentBaseInfo) throws Exception;

    /**
     * 根据学生ID批量修改学生信息
     * @param studentid
     * @param studentinfo
     * @return
     * @throws Exception
     */
    boolean updateStudentInfoById(String studentid, TStudentBaseInfo studentinfo) throws Exception;
    /**
     * 根据学生ID删除对应的学生信息
     * @param studentid
     * @return
     * @throws Exception
     */
    boolean deleteStudentInfoById(String studentid) throws Exception;


    /**
     * 根据学生ID查询学生基本信息
     *
     * @return
     * @throws Exception
     */
    TStudentBaseInfo getStudentInfoById(String studentId) throws Exception;

    /**
     * 组合条件查询教师老师签名图片信息分页显示
     *
     * @param condition
     * @param currentPage
     * @param pageSize
     * @return
     * @throws Exception
     */
    PageInfo<StudentClassInfo> findStudentInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception;

    List<Map<String,Object>> findStudentNameAndId() throws Exception;
}
