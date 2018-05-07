package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;
import cn.xm.jwxt.bean.trainScheme.Trainpicture;
import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo;
import cn.xm.jwxt.queryVo.ListVo;
import cn.xm.jwxt.service.trainScheme.TrainschemeinfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 培养方案COntroller
 * @Date: 11:41 2018/5/2
 */
@RestController
@RequestMapping("/TrainScheme")
public class TrainSchemeController {
    /**
     * 日志记录器
     */
    private Logger logger = Logger.getLogger(TrainSchemeController.class);
    @Autowired
    private TrainschemeinfoService trainschemeinfoService;//培养方案service

    /**
     * 获取所有的专业名称和专业代码
     * @return  以JSON形式返回专业名称和代码
     */
    @RequestMapping("/getMajorNameAndCode")
    public List<Map<String, Object>> getMajorNameAndCode(){
        List<Map<String, Object>> majorNameAndCode = null;
        try {
            majorNameAndCode =    trainschemeinfoService.getMajorNameAndCode();
        } catch (SQLException e) {
            logger.error("查询所有的专业名称和专业代码出错",e);
        }
        return majorNameAndCode;
    }


    /**
     * 根据专业代码获取专业信息
     * @param majorCode 专业编号
     * @return  以JSON的形式返回专业信息
     */
    @RequestMapping("/getMajorInfo")
    public Map<String, Object> getMajorInfoByMajorCode(String majorCode){
        Map<String, Object> majorInfoByMajorCode =null;
        try {
            majorInfoByMajorCode  = trainschemeinfoService.getMajorInfoByMajorCode(majorCode);
        } catch (SQLException e) {
            logger.error("根据专业代码获取专业信息出错",e);
        }
        return majorInfoByMajorCode;
    }


    /**
     * 保存培养方案基本信息和培养方案能力信息
     * @param trainschemeinfo   培养方案基本信息
     * @param listVo    包装培养方案能力的信息
     * @return  添加结果
     */
    @RequestMapping("/addTrainScheme")
    public String addTrainschemeinfo(Trainschemeinfo trainschemeinfo, ListVo listVo){
        List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos = null;
        if(listVo != null){
            trainningcapacitybaseinfos = listVo.getTrainningcapacitybaseinfos();
        }
        String result = null;
        try {
            result = trainschemeinfoService.addTrainschemeinfo(trainschemeinfo, trainningcapacitybaseinfos)?"添加成功":"添加失败";
        } catch (Exception e) {
            result="添加失败";
            logger.error("插入培养方案出错!",e);
        }
        return result;
    }


    @RequestMapping("/updateTrainScheme")
    public String updateTrainschemeinfo(Trainschemeinfo trainschemeinfo, ListVo listVo){
        List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos = null;
        if(listVo != null){
            trainningcapacitybaseinfos = listVo.getTrainningcapacitybaseinfos();
        }
        String result = null;
        try {
            result = trainschemeinfoService.updateTrainschemeinfo(trainschemeinfo, trainningcapacitybaseinfos)?"保存成功":"保存失败";
        } catch (Exception e) {
            result="保存失败";
            logger.error("修改培养方案出错!",e);
        }
        return result;
    }

    /**
     * 分页查询培养方案基本信息
     * @param condition 自动映射的查询条件
     * @return  分页信息
     */
    @RequestMapping("/getTrainSchemeFY")
    public PageInfo<Map<String,Object>> getTrainschemeinfosFY(@RequestParam Map condition){
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){ //如果不为空的话改变当前页号
            pageNum = Integer.parseInt((String) condition.get("pageNum"));
        }
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){ //如果不为空的话改变当前页大小
            pageSize = Integer.parseInt((String) condition.get("pageSize"));
        }
        //开始分页
        PageHelper.startPage(pageNum,pageSize,"createTime desc");//按创建时间降序排序
        List<Map<String, Object>> trainschemeinfoByCondition = null;
        try {
            trainschemeinfoByCondition =  trainschemeinfoService.getTrainschemeinfoByCondition(condition);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(trainschemeinfoByCondition);
        return pageInfo;
    }

    /**
     * 根据培养方案编号查询培养方案基本信息
     * @param trainSchemeId 培养方案编号
     * @return  培养方案信息
     */
    @RequestMapping("/getTrainSchemeInfoById")
    public Map<String,Object> getTrainSchemeInfoById(@RequestParam(defaultValue = "1")String trainSchemeId){
        Map<String, Object> trainschemeinfo = null;
        try {
            trainschemeinfo = trainschemeinfoService.getTrainschemeinfoById(trainSchemeId);
        } catch (SQLException e) {
            logger.error("根据培养方案编号查询培养方案信息出错");
        }
        return trainschemeinfo;
    }


    /**
     * 根据培养方案编号删除培养方案(将标记位置为0)
     * @param trainSchemeId
     * @return
     */
    @RequestMapping("/deleteTrainSchemeById")
    public String deleteTrainSchemeByTrainSchemeId(@RequestParam(defaultValue = "1")String trainSchemeId){
        String result = null;
        try {
            result = trainschemeinfoService.deleteTrainschemeinfoById(trainSchemeId)?"删除成功":"删除失败";
        } catch (SQLException e) {
            result = "删除失败";
            logger.error("删除培养方案信息出错",e);
        }
        return result;
    }





}
