/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TeachertitlecheckinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Teachertitlecheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitlecheckinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.TeachertitlecheckinfoMapper;
import cn.xm.jwxt.service.graduateDesign.TeachertitlecheckinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachertitlecheckinfoServiceImpl implements TeachertitlecheckinfoService {

    @Autowired
    private TeachertitlecheckinfoMapper teachertitlecheckinfoMapper;

    @Override
    public int countByExample(TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.deleteByExample(example)==1?true:false;
    }

    @Override
    public boolean deleteByPrimaryKey(String checkid) {
        return teachertitlecheckinfoMapper.deleteByPrimaryKey(checkid)==1?true:false;
    }

    @Override
    public boolean insert(Teachertitlecheckinfo record) {
        return teachertitlecheckinfoMapper.insert(record)==1?true:false;
    }

    @Override
    public boolean insertSelective(Teachertitlecheckinfo record) {
        return teachertitlecheckinfoMapper.insertSelective(record)==1?true:false;
    }

    @Override
    public List<Teachertitlecheckinfo> selectByExample(TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.selectByExample(example);
    }

    @Override
    public Teachertitlecheckinfo selectByPrimaryKey(String checkid) {
        return teachertitlecheckinfoMapper.selectByPrimaryKey(checkid);
    }

    @Override
    public boolean updateByExampleSelective(Teachertitlecheckinfo record, TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.updateByExampleSelective(record, example)==1?true:false;
    }

    @Override
    public boolean updateByExample(Teachertitlecheckinfo record, TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.updateByExample(record, example)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Teachertitlecheckinfo record) {
        return teachertitlecheckinfoMapper.updateByPrimaryKeySelective(record)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKey(Teachertitlecheckinfo record) {
        return teachertitlecheckinfoMapper.updateByPrimaryKey(record)==1?true:false;
    }
}