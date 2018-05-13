package cn.xm.jwxt.controller.graduateDesign.projectManage;

import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseGPStudentService;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
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

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("chooseGPStudent")
public class ChooseGPStudentController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private ChooseGPStudentService chooseGPStudentService;

    /**
     * 分页组合条件查询课题添加基本信息
     * @param condition 组合条件
     * @return  查询到的数据
     */
    @RequestMapping("/getProjectInfo")
    public @ResponseBody
    PageInfo<Map<String,String>> getProjectInfo(@RequestParam Map<String,String> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull(condition.get("pageSize"))){//如果不为空的话改变当前页大小
            pageSize = Integer.valueOf(condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull(condition.get("pageNum"))){//如果不为空的话改变当前页号
            pageNum = Integer.valueOf(condition.get("pageNum"));
        }
        //开始分页   CONVERT(courseNameCN USING gbk)显示方式。排序方式。"createTime desc";//按创建时间降序排序
        PageHelper.startPage(pageNum,pageSize,"CONVERT(courseNameCN USING gbk)");
        //上面pagehelper的设置对此查询有效，查到数据总共8条
        List<Map<String, String>> projectInfo = null;
        try {
            projectInfo = chooseGPStudentService.getprojectInfoByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页查询信息失败",e);
        }
        PageInfo<Map<String,String>> pageInfo = new PageInfo<Map<String,String>>(projectInfo);
        return pageInfo;
    }


}