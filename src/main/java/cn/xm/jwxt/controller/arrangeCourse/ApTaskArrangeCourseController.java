package cn.xm.jwxt.controller.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourse;
import cn.xm.jwxt.bean.arrangeCourse.custom.ApTaskArrangeCourseCustom;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.bean.arrangeCourse.custom.HistoryArrangeCourseQueryVo;
import cn.xm.jwxt.queryVo.ListVo;
import cn.xm.jwxt.service.arrangeCourse.ApTaskArrangeCourseService;
import cn.xm.jwxt.utils.DefaultValue;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：排课任务分配课程的Controller
 * 创建人：LL
 * 创建时间：2018/5/6 18:44
 */
@Controller
@RequestMapping("/arrangeCourse")
public class ApTaskArrangeCourseController {
    private Logger logger = Logger.getLogger(ApTaskArrangeCourse.class);
    @Resource
    private ApTaskArrangeCourseService taskArrangeCourseService;

    /**
     * 批量添加排课任务分配课程信息
     * @param arrangeTaskId
     * @param listVo
     * @return
     */
    @RequestMapping("/addTaskArrangeCourseInfoList")
    public @ResponseBody String addTaskArrangeCourseInfoList(String arrangeTaskId, ListVo listVo){
        try {
            taskArrangeCourseService.saveTaskArrangeCourseListByArrangeId(arrangeTaskId,listVo.getTaskArrangeCourses());
        } catch (Exception e) {
            logger.error("保存排课任务分配课程出错！",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 批量修改排课任务分配课程信息
     * @param arrangeTaskId
     * @param listVo
     * @return
     */
    @RequestMapping("/updateTaskArrangeCourseInfoList")
    public @ResponseBody String updateTaskArrangeCourseInfoList(String arrangeTaskId, ListVo listVo){
        try {
            taskArrangeCourseService.updateTaskArrangeCourseListByArrangeId(arrangeTaskId,listVo.getTaskArrangeCourses());
        } catch (Exception e) {
            logger.error("修改排课任务分配课程出错！",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 根据排课任务ID查询相关的课程信息用于排课任务详情的显示
     * @param arrangeTaskId
     * @return
     */
    @RequestMapping("/findTaskArrangeCourseInfoList")
    public @ResponseBody List<ApTaskArrangeCourse> findTaskArrangeCourseInfoList(String arrangeTaskId){
        List<ApTaskArrangeCourse> taskArrangeCourseList = null;
        try {
            taskArrangeCourseList = taskArrangeCourseService.findTaskArrangeCourseListInfoByArrangeId(arrangeTaskId);
        } catch (Exception e) {
            logger.error("查询排课任务分配课程信息失败",e);
        }
        return taskArrangeCourseList;
    }

    /**
     * 根据排课任务ID查询相关的课程和教师信息分页显示
     * @param condition
     * @param arrangeTaskId
     * @return
     */
    @RequestMapping("/findTaskArrangeCourseAndTeacherList")
    public @ResponseBody
    PageInfo<ApTaskArrangeCourseCustom> findTaskArrangeCourseAndTeacherList(CommonQueryVo condition,String arrangeTaskId){
        if(condition.getPageSize()==null){
            condition.setPageSize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentPage()==null){
            condition.setCurrentPage(1);
        }
        PageInfo<ApTaskArrangeCourseCustom> pageInfo = null;
        try {
            pageInfo = taskArrangeCourseService.findTaskArrangeCourseAndTeacherListByArrangeId(arrangeTaskId, condition.getCurrentPage(), condition.getPageSize());
        } catch (Exception e) {
            logger.error("查询排课任务分配课程和教师信息失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据安排课程ID查询查询每一门课程对应的教师课程信息
     * @param arrangeCourseId
     * @return
     */
    @RequestMapping("/getTaskArrangeCourseAndTeacherClassInfo")
    public @ResponseBody ApTaskArrangeCourseCustom getTaskArrangeCourseAndTeacherClassInfo(String arrangeCourseId){
        ApTaskArrangeCourseCustom info = null;
        try {
            info = taskArrangeCourseService.getTaskArrangeCourseAndTeacherClassInfo(arrangeCourseId);
        } catch (Exception e) {
            logger.error("查询课程和教师班级信息失败",e);
        }
        return info;
    }

    /**
     * 根据安排课程ID查询课程的基本信息包括学年学期
     * @param arrangeCourseId
     * @return
     */
    @RequestMapping("/getTaskArrangeCourse")
    public @ResponseBody ApTaskArrangeCourse getTaskArrangeCourse(String arrangeCourseId){
        ApTaskArrangeCourseCustom arrangeCourseInfo = null;
        try {
            arrangeCourseInfo = taskArrangeCourseService.getTaskArrangeCourseInfoById(arrangeCourseId);
        } catch (Exception e) {
            logger.error("查询课程信息失败",e);
        }
        return arrangeCourseInfo;
    }

    /**
     * 根据排课任务ID和学年学期查询历史排课记录
     * @param condition
     * @return
     */
    @RequestMapping("/findHistroyTeacherCourse")
    public @ResponseBody List<ApTaskArrangeCourseCustom> findHistroyTeacherCourse(HistoryArrangeCourseQueryVo condition){
        List<ApTaskArrangeCourseCustom> histroyTeacherCourses = null;
        try {
            histroyTeacherCourses = taskArrangeCourseService.findHistroyTeacherCourseByCodition(condition);
        } catch (Exception e) {
            logger.error("查询历史排课记录失败",e);
        }
        return histroyTeacherCourses;
    }

    /**
     * 根据排课任务ID导出相应的排课信息
     * @param session
     * @param arrangeCourseTaskId
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/exportArrangeCourseInfo")
    public ResponseEntity<byte[]> exportArrangeCourseInfo(HttpSession session, String arrangeCourseTaskId, Model model)throws Exception {
        String filename = DefaultValue.ARRANGE_COURSE_FILENAME;
        //下载文件路径
        String path = session.getServletContext().getRealPath(filename);
        Map<String, List<ApTaskArrangeCourseCustom>> mapInfo = taskArrangeCourseService.getArrangeCourseAllInfoByArrangeCourseTaskId(arrangeCourseTaskId);
        GenerateArrangeCourseExcel.generateArrangeCourseExcelInfo(mapInfo,path);
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        //下载显示的文件名，解决中文名称乱码问题
        String downloadFielName = new String(filename.getBytes("UTF-8"),"iso-8859-1");
        //通知浏览器以attachment（下载方式）打开文件
        headers.setContentDispositionFormData("attachment", downloadFielName);
        //application/octet-stream ： 二进制流数据（最常见的文件下载）。
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }

    /**
     * 根据排课任务ID统计还未排课的数量
     * @param arrangeTaskId
     * @return
     */
    @RequestMapping("/getNotArrangeCourseCount")
    public @ResponseBody String getNotArrangeCourseCount(String arrangeTaskId){
        int count = 0;
        try {
            count = taskArrangeCourseService.getNotArrangeCourseCount(arrangeTaskId);
        } catch (Exception e) {
            logger.error("统计还未排课的数量失败",e);
        }
        return String.valueOf(count);
    }
}
