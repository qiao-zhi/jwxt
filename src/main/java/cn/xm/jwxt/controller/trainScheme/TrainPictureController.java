package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainpicture;
import cn.xm.jwxt.service.trainScheme.TrainPictureService;
import cn.xm.jwxt.utils.FileHandleUtil;
import cn.xm.jwxt.utils.ResposeResult;
import cn.xm.jwxt.utils.UUIDUtil;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * @Author: qlq
 * @Description 培养方案课程关系结构图Action
 * @Date: 17:12 2018/5/4
 */
@RestController
@RequestMapping("/TrainPicture")
public class TrainPictureController {
    private Logger logger = Logger.getLogger(TrainPictureController.class);//日志记录器
    @Autowired
    private  TrainPictureService trainPictureService;
    /**
     * 上传培养方案图片
     * 1.图片保存到本地2.调用service保存数据库
     * @param trainpicture 培养方案信息
     * @param file  文件内容
     * @return
     */
    @RequestMapping("/uploadTrainPicture")
    public ResposeResult addTrainPicture(Trainpicture trainpicture, MultipartFile file){
        //1.保存图片到本地
        String fileoriname=null;//原名称
        String filenowname=null;//系统生成的名称
        if(file != null){
            fileoriname = file.getOriginalFilename();//获取原名字
            filenowname = UUIDUtil.getUUID2()+ "."+FilenameUtils.getExtension(fileoriname);//UUID生成新的唯一名字+文件扩展名
        }

        try {
             FileHandleUtil.uploadSpringMVCFile(file, "trainPicture", filenowname);
        } catch (Exception e) {
            logger.error("保存培养方案图片出错",e);
        }
        //2.调用service保存数据库
        trainpicture.setPictureoriname(fileoriname);
        trainpicture.setPicturenowname(filenowname);
        trainpicture.setUptime(new Date());
        ResposeResult resposeResult = new ResposeResult();
        String result = null;
        try {
            result = trainPictureService.addTrainPicture(trainpicture)?"上传成功":"上传失败";
        } catch (SQLException e) {
            result = "上传失败";
            logger.error("保存培养方案数据库出错",e);
        }
        resposeResult.setMsg(result);
        return resposeResult;
    }


    /**
     * 根据培养方案编号查询培养方案图片信息
     * @param trainSchemeId 培养方案编号
     * @return  JSON的形式返回培养方案图片信息
     */
    @RequestMapping("/getTrainpicturesByTrainSchemeId")
    public List<Trainpicture> getTrainpicturesByTrainSchemeId(@RequestParam(defaultValue = "1")String trainSchemeId){
        List<Trainpicture> trainPictures = null;
        try {
            trainPictures  = trainPictureService.getTrainPictureByTrainschemeId(trainSchemeId);
        } catch (SQLException e) {
            logger.error("根据培养方案编号查询培养方案图片信息出错",e);
        }
        return trainPictures;
    }


}
