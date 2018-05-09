package cn.xm.jwxt.service.impl.graduateDesign.fileManage;

import cn.xm.jwxt.mapper.graduateDesign.fileManage.GDFileManageMapper;
import cn.xm.jwxt.service.graduateDesign.fileManage.GDFileManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class GDFileManageServiceImpl implements GDFileManageService {

    @Resource
    private GDFileManageMapper gDFileManageMapper;

    /**
     * 获取毕设文件上传管理的基本信息
     * @param condition
     * @return
     */
    public List<Map<String, String>> getFileCheckInfoByCondition(Map<String,String> condition) throws SQLException{
        List<Map<String, String>> fileCheckInfos = gDFileManageMapper.selectFileCheckinfoByCondition(condition);

        /*查询内容：
        学生、学号、班级、毕设题目、指导教师、审核结果、审核意见
        studentName，studentNum，className，gdTitle，teacherName，auditResult，auditContent*/
        //通过学生id和教师id查询相关信息。遍历的同时查询
        for (Map<String, String> fileCheckInfo :fileCheckInfos) {

        }

        return fileCheckInfos;
    }
}
