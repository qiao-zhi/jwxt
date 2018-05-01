package cn.xm.jwxt.service.impl.common;

import cn.xm.jwxt.bean.common.Dictionary;
import cn.xm.jwxt.mapper.common.DictionaryMapper;
import cn.xm.jwxt.mapper.common.custom.DictionaryCustomMapper;
import cn.xm.jwxt.service.common.DictionaryService;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DictionaryMapper dictionaryMapper;//自动导出的mapper
    @Autowired
    private DictionaryCustomMapper dictionaryCustomMapper;//自己手写的mapper
    @Override
    public String getNextDictionaryId(String upDictionaryOptionId) throws SQLException {
        String maxTypeId = dictionaryCustomMapper.getNextDictionaryId(upDictionaryOptionId);
        String typeId = null;
        if("0".equals(maxTypeId)){//不存在的话是当前字典编号+000
            typeId = upDictionaryOptionId.toString()+"000";
        }else{
            typeId = String.valueOf(Integer.valueOf(maxTypeId)+1);//存在的话最大编号加1
        }
        return typeId;
    }

    @Override
    public boolean addDictionary(Dictionary dictionary) throws SQLException {
        //1.先给传下来的字典赋值一个字典编号
        dictionary.setDictionaryid(this.getNextDictionaryId(dictionary.getUpdictionaryid()));
        //2.添加字典信息到数据库
        return dictionaryMapper.insert(dictionary)>0?true:false;
    }

    @Override
    public boolean deleteDictionary(String dictionaryOptionId) throws SQLException {
        return dictionaryMapper.deleteByPrimaryKey(dictionaryOptionId)>0?true:false;
    }

    @Override
    public boolean deleteDictionaryBatch(List<String> dictionaryOptionIds) throws SQLException {
        return dictionaryCustomMapper.deleteDictionaryBatch(dictionaryOptionIds)>0?true:false;
    }

    @Override
    public boolean updateDictionary(Dictionary dictionary) throws SQLException {
        return dictionaryMapper.updateByPrimaryKeySelective(dictionary)>0?true:false;
    }

    @Override
    public List<Map<String,Object>> getDictionaryByConditon(Map<String, Object> condition) throws SQLException {
        return dictionaryCustomMapper.getDictionaryByConditon(condition);
    }

    @Override
    public List<Map<String, Object>> getDictionaryIdAndNamesByUpId(String upDicId) throws SQLException {
        return dictionaryCustomMapper.getDictionaryIdAndNamesByUpId(upDicId);
    }

    @Override
    public List<Dictionary> getDictionaryTree() throws SQLException {
        return dictionaryCustomMapper.getDictionaryTree();
    }

    @Override
    public Dictionary getDictionaryById(String dictionaryOptionId) throws SQLException {
        return dictionaryMapper.selectByPrimaryKey(dictionaryOptionId);
    }
}