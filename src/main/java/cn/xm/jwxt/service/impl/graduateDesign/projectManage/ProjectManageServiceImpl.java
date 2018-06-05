package cn.xm.jwxt.service.impl.graduateDesign.projectManage;

import cn.xm.jwxt.mapper.arrangeCourse.ApArrangeCourseTaskMapper;
import cn.xm.jwxt.mapper.graduateDesign.projectManage.ProjectManageMapper;
import cn.xm.jwxt.service.graduateDesign.projectManage.ProjectManageService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Date;

@Service
public class ProjectManageServiceImpl implements ProjectManageService {

    @Resource
    private ProjectManageMapper projectManageMapper;

    @Override
    public List<Map<String, Object>> getSelfStudentInfo(Map<String, Object> condition) {
        return null;
    }

    /**
     * 查询当前登录系统的教师负责的学生数量
     * @param year 默认当前年份
     * @param teacherId  教师id
     * @return 学生数量
     */
    public int getSelfStudentNum(String year, String teacherId) {

        //判断年份是否为空，若为空，获取当前年份
        if(ValidateCheck.isNull(year)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            Date date = new Date();
            year = sdf.format(date);
        }

        if(ValidateCheck.isNull(teacherId)) {
            throw new IllegalArgumentException("教师id不能为空!");
        }

        int count = projectManageMapper.selectCountSelfStudent(year, teacherId);

        return count;
    }
}
