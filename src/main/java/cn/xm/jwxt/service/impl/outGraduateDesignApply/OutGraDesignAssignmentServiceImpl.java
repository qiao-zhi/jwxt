package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Checkassignment;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgraduateassignment;
import cn.xm.jwxt.mapper.outGraduateDesignApply.OutgraduateassignmentMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.RelationOGDAssCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGradesignAssignmentService;
import cn.xm.jwxt.utils.FileHandleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
public class OutGraDesignAssignmentServiceImpl implements OutGradesignAssignmentService{

    @Autowired
    private RelationOGDAssCustomMapper rOGDAssCustomMapper;
    @Autowired
    private OutgraduateassignmentMapper outgraduateassignmentMapper;

    @Override
    public Outgraduateassignment selectAssignmentById(String assignmentId) throws SQLException {
        Outgraduateassignment outgraduateassignment = rOGDAssCustomMapper.selectAssInfo(assignmentId);
        String path = FileHandleUtil.getValue("path","signPicturePath");
        String studentSign = outgraduateassignment.getStudentsign();
        if(studentSign!=null&&!studentSign.equals("")){
            outgraduateassignment.setStudentsign(path+studentSign);
        }
        List<Checkassignment> checkassignments = outgraduateassignment.getCheckassignments();
        for(Checkassignment checkassignment:checkassignments){
            if(checkassignment.getTeachersign()!=null&&!checkassignment.getTeachersign().equals("")){
                checkassignment.setTeachersign(path+checkassignment.getTeachersign());
            }
        }
        return outgraduateassignment;
    }

    @Override
    public boolean saveStudentsign(String assignmentId, String signName) throws SQLException {
        Outgraduateassignment outgraduateassignment = new Outgraduateassignment();
        outgraduateassignment.setAssignmentid(assignmentId);
        outgraduateassignment.setStudentsign(signName);
        int i = outgraduateassignmentMapper.updateByPrimaryKeySelective(outgraduateassignment);
        if(i==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean saveAssignmentById(Map<String,Object> map, String status,String isok) throws Exception {
        String assignmentId = (String)map.get("assignmentID");
        String samegroup = (String)map.get("samegroup");
        String starttime = (String)map.get("starttime");
        String endtime = (String)map.get("endtime");
        String title = (String)map.get("title");
        String request = (String)map.get("request");
        String content = (String)map.get("content");
        String submitfile = (String)map.get("submitfile");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Outgraduateassignment outgraduateassignment = new Outgraduateassignment();
        outgraduateassignment.setAssignmentid(assignmentId);
        outgraduateassignment.setTitle(title);
        outgraduateassignment.setSamegroup(samegroup);
        outgraduateassignment.setStarttime(sdf.parse(starttime));
        outgraduateassignment.setEndtime(sdf.parse(endtime));
        outgraduateassignment.setRequest(request);
        outgraduateassignment.setContent(content);
        outgraduateassignment.setSubmitfile(submitfile);
        outgraduateassignment.setCheckstatus(status);
        outgraduateassignment.setIsok(isok);
        int i = outgraduateassignmentMapper.updateByPrimaryKeySelective(outgraduateassignment);
        if(i==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean commitAssigmengById(Outgraduateassignment outgraduateassignment) throws SQLException {
        int i = outgraduateassignmentMapper.updateByPrimaryKeySelective(outgraduateassignment);
        //删除审核信息
        rOGDAssCustomMapper.deleteCheckInfo(outgraduateassignment.getAssignmentid());
        if(i==1){
            return true;
        }
        return false;
    }
}
