/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GradesignstudenttitleinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/5 19:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Gradesignstudenttitleinfo;
import cn.xm.jwxt.bean.graduateDesign.GradesignstudenttitleinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.GradesignstudenttitleinfoMapper;
import cn.xm.jwxt.service.graduateDesign.GradesignstudenttitleinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradesignstudenttitleinfoServiceImpl implements GradesignstudenttitleinfoService {

    @Autowired
    private GradesignstudenttitleinfoMapper gradesignstudenttitleinfoMapper;

    @Override
    public int countByExample(GradesignstudenttitleinfoExample example) {
        return gradesignstudenttitleinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(GradesignstudenttitleinfoExample example) {
        return gradesignstudenttitleinfoMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(String studenttitleid) {
        return gradesignstudenttitleinfoMapper.deleteByPrimaryKey(studenttitleid)==1;
    }

    @Override
    public boolean insert(Gradesignstudenttitleinfo record) {
        return gradesignstudenttitleinfoMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Gradesignstudenttitleinfo record) {
        return gradesignstudenttitleinfoMapper.insertSelective(record)==1;
    }

    @Override
    public List<Gradesignstudenttitleinfo> selectByExample(GradesignstudenttitleinfoExample example) {
        return gradesignstudenttitleinfoMapper.selectByExample(example);
    }

    @Override
    public Gradesignstudenttitleinfo selectByPrimaryKey(String studenttitleid) {
        return gradesignstudenttitleinfoMapper.selectByPrimaryKey(studenttitleid);
    }

    @Override
    public boolean updateByExampleSelective(Gradesignstudenttitleinfo record, GradesignstudenttitleinfoExample example) {
        return gradesignstudenttitleinfoMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Gradesignstudenttitleinfo record, GradesignstudenttitleinfoExample example) {
        return gradesignstudenttitleinfoMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Gradesignstudenttitleinfo record) {
        return gradesignstudenttitleinfoMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Gradesignstudenttitleinfo record) {
        return gradesignstudenttitleinfoMapper.updateByPrimaryKey(record)==1;
    }
}