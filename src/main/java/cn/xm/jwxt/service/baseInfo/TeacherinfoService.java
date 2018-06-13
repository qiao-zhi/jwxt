package cn.xm.jwxt.service.baseInfo;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.bean.baseInfo.custom.StudentClassInfo;
import cn.xm.jwxt.bean.baseInfo.custom.TeacherMajorInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface TeacherinfoService {

    /**
     * 添加教师信息
     * @param teacherBaseInfo
     * @return
     * @throws Exception
     */

    boolean addTeacherInfo(TTeacherBaseInfo teacherBaseInfo) throws Exception;

    /**
     * 根据教师ID批量修改教师信息
     * @param teacherid
     * @param teacherinfo
     * @return
     * @throws Exception
     */
    boolean updateTeacherInfoById(String teacherid, TTeacherBaseInfo teacherinfo) throws Exception;
    /**
     * 根据教师ID删除对应的教师信息
     * @param teacherid
     * @return
     * @throws Exception
     */
    boolean deleteTeacherInfoById(String teacherid) throws Exception;

    /**
     * 根据教师ID查询教师的所有信息
     * @param teacherid
     * @return
     * @throws Exception
     */
    TeacherMajorInfo getTeacherInfoById(String teacherid) throws Exception;

    /**
     * 组合条件查询教师老师签名图片信息分页显示
     *
     * @param condition
     * @param currentPage
     * @param pageSize
     * @return
     * @throws Exception
     */
    PageInfo<TeacherMajorInfo> findTeacherInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception;

    List<TeacherMajorInfo> findTeacherInfoByCondition(CommonQuery condition) throws Exception;

    List<Map<String,Object>> findTeacherNameAndId() throws Exception;

    List<Map<String,Object>> findTeacherPositionaltitle() throws Exception;
    /**
     * 导入教师信息
     * @param detailInfoList
     * @return
     * @throws Exception
     */
    boolean saveTeacherInfoById(String majorId,String collegeId, List<TTeacherBaseInfo> detailInfoList) throws Exception;
    //判断插入教师编号是否重复
    boolean checkTeacherNum(String teachernum) throws Exception;
}
