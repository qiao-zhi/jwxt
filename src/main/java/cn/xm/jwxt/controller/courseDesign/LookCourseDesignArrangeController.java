package cn.xm.jwxt.controller.courseDesign;

import cn.xm.jwxt.bean.system.User;
import cn.xm.jwxt.service.courseDesign.LookCourseDesignArrangeInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/lookCourseDesignArrange")
public class LookCourseDesignArrangeController {
    Logger logger = Logger.getLogger(LookCourseDesignArrangeController.class);

    @Autowired
    private LookCourseDesignArrangeInfoService lookService;

    @ResponseBody
    @RequestMapping("/findCourseDesignArrange.do")
    public PageInfo<Map<String,Object>> findCourseDesignArrange(@RequestParam Map<String,Object> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){
            pageSize = Integer.valueOf((String) condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum = Integer.valueOf((String)condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String,Object>> infoList = new ArrayList<Map<String,Object>>();
        //获取request与session
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession(false);
        // 根据session 决定执行的sql
        User user = (User) session.getAttribute("userinfo");//获取session中的user对象进而获取操作人名字
        String userSort = user.getUsersort();
        if(userSort.equals("教师")){
            try {
                condition.put("teacherID","1");
                infoList = lookService.findCourseDesignArrangeByTeacher(condition);
            } catch (SQLException e) {
                logger.error("教师查询课设安排出错",e);
            }
        }
        if(userSort.equals("学生")){
            try {
                condition.put("studentID","1");
                infoList = lookService.findCourseDesignArrangeByStudent(condition);
            } catch (SQLException e) {
                logger.error("学生查询课设安排出错",e);
            }
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(infoList);
        return pageInfo;
    }


    @ResponseBody
    @RequestMapping("/findCourseDesignDetailInfo.do")
    public Map<String,Object> findCourseDesignDetailInfo(String courseDesignTeacherArrangeID){
        Map<String,Object> mapInfo = new HashMap<String,Object>();
        try {
            mapInfo = lookService.findCourseDesignDetailArrangeInfoByTeacher(courseDesignTeacherArrangeID);
        } catch (SQLException e) {
            logger.error("教师查询课设详细安排信息出错",e);
        }
        return mapInfo;
    }


}
