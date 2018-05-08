package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigntitleapply;
import cn.xm.jwxt.mapper.outGraduateDesignApply.OutgradesigntitleapplyMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.RelationOGDTitleCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGraDesignTitleApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@SuppressWarnings("ALL")
@Transactional
public class OutGraDesignTitleApplyServiceImpl implements OutGraDesignTitleApplyService{
    @Autowired
    private RelationOGDTitleCustomMapper rOGDTitleCustomMapper;
    @Autowired
    private OutgradesigntitleapplyMapper oGDTitleMapper;

    /**
     * 根据titltID查询题目申请的详细信息
     * @param titleID
     * @return
     * @throws SQLException
     */
    @Override
    public Outgradesigntitleapply selectTitleInfoByTitleID(String titleID) throws SQLException {
        Outgradesigntitleapply oGDTitleApply = rOGDTitleCustomMapper.selectTitleByOutsideApplyID(titleID);
        /*对查询结果数据进行处理*/
        return oGDTitleApply;
    }

    @Override
    public boolean updateTitleApply(Outgradesigntitleapply outGraDesignTitleApply) throws SQLException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String stringDate = sdf.format(date);
        outGraDesignTitleApply.setRemark1(stringDate);
        int i = oGDTitleMapper.updateByPrimaryKeySelective(outGraDesignTitleApply);
        if(i==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean commitTitle(String outgradesignapplyid) throws SQLException {
        Outgradesigntitleapply oGDTitle = new Outgradesigntitleapply();
        oGDTitle.setOutgradesignapplyid(outgradesignapplyid);
        oGDTitle.setIsok("01");
        int num = oGDTitleMapper.updateByPrimaryKeySelective(oGDTitle);
        if(num==1){
            return true;
        }
        return false;
    }

}
