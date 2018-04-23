/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: PlearesultsigninfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Plearesultsigninfo;
import cn.xm.jwxt.bean.graduateDesign.PlearesultsigninfoExample;
import cn.xm.jwxt.mapper.graduateDesign.PlearesultsigninfoMapper;
import cn.xm.jwxt.service.graduateDesign.PlearesultsigninfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlearesultsigninfoServiceImpl implements PlearesultsigninfoService {

    @Autowired
    private PlearesultsigninfoMapper plearesultsigninfoMapper;

    @Override
    public int countByExample(PlearesultsigninfoExample example) {
        return plearesultsigninfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(PlearesultsigninfoExample example) {
        return plearesultsigninfoMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer plearesultsignid) {
        return plearesultsigninfoMapper.deleteByPrimaryKey(plearesultsignid)==1;
    }

    @Override
    public boolean insert(Plearesultsigninfo record) {
        return plearesultsigninfoMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Plearesultsigninfo record) {
        return plearesultsigninfoMapper.insertSelective(record)==1;
    }

    @Override
    public List<Plearesultsigninfo> selectByExample(PlearesultsigninfoExample example) {
        return plearesultsigninfoMapper.selectByExample(example);
    }

    @Override
    public Plearesultsigninfo selectByPrimaryKey(Integer plearesultsignid) {
        return plearesultsigninfoMapper.selectByPrimaryKey(plearesultsignid);
    }

    @Override
    public boolean updateByExampleSelective(Plearesultsigninfo record, PlearesultsigninfoExample example) {
        return plearesultsigninfoMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Plearesultsigninfo record, PlearesultsigninfoExample example) {
        return plearesultsigninfoMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Plearesultsigninfo record) {
        return plearesultsigninfoMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Plearesultsigninfo record) {
        return plearesultsigninfoMapper.updateByPrimaryKey(record)==1;
    }
}