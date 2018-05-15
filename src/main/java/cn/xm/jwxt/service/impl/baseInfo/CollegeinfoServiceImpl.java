package cn.xm.jwxt.service.impl.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TCollegeBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.mapper.baseInfo.TCollegeBaseInfoMapper;
import cn.xm.jwxt.mapper.baseInfo.TTeacherBaseInfoMapper;
import cn.xm.jwxt.mapper.baseInfo.custom.TCollegeBaseInfoCustomMapper;
import cn.xm.jwxt.mapper.baseInfo.custom.TTeacherBaseInfoCustomMapper;
import cn.xm.jwxt.service.baseInfo.CollegeinfoService;
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
public class CollegeinfoServiceImpl implements CollegeinfoService {

    @Resource
    private TCollegeBaseInfoMapper collegeBaseInfoMapper;
    @Resource
    private TCollegeBaseInfoCustomMapper collegeBaseInfoCustomMapper;

    @Override
    public boolean addCollegeInfo(TCollegeBaseInfo collegeBaseInfo) throws Exception {
        if(collegeBaseInfo==null){
            throw new IllegalArgumentException("学院基本信息不能为空!");
        }
        //设置主键
        collegeBaseInfo.setCollegeid(UUIDUtil.getUUID2());
        //是否删除字段默认使用
        //teacherBaseInfo.setInposition(DefaultValue.IS_NOT_USE);
        int count = collegeBaseInfoMapper.insertSelective(collegeBaseInfo);
        return count>0?true:false;
    }

    //@Override
    public boolean updateCollegeInfoById(String collegeid, TCollegeBaseInfo collegeinfo) throws Exception {
        if(ValidateCheck.isNull(collegeid)){
            throw new IllegalArgumentException("学院编号不能为空!");
        }
        if(collegeinfo==null){
            throw new IllegalArgumentException("学院基本信息不能为空!");
        }
        //设置通知书编号
        collegeinfo.setCollegeid(collegeid);
        int count = collegeBaseInfoMapper.updateByPrimaryKeySelective(collegeinfo);
        return count>0?true:false;
    }


    //@Override
    public boolean deleteCollegeInfoById(String collegeid) throws Exception {
        return false;
    }

    //@Override
    public TCollegeBaseInfo getCollegeInfoById(String collegeid) throws Exception {
        if(ValidateCheck.isNull( collegeid)){
            throw new IllegalArgumentException("学院编号不能为空!");
        }
        TCollegeBaseInfo collegeBaseInfo = collegeBaseInfoMapper.selectByPrimaryKey(collegeid);
        return collegeBaseInfo;
    }

    //@Override
    public PageInfo<TCollegeBaseInfo> findCollegeInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception {
        if(currentPage==null||pageSize==null){
            throw new IllegalArgumentException("分页参数传递错误！");
        }
        if(condition==null){
            throw new IllegalArgumentException("查询条件参数传递错误!");
        }
        //采用PageHelper插件进行分页
        PageHelper.startPage(currentPage,pageSize,"collegeNum");
        List<TCollegeBaseInfo> listInfo = collegeBaseInfoCustomMapper.findCollegeInfoListByCondition(condition);
        PageInfo<TCollegeBaseInfo> pageInfo = new PageInfo<TCollegeBaseInfo>(listInfo);
        return pageInfo;
    }

    /**
     * 查询教师的名称和ID
     * @return
     * @throws Exception
     */
   // @Override
    public List<Map<String, Object>> findCollegeNameAndId() throws Exception {
        return collegeBaseInfoCustomMapper.findCollegeNameAndId();
    }
}
