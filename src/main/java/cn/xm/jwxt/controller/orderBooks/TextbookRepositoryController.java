package cn.xm.jwxt.controller.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;
import cn.xm.jwxt.controller.arrangeCourse.ApTaskNoticeBaseInfoController;
import cn.xm.jwxt.service.orderBooks.TextbookRepositoryService;
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

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


/**
 * 项目名称：jwxt
 * 类描述：教材库管理的Controller
 * 创建人：yy
 * 创建时间：2018/5/4 11:52
 */
@Controller
@RequestMapping("/TextbookRepository")
public class TextbookRepositoryController {
    //日志记录器，处理异常
    private Logger logger = Logger.getLogger(ApTaskNoticeBaseInfoController.class);
    @Autowired
    private TextbookRepositoryService textbookRepositoryService;//教材库service

    /**
     * 根据教材编号查找教材总数，查询是否存在相同编号的教材
     * @param textbookNum
     * @return
     */
    @RequestMapping("/getCountByTextbookNum")
    public @ResponseBody String getCountByTextbookNum(String textbookNum){
        int count=0;
        if(ValidateCheck.isNull(textbookNum))
            count=1;
        try{
            count=textbookRepositoryService.getCountByTextbookNum(textbookNum);
        }
        catch (SQLException e){
            logger.error("根据教材编号查询教材总数出错",e);
        }
        return String.valueOf(count);
    }

    /**
     * 添加教材
     * @param textbook
     * @return
     */
    @RequestMapping("/addTextbook")
    public @ResponseBody String addTextbook(TTextbookBaseInfo textbook){
        if(textbook==null)
            return "添加失败";
        try{
            textbookRepositoryService.addTextbook(textbook);
        }
        catch (SQLException e){
            logger.error( "添加教材失败",e);
            return "添加失败";
        }
        return "添加成功";
    }

    /**
     * 查找所有课程
     * @return
     */
    @RequestMapping("/findAllCourse")
    public @ResponseBody List<Map> findAllCourse(){
        List<Map> allCourse = null;
        try {
            allCourse = textbookRepositoryService.findAllCourse();
        } catch (SQLException e) {
            logger.error( "查找失败",e);
        }
        return  allCourse;
    }

    /**
     * 根据教材ID查找教材基本信息
     * @param textbookId
     * @return
     */
    @RequestMapping("/findTextbookByTextbookId")
    public @ResponseBody TTextbookBaseInfo findTextbookByTextbookId(@RequestParam String textbookId){
        TTextbookBaseInfo textbook=null;
        try {
            textbook=textbookRepositoryService.findTextbookByTextbookId(textbookId);
        } catch (SQLException e) {
            logger.error( "查找教材失败",e);
        }
        return  textbook;
    }

    @RequestMapping("/findTextbook")
    public @ResponseBody PageInfo<Map<String,Object>> findTextbook(@RequestParam/*控制层用SpringMVC的注解@RequestParam，持久层Mybatis的注解@Param*/ Map condition){
        int pageSize= DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String)condition.get("pageSize")/*get（）根据键得到值*/)){
            pageSize=Integer.valueOf((String)condition.get("pageSize"));
        }
        int pageNum=1;
        if(ValidateCheck.isNotNull((String)condition.get("pageNum"))){
            pageNum=Integer.valueOf((String)condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize,"CONVERT(textbookName USING gbk)");
        //上面pagehelper的设置对此查询有效，查到数据总共6条
        List<Map<String, Object>> textbook = null;
        try {
            textbook=textbookRepositoryService.findTextbook(condition);
        } catch (SQLException e) {
            logger.error("分页查询教材信息失败",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(textbook);
        return pageInfo;
    }

    @RequestMapping("/updateTextbook")
    public @ResponseBody String updateTextbook(TTextbookBaseInfo tTextbookBaseInfo){
        String result=null;
        try {
            result=textbookRepositoryService.updateTextbook(tTextbookBaseInfo)?"修改成功":"修改失败";
        } catch (SQLException e) {
            logger.error("修改教材基本信息失败",e);
            result="修改出错了！！！";
        }
        return result;
    }

    @RequestMapping("/deleteTextbook")
    public @ResponseBody String deleteTextbook(String textbookId) {
        String result = null;
        try {
            result = textbookRepositoryService.deleteTextbook(textbookId)?"删除成功":"删除失败";
        } catch (SQLException e) {
            result = "删除失败";
            logger.error("删除教材信息失败", e);
        }
        return result;
    }
    }


