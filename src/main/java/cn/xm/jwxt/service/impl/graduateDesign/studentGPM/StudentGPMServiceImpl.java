/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CencheckarrangeinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/3 20:50
 * Description: 毕设中期检查实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign.studentGPM;

import cn.xm.jwxt.mapper.graduateDesign.projectManage.Project_ACMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.Project_ACService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class StudentGPMServiceImpl implements Project_ACService {

    private Project_ACMapper project_ACMapper;
    @Override
    public List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws SQLException{
        return project_ACMapper.selectProject_ACInfo(condition);
    }
}