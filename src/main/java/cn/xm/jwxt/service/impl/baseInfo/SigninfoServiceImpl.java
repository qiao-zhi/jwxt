package cn.xm.jwxt.service.impl.baseInfo;


import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.service.baseInfo.SigninfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SigninfoServiceImpl implements SigninfoService{
    @Override
    public boolean addSignInfo(Signinfo signinfo) throws Exception {
        return false;
    }

    @Override
    public boolean updateSignInfoById(String signId, Signinfo signinfo) throws Exception {
        return false;
    }

    @Override
    public boolean deleteSignInfoById(String signId) throws Exception {
        return false;
    }

    @Override
    public Signinfo getSignInfoById(String signId) throws Exception {
        return null;
    }

    @Override
    public PageInfo<Signinfo> findSignInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception {
        return null;
    }

}