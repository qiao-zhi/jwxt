package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Checkleave;
import cn.xm.jwxt.bean.outGraduateDesignApply.Gradesignleaveapply;
import cn.xm.jwxt.mapper.outGraduateDesignApply.GradesignleaveapplyMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.RelationOGDLeaveCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.GraDesignLeaveApplyService;
import cn.xm.jwxt.utils.FileHandleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@SuppressWarnings("ALL")
@Transactional
public class OutGraDesignLeaveServiceImpl implements GraDesignLeaveApplyService {
    @Autowired
    private RelationOGDLeaveCustomMapper rOGDLeaveMapper;
    @Autowired
    private GradesignleaveapplyMapper gLeaveApplyMapper;

    @Override
    public Gradesignleaveapply selectLeaveApplyByLeaveID(String leaveID) throws SQLException {
        Gradesignleaveapply gradesignleaveapply = rOGDLeaveMapper.selectLeaveByOutsideApplyID(leaveID);
        /*对查询结果数据进行处理*/
        String path = FileHandleUtil.getValue("path","signPicturePath");
        /*获取签名路径并进行修改*/
        List<Checkleave> checkLeaves = gradesignleaveapply.getCheckLeaves();
        for(Checkleave checkleave:checkLeaves){
            if(checkleave.getTeachersign()!=null&&!checkleave.getTeachersign().equals("")){
                checkleave.setTeachersign(path+checkleave.getTeachersign());
            }
        }
        return gradesignleaveapply;
    }

    @Override
    public boolean updateLeave(Gradesignleaveapply graDesignLeaveApply) throws SQLException {
        int i = gLeaveApplyMapper.updateByPrimaryKeySelective(graDesignLeaveApply);
        if(i == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean commitLeave(String leaveID) throws SQLException {
        Gradesignleaveapply gLeaveApply = new Gradesignleaveapply();
        gLeaveApply.setLeaveid(leaveID);
        gLeaveApply.setCheckstatus("01");
        gLeaveApply.setIsok("01");
        int num = gLeaveApplyMapper.updateByPrimaryKeySelective(gLeaveApply);
        if(num == 1){
            //删除审核请假信息
            rOGDLeaveMapper.deleteCheckLeavebyLeaveId(leaveID);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteLeave(String outsideApplyID) throws SQLException {
        return false;
    }
}
