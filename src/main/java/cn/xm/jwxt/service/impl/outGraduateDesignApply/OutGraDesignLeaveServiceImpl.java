package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Gradesignleaveapply;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.RelationOGDLeaveCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.GraDesignLeaveApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@SuppressWarnings("ALL")
@Transactional
public class OutGraDesignLeaveServiceImpl implements GraDesignLeaveApplyService {
    @Autowired
    private RelationOGDLeaveCustomMapper rOGDLeaveMapper;

    @Override
    public Gradesignleaveapply selectLeaveApplyByLeaveID(String leaveID) throws SQLException {
        Gradesignleaveapply gradesignleaveapply = rOGDLeaveMapper.selectLeaveByOutsideApplyID(leaveID);
        return gradesignleaveapply;
    }

    @Override
    public boolean updateInfo(Gradesignleaveapply graDesignLeaveApply) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteInfo(String outsideApplyID) throws SQLException {
        return false;
    }
}
