package cn.xm.jwxt.controller.courseDesign;

import cn.xm.jwxt.controller.trainScheme.TeachingProgramInfoController;
import cn.xm.jwxt.service.courseDesign.TCoursedesignTeacherstudentService;
import cn.xm.jwxt.utils.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/studentCourseDesignFileInfo")
public class StudentCourseDesignFileInfoController {
    private Logger logger = Logger.getLogger(StudentCourseDesignFileInfoController.class);
    @Autowired
    private TCoursedesignTeacherstudentService tsService;

    /**
     * 查询需要安排的课设
     * @param condition
     * @return
     */
    @ResponseBody
    @RequestMapping("/findNeedUploadCourseDesignFile.do")
    public PageInfo<Map<String,Object>> StudentCourseDesignFileInfo(@RequestParam Map<String,Object> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String)condition.get("pageSize"))){
            pageSize = Integer.valueOf((String)condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){
            pageNum = Integer.valueOf((String) condition.get("pageNum"));
        }
        // 只对紧邻的下一条select进行查询，对以后的不起作用
        PageHelper.startPage(pageNum,pageSize,"courseDesignNum");

      //  Map<String,Object> condition = new HashMap<String,Object>();
        condition.put("uploadStatus","0");
        condition.put("display","1");
      //  condition.put("studentID",studentID);
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        try {
            list = tsService.findNeedUploadCoursedesignFile(condition);
        } catch (SQLException e) {
            logger.error("查询需要上传报告的课设信息失败",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     *  前往课设上传页面，获取数据
     * @param courseDesignTeacherStudentID
     * @return
     */
    @ResponseBody
    @RequestMapping("/toUploadCourseDesignFile.do")
    public Map<String,Object> toUploadCourseDesignFile(String courseDesignTeacherStudentID){
        Map<String,Object> resultInfo = new HashMap<String,Object>();
        try {
            resultInfo = tsService.findUploadCourseDesignInfo(courseDesignTeacherStudentID);
        } catch (SQLException e) {
            logger.error("查询要上传报告的课设的信息失败",e);
        }
        return resultInfo;
    }

    /**
     *  上传课设报告
     * @param courseDesignTeacherStudentID
     * @param file
     * @return
     */
    @ResponseBody
    @RequestMapping("/uploadCourseDesignFile.do")
    public ResposeResult uploadCourseDesignFile(String courseDesignTeacherStudentID, MultipartFile file){
        Map<String,Object> condition = new HashMap<String,Object>();
            condition.put("courseDesignTeacherStudentID",courseDesignTeacherStudentID);
        //1.将文件保存到磁盘
        String courseDesignReportName=null;//原名称
        String courseDesignReportStore=null;//系统生成的名称
        if(file!=null){
            courseDesignReportName=file.getOriginalFilename();//获取文件原始名字
            courseDesignReportStore = UUIDUtil.getUUID2()+"."+ FilenameUtils.getExtension(courseDesignReportName);//新生产一个文件
        }
        try {
            courseDesignReportStore = FileHandleUtil.uploadSpringMVCFile(file,"courseDesignFile",courseDesignReportStore);//获取传完之后新的名字
        } catch (Exception e) {
            logger.error("保存文件出错",e);
        }
        //2.保存数据库
        condition.put("courseDesignReportName",courseDesignReportName);//设置UUID生成的名字
        condition.put("courseDesignReportStore",courseDesignReportStore);//设置原始名字
        String result=null;
        //返回ajax请求的工具类
        ResposeResult resposeResult = new ResposeResult();
        try {
            result = tsService.addCourseDesignFileInfo(condition)?"上传成功":"保存失败";
        } catch (SQLException e) {
            logger.error("上传课设报告出错",e);
        }
        resposeResult.setMsg(result);
        return resposeResult;
    }

    /**
     * 查询课设审核结果
     * @param courseDesignTeacherStudentID
     * @return
     */
    @ResponseBody
    @RequestMapping("/getCourseDesingCheckResult.do")
    public Map<String,Object> getCourseDesignCheckResult(String courseDesignTeacherStudentID){
        Map<String,Object> checkInfo = new HashMap<String,Object>();
        try {
            checkInfo = tsService.getCourseDesignCheckResult(courseDesignTeacherStudentID);
        } catch (SQLException e) {
            logger.error("查询课设审核结果出错",e);
        }
        return checkInfo;
    }

    /**
     *  查询课设报告（生成名称）  与 学生姓名
     * @param courseDesignTeacherStudentID
     * @return
     */
    @ResponseBody
    @RequestMapping("/checkCourseDesignFile.do")
    public Map<String,Object> getCourseDesignFileInfo(String courseDesignTeacherStudentID){
        Map<String, Object> fileInfo = new HashMap<String,Object>();
        try {
            fileInfo = tsService.getCourseDesignFileInfo(courseDesignTeacherStudentID);
        } catch (SQLException e) {
            logger.error("查询课设报告信息失败",e);
        }
        return fileInfo;
    }
}
