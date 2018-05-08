package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesignsurebook;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGraDesignAggAndSureService;
import cn.xm.jwxt.service.outGraduateDesignApply.OutsideGraDesignAttachmentService;
import cn.xm.jwxt.service.outGraduateDesignApply.PublicMethod;
import cn.xm.jwxt.utils.FileHandleUtil;
import cn.xm.jwxt.utils.UUIDUtil;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@SuppressWarnings("all")
@RequestMapping("/oGDAttachment")
public class Upload {
    private Logger logger = Logger.getLogger(Upload.class);
    @Autowired
    private OutsideGraDesignAttachmentService oGDAttachmentService;
    @Autowired
    private PublicMethod publicMethod;
    @Autowired
    private OutGraDesignAggAndSureService oGDAggAndSureService;

    /*处理保证书提交请求*/
    @RequestMapping("/commitSureBook")
    @ResponseBody
    public String commitSureBook(String sureBookId){
        Outgradesignsurebook sureBook = new Outgradesignsurebook();
        try {
            sureBook.setSureid(sureBookId);
            sureBook.setIscommit("01");
            boolean b = oGDAggAndSureService.updateSureBySureID(sureBook);
            if(b){
                return "提交成功";
            }
        } catch (SQLException e) {
            logger.error("提交保证书内容失败，数据库异常",e);
        }
        return "提交失败";
    }

    /*处理保证书签字请求*/
    @RequestMapping("/studentSign")
    @ResponseBody
    public Map<String,Object> studentSign(String userID, String signPassword, String sureBookId){
        Map<String,Object> resultMap = new HashMap<String,Object>();
        try {
            Map<String,Object> map = publicMethod.sureStudentSign(userID,signPassword);
            String status =(String) map.get("status");
            if("1".equals(status)){
                Signinfo signInfo = (Signinfo)map.get("signInfo");
                //保存导数据库中
                String fileName = signInfo.getNowname();
                Outgradesignsurebook sureBook = new Outgradesignsurebook();
                sureBook.setSureid(sureBookId);
                sureBook.setStudentsignurl(fileName);
                sureBook.setSigntime(new Date());
                boolean b = oGDAggAndSureService.updateSureBySureID(sureBook);
                String path = FileHandleUtil.getValue("path","signPicturePath");
                if(b){
                    resultMap.put("status",1);
                    resultMap.put("signUrl",path+fileName);
                }
                else   resultMap.put("status",3);
            }if("0".equals(status)){
                resultMap.put("status",0);
                resultMap.put("signUrl","签名秘密错误，请重新输入。");
            }if("2".equals(status)){
                resultMap.put("status",2);
                resultMap.put("signUrl","未上传签名，请到...上传签名。");
            }
        } catch (SQLException e) {
            logger.error("数据库异常",e);
        }
        return resultMap;
    }

    /*处理删除附件信息请求*/
    @RequestMapping("/deleteOGDAttachmentContent")
    @ResponseBody
    public  String deleteOGDAttachmentContent(String contentID){
        try {
            boolean num = oGDAttachmentService.deleteAttachmentContentbyID(contentID);
            if(num){
                return "删除成功";
            }
        } catch (SQLException e) {
            logger.error("删除学生成绩失败，数据库异常",e);
        }
        return "删除失败";
    }
    /**
     * 上传图片文件
     * @param file
     * @return
     */
    /*处理上传附件请求*/
    @RequestMapping("/uploadFile")
    public @ResponseBody Map uploadFile(@RequestParam(value="file")MultipartFile file,String attachmentID){
        String fileOldName = null;
        String fileNewName = null;
        Map map = new HashMap();
        try {
            if(file != null) {
                fileOldName = file.getOriginalFilename();
                //生成图爿新名称+文件扩展名
                fileNewName = UUIDUtil.getUUID2()+"."+ FilenameUtils.getExtension(fileOldName);
            }
            //调用工具类保存文件
            FileHandleUtil.uploadSpringMVCFile(file, "attachmentFile", fileNewName);
            //调用service并保存到数据库中
            boolean b = oGDAttachmentService.addAttachmentContent(attachmentID,fileNewName);
            if(b){
                map.put("result","上传成功");
            } else {
                map.put("result","上传失败");
            }
        } catch (Exception e) {
            logger.error("文件上传失败",e);
        }

        return map;
    }

}
