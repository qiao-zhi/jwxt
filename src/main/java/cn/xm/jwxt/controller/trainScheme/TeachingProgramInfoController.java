package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.annotation.MyLogAnnotation;
import cn.xm.jwxt.bean.trainScheme.TTeachingprogramInfo;
import cn.xm.jwxt.service.trainScheme.TeachingProgramInfoService;
import cn.xm.jwxt.utils.FileHandleUtil;
import cn.xm.jwxt.utils.ResourcesUtil;
import cn.xm.jwxt.utils.ResposeResult;
import cn.xm.jwxt.utils.UUIDUtil;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: qlq
 * @Description 课程教学资料Controller
 * @Date: 14:45 2018/4/14
 */
@Controller
@RequestMapping("/teachingFile")
@SuppressWarnings("all")
public class TeachingProgramInfoController {

    private Logger logger = Logger.getLogger(TeachingProgramInfoController.class);
    @Autowired
    private TeachingProgramInfoService teachingProgramInfoService;
    /**
     * 教学资料文件上传
     * @param teachingprogramInfo
     * @param file
     * @return
     */
    @MyLogAnnotation(operateDescription = "上传课程教学资料信息")
    @RequestMapping("/upload")
    public @ResponseBody
    ResposeResult uploadTeachingProgramFile(TTeachingprogramInfo teachingprogramInfo, MultipartFile file){
        //1.将文件保存到磁盘
        String fileoriname=null;//原名称
        String filenowname=null;//系统生成的名称
        if(file!=null){
            fileoriname=file.getOriginalFilename();//获取文件原始名字
            filenowname = UUIDUtil.getUUID2()+"."+ FilenameUtils.getExtension(fileoriname);//新生产一个文件
        }
        try {
            filenowname = FileHandleUtil.uploadSpringMVCFile(file,"teachingFile",filenowname);//获取传完之后新的名字
        } catch (Exception e) {
            logger.error("保存文件出错",e);
        }
        //2.保存数据库
        teachingprogramInfo.setFilenowname(filenowname);//设置UUID生成的名字
        teachingprogramInfo.setFileoriname(fileoriname);//设置原始名字
        String result=null;
        //返回ajax请求的工具类
        ResposeResult resposeResult = new ResposeResult();
        try {
            result = teachingProgramInfoService.addTeachingProgramInfo(teachingprogramInfo)?"上传成功":"保存失败";
        } catch (SQLException e) {
            result = "保存失败";
            resposeResult.setSuccess(false);
            logger.error("保存课程资料到数据库出错");
        }
        resposeResult.setMsg(result);
        return resposeResult;
    }


    /**
     * 根据课程编号查询课程教学资料信息
     * @param courseId
     * @return
     */
    @RequestMapping("/getTeachingFile")
    public @ResponseBody List<TTeachingprogramInfo> getTeachingprogramInfosByCourseId(String courseId){
        List<TTeachingprogramInfo> teachingProgramInfos =null;
        try {
            teachingProgramInfos = teachingProgramInfoService.getTeachingProgramInfoByCourseId(courseId);
        } catch (SQLException e) {
            logger.error("根据课程编号查询课程教学资料出错!",e);
        }
        return teachingProgramInfos;
    }


    @MyLogAnnotation(operateDescription = "删除课程教学资料")
    @RequestMapping("/deleteTeachingFile")
    public @ResponseBody String deleteTeachingFileByFileId(int fileId){
        String result = null;
        try {
            result = teachingProgramInfoService.deleteTeachingProgramInfoById(fileId)?"删除成功":"删除失败";
        } catch (SQLException e) {
            logger.error("删除教学资料文件失败",e);
        }
        return result;
    }

}
