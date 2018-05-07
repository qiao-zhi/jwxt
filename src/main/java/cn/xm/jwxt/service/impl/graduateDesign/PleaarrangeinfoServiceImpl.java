/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: PleaarrangeinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Pleaarrangeinfo;
import cn.xm.jwxt.bean.graduateDesign.PleaarrangeinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.PleaarrangeinfoMapper;
import cn.xm.jwxt.service.graduateDesign.PleaarrangeinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PleaarrangeinfoServiceImpl implements PleaarrangeinfoService {

    @Autowired
    private PleaarrangeinfoMapper pleaarrangeinfoMapper;

    @Override
    public int countByExample(PleaarrangeinfoExample example) {
        return pleaarrangeinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(PleaarrangeinfoExample example) {
        return pleaarrangeinfoMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer arrangeid) {
        return pleaarrangeinfoMapper.deleteByPrimaryKey(arrangeid)==1;
    }

    @Override
    public boolean insert(Pleaarrangeinfo record) {
        return pleaarrangeinfoMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Pleaarrangeinfo record) {
        return pleaarrangeinfoMapper.insertSelective(record)==1;
    }

    @Override
    public List<Pleaarrangeinfo> selectByExample(PleaarrangeinfoExample example) {
        return pleaarrangeinfoMapper.selectByExample(example);
    }

    @Override
    public Pleaarrangeinfo selectByPrimaryKey(Integer arrangeid) {
        return pleaarrangeinfoMapper.selectByPrimaryKey(arrangeid);
    }

    @Override
    public boolean updateByExampleSelective(Pleaarrangeinfo record, PleaarrangeinfoExample example) {
        return pleaarrangeinfoMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Pleaarrangeinfo record, PleaarrangeinfoExample example) {
        return pleaarrangeinfoMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Pleaarrangeinfo record) {
        return pleaarrangeinfoMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Pleaarrangeinfo record) {
        return pleaarrangeinfoMapper.updateByPrimaryKey(record)==1;
    }
}