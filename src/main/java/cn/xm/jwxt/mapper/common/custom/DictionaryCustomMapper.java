package cn.xm.jwxt.mapper.common.custom;

import cn.xm.jwxt.bean.common.Dictionary;
import cn.xm.jwxt.bean.common.DictionaryExample;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DictionaryCustomMapper {
    /**
     * 根据上级字典Id查询下一个要插入的下一级字典的编号
     *
     * @param upDictionaryOptionId
     *            上级字典Id
     * @return
     * @throws Exception
     */
    public String getNextDictionaryId(String upDictionaryOptionId) throws SQLException;


    /**
     * 根据多个字典编号进行批量删除
     *
     * @param dictionaryOptionIds
     *            字典编号的集合
     * @return
     * @throws Exception
     */
    public int deleteDictionaryBatch(List<String> dictionaryOptionIds) throws SQLException;


    /**
     * 根据条件分页查询字典信息
     *
     * @param condition 组合条件(可以有名称，启用或者禁用或者上级编号)
     * @return  字典集合
     * @throws Exception
     */
    public List<Dictionary> getDictionaryByConditon(Map<String, Object> condition) throws SQLException;


    /**
     * 根据字典的上级编号查询字典的名称与编号(用于往下拉列表显示一些字典项)
     *
     * @param upDicId   上级字典ID
     * @return
     * @throws SQLException
     */
    public List<Map<String, Object>> getDictionaryIdAndNamesByUpId(String upDicId) throws SQLException;

    /**
     * 查询字典树信息
     *
     * @return List<Map<String,Object>>
     *         返回的map包括(dictionaryOptionId,dictionaryOptionName,
     *         upDictionaryOptionId) (字典编号，字典名称，上级字典编号)
     * @throws Exception
     */
    public List<Dictionary> getDictionaryTree() throws SQLException;


    /**
     * 根据字典编码查询字典信息
     *
     * @param dictionaryOptionId
     * @return
     * @throws Exception
     */
    public Dictionary getDictionaryById(String dictionaryOptionId) throws Exception;
}