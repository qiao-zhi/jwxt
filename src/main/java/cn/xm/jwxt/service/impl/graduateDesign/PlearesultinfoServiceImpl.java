/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: PlearesultinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Plearesultinfo;
import cn.xm.jwxt.bean.graduateDesign.PlearesultinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.PlearesultinfoMapper;
import cn.xm.jwxt.service.graduateDesign.PlearesultinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlearesultinfoServiceImpl implements PlearesultinfoService {

    @Autowired
    private PlearesultinfoMapper plearesultinfoMapper;

    @Override
    public int countByExample(PlearesultinfoExample example) {
        return plearesultinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(PlearesultinfoExample example) {
        return plearesultinfoMapper.deleteByExample(example)==1?true:false;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer plearesultid) {
        return plearesultinfoMapper.deleteByPrimaryKey(plearesultid)==1?true:false;
    }

    @Override
    public boolean insert(Plearesultinfo record) {
        return plearesultinfoMapper.insert(record)==1?true:false;
    }

    @Override
    public boolean insertSelective(Plearesultinfo record) {
        return plearesultinfoMapper.insertSelective(record)==1?true:false;
    }

    @Override
    public List<Plearesultinfo> selectByExample(PlearesultinfoExample example) {
        return plearesultinfoMapper.selectByExample(example);
    }

    @Override
    public Plearesultinfo selectByPrimaryKey(Integer plearesultid) {
        return plearesultinfoMapper.selectByPrimaryKey(plearesultid);
    }

    @Override
    public boolean updateByExampleSelective(Plearesultinfo record, PlearesultinfoExample example) {
        return plearesultinfoMapper.updateByExampleSelective(record, example)==1?true:false;
    }

    @Override
    public boolean updateByExample(Plearesultinfo record, PlearesultinfoExample example) {
        return plearesultinfoMapper.updateByExample(record, example)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Plearesultinfo record) {
        return plearesultinfoMapper.updateByPrimaryKeySelective(record)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKey(Plearesultinfo record) {
        return plearesultinfoMapper.updateByPrimaryKey(record)==1?true:false;
    }
}