package cn.xm.jwxt.controller.courseDesign;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.service.courseDesign.TCoursedesignInfoArrangeService;
import cn.xm.jwxt.service.courseDesign.TCoursedesignToolService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/findcourseDesign")
public class FindNeendArrangeCourseDesignController {

    private Logger logger = Logger.getLogger(FindNeendArrangeCourseDesignController.class);

    @Autowired
    private TCoursedesignToolService cdToolService;
    @Autowired
    private TCoursedesignInfoArrangeService cdInfoArrangeService;

    /**
     * 返回当前年级和专业列表
     * @return
     */
    @ResponseBody
    @RequestMapping("/yearAndMajor.do")
    public Map<String,Object> getMajorListAndYearList(){
        Map<String,Object> resultMap = new HashMap<String,Object>();
        //生成 年 的列表
        List<String> yearList = new ArrayList<String>();
        try {
            yearList = cdToolService.getYearList();
        } catch (SQLException e) {
            logger.error("获取当前 年 失败",e);
        }
        // 查询专业种类
        List<Map<String,Object>> majorList = new ArrayList<Map<String,Object>>();
        try {
            majorList =  cdToolService.getMajorList("1");
        } catch (SQLException e) {
            logger.error("根据学院id获取专业信息失败",e);
        }
        resultMap.put("majorList",majorList);
        resultMap.put("yearList",yearList);
        return resultMap;
    }

    /**
     *  查询要安排的课设
     * @param condition
     * @return
     */
    @ResponseBody
    @RequestMapping("/toFindNeedArrangeCourseDesign.do")
    public PageInfo<Map<String,Object>> toFindNeedArrangeCourseDesign(@RequestParam Map<String,Object> condition){

        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){
            pageSize = Integer.valueOf((String) condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum = Integer.valueOf((String)condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize,"trainingSchemeID"); //CONVERT(courseNameCN USING gbk)
        // 查询需要安排的课设
        List<Map<String,Object>> courseDesignList = new ArrayList<Map<String,Object>>();
        try {
            courseDesignList = cdInfoArrangeService.findNeedArrangeCourseDesign(condition);
        } catch (SQLException e) {
            logger.error("查询需要安排的课设信息失败",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(courseDesignList);
        return pageInfo;
    }

    @ResponseBody
    @RequestMapping("/deleteCourseDesignArrangeInfo.do")
    public boolean deleteCourseDesignArrangeInfo(String courseDesignArrangeID){
//        Map<String,Object> condition = new HashMap<String,Object>();
//        condition.put("trainCourseID",trainCourseID);
//        condition.put("yearNum",yearNum);
//        condition.put("majorID",majorID);
//        condition.put("grade",grade);
        boolean result = false;
        try {
            result = cdInfoArrangeService.deleteTCoursedesignInfo(courseDesignArrangeID);
        } catch (SQLException e) {
            logger.error("删除安排的课设信息失败",e);
        }
        return result;
    }

}
