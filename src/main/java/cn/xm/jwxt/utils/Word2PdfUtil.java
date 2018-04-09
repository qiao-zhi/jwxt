package cn.xm.jwxt.utils;



import java.io.File;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
/**
 * word转pdf工具类
 * @author QiaoLiQiang
 * @time 2018年1月5日下午7:16:12
 */
public class Word2PdfUtil {
    static final int wdFormatPDF = 17;// PDF 格式   
    public static void main(String[] args) throws Exception {
    	  String source1 = "C:\\Users\\liqiang\\Desktop\\sbgl.docx";
          String target1 = "C:\\Users\\liqiang\\Desktop\\sbgl.pdf";
          Word2PdfUtil.word2pdf(source1, target1);
	}
    
    /**
     * 实现转换word文档为PDF文档
     * @param docFileName doc文件全路径（路径+文件名）
     * @param toFileName PDF文件全路径（路径+文件名）
     * @throws Exception
     */
    public static boolean word2pdf(String docFileName,String toFileName) throws Exception {   
        ComThread.InitSTA();
        System.out.println("启动Word...");
        
        long start = System.currentTimeMillis();     
        ActiveXComponent app = null; 
        Dispatch doc = null; 
        
        try {     
            app = new ActiveXComponent("Word.Application");     
            app.setProperty("Visible", new Variant(false)); 
            Dispatch docs = app.getProperty("Documents").toDispatch();   
            doc = Dispatch.call(docs,  "Open" , docFileName).toDispatch(); 
            
            System.out.println("打开文档..." + docFileName); 
            System.out.println("转换文档到PDF..." + toFileName);
            
            File tofile = new File(toFileName);     
            if (tofile.exists()) {     
                tofile.delete();     
            }     
            
            Dispatch.call(doc,     
                          "SaveAs",     
                          toFileName,     
                          wdFormatPDF);     
            
            long end = System.currentTimeMillis();     
            System.out.println("转换完成..用时：" + (end - start) + "ms."); 
 
 
        } catch (Exception e) {     
            System.out.println("========Error:文档转换失败：" + e.getMessage());  
            return false;
        } finally { 
        	try {
	            Dispatch.call(doc,"Close",false); 
	            System.out.println("关闭文档"); 
	            if (app != null) {
	                app.invoke("Quit", 0);     
	            } 

	           ComThread.Release();
	        } catch(Exception ex) {
	        
	        }
    	}
        return true;
    }
}
