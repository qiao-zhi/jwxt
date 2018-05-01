package cn.xm.jwxt.service.common;

import cn.xm.jwxt.bean.common.Dictionary;
import cn.xm.jwxt.bean.common.DictionaryExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 字典service
 *
 */
public interface DictionaryService {

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
     * 添加字典信息
     * @param dictionary    需要添加的字典信息
     * @return  是否添加成功
     * @throws SQLException
     */
    public boolean addDictionary(Dictionary dictionary) throws SQLException;

    /**
     * 根据字典Id删除单个字典信息(删除单个字典项)
     *
     * @param dictionaryOptionId
     * @return
     * @throws Exception
     */
    public boolean deleteDictionary(String dictionaryOptionId) throws SQLException;

    /**
     * 根据多个字典编号进行批量删除
     *
     * @param dictionaryOptionIds
     *            字典编号的集合
     * @return
     * @throws Exception
     */
    public boolean deleteDictionaryBatch(List<String> dictionaryOptionIds) throws SQLException;

    /**
     * 修改字典信息(主要是修改字典的名称和启用与禁用以及描述信息)
     *
     * @param dictionary
     * @return
     * @throws Exception
     */
    public boolean updateDictionary(Dictionary dictionary) throws SQLException;

    /**
     * 根据条件分页查询字典信息
     *
     * @param condition 组合条件(可以有名称，启用或者禁用或者上级编号)
     * @return  字典集合
     * @throws Exception
     */
    public List<Map<String,Object>> getDictionaryByConditon(Map<String, Object> condition) throws SQLException;


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
    public Dictionary getDictionaryById(String dictionaryOptionId) throws SQLException;

}