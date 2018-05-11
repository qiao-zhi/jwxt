package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursetypeinfo;
import cn.xm.jwxt.service.trainScheme.CourseTypeInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: qlq
 * @Description 培养方案课程类别Controller
 * @Date: 10:07 2018/5/6
 */
@RestController
@RequestMapping("/courseType")
public class TrainschemeCourseTypeController {
    private Logger logger = Logger.getLogger(TrainschemeCourseTypeController.class);
    @Autowired
    private CourseTypeInfoService courseTypeInfoService;

    /**
     * 获取培养方案课程类别树
     * 每次查出的数据加一条编号为1的数据(虚拟节点，名称是课程类别)
     *
     * @param trainSchemeId 培养方案编号
     * @return 课程类别树(多一条虚拟数据)
     */
    @RequestMapping("/getTypeTree")
    public List<Coursetypeinfo> getTypeTreeByTrainSchemeId(@RequestParam(defaultValue = "1") String trainSchemeId) {
        List<Coursetypeinfo> typeTree = null;
        try {
            typeTree = courseTypeInfoService.getTypeTreeByTrainSchemeId(trainSchemeId);
        } catch (SQLException e) {
            logger.error("查询培养方案类别树出错!", e);
        }
        Coursetypeinfo coursetypeinfo = new Coursetypeinfo();
        coursetypeinfo.setTypenum("1");//设置编号为1
        coursetypeinfo.setTypename(DefaultValue.COURSE_TYPE_ROOT_NAME);//设置名称是课程类别
        typeTree.add(coursetypeinfo);
        return typeTree;
    }

    /**
     * 增加课程类别
     *
     * @param coursetypeinfo 课程类别实体
     * @return 添加结果以JSON的形式返回
     */
    @RequestMapping("/addCourseType")
    public String addCourseType(Coursetypeinfo coursetypeinfo) {
        String result = null;
        try {
            result = courseTypeInfoService.addcourseTypeInfo(coursetypeinfo) ? "添加成功" : "添加失败";
        } catch (SQLException e) {
            result = "添加失败";
            logger.error("添加课程类别报错", e);
            return result;
        }
        return result;
    }

    /**
     * 修改课程类别信息(单独的修改类别的名称)
     * @param typeNum   课程类别编号
     * @param typeName  类别名称
     * @return
     */
    @RequestMapping("/updateCourseType")
    public String updateCourseType(@RequestParam(defaultValue = "1") String trainSchemeId,@RequestParam(value = "typeNum", defaultValue = "1") String typeNum, @RequestParam(value = "typeName", defaultValue = "1") String typeName) {
        String result = null;
        try {
            result = courseTypeInfoService.updateCurseTypeNameByTypeNumAndTrainSchemeId(trainSchemeId,typeNum,typeName)?"修改成功":"修改失败";
        } catch (SQLException e) {
            logger.error("修改课程类别出错",e);
            return "修改失败";
        }
        return result;
    }

    @RequestMapping("/deleteCourseType")
    public String deleteTrainCourseType(@RequestParam(defaultValue = "1") String trainSchemeId,@RequestParam(defaultValue="0")String typeNum){
        String result = null;
        try {
            result = courseTypeInfoService.deleteCourseTypeInfoByTrainSchemeIdAndTypeNum(trainSchemeId,typeNum)?"删除成功":"删除失败";
        } catch (SQLException e) {
            logger.error("删除失败",e);
            return "删除失败";
        }
        return result;
    }


}
