package cn.xm.jwxt.controller.courseDesign;

import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignTeacherstudentCustomMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignTeacherstudentService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/studentCourseDesignFileInfo")
public class StudentCourseDesignFileInfoController {

    @Autowired
    private TCoursedesignTeacherstudentService tsService;
    @ResponseBody
    @RequestMapping("/findNeedUploadCourseDesignFile.do")
    public PageInfo<Map<String,Object>> StudentCourseDesignFileInfoController(@RequestParam Map<String,Object> condition){
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
            list = tsService.findNeedUploadCoursedesignFile(condition);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
