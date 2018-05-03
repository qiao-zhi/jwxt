package cn.xm.jwxt.controller.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.service.arrangeCourse.ApTaskNoticeDetailInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ResposeResult;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

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
        Integer pageSize = DefaultValue.PAGE_SIZE;
        Integer currentPage = 1;
        if(ValidateCheck.isNotNull(condition.getPageSize())){
            pageSize = Integer.valueOf(condition.getPageSize());
        }
        if(ValidateCheck.isNotNull(condition.getCurrentPage())){
            currentPage = Integer.valueOf(condition.getCurrentPage());
        }
        PageInfo<ApTaskNoticeDetailInfo> pageInfo = null;
        try {
            pageInfo = taskNoticeDetailInfoService.findApTaskNoticeDetailInfoByNoticeId(noticeBookId, currentPage, pageSize);
        } catch (Exception e) {
            logger.error("查询任务通知书明细失败",e);
        }
        return pageInfo;
    }
}
