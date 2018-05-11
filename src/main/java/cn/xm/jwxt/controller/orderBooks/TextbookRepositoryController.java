package cn.xm.jwxt.controller.orderBooks;

import cn.xm.jwxt.bean.orderBooks.TTextbookBaseInfo;
import cn.xm.jwxt.controller.arrangeCourse.ApTaskNoticeBaseInfoController;
import cn.xm.jwxt.service.orderBooks.TextbookRepositoryService;
import cn.xm.jwxt.utils.ValidateCheck;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/findAllCourse")
    public @ResponseBody List<Map> findAllCourse(){
        List<Map> allCourse = null;
        try {
            allCourse = textbookRepositoryService.findAllCourse();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  allCourse;
    }
    }


