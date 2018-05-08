package cn.xm.jwxt.controller.common;

import cn.xm.jwxt.bean.common.Dictionary;
import cn.xm.jwxt.service.common.DictionaryService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.jdbc.SQL;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 字典controller
 */

@RequestMapping("/dictionary")//基本的映射路径
//@ResponseBody//所有方法返回都是以JSON形式返回
//@Controller//控制层代码
@RestController//这个注解等于@ResponseBody+@Controller，打开源码可以看到该注解上仍然有注解
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;
    private Logger logger = Logger.getLogger(DictionaryController.class);

    @RequestMapping("/getDictionaryTree")
    public List<Dictionary> getDictionaryTrees() {
        List<Dictionary> dictionaryTree = null;
        try {
            dictionaryTree =  dictionaryService.getDictionaryTree();
        } catch (SQLException e) {
            logger.error("查询字典树出错!",e);
        }
        return dictionaryTree;
    }


    @RequestMapping("/getDictionaryFY")
    public PageInfo<Map<String,Object>> getDictionaryByCondition(@RequestParam Map condition){
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){
            pageSize = Integer.valueOf((String) condition.get("pageSize"));
        }
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){
            pageNum = Integer.valueOf((String) condition.get("pageNum"));
        }
        //只对紧邻的下一条select语句进行分页查询，对之后的select不起作用
        PageHelper.startPage(pageNum,pageSize);
        List<Map<String,Object>> dictionarys = null;
        try {
            dictionarys =  dictionaryService.getDictionaryByConditon(condition);
        } catch (SQLException e) {
            logger.error("查询字典出错",e);
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(dictionarys);
        return pageInfo;
    }


    /**
     * 添加字典
     * @param dictionary    表单自动映射的数据
     * @return  添加结果
     */
    @RequestMapping("/addDictionary")
    public String addDictionary(Dictionary dictionary){
        String result = null;
        try {
            result = dictionaryService.addDictionary(dictionary)?"添加成功":"添加失败";
        } catch (SQLException e) {
            result  = "添加失败!";
            logger.error("添加字典出错",e);
        }
        return result;
    }

    /**
     * 批量删除字典
     * @param dictionaryIds 自动映射的字典数组
     * @return  删除结果
     */
    @RequestMapping("/deleteDictBatch")
    public String deleteDictionaryBatch(String dictionaryIds){
        //1.字符串转为数组
        String[] dictIds = dictionaryIds.split(",");
        String result = null;
        try {
            //2.删除
            result = dictionaryService.deleteDictionaryBatch(Arrays.asList(dictIds))?"删除成功":"删除失败";
        } catch (SQLException e) {
            result = "删除失败！";
            logger.error("批量删除字典出错",e);
        }
        return result;
    }


    /**
     * 修改字典信息
     * @param dictionary    修改后的字典信息
     * @return
     */
    @RequestMapping("/updateDict")
    public String updateDict(Dictionary dictionary){
        String result = null;
        try {
            result = dictionaryService.updateDictionary(dictionary)?"修改成功":"修改失败";
        } catch (SQLException e) {
            result = "修改失败";
            logger.error("修改字典出错",e);
        }
        return result;
    }

    /**
     * 根据字典编号查询字典
     * @param dictionaryId
     * @return
     */
    @RequestMapping("/getDictionaryById")
    public Dictionary getDictionaryById(@RequestParam(defaultValue = "1")String dictionaryId){
        //下面这句话的作用域注解上的@RequestParam设置默认值的效果一样
/*        if(ValidateCheck.isNull(dictionaryId)){
            dictionaryId="1";
        }*/
        Dictionary dictionary = null;
        try {
            dictionary = dictionaryService.getDictionaryById(dictionaryId);
        } catch (SQLException e) {
            logger.error("根据字典编号查询字典出错",e);
        }
        return dictionary;
    }


    /**
     * 根据字典上级编号查询下级字典名信息
     * @param upDicId
     * @return
     */
    @RequestMapping("/getDictionarysByUpDictId")
    public List<Dictionary> getDictionaryIdAndNamesByUpId(@RequestParam(defaultValue = "1") String upDicId){
        //下面这句话的作用域注解上的@RequestParam设置默认值的效果一样
        /*if(ValidateCheck.isNull(upDicId)){
            upDicId = "1";
        }*/
        List<Dictionary> dictionarys = null;
        try {
            dictionarys = dictionaryService.getDictionaryIdAndNamesByUpId(upDicId);
        } catch (SQLException e) {
            logger.error("根据字典上级编号查询字典出错",e);
        }
        return dictionarys;
    }


}