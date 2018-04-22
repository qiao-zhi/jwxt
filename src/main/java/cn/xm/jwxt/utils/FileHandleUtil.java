package cn.xm.jwxt.utils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Author: qlq
 * @Description 文件处理类
 * @Date: 22:59 2018/4/9
 */
public class FileHandleUtil {
    /******S   封装的读取properties文件****************/
    /**
     * 系统语言环境，默认为中文zh
     */
    public static final String LANGUAGE = "zh";

    /**
     * 系统国家环境，默认为中国CN
     */
    public static final String COUNTRY = "CN";

    private static String getProperties(String baseName, String section) {
        String retValue = "";
        try {
            Locale locale = new Locale(LANGUAGE, COUNTRY);
            ResourceBundle rb = ResourceBundle.getBundle(baseName, locale);
            retValue = (String) rb.getObject(section);
        } catch (Exception e) {
            e.printStackTrace();
            // TODO 添加处理
        }
        return retValue;
    }
    /**
     * 通过key从资源文件读取内容
     *
     * @param fileName
     *            资源文件名
     *
     * @param key
     *            索引
     *
     * @return 索引对应的内容
     */
    public static String getValue(String fileName, String key) {
        String value = getProperties(fileName,key);
        return value;
    }
    /******E   封装的读取properties文件****************/


    /**********S  保存文件相关操作**************/
    /**
     * 配置虚拟路径上传文件到本地磁盘
     * @param f  需要上传的文件
     * @param fileName	保存到磁盘的文件名
     * @param pathKey	资源文件中的键 path.properties
     */
    public static void uploadFileToDisk(File f,String fileName,String pathKey){
        //从资源文件中读取文件的基本目录
        String basePath = ResourcesUtil.getValue("path", pathKey);
        //获取文件的后缀
        String sufix = FilenameUtils.getExtension(fileName);
        //获取文件的前缀
        String prefix = FilenameUtils.getBaseName(fileName);
        //保存到硬盘的文件的完整路径
        String dir = basePath+fileName;
        try{
            InputStream streamIn = new FileInputStream(f);
            OutputStream streamOut = new FileOutputStream(new File(dir));
            int bytesRead=0;
            byte[] byffer = new byte[8192];
            while((bytesRead=streamIn.read(byffer,0,8192))!=-1){
                streamOut.write(byffer, 0, bytesRead);
            }
            streamIn.close();
            streamOut.flush();
            streamOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //如果文件是doc或者docx文件将文件转为pdf存一份到服务器
        if("doc".equals(sufix)||"docx".equals(sufix)){
            try {
//                Word2PdfUtil.word2pdf(dir, basePath+prefix+".pdf");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**********E  保存文件相关操作**************/





    /******************S  删除文件相关操作********/
    /**
     *删除word(有可能后缀是doc，docx，或者转换后的pdf文件)
     * @param propertiesFileName		properties文件的名称(确定读取哪个properties文件)
     * @param propertiesKey	properties文件中的key(确定目录)
     * @param fileName 	需要删除的文件的名字(确定删除哪个文件)
     * @return	删除结果
     */
    public static boolean deleteWordFile(String propertiesFileName,String propertiesKey,String fileName) {
        if (fileName == null) {
            return false;
        }
        String dir = FileHandleUtil.getValue(propertiesFileName, propertiesKey);// 获取文件的基本目录
        String baseName = FilenameUtils.getBaseName(fileName);// 获取文件的基本名字(借助commons-io包读取文件基本名称)
        try {
            FileUtils.forceDeleteOnExit(new File(dir + baseName + ".pdf"));
            FileUtils.forceDeleteOnExit(new File(dir + baseName + ".doc"));
            FileUtils.forceDeleteOnExit(new File(dir + baseName + ".docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    /**
     *删除普通的文件(jpg，word，pdf)
     * @param propertiesFileName		properties文件的名称(确定读取哪个properties文件)
     * @param propertiesKey	properties文件中的key(确定目录)
     * @param fileName 	需要删除的文件的名字(确定删除哪个文件)
     * @return	删除结果
     */
    public static boolean deletePlainFile(String propertiesFileName,String propertiesKey,String fileName) {
        if (fileName == null) {
            return false;
        }
        String dir = FileHandleUtil.getValue(propertiesFileName, propertiesKey);// 获取文件的基本目录
        try {
            //删除文件
            FileUtils.forceDeleteOnExit(new File(dir + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    /****************E  删除文件相关操作**************/



}
