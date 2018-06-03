package cn.xm.jwxt.controller.graduateDesign.graduateManage;

import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.service.graduateDesign.graduateManage.GraduateManageService;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/graduateManage")
public class GraduateManageController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private GraduateManageService graduateManageService;

    /**
     * 获取学年，初始化菜单
     *
     * @return
     */
    @RequestMapping("/getYearNum")
    public @ResponseBody
    List<String> getYearNum() {
        List<String> yearOptions = new ArrayList<String>();
        try {
            yearOptions = graduateManageService.getYearNum();
        } catch (Exception e) {
            logger.error("获取学年，初始化菜单失败", e);
        }
        return yearOptions;
    }

    /**
     * 获取专业，初始化菜单
     *
     * @return
     */
    @RequestMapping("/getMajor")
    public @ResponseBody
    List<TMajorBaseInfo> getMajor() {
        List<TMajorBaseInfo> majorOptions = new ArrayList<TMajorBaseInfo>();
        try {
            majorOptions = graduateManageService.getMajor();
        } catch (Exception e) {
            logger.error("获取专业，初始化菜单失败", e);
        }
        return majorOptions;
    }

    /**
     * 添加毕设基本信息
     *
     * @param gradeuatebaseinfo
     * @return
     */
    @RequestMapping("/addGraduateInfo")
    public @ResponseBody
    String addGraduateInfo(Gradeuatebaseinfo gradeuatebaseinfo) {
        try {
            Boolean res = graduateManageService.addGraduateInfo(gradeuatebaseinfo);
            if (!res) {
                return "添加失败";
            }
        } catch (Exception e) {
            logger.error("添加毕设基本信息失败", e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 修改毕设基本信息
     *
     * @param gradeuatebaseinfo
     * @return
     */
    @RequestMapping("/modifyGraduateInfo")
    public @ResponseBody
    String modifyGraduateInfo(Gradeuatebaseinfo gradeuatebaseinfo) {
        try {
            Boolean res = graduateManageService.modifyGraduateInfo(gradeuatebaseinfo);
            if (!res) {
                return "修改失败";
            }
        } catch (Exception e) {
            logger.error("修改毕设基本信息失败", e);
            return "修改失败";
        }
        return "修改成功";
    }

    /**
     * 删除毕设基本信息
     *
     * @param graDesignID
     * @return
     */
    @RequestMapping("/removeGraduateInfo")
    public @ResponseBody String removeGraduateInfo(String graDesignID) {
        try {
            Boolean res = graduateManageService.removeGraduateInfo(graDesignID);
            if (!res) {
                return "删除失败";
            }
        } catch (Exception e) {
            logger.error("课题毕设基本信息删除失败", e);
            return "删除失败";
        }
        return "删除成功";
    }

    /**
     * 分页组合条件查询毕业基本信息,初始化表格
     *
     * @param condition 组合条件
     * @return 查询到的数据
     */
    @RequestMapping("/getGraduateInfoByCondition")
    public @ResponseBody
    PageInfo<Map<String, String>> getGraduateInfoByCondition(@RequestParam Map<String, String> condition) {
        int pageSize = DefaultValue.PAGE_SIZE;
        if (ValidateCheck.isNotNull(condition.get("pageSize"))) {//如果不为空的话改变当前页大小
            pageSize = Integer.valueOf(condition.get("pageSize"));
        }
        int pageNum = 1;
        if (ValidateCheck.isNotNull(condition.get("currentPage"))) {//如果不为空的话改变当前页号
            pageNum = Integer.valueOf(condition.get("currentPage"));
        }
        //开始分页
        PageHelper.startPage(pageNum,pageSize,"yearNum desc");

        List<Map<String, String>> graduateInfo = null;
        try {
            graduateInfo = graduateManageService.getGraduateInfoByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页组合条件查询毕设基本信息,初始化表格失败", e);
        }
        PageInfo<Map<String, String>> pageInfo = new PageInfo<Map<String, String>>(graduateInfo);
        return pageInfo;
    }

}