package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.service.outGraduateDesignApply.CountInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ResourcesUtil;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@SuppressWarnings("all")
@RequestMapping("/ext")
public class ExtOGDStudentExcelController {
    private Logger logger = Logger.getLogger(ExtOGDStudentExcelController.class);
    @Autowired
    private CountInfoService countInfoService;

    //1.先从缓存中取数据，看能取到取不到

    //2.写入excel到本地

    //3.打开流提供下载
    @RequestMapping("/extOGDStudentInClass")
    @ResponseBody
    public String extOGDStudentInClass(HttpServletRequest request, HttpServletResponse response,String classID){
        //1.查询数据
        List<Map<String,Object>> datas = this.getOGDStudentInfoInClass(classID);
        //2.写入excel
        String dir = ResourcesUtil.getValue("path","ogdStudentExcelFile");
        String fileName = DefaultValue.OGDSTUDENTS_DEFAULT_FILENAME;
        String fileQualifyName =  dir + fileName;//生成的excel名字
        this.writeStudentInfoToLocalEXcel(datas,fileQualifyName);//写入数据(生成文件)
        //3.打开流提供下载
        //获取输入流
        try {
            InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileQualifyName)));
            fileName = URLEncoder.encode(fileName,"UTF-8");
            //设置文件下载头
            response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
            //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
            response.setContentType("multipart/form-data");
            BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
            int len = 0;
            while((len = bis.read()) != -1){
                out.write(len);
                out.flush();
            }
            out.close();
        } catch (Exception e) {
            logger.error("下载课程信息出错!",e);
        }
        return "下载完成";
    }

    /*1.查询数据*/
    public List<Map<String,Object>> getOGDStudentInfoInClass(String classID){
        List<Map<String,Object>> studentsInfo = new ArrayList<>();
        try {
            studentsInfo = countInfoService.countMajorClassOGDStudentInfo(classID);
        } catch (SQLException e) {
            logger.error("查询班级内校外毕设学生信息失败",e);
        }
        return studentsInfo;
    }
    /*2.写文件到excel中*/

    /**
     *
     * @param datas 需要导出的数据
     * @param fileQualifyName   文件路径
     */
    public void writeStudentInfoToLocalEXcel(List<Map<String,Object>> datas,String fileQualifyName){
        String[] title = { "学号", "姓名","专业班级","校内导师","毕设题目","接受单位", "校外导师","申请时间"};
        //2.1写入表头信息
        // 创建一个工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建一个工作sheet
        HSSFSheet sheet = workbook.createSheet();
        //设置列数
        this.setColumnWidth(sheet,title.length);
        //创建第一行
        HSSFRow row = sheet.createRow(0);
        //创建一个单元格
        HSSFCell cell = null;
        //创建表头
        for(int i=0;i<title.length;i++){
            cell = row.createCell(i);
            //设置样式
            HSSFCellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置字体居中
            // 设置字体
            HSSFFont font = workbook.createFont();
            font.setFontName("宋体");
            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 字体加粗
            // font.setFontHeight((short)12);
            font.setFontHeightInPoints((short) 13);
            cellStyle.setFont(font);
            cell.setCellStyle(cellStyle);
            cell.setCellValue(title[i]);
        }

        //写入数据
        //从第二行开始追加数据
        for(int i=1,length_1=(datas.size()+1);i<length_1;i++){
            //创建第i行
            HSSFRow nextRow = sheet.createRow(i);
            //设置样式
            HSSFCellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置字体居中
            // 获取数据(一条数据)
            Map<String,Object> data = datas.get(i-1);
            for (int j=0;j<title.length;j++){
                //创建单元格
                HSSFCell cell2 = nextRow.createCell(j);
                //设置样式
                cell2.setCellStyle(cellStyle);
                if (j==0){
                    cell2.setCellValue(data.get("studentNum").toString());
                    continue;
                }
                if (j==1){
                    cell2.setCellValue(data.get("studentName").toString());
                    continue;
                }
                if (j==2){
                    cell2.setCellValue(data.get("majorClass").toString());
                    continue;
                }
                if (j==3){
                    cell2.setCellValue(data.get("inTeacherName").toString());
                    continue;
                }
                if (j==4){
                    cell2.setCellValue(data.get("finallyName").toString());
                    continue;
                }
                if (j==5){
                    cell2.setCellValue(data.get("receiveUnit").toString());
                    continue;
                }
                if (j==6){
                    cell2.setCellValue(data.get("outTeacherName").toString());
                    continue;
                }
                if (j==7){
                    cell2.setCellValue(data.get("applyTime").toString());
                    continue;
                }
            }
            //创建一个文件
            File file = new File(fileQualifyName);
            //获取父文件夹，并删除文件夹下面的文件
            /**
             * getParent(),返回父文件的名字
             */
            File fileParent = file.getParentFile();
            // 获取父文件夹下面的所有文件
            File[] listFiles = fileParent.listFiles();
            //父文件不为空并且是一个文件夹
            if(fileParent!=null&&fileParent.isDirectory()){
                //删除父文件夹下的所有文件
                for(File fi:listFiles){
                    fi.delete();
                }
            }
            //如果该文件存在，则删除
            if(file.exists()){
                file.delete();
            }
            try{
                file.createNewFile();
                // 打开文件流并写入文件
                FileOutputStream outputStream = FileUtils.openOutputStream(file);
                workbook.write(outputStream);
                outputStream.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }


    }

    /**
     * 设置列宽的函数
     * @param sheet 对哪个sheet进行设置，
     * @param colNum
     */
    private  void setColumnWidth(HSSFSheet sheet, int colNum) {
        for (int i = 0; i < colNum; i++) {
            int v = 0;
//            v = Math.round(Float.parseFloat("15.0") * 37F);
            v = Math.round(Float.parseFloat("16.0") * 267.5F);
            sheet.setColumnWidth(i, v);
        }
    }

}
