package cn.xm.jwxt.service.impl.graduateDesign.projectManage;

import cn.xm.jwxt.mapper.graduateDesign.projectManage.ProjectManageMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.ChooseGPStudentService;
import cn.xm.jwxt.service.graduateDesign.projectManage.ProjectManageService;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ChooseGPStudentServiceImpl implements ChooseGPStudentService {


    @Override
    public List<Map<String, Object>> getChooseProjectStudentInfo(Map<String, Object> condition) {
        return null;
    }

    @Override
    public List<Map<String, String>> getprojectInfoByCondition(Map<String, String> condition) throws SQLException {
        return null;
    }
}
