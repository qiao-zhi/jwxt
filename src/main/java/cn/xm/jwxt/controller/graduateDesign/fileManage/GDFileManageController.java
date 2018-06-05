package cn.xm.jwxt.controller.graduateDesign.fileManage;

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
@EnableCaching
@RequestMapping("gdfilemanage")
public class GDFileManageController {

    //log4j日志打印
    public Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private GDFileManageService gDFileManageService;

    /**
     * 分页组合条件查询学生信息
     * @param condition 组合条件
     * @return  查询到的数据
     */
    @RequestMapping("/getStudentInfo")
    public @ResponseBody PageInfo<Map<String,Object>> getStudentInfo(@RequestParam Map<String,Object> condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){
            pageSize = Integer.valueOf((String) condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){
            pageNum = Integer.valueOf((String) condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize,"CONVERT(courseNameCN USING gbk)");
        //上面pagehelper的设置对此查询有效，查到数据总共8条
        List<Map<String, Object>> fileCheckInfo = null;
        try {
            fileCheckInfo = gDFileManageService.getFileCheckInfo(condition);
        } catch (Exception e) {
            logger.error("分页查询答辩秘书审核信息失败",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(fileCheckInfo);
        return pageInfo;
    }
}
