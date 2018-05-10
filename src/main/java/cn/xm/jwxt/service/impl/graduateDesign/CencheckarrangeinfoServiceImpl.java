/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CencheckarrangeinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/3 20:50
 * Description: 毕设中期检查实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckarrangeinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckarrangeinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.CencheckarrangeinfoMapper;
import cn.xm.jwxt.mapper.graduateDesign.custom.CencheckarrangeinfoCustomMapper;
import cn.xm.jwxt.service.graduateDesign.CencheckarrangeinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CencheckarrangeinfoServiceImpl implements CencheckarrangeinfoService{

    @Autowired
    private CencheckarrangeinfoMapper cencheckarrangeinMapper;

    @Autowired
    private CencheckarrangeinfoCustomMapper cencheckarrangeinfoCustomMapper;

    @Override
    public int countByCencheckarrangeinfo(CencheckarrangeinfoExample example) {
        return cencheckarrangeinMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(CencheckarrangeinfoExample example) {
        return cencheckarrangeinMapper.deleteByExample(example)>=0;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer cenarrangeinfoid) {
        return cencheckarrangeinMapper.deleteByPrimaryKey(cenarrangeinfoid)==1;
    }

    @Override
    public boolean insert(Cencheckarrangeinfo record) {
        return cencheckarrangeinMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Cencheckarrangeinfo record) {
        return cencheckarrangeinMapper.insertSelective(record)==1;
    }

    @Override
    public List<Cencheckarrangeinfo> selectByExample(CencheckarrangeinfoExample example) {
        return cencheckarrangeinMapper.selectByExample(example);
    }

    @Override
    public Cencheckarrangeinfo selectByPrimaryKey(Integer cenarrangeinfoid) {
        return cencheckarrangeinMapper.selectByPrimaryKey(cenarrangeinfoid);
    }

    @Override
    public boolean updateByExampleSelective(Cencheckarrangeinfo record, CencheckarrangeinfoExample example) {
        return cencheckarrangeinMapper.updateByExampleSelective(record,example)==1;
    }

    @Override
    public boolean updateByExample(Cencheckarrangeinfo record, CencheckarrangeinfoExample example) {
        return cencheckarrangeinMapper.updateByExample(record,example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Cencheckarrangeinfo record) {
        return cencheckarrangeinMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Cencheckarrangeinfo record) {
        return cencheckarrangeinMapper.updateByPrimaryKey(record)==1;
    }

    @Override
    public Cencheckarrangeinfo selectOneCencheckarrangeinfo(int cenarrangeinfoid) {
        return cencheckarrangeinfoCustomMapper.selectOneCencheckarrangeinfo(cenarrangeinfoid);
    }

    @Override
    public List<Cencheckarrangeinfo> selectCencheckarrangeinfoList(Map<String, Object> map) {
        return cencheckarrangeinfoCustomMapper.selectCencheckarrangeinfoList(map);
    }
}