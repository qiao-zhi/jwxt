package cn.xm.jwxt.controller.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TCollegeBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.service.baseInfo.CollegeinfoService;
import cn.xm.jwxt.service.baseInfo.TeacherinfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/collegeInfo")
public class CollegeinfoController {

    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(CollegeinfoController.class);
    @Resource
    private CollegeinfoService collegeinfoService;
    /**
     * 添加学院基本信息
     * @param collegeInfo
     * @return
     */
    @RequestMapping("/addCollegeInfo")
    public @ResponseBody
    String addCollegeInfo(TCollegeBaseInfo collegeInfo){
        try {
            collegeinfoService.addCollegeInfo(collegeInfo);
        } catch (Exception e) {
            logger.error("添加学院失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 组合条件查询学院信息分页显示
     * @param condition
     * @return
     */
    @RequestMapping("/findCollegeInfoList")
    public @ResponseBody
    PageInfo<TCollegeBaseInfo> findCollegeInfoList(CommonQuery condition){
        if(condition.getPagesize()==null){
            condition.setPagesize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentpage()==null){
            condition.setCurrentpage(1);
        }
        PageInfo<TCollegeBaseInfo> pageInfo = null;
        try {
            pageInfo = collegeinfoService.findCollegeInfoByCondition(condition, condition.getCurrentpage(),condition.getPagesize());
        } catch (Exception e) {
            logger.error("查询学院失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据学院ID删除学院
     * @param collegeId
     * @return
     */
    @RequestMapping("/deleteCollegeInfo")
    public @ResponseBody String deleteCollegeInfo(String collegeId){
        try {
            collegeinfoService.deleteCollegeInfoById(collegeId);
        } catch (Exception e) {
            logger.error("删除学院信息失败",e);
            return "删除学院信息失败！";
        }
        return "删除学院信息成功！";
    }

    /**
     * 根据学院ID查询基本信息
     * @param collegeId
     * @return
     */
    @RequestMapping("/getCollegeInfo")
    public @ResponseBody TCollegeBaseInfo getCollegeInfo(String collegeId){
        TCollegeBaseInfo collegeinfo = null;
        try {
            collegeinfo = collegeinfoService.getCollegeInfoById(collegeId);
        } catch (Exception e) {
            logger.error("查询学院信息失败",e);
        }
        return collegeinfo;
    }

    /**
     * 修改学院基本信息
     * @param collegeInfo
     * @return
     */
    @RequestMapping("/updateCollegeInfo")
    public @ResponseBody String updateCollegeInfo(TCollegeBaseInfo collegeInfo){
        String collegeId = null;
        if(ValidateCheck.isNull(collegeInfo.getCollegeid())){
            return "修改失败！";
        }else{
            collegeId = collegeInfo.getCollegeid();
        }
        try {
            collegeinfoService.updateCollegeInfoById(collegeId,collegeInfo);
        } catch (Exception e) {
            logger.error("修改学院信息失败",e);
            return "修改失败！";
        }
        return "修改成功！";
    }

    //查询教师的名称和ID用于下拉框显示
    @RequestMapping("/findCollegeNameAndId")
    public @ResponseBody
    List<Map<String,Object>> findCollegeNameAndId(){
        List<Map<String, Object>> collegeNameAndIdList = null;
        try {
            collegeNameAndIdList = collegeinfoService.findCollegeNameAndId();
        } catch (Exception e) {
            logger.error("查询学院失败",e);
        }
        return collegeNameAndIdList;
    }
}
