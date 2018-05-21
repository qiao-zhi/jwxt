/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GradesigncheckgroupServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/5 18:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.mapper.graduateDesign.GradesigncheckgroupMapper;
import cn.xm.jwxt.mapper.graduateDesign.custom.GraDesignCheckGroupNewCustomMapper;
import cn.xm.jwxt.mapper.graduateDesign.custom.GradesigncheckgroupCustomMapper;
import cn.xm.jwxt.service.graduateDesign.GradesigncheckgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GradesigncheckgroupServiceImpl implements GradesigncheckgroupService {

    @Autowired
    private GradesigncheckgroupMapper gradesigncheckgroupMapper;

    @Autowired
    private GradesigncheckgroupCustomMapper gradesigncheckgroupCustomMapper;

    @Autowired
    private GraDesignCheckGroupNewCustomMapper graDesignCheckGroupNewCustomMapper;

    @Override
    public int countByExample(GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(String groupid) {
        return gradesigncheckgroupMapper.deleteByPrimaryKey(groupid)==1;
    }

    @Override
    public boolean insert(Gradesigncheckgroup record) {
        return gradesigncheckgroupMapper.insert(record)==1;
    }

    @Override
    public boolean insertGraDesignCheckGroupNew(GraDesignCheckGroupNew graDesignCheckGroupNew) {
        return graDesignCheckGroupNewCustomMapper.insertGraDesignCheckGroupNew(graDesignCheckGroupNew)==1;
    }

    @Override
    public boolean updateGraDesignCheckGroupNewByCondition(Map<String , Object> map) {
        return graDesignCheckGroupNewCustomMapper.updateGraDesignCheckGroupNewByCondition(map)>=0;
    }

    @Override
    public boolean insertSelective(Gradesigncheckgroup record) {
        return gradesigncheckgroupMapper.insertSelective(record)==1;
    }

    @Override
    public List<Gradesigncheckgroup> selectByExample(GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.selectByExample(example);
    }

    @Override
    public Gradesigncheckgroup selectByPrimaryKey(String groupid) {
        return gradesigncheckgroupMapper.selectByPrimaryKey(groupid);
    }

    @Override
    public boolean updateByExampleSelective(Gradesigncheckgroup record, GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Gradesigncheckgroup record, GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Gradesigncheckgroup record) {
        return gradesigncheckgroupMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Gradesigncheckgroup record) {
        return gradesigncheckgroupMapper.updateByPrimaryKey(record)==1;
    }

    @Override
    public Gradesigncheckgroup selectOneGradesigncheckgroup(String groupid) {
        return gradesigncheckgroupCustomMapper.selectOneGradesigncheckgroup(groupid);
    }

    @Override
    public TTeacherInfoVo selectOneGradesigncheckgroup2(String groupid) {
        return gradesigncheckgroupCustomMapper.selectOneGradesigncheckgroup2(groupid);
    }

    @Override
    public TTeacherInfoVo selectOneGradesigncheckgroup2New(String groupid) {
        return graDesignCheckGroupNewCustomMapper.selectOneGradesigncheckgroup2(groupid);
    }


    @Override
    public List<Gradesigncheckgroup> selectGradesigncheckgroupList(Map<String, Object> map) {
        return gradesigncheckgroupCustomMapper.selectGradesigncheckgroupList(map);
    }

    @Override
    public List<GradesigncheckgroupVo> selectGradesigncheckgroupList2(Map<String, Object> map) {
        return gradesigncheckgroupCustomMapper.selectGradesigncheckgroupList2(map);
    }

    @Override
    public List<GradesigncheckgroupVo> selectGradesigncheckgroupList2New(Map<String, Object> map) {
        return graDesignCheckGroupNewCustomMapper.selectGradesigncheckgroupList2New(map);
    }

    @Override
    public boolean deleteGroupNewByPrimaryKey(String groupid) {
        return graDesignCheckGroupNewCustomMapper.deleteGroupNewByPrimaryKey(groupid)==1;
    }
}