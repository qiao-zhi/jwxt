/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: PleafilerecordinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Pleafilerecordinfo;
import cn.xm.jwxt.bean.graduateDesign.PleafilerecordinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.PleafilerecordinfoMapper;
import cn.xm.jwxt.service.graduateDesign.PleafilerecordinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PleafilerecordinfoServiceImpl implements PleafilerecordinfoService {

    @Autowired
    private PleafilerecordinfoMapper pleafilerecordinfoMapper;

    @Override
    public int countByExample(PleafilerecordinfoExample example) {
        return pleafilerecordinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(PleafilerecordinfoExample example) {
        return pleafilerecordinfoMapper.deleteByExample(example)==1?true:false;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer fileuprecoreid) {
        return pleafilerecordinfoMapper.deleteByPrimaryKey(fileuprecoreid)==1?true:false;
    }

    @Override
    public boolean insert(Pleafilerecordinfo record) {
        return pleafilerecordinfoMapper.insert(record)==1?true:false;
    }

    @Override
    public boolean insertSelective(Pleafilerecordinfo record) {
        return pleafilerecordinfoMapper.insertSelective(record)==1?true:false;
    }

    @Override
    public List<Pleafilerecordinfo> selectByExample(PleafilerecordinfoExample example) {
        return pleafilerecordinfoMapper.selectByExample(example);
    }

    @Override
    public Pleafilerecordinfo selectByPrimaryKey(Integer fileuprecoreid) {
        return pleafilerecordinfoMapper.selectByPrimaryKey(fileuprecoreid);
    }

    @Override
    public boolean updateByExampleSelective(Pleafilerecordinfo record, PleafilerecordinfoExample example) {
        return pleafilerecordinfoMapper.updateByExampleSelective(record, example)==1?true:false;
    }

    @Override
    public boolean updateByExample(Pleafilerecordinfo record, PleafilerecordinfoExample example) {
        return pleafilerecordinfoMapper.updateByExample(record, example)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Pleafilerecordinfo record) {
        return pleafilerecordinfoMapper.updateByPrimaryKeySelective(record)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKey(Pleafilerecordinfo record) {
        return pleafilerecordinfoMapper.updateByPrimaryKey(record)==1?true:false;
    }
}