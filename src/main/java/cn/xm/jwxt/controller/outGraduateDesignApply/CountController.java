package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.service.outGraduateDesignApply.CountInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SuppressWarnings("all")
@RequestMapping("/count")
public class CountController {
    private Logger logger = Logger.getLogger(CountController.class);
    @Autowired
    private CountInfoService countInfoService;

    @RequestMapping("/selectOGDClassStucent")
    @ResponseBody
    public PageInfo<Map<String,Object>> selectOGDClassStucent(String classID,String pagesize,String pagenum){
        //分页大小
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull(pagesize)){
            pageSize = Integer.valueOf(pagesize);
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull(pagenum)){
            pageNum = Integer.valueOf(pagenum);
        }
        //只对紧邻的下一条SELECT语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String,Object>> list = null;
        try {
            list = countInfoService.countMajorClassOGDStudentInfo(classID);
        } catch (SQLException e) {
            logger.error("统计班级校外人数失败",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @RequestMapping("/selectClassCoutn")
    @ResponseBody
    public PageInfo<Map<String,Object>> selectClassCoutn(String sYear,String eYear,String userID,
                                                     String pagesize,String pagenum){
        //分页大小
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull(pagesize)){
            pageSize = Integer.valueOf(pagesize);
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull(pagenum)){
            pageNum = Integer.valueOf(pagenum);
        }
        //只对紧邻的下一条SELECT语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize,"m.majorName");
        //封装数据
        List<Map<String, Object>> list = null;
        Map<String,Object> map = new HashMap<>();
        map.put("userID",userID);
        map.put("sYear",sYear);
        map.put("eYear",eYear);
        try {
            list = countInfoService.countMajorClass(map);
            /*遍历集合，在每次遍历中加入个班级校外毕设的人数*/
            for(Map<String,Object> classInfo:list){
                String classID = (String) classInfo.get("classID");
                List<Map<String,Object>> oGDStus = countInfoService.countMajorClassOGDStudentInfo(classID);
                classInfo.put("students",oGDStus);
            }

        } catch (SQLException e) {
            logger.error("统计班级校外人数失败",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
