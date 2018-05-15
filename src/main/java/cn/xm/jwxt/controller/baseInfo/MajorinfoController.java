package cn.xm.jwxt.controller.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.service.baseInfo.MajorinfoService;
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
@RequestMapping("/majorInfo")
public class MajorinfoController {

    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(MajorinfoController.class);
    @Resource
    private MajorinfoService majorinfoService;
    /**
     * 添加专业基本信息
     * @param majorBaseInfo
     * @return
     */
    @RequestMapping("/addMajorInfo")
    public @ResponseBody
    String addMajorInfo(TMajorBaseInfo majorBaseInfo){
        try {
            majorinfoService.addMajorInfo(majorBaseInfo);
        } catch (Exception e) {
            logger.error("添加专业失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 组合条件查询专业信息分页显示
     * @param condition
     * @return
     */
    @RequestMapping("/findMajorInfoList")
    public @ResponseBody PageInfo<TMajorBaseInfo> findMajorInfoList(CommonQuery condition){
        if(condition.getPagesize()==null){
            condition.setPagesize(DefaultValue.PAGE_SIZE);
        }
        if(condition.getCurrentpage()==null){
            condition.setCurrentpage(1);
        }
        PageInfo<TMajorBaseInfo> pageInfo = null;
        try {
            pageInfo = majorinfoService.findMajorInfoByCondition(condition, condition.getCurrentpage(),condition.getPagesize());
        } catch (Exception e) {
            logger.error("查询教师失败",e);
        }
        return pageInfo;
    }

    /**
     * 根据专业ID删除专业信息
     * @param classId
     * @return
     */
    @RequestMapping("/deleteMajorInfo")
    public @ResponseBody String deleteMajorInfo(String classId){
        try {
            majorinfoService.deleteMajorInfoById(classId);
        } catch (Exception e) {
            logger.error("删除专业信息失败",e);
            return "删除专业信息失败！";
        }
        return "删除专业信息成功！";
    }

    /**
     * 根据专业ID查询基本信息
     * @param majorId
     * @return
     */
    @RequestMapping("/getMajorInfo")
    public @ResponseBody TMajorBaseInfo getMajorInfo(String majorId){
        TMajorBaseInfo majorinfo = null;
        try {
            majorinfo = majorinfoService.getMajorInfoById(majorId);
        } catch (Exception e) {
            logger.error("查询专业信息失败",e);
        }
        return majorinfo;
    }

    /**
     * 修改任务通知书基本信息
     * @param majorInfo
     * @return
     */
    @RequestMapping("/updateMajorInfo")
    public @ResponseBody String updateMajorInfo(TMajorBaseInfo majorInfo){
        String majorId = null;
        if(ValidateCheck.isNull(majorInfo.getMajorid())){
            return "修改失败！";
        }else{
            majorId = majorInfo.getMajorid();
        }
        try {
            majorinfoService.updateMajorById(majorId,majorInfo);
        } catch (Exception e) {
            logger.error("修改专业信息失败",e);
            return "修改失败！";
        }
        return "修改成功！";
    }

    //查询专业的名称和ID用于下拉框显示
    @RequestMapping("/findMajorNameAndId")
    public @ResponseBody List<Map<String,Object>> findMajorNameAndId(){
        List<Map<String, Object>> majorNameAndIdList = null;
        try {
            majorNameAndIdList = majorinfoService.findMajorNameAndId();
        } catch (Exception e) {
            logger.error("查询专业失败",e);
        }
        return majorNameAndIdList;
    }
}
