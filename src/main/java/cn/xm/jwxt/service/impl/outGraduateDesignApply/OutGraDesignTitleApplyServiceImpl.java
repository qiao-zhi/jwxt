package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigntitleapply;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.RelationOGDTitleCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGraDesignTitleApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
@Service
@SuppressWarnings("ALL")
@Transactional
public class OutGraDesignTitleApplyServiceImpl implements OutGraDesignTitleApplyService{
    @Autowired
    private RelationOGDTitleCustomMapper rOGDTitleCustomMapper;
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
        return false;
    }

    @Override
    public boolean deleteTitleApply(String outsideApplyID) throws SQLException {
        return false;
    }
}
