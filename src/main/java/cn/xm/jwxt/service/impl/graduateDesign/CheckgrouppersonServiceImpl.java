/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CheckgrouppersonServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/3 22:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.mapper.graduateDesign.ArrangeTeacherResultMapper;
import cn.xm.jwxt.mapper.graduateDesign.ArrangeTeacherResultNewMapper;
import cn.xm.jwxt.mapper.graduateDesign.CheckgrouppersonMapper;
import cn.xm.jwxt.mapper.graduateDesign.custom.CheckGroupPersonCustomMapper;
import cn.xm.jwxt.mapper.graduateDesign.custom.CheckGroupPersonNewCustomMapper;
import cn.xm.jwxt.service.graduateDesign.CheckgrouppersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CheckgrouppersonServiceImpl implements  CheckgrouppersonService {

    @Autowired
    private CheckgrouppersonMapper checkgrouppersonMapper;

    @Autowired
    private CheckGroupPersonCustomMapper checkGroupPersonCustomMapper;

    @Autowired
    private CheckGroupPersonNewCustomMapper checkGroupPersonNewCustomMapper;

    @Autowired
    private ArrangeTeacherResultMapper arrangeTeacherResultMapper;

    @Autowired
    private ArrangeTeacherResultNewMapper arrangeTeacherResultNewMapper;

    @Override
    public int countByExample(CheckgrouppersonExample example) {
        return checkgrouppersonMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(CheckgrouppersonExample example) {
        return checkgrouppersonMapper.deleteByExample(example)>=0;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer gropersonid) {
        return checkgrouppersonMapper.deleteByPrimaryKey(gropersonid)==1;
    }

    @Override
    public boolean insert(Checkgroupperson record) {
        return checkgrouppersonMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Checkgroupperson record) {
        return checkgrouppersonMapper.insertSelective(record)==1;
    }

    @Override
    public boolean insertCheckGroupPersonNew(CheckGroupPersonNew checkGroupPersonNew) {
        return checkGroupPersonNewCustomMapper.insertCheckGroupPersonNew(checkGroupPersonNew)==1;
    }

    @Override
    public boolean updatecheckgrouppersonNewByCondition(Map<String, Object> map) {
        return checkGroupPersonNewCustomMapper.updatecheckgrouppersonNewByCondition(map)>=0;
    }

    @Override
    public List<Checkgroupperson> selectByExample(CheckgrouppersonExample example) {
        return checkgrouppersonMapper.selectByExample(example);
    }

    @Override
    public List<CheckGroupPersonNew> selectByCondition(CheckGroupPersonNew checkGroupPersonNew) {
        return checkGroupPersonNewCustomMapper.selectByCondition(checkGroupPersonNew);
    }

    @Override
    public Checkgroupperson selectByPrimaryKey(Integer gropersonid) {
        return checkgrouppersonMapper.selectByPrimaryKey(gropersonid);
    }

    @Override
    public boolean updateByExampleSelective(Checkgroupperson record, CheckgrouppersonExample example) {
        return checkgrouppersonMapper.updateByExampleSelective(record,example)>=0;
    }

    @Override
    public boolean updateByExample(Checkgroupperson record, CheckgrouppersonExample example) {
        return checkgrouppersonMapper.updateByExample(record, example)>=0;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Checkgroupperson record) {
        return checkgrouppersonMapper.updateByPrimaryKeySelective(record)>=0;
    }

    @Override
    public boolean updateByPrimaryKey(Checkgroupperson record) {
        return checkgrouppersonMapper.updateByPrimaryKey(record)==1;
    }

    @Override
    public Checkgroupperson selectOneCheckgroupperson(int grppersonid) {
        return checkGroupPersonCustomMapper.selectOneCheckgroupperson(grppersonid);
    }

    @Override
    public TTeacherInfoVo selectOneCheckgroupperson2(int grppersonid) {
        return checkGroupPersonCustomMapper.selectOneCheckgroupperson2(grppersonid);
    }

    @Override
    public List<Checkgroupperson> selectCheckgrouppersonList(Map<String, Object> map) {
        return checkGroupPersonCustomMapper.selectCheckgrouppersonList(map);
    }

    @Override
    public List<TTeacherInfoVo> selectCheckgrouppersonList2(Map<String, Object> map) {
        return checkGroupPersonCustomMapper.selectCheckgrouppersonList2(map);
    }

    @Override
    public List<TTeacherInfoVo> selectCheckgrouppersonList2New(Map<String, Object> map) {
        return checkGroupPersonNewCustomMapper.selectCheckgrouppersonList2(map);
    }

    @Override
    public List<CheckgrouppersonVo> selectTeacherAndStudentCountBygroupid(String groupid) {
        return checkGroupPersonCustomMapper.selectTeacherAndStudentCountBygroupid(groupid);
    }

    @Override
    public List<CheckgrouppersonVo> selectTeacherAndStudentCountNewBygroupid(String groupid) {
        return checkGroupPersonNewCustomMapper.selectTeacherAndStudentCountBygroupid(groupid);
    }

    @Override
    public String selectGroupLeader(String groupid) {
        List<String> groupLeaders = new ArrayList<>();
        //查询出小组的组长信息，若没有小组，则组长未空
        CheckgrouppersonExample checkgrouppersonExample = new CheckgrouppersonExample();
        CheckgrouppersonExample.Criteria criteria = checkgrouppersonExample.createCriteria();
        criteria.andGroupidEqualTo(groupid);
        criteria.andGrouproleEqualTo("组长");
        List<Checkgroupperson> checkgrouppersonLeaderList = checkgrouppersonMapper.selectByExample(checkgrouppersonExample);
        if(checkgrouppersonLeaderList.size() != 0){
            groupLeaders.add(checkgrouppersonLeaderList.get(0).getTeachername());
        }else {
            groupLeaders.add("");
        }
        return groupLeaders.get(0);
    }

    @Override
    public String selectGroupLeaderNew(String groupid) {
        List<String> groupLeaders = new ArrayList<>();
        //查询出小组的组长信息，若没有小组，则组长未空
        CheckGroupPersonNew checkGroupPersonNew = new CheckGroupPersonNew();
        checkGroupPersonNew.setGrouprole("组长");
        checkGroupPersonNew.setGroupid(groupid);
        List<CheckGroupPersonNew> checkgrouppersonLeaderList = checkGroupPersonNewCustomMapper.selectByCondition(checkGroupPersonNew);
        if(checkgrouppersonLeaderList.size() != 0){
            groupLeaders.add(checkgrouppersonLeaderList.get(0).getTeachername());
        }else {
            groupLeaders.add("");
        }
        return groupLeaders.get(0);
    }

    @Override
    public int selectCheckgrouppersonCount(Map<String, Object> map) {
        return checkGroupPersonCustomMapper.selectCheckgrouppersonCount(map);
    }

    @Override
    public int selectCheckgrouppersonNewCount(Map<String, Object> map) {
        return checkGroupPersonNewCustomMapper.selectCheckgrouppersonCount(map);
    }

    @Override
    public boolean insertArrangeTeacherResult(ArrangeTeacherResult arrangeTeacherResult) {
        return arrangeTeacherResultMapper.insertArrangeTeacherResult(arrangeTeacherResult)==1;
    }

    @Override
    public boolean insertArrangeTeacherResultNew(ArrangeTeacherResultNew arrangeTeacherResultNew) {
        return arrangeTeacherResultNewMapper.insertArrangeTeacherResult(arrangeTeacherResultNew)==1;
    }

    @Override
    public List<ArrangeTeacherResult> selectArrangeTeacherResult(Map<String, Object> map) {
        return arrangeTeacherResultMapper.selectArrangeTeacherResult(map);
    }

    @Override
    public List<ArrangeTeacherResultNew> selectArrangeTeacherResultNew(Map<String, Object> map) {
        return arrangeTeacherResultNewMapper.selectArrangeTeacherResult(map);
    }

    @Override
    public boolean deleteArrangeTeacherResultByPrimaryKey(String arrangeresultid) {
        return arrangeTeacherResultMapper.deleteArrangeTeacherResultByPrimaryKey(arrangeresultid)==1;
    }

    @Override
    public boolean deleteArrangeTeacherResultNewByPrimaryKey(String arrangeresultid) {
        return arrangeTeacherResultNewMapper.deleteArrangeTeacherResultByPrimaryKey(arrangeresultid)==1;
    }

    @Override
    public boolean deleteArrangeTeacherResultByGroupid(String groupid) {
        return arrangeTeacherResultMapper.deleteArrangeTeacherResultByGroupid(groupid)>=0;
    }

    @Override
    public boolean deleteArrangeTeacherResultNewByGroupid(String groupid) {
        return arrangeTeacherResultNewMapper.deleteArrangeTeacherResultNewByGroupid(groupid)>=0;
    }

    @Override
    public boolean deleteCheckgrouppersonNewBypgroupid(String groupid) {
        return checkGroupPersonNewCustomMapper.deleteCheckgrouppersonNewBypgroupid(groupid)>=0;
    }

}