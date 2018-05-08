package cn.xm.jwxt.controller.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.bean.arrangeCourse.custom.DistributeCourseSource;
import cn.xm.jwxt.service.arrangeCourse.ApTaskNoticeDetailInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ResposeResult;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：通知书明细的Controller
 * 创建人：LL
 * 创建时间：2018/5/2 17:53
 */
@Controller
@RequestMapping("/arrangeCourse")
public class ApTaskNoticeDetailInfoController {

    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(ApTaskNoticeDetailInfoController.class);

    @Resource
    private ApTaskNoticeDetailInfoService taskNoticeDetailInfoService;

    /**
     * 导入教学任务通知书文件
     * @param session
     * @param noticeBookId
     * @param file
     * @return
     */
    @RequestMapping("/addDetailInfoList")
    public @ResponseBody
    ResposeResult addDetailInfoList(HttpSession session, String noticeBookId, MultipartFile file){
        ServletContext servletContext = session.getServletContext();
        //获取上传文件的绝对路径
        String realPath = servletContext.getRealPath(file.getOriginalFilename());
        File noticeFile = new File(realPath);
        //返回ajax请求的工具类
        ResposeResult resposeResult = new ResposeResult();
        String result;
        try {
            file.transferTo(noticeFile);
        } catch (IOException e) {
            logger.error("上传文件出错！",e);
            result = "保存失败";
            resposeResult.setSuccess(false);
            resposeResult.setMsg(result);
            return resposeResult;
        }
        List<ApTaskNoticeDetailInfo> taskNoticeDetailInfos = ReadNoticeExcelData.readNoticeExcelData(realPath);
        try {
            taskNoticeDetailInfoService.saveApTaskNoticeDetailInfoByNoticeId(noticeBookId,taskNoticeDetailInfos);
        } catch (Exception e) {
            logger.error("保存课程信息出错！",e);
            result = "保存失败";
            resposeResult.setSuccess(false);
            resposeResult.setMsg(result);
            return resposeResult;
        }
        //将上传的文件删除
        File fileDelete = new File(realPath);
        boolean delete = fileDelete.delete();
        result = "上传成功！";
        resposeResult.setMsg(result);
        return resposeResult;
    }

    /**
     * 查询任务通知书明细分页显示
     * @param noticeBookId
     * @param condition
     * @return
     */
    @RequestMapping("/findNoticeDetailInfo")
    public @ResponseBody  PageInfo<ApTaskNoticeDetailInfo> findNoticeDetailInfo(String noticeBookId,CommonQueryVo condition){
        if(condition.getPageSize()==null){
            condition.setPageSize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentPage()==null){
            condition.setCurrentPage(1);
        }
        PageInfo<ApTaskNoticeDetailInfo> pageInfo = null;
        try {
            pageInfo = taskNoticeDetailInfoService.findApTaskNoticeDetailInfoByNoticeId(noticeBookId, condition.getCurrentPage(), condition.getPageSize());
        } catch (Exception e) {
            logger.error("查询任务通知书明细失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据任务通知书ID,排课任务ID查询任务书中需要进行排课的课程
     * @param condition
     * @return
     */
    @RequestMapping("/findUnArrangeCourseInfo")
    public @ResponseBody List<DistributeCourseSource> findUnArrangeCourseInfo(@RequestParam Map condition){
        List<DistributeCourseSource> unArrangedCourseInfoList = null;
        try {
            unArrangedCourseInfoList = taskNoticeDetailInfoService.findUnarrangedCourseInfoByCondition(condition);
        } catch (Exception e) {
            logger.error("查询未分配课程失败",e);
        }
        return unArrangedCourseInfoList;
    }
}
