package cn.xm.jwxt.controller.graduateDesign.fileManage;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseTask;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.bean.graduateDesign.GdFileCheck;
import cn.xm.jwxt.service.graduateDesign.fileManage.GDFileManageService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/gdfilemanage")
public class GDFileManageController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private GDFileManageService gDFileManageService;

    /**
     * 分页组合条件查询审核学生信息
     * @param condition 组合条件
     * @return  查询到的数据
     */
    @RequestMapping("/getFileCheckInfo")
    public @ResponseBody PageInfo<Map<String,String>> getFileCheckInfo(@RequestParam Map<String,String> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull(condition.get("pageSize"))){//如果不为空的话改变当前页大小
            pageSize = Integer.valueOf(condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull(condition.get("pageNum"))){//如果不为空的话改变当前页号
            pageNum = Integer.valueOf(condition.get("pageNum"));
        }
        //开始分页   CONVERT(courseNameCN USING gbk)显示方式。排序方式。"createTime desc";//按创建时间降序排序
        PageHelper.startPage(pageNum,pageSize,"CONVERT(studentName desc)");
        //上面pagehelper的设置对此查询有效，查到数据总共8条
        List<Map<String, String>> fileCheckInfo = null;
        try {
            fileCheckInfo = gDFileManageService.getFileCheckInfoByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页查询审核学生信息失败",e);
        }
        PageInfo<Map<String,String>> pageInfo = new PageInfo<Map<String,String>>(fileCheckInfo);
        return pageInfo;
    }

    /**
     * 文件提交审核
     * @param gdFileCheck
     * @return
     */
    @RequestMapping("/addAuditInfo")
    public @ResponseBody String addAuditInfo(GdFileCheck gdFileCheck){
        boolean res = false;
        try {
            res = gDFileManageService.addAuditInfo(gdFileCheck);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("分页查询答辩秘书审核信息失败",e);
        }

        return res ? "审核成功" : "审核失败";
    }
}
