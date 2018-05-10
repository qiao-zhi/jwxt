package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.bean.trainScheme.TrainCourse;
import cn.xm.jwxt.queryVo.ListVo;
import cn.xm.jwxt.service.trainScheme.TrainCourseService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.soap.Addressing;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 培养方案课程controller
 * @Date: 15:43 2018/5/7
 */
@RestController
@RequestMapping("/TrainCourse")
public class TrainCourseController {
    private Logger logger = Logger.getLogger(TrainCourseController.class);//日志记录器
    @Autowired
    private TrainCourseService trainCourseService;

    /**
     * 分页查询培养方案中没有排过的课程
     * @param condition 组合条件
     * @return  没有排的课程信息
     */
    @RequestMapping("/getCoursesBseInfoByCondition")
    public PageInfo<TCourseBaseInfo> getCoursesBseInfoByCondition(@RequestParam Map condition){
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){ //如果不为空的话改变当前页号
            pageNum = Integer.parseInt((String) condition.get("pageNum"));
        }
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){ //如果不为空的话改变当前页大小
            pageSize = Integer.parseInt((String) condition.get("pageSize"));
        }
        //开始分页
        PageHelper.startPage(pageNum,pageSize);
        List<TCourseBaseInfo> coursesBseInfos = null;
        try {
            coursesBseInfos = trainCourseService.getCoursesBseInfoByCondition(condition);
        } catch (SQLException e) {
            logger.error("查询未排的课程失败",e);
            return null;
        }
        PageInfo<TCourseBaseInfo> pageInfo = new PageInfo<TCourseBaseInfo>(coursesBseInfos);
        return pageInfo;
    }


    /**
     * 添加培养方案课程信息
     * @param listVo
     * @return
     */
    @RequestMapping("/addTrainCourse")
    public String addTrainCourses(ListVo listVo){
        //如果集合不存在数据就直接返回
        if(listVo == null || listVo.getTrainCourse()==null || listVo.getTrainCourse().size()==0){
            return "没有数据可以添加";
        }
        String result = null;
        try {
            result = trainCourseService.addTrainCourseBatch(listVo.getTrainCourse())?"添加成功":"添加失败";
        } catch (SQLException e) {
            logger.error("添加培养方案课程失败",e);
            return "添加失败";
        }
        return result;
    }

    /**
     * 分页查询已经排好的培养方案课程信息
     * @param condition 组合条件
     * @return  以JSON的形式返回这些数据
     */
    @RequestMapping("/getTrainCoursesByCondition")
    public PageInfo<Map<String,Object>> getTrainCoursesByCondition(@RequestParam Map<String,Object> condition){
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){ //如果不为空的话改变当前页号
            pageNum = Integer.parseInt((String) condition.get("pageNum"));
        }
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){ //如果不为空的话改变当前页大小
            pageSize = Integer.parseInt((String) condition.get("pageSize"));
        }
        //开始分页
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String, Object>> trainCourses = null;
        try {
            trainCourses = trainCourseService.getTrainCoursesByCondition(condition);
        } catch (SQLException e) {
            logger.error("查询培养方案课程失败",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(trainCourses);
        return pageInfo;
    }

    /**
     * 批量删除培养方案课程信息
     * @param trainCourseIds
     * @return
     */
    @RequestMapping("/deleteTrainCourseBatch")
    public String deleteTrainCourseBatch(@RequestParam(defaultValue = "100000,200000") String trainCourseIds){
        //转换为String数组
        String[] ids_str = trainCourseIds.split(",");
        List<Integer> ids = new ArrayList<Integer>();
        for(String id : ids_str){
            ids.add(Integer.parseInt(id));
        }
        String result = null;
        try {
            result = trainCourseService.deleteTrainCourseBatch(ids)?"删除成功":"删除失败";
        } catch (SQLException e) {
            logger.error("删除培养方案课程出错",e);
            return "删除失败";
        }
        return result;
    }

    /**
     * 修改培养方案课程信息
     * @param trainCourse   修改后的培养方案信息(主要是修改培养方案课程学期)
     * @return
     */
    @RequestMapping("/updateTrainCourse")
    public  String updateTrainCourse(TrainCourse trainCourse){
        String result = null;
        try {
            result = trainCourseService.updateTrainCourseSemesterByID(trainCourse)?"修改成功":"修改失败";
        } catch (SQLException e) {
            logger.error("修改培养方案课程学期出错",e);
            return "修改失败";
        }
        return result;
    }

}
