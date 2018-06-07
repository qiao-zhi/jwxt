package cn.xm.jwxt.controller.courseDesign;

import cn.xm.jwxt.annotation.MyLogAnnotation;
import cn.xm.jwxt.service.courseDesign.TCoursedesignInfoArrangeService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ResourcesUtil;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/exportCourseDesignArrange")
public class ExportCourseDesign2Excel {

    Logger logger = Logger.getLogger(ExportCourseDesign2Excel.class);
    @Autowired
    private TCoursedesignInfoArrangeService cdInfoArrangeService;

    //1.查询数据
    public List<Map<String, Object>> getCourseDesiginArrangeByCondition(@RequestParam Map<String, Object> condition) {
        List<Map<String, Object>> datas = null;
        try {
            datas =  cdInfoArrangeService.findNeedArrangeCourseDesign(condition);
        } catch (SQLException e) {
            logger.error("导出课程设计安排信息的时候查询数据库出错",e);
        }
        return datas;
    }


    //2.写文件到excel中

    /**
     * 写数据到本地磁盘
     * @param datas 课程数据
     * @param fileQualifyName   文件全路径(比如C:/USER/XXX.excel)
     */
    public void writeCourseDesignArrange2LocalExcel(List<Map<String,Object>> datas,String fileQualifyName){
        String[] title = { "学年", "学期","专业名称","课程设计编号","课程设计名称","学分", "安排状态","指导教师","安排时间"};
        //2.1写入表头信息
        // 创建一个工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 创建一个工作表sheet
        HSSFSheet sheet = workbook.createSheet();
        // 设置列宽
        this.setColumnWidth(sheet, 14);
        // 创建第一行
        HSSFRow row = sheet.createRow(0);
        // 创建一个单元格
        HSSFCell cell = null;
        // 创建表头
        for (int i = 0; i < title.length; i++) {
            cell = row.createCell(i);
            // 设置样式
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


        // 2.2写入数据
        // 从第二行开始追加数据
        for (int i = 1, length_1 = (datas.size() + 1); i < length_1; i++) {
            // 创建第i行
            HSSFRow nextRow = sheet.createRow(i);
            // 设置样式
            HSSFCellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 设置字体居中
            // 获取数据(一条数据)
            Map<String, Object> course = datas.get(i - 1);
            for (int j = 0; j < 9; j++) {
                HSSFCell cell2 = nextRow.createCell(j);
                cell2.setCellStyle(cellStyle);
                if (j == 0) {
                    cell2.setCellValue(course.get("yearNum").toString());//学年
                    continue;
                }
                if (j == 1) {
                    cell2.setCellValue(course.get("semester").toString());//学期
                    continue;
                }
                if (j == 2) {
                    cell2.setCellValue(course.get("majorName").toString());//专业名称
                    continue;
                }
                if (j == 3) {
                    cell2.setCellValue(course.get("courseNum").toString());//课程设计编号
                    continue;
                }
                if (j == 4) {
                    cell2.setCellValue(course.get("courseNameCN").toString());//课程设计名称
                    continue;
                }
                if (j == 5) {
                    cell2.setCellValue(course.get("credit").toString());//学分
                    continue;
                }
                if (j == 6) {
                    int status = -1;
                    if(course.get("display")!=null && course.get("display")!=""){
                       status = Integer.parseInt((String) course.get("display"));
                    }
                    String msg = "未安排";
                    if(status==0){
                        msg="未提交";
                    }
                    if(status==1){
                        msg="已提交";
                    }
                    cell2.setCellValue(msg);//安排状态
                    continue;
                }
                if (j == 7) {
                    cell2.setCellValue(course.get("teacherName").toString());//指导教师
                    continue;
                }
                if (j == 8) {
                    cell2.setCellValue(course.get("CourseArrangeTime").toString());//安排时间
                    continue;
                }

            }
        }


        // 创建一个文件
        File file = new File(fileQualifyName);
        // 获取文件的父文件夹并删除文件夹下面的文件
        File parentFile = file.getParentFile();
        // 获取父文件夹下面的所有文件
        File[] listFiles = parentFile.listFiles();
        if (parentFile != null && parentFile.isDirectory()) {
            for (File fi : listFiles) {
                // 删除文件
                fi.delete();
            }
        }
        // 如果存在就删除
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            // 打开文件流并写入文件
            FileOutputStream outputStream = org.apache.commons.io.FileUtils.openOutputStream(file);
            workbook.write(outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
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

    //3.打开流提供下载
    @MyLogAnnotation(operateDescription = "下载了课程课设安排信息")
    @RequestMapping("/downCourseDesignArrangeInfo.do")
    public void down(HttpServletRequest request, HttpServletResponse response, @RequestParam Map condition){
        //1.查询数据
        List<Map<String, Object>> datas = this.getCourseDesiginArrangeByCondition(condition);
        //2.写入excel
        String dir = ResourcesUtil.getValue("path","courseDesignArrangeFile");
        String fileName = DefaultValue.COURSEDESIGNER_ARRANGE_DEFAULT_FILENAME;
        String fileQualifyName =  dir + fileName;//生成的excel名字
        this.writeCourseDesignArrange2LocalExcel(datas,fileQualifyName);//写入数据(生成文件)
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
            logger.error("下载课程设计安排信息出错!",e);
        }
    }


}
