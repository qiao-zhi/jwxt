package cn.xm.jwxt.controller.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.bean.baseInfo.custom.StudentClassInfo;
import cn.xm.jwxt.bean.baseInfo.custom.TeacherMajorInfo;
import cn.xm.jwxt.service.baseInfo.StudentinfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ResposeResult;
import cn.xm.jwxt.utils.ValidateCheck;
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
 * 类描述：学生信息的controller
 * 创建人：bqq
 * 创建时间：2018/5/4
 */
@Controller
@RequestMapping("/studentInfo")
public class StudentinfoController {

    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(StudentinfoController.class);
    @Resource
    private StudentinfoService studentinfoService;
    /**
     * 添加学生基本信息
     * @param studentInfo
     * @return
     */
    @RequestMapping("/addStudentInfo")
    public @ResponseBody
    String addStudentInfo(TStudentBaseInfo studentInfo){
        try {
            studentinfoService.addStudentInfo(studentInfo);
        } catch (Exception e) {
            logger.error("添加学生失败",e);
            return "添加失败";
        }
        return "添加成功";
    }
    /**
     * 导入学生文件
     * @param session
     * @param classId
     * @param file
     * @return
     */
    @RequestMapping("/addStudentInfoList")
    public @ResponseBody
    ResposeResult addTeacherList(HttpSession session, String classId, MultipartFile file){
        ServletContext servletContext = session.getServletContext();
        //获取上传文件的绝对路径
        String realPath = servletContext.getRealPath(file.getOriginalFilename());
        File StudentFile = new File(realPath);
        //返回ajax请求的工具类
        ResposeResult resposeResult = new ResposeResult();
        String result;
        try {
            file.transferTo(StudentFile);
        } catch (IOException e) {
            logger.error("上传文件出错！",e);
            result = "保存失败";
            resposeResult.setSuccess(false);
            resposeResult.setMsg(result);
            return resposeResult;
        }
        List<TStudentBaseInfo> studentDetailInfos = ReadStudentInfoExcel.readStudentData(realPath);
        try {
            studentinfoService.saveStudentInfoById(classId,studentDetailInfos);
        } catch (Exception e) {
            logger.error("保存学生信息出错！",e);
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
     * 导出学生信息
     * @param session
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/exportStudentInfo")
    public ResponseEntity<byte[]> exportStudentInfo(HttpSession session, CommonQuery condition, Model model)throws Exception {
        String filename = DefaultValue.STUDENT_FILENAME;
        //下载文件路径
        String path = session.getServletContext().getRealPath(filename);
        List<StudentClassInfo> mapInfo = studentinfoService.findStudentInfoByCondition(condition);
        GenerateStudentInfoExcel.generateStudentExcelInfo(mapInfo,path);
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
     * 组合条件查询学生信息分页显示
     * @param condition
     * @return
     */
    @RequestMapping("/findStudentInfoList")
    public @ResponseBody PageInfo<StudentClassInfo> findStudentInfoList(CommonQuery condition){
        if(condition.getPagesize()==null){
            condition.setPagesize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentpage()==null){
            condition.setCurrentpage(1);
        }
        PageInfo<StudentClassInfo> pageInfo = null;
        try {
            pageInfo = studentinfoService.findStudentInfoByCondition(condition, condition.getCurrentpage(),condition.getPagesize());
        } catch (Exception e) {
            logger.error("查询学生失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据学生ID删除学生
     * @param studentId
     * @return
     */
    @RequestMapping("/deleteStudentInfo")
    public @ResponseBody String deleteStudentInfo(String studentId){
        try {
            studentinfoService.deleteStudentInfoById(studentId);
        } catch (Exception e) {
            logger.error("删除学生信息失败",e);
            return "删除学生信息失败！";
        }
        return "删除学生信息成功！";
    }

    /**
     * 根据学生ID查询基本信息
     * @param studentId
     * @return
     */
    @RequestMapping("/getStudentInfo")
    public @ResponseBody TStudentBaseInfo getStudentInfo(String studentId){
        TStudentBaseInfo studentinfo = null;
        try {
            studentinfo = studentinfoService.getStudentInfoById(studentId);
        } catch (Exception e) {
            logger.error("查询学生信息失败",e);
        }
        return studentinfo;
    }

    /**
     * 修改学生基本信息
     * @param studentInfo
     * @return
     */
    @RequestMapping("/updateStudentInfo")
    public @ResponseBody String updateStudentInfo(TStudentBaseInfo studentInfo){
        String studentId = null;
        if(ValidateCheck.isNull(studentInfo.getStudentid())){
            return "修改失败！";
        }else{
            studentId = studentInfo.getStudentid();
        }
        try {
            studentinfoService.updateStudentInfoById(studentId,studentInfo);
        } catch (Exception e) {
            logger.error("修改学生信息失败",e);
            return "修改失败！";
        }
        return "修改成功！";
    }

    //查询学生的名称和ID用于下拉框显示
    @RequestMapping("/findStudentNameAndId")
    public @ResponseBody
    List<Map<String,Object>> findStudentNameAndId(){
        List<Map<String, Object>> studentNameAndIdList = null;
        try {
            studentNameAndIdList = studentinfoService.findStudentNameAndId();
        } catch (Exception e) {
            logger.error("查询学生失败",e);
        }
        return studentNameAndIdList;
    }
}
