package cn.xm.jwxt.service.impl.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TClassBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import cn.xm.jwxt.mapper.baseInfo.TClassBaseInfoMapper;
import cn.xm.jwxt.mapper.baseInfo.TStudentBaseInfoMapper;
import cn.xm.jwxt.mapper.baseInfo.custom.TClassBaseInfoCustomMapper;
import cn.xm.jwxt.service.baseInfo.ClassinfoService;
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
public class ClassinfoServiceImpl implements ClassinfoService {
    @Resource
    private TClassBaseInfoMapper classBaseInfoMapper;
    @Resource
    private TClassBaseInfoCustomMapper classBaseInfoCustomerMapper;


    @Override
    public boolean addClassInfo(TClassBaseInfo classBaseInfo) throws Exception {
        if(classBaseInfo==null){
            throw new IllegalArgumentException("通知书基本信息不能为空!");
        }
        //设置主键
        classBaseInfo.setClassid(UUIDUtil.getUUID2());

        int count = classBaseInfoMapper.insertSelective(classBaseInfo);
        return count>0?true:false;
    }

    @Override
    public boolean updateClassById(String classId, TClassBaseInfo classInfo) throws Exception {
        if(ValidateCheck.isNull(classId)){
            throw new IllegalArgumentException("班级编号不能为空!");
        }
        if(classInfo==null){
            throw new IllegalArgumentException("通知书基本信息不能为空!");
        }
        //设置通知书编号
        classInfo.setClassid(classId);
        int count = classBaseInfoMapper.updateByPrimaryKeySelective(classInfo);
        return count>0?true:false;
    }


    @Override
    public boolean deleteClassInfoById(String classid) throws Exception {
        return false;
    }

    @Override
    public TClassBaseInfo getClassInfoById(String classId) throws Exception {
        if(ValidateCheck.isNull(classId)){
            throw new IllegalArgumentException("通知书编号不能为空!");
        }
        TClassBaseInfo classBaseInfo = classBaseInfoMapper.selectByPrimaryKey(classId);
        return classBaseInfo;
    }

    @Override
    public PageInfo<Map<String,Object>> findClassInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception {
        if(currentPage==null||pageSize==null){
            throw new IllegalArgumentException("分页参数传递错误！");
        }
        if(condition==null){
            throw new IllegalArgumentException("查询条件参数传递错误!");
        }
        //采用PageHelper插件进行分页
        PageHelper.startPage(currentPage,pageSize,"classNum ");
        List<Map<String,Object>> listInfo = classBaseInfoCustomerMapper.findClassInfoListByCondition(condition);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(listInfo);
        return pageInfo;
    }

    /**
     * 查询班级的名称和ID
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> findClassNameAndId() throws Exception {
        return classBaseInfoCustomerMapper.findClassNameAndId();
    }

}
