/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: PleafileuploadinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Pleafileuploadinfo;
import cn.xm.jwxt.bean.graduateDesign.PleafileuploadinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.PleafileuploadinfoMapper;
import cn.xm.jwxt.service.graduateDesign.PleafileuploadinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PleafileuploadinfoServiceImpl implements PleafileuploadinfoService {

    @Autowired
    private PleafileuploadinfoMapper pleafileuploadinfoMapper;

    @Override
    public int countByExample(PleafileuploadinfoExample example) {
        return pleafileuploadinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(PleafileuploadinfoExample example) {
        return pleafileuploadinfoMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer pleafileid) {
        return pleafileuploadinfoMapper.deleteByPrimaryKey(pleafileid)==1;
    }

    @Override
    public boolean insert(Pleafileuploadinfo record) {
        return pleafileuploadinfoMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Pleafileuploadinfo record) {
        return pleafileuploadinfoMapper.insertSelective(record)==1;
    }

    @Override
    public List<Pleafileuploadinfo> selectByExample(PleafileuploadinfoExample example) {
        return pleafileuploadinfoMapper.selectByExample(example);
    }

    @Override
    public Pleafileuploadinfo selectByPrimaryKey(Integer pleafileid) {
        return pleafileuploadinfoMapper.selectByPrimaryKey(pleafileid);
    }

    @Override
    public boolean updateByExampleSelective(Pleafileuploadinfo record, PleafileuploadinfoExample example) {
        return pleafileuploadinfoMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Pleafileuploadinfo record, PleafileuploadinfoExample example) {
        return pleafileuploadinfoMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Pleafileuploadinfo record) {
        return pleafileuploadinfoMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Pleafileuploadinfo record) {
        return pleafileuploadinfoMapper.updateByPrimaryKey(record)==1;
    }
}