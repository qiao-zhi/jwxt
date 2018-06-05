package cn.xm.jwxt.service.impl.baseInfo;


import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfo;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.bean.baseInfo.custom.StudentClassInfo;
import cn.xm.jwxt.bean.baseInfo.custom.TeacherMajorInfo;
import cn.xm.jwxt.mapper.baseInfo.TTeacherBaseInfoMapper;
import cn.xm.jwxt.mapper.baseInfo.custom.TTeacherBaseInfoCustomMapper;
import cn.xm.jwxt.service.baseInfo.TeacherinfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class TeacherinfoServiceImpl implements TeacherinfoService {

    @Resource
    private TTeacherBaseInfoMapper teacherBaseInfoMapper;
    @Resource
    private TTeacherBaseInfoCustomMapper teacherBaseInfoCustomMapper;

    @Override
    public boolean addTeacherInfo(TTeacherBaseInfo teacherBaseInfo) throws Exception {
        if(teacherBaseInfo==null){
            throw new IllegalArgumentException("通知书基本信息不能为空!");
        }
        //设置主键
        teacherBaseInfo.setTeacherid(UUIDUtil.getUUID2());
        //是否删除字段默认使用
        teacherBaseInfo.setInposition(DefaultValue.IS_USE);
        int count = teacherBaseInfoMapper.insertSelective(teacherBaseInfo);
        return count>0?true:false;
    }

    @Override
    public boolean updateTeacherInfoById(String teacherid, TTeacherBaseInfo teacherinfo) throws Exception {
        if(ValidateCheck.isNull(teacherid)){
            throw new IllegalArgumentException("教师编号不能为空!");
        }
        if(teacherinfo==null){
            throw new IllegalArgumentException("教师基本信息不能为空!");
        }
        //设置通知书编号
        teacherinfo.setTeacherid(teacherid);
        int count = teacherBaseInfoMapper.updateByPrimaryKeySelective(teacherinfo);
        return count>0?true:false;
    }


    @Override
    public boolean deleteTeacherInfoById(String teacherid) throws Exception {
        return false;
    }

    @Override
    public TTeacherBaseInfo getTeacherInfoById(String teacherid) throws Exception {
        if(ValidateCheck.isNull(teacherid)){
            throw new IllegalArgumentException("教师编号不能为空!");
        }
        TTeacherBaseInfo teacherBaseInfo = teacherBaseInfoMapper.selectByPrimaryKey(teacherid);
        return teacherBaseInfo;
    }

    @Override
    public PageInfo<TTeacherBaseInfo> findTeacherInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception {
        if(currentPage==null||pageSize==null){
            throw new IllegalArgumentException("分页参数传递错误！");
        }
        if(condition==null){
            throw new IllegalArgumentException("查询条件参数传递错误!");
        }
        //采用PageHelper插件进行分页
        PageHelper.startPage(currentPage,pageSize,"teacherNum");
        List<TTeacherBaseInfo> listInfo = teacherBaseInfoCustomMapper.findTeacherInfoListByCondition(condition);
        PageInfo<TTeacherBaseInfo> pageInfo = new PageInfo<TTeacherBaseInfo>(listInfo);
        return pageInfo;
    }

    /**
     * 查询教师的名称和ID
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> findTeacherNameAndId() throws Exception {
        return teacherBaseInfoCustomMapper.findTeacherNameAndId();
    }

    @Override
    public boolean saveTeacherInfoById(String noticeId, List<TeacherMajorInfo> detailInfoList) throws Exception {
        if(ValidateCheck.isNull(noticeId)){
            throw new IllegalArgumentException("教师编号不能为空!");
        }
        int total = detailInfoList.size();
        if(total <= 0){
            throw new IllegalArgumentException("明细集合参数传递错误!");
        }
        for (TeacherMajorInfo detailInfo:detailInfoList) {
            //设置通知书ID
            detailInfo.setTeacherid(noticeId);
        }
        int count = teacherBaseInfoCustomMapper.saveTeacherInfoList(detailInfoList);
        //修改是否上传参数
        //teacherinfoService.updateIsInputStatus(noticeId);
        return count == total;
    }
}
