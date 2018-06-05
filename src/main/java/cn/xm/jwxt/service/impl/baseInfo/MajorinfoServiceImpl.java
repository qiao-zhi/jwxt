package cn.xm.jwxt.service.impl.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.mapper.baseInfo.TMajorBaseInfoMapper;
import cn.xm.jwxt.mapper.baseInfo.TTeacherBaseInfoMapper;
import cn.xm.jwxt.mapper.baseInfo.custom.TMajorBaseInfoCustomMapper;
import cn.xm.jwxt.service.baseInfo.MajorinfoService;
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
public class MajorinfoServiceImpl implements MajorinfoService {

    @Resource
    private TMajorBaseInfoMapper majorBaseInfoMapper;
    @Resource
    private TMajorBaseInfoCustomMapper majorBaseInfoCustomMapper;
    @Override
    public boolean addMajorInfo(TMajorBaseInfo majorBaseInfo) throws Exception {
        if(majorBaseInfo==null){
            throw new IllegalArgumentException("教师基本信息不能为空!");
        }
        //设置主键
        majorBaseInfo.setMajorid(UUIDUtil.getUUID2());
        int count = majorBaseInfoMapper.insertSelective(majorBaseInfo);
        return count>0?true:false;
    }

    @Override
    public boolean updateMajorById(String majorid, TMajorBaseInfo majorBaseInfo) throws Exception {
        if(ValidateCheck.isNull(majorid)){
            throw new IllegalArgumentException("专业编号不能为空!");
        }
        if(majorBaseInfo==null){
            throw new IllegalArgumentException("专业基本信息不能为空!");
        }
        //设置通知书编号
        majorBaseInfo.setMajorid(majorid);
        int count = majorBaseInfoMapper.updateByPrimaryKeySelective(majorBaseInfo);
        return count>0?true:false;
    }

    @Override
    public boolean deleteMajorInfoById(String majorid) throws Exception {
        return false;
    }

    @Override
    public TMajorBaseInfo getMajorInfoById(String majorid) throws Exception {
        if(ValidateCheck.isNull(majorid)){
            throw new IllegalArgumentException("通知书编号不能为空!");
        }
        TMajorBaseInfo majorBaseInfo = majorBaseInfoMapper.selectByPrimaryKey(majorid);
        return majorBaseInfo;
    }

    @Override
    public PageInfo<TMajorBaseInfo> findMajorInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception {
        if(currentPage==null||pageSize==null){
            throw new IllegalArgumentException("分页参数传递错误！");
        }
        if(condition==null){
            throw new IllegalArgumentException("查询条件参数传递错误!");
        }
        //采用PageHelper插件进行分页
        PageHelper.startPage(currentPage,pageSize,"majorName ");
        List<TMajorBaseInfo> listInfo = majorBaseInfoCustomMapper.findMajorInfoListByCondition(condition);
        PageInfo<TMajorBaseInfo> pageInfo = new PageInfo<TMajorBaseInfo>(listInfo);
        return pageInfo;
    }

    /**
     * 查询专业的名称和ID
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> findMajorNameAndId() throws Exception {
        return majorBaseInfoCustomMapper.findMajorNameAndId();
    }
}

