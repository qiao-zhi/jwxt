package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.service.trainScheme.CourseBaseInfoService;
import cn.xm.jwxt.utils.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description 导出课程信息到Excel中
 * @Date: 10:11 2018/4/29
 */
@Controller
public class ExtCourseExcel {

    @Autowired
    private CourseBaseInfoService courseBaseInfoService;
    private Logger logger = Logger.getLogger(ExtCourseExcel.class);
    //1.先从缓存中取数据，看能取到取不到

    //2.写入excel到本地

    //3.打开流提供下载
    //1.查询数据
    public List<Map<String, Object>> getCourseBaseInfosByCondition(@RequestParam Map<String, Object> condition) {
        List<Map<String, Object>> datas = null;
        try {
            datas =  courseBaseInfoService.getCourseBaseInfosByCondition(condition);
        } catch (SQLException e) {
            logger.error("导出课程信息的时候查询数据库出错",e);
        }
        return datas;
    }


    //2.写文件到excel中

    /**
     * 写数据到本地磁盘
     * @param datas 课程数据
     * @param fileQualifyName   文件全路径(比如C:/USER/XXX.excel)
     */
    public void writeCourse2LocalExcel(List<Map<String,Object>> datas,String fileQualifyName){
        String[] title = { "课程编号", "课程平台","课程性质","中文名称","英文名称","学分", "学时","讲课时长","实验时长","上机时长","实践时长","周学时分配","计分方式","学时单位" };
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
            for (int j = 0; j < 14; j++) {
                HSSFCell cell2 = nextRow.createCell(j);
                cell2.setCellStyle(cellStyle);
                if (j == 0) {
                    cell2.setCellValue(course.get("courseNum").toString());//课程编号
                    continue;
                }
                if (j == 1) {
                    cell2.setCellValue(course.get("coursePlatform").toString());//课程平台
                    continue;
                }
                if (j == 2) {
                    cell2.setCellValue(course.get("courseNature").toString());//课程性质
                    continue;
                }
                if (j == 3) {
                    cell2.setCellValue(course.get("courseNameCN").toString());//中文名称
                    continue;
                }
                if (j == 4) {
                    cell2.setCellValue(course.get("courseNameEN").toString());//英文名称
                    continue;
                }
                if (j == 5) {
                    cell2.setCellValue(course.get("credit").toString());//学分
                    continue;
                }
                if (j == 6) {
                    cell2.setCellValue(course.get("courseHour").toString());//学时
                    continue;
                }
                if (j == 7) {
                    cell2.setCellValue(course.get("teachHour").toString());//讲课时长
                    continue;
                }
                if (j == 8) {
                    cell2.setCellValue(course.get("experimentHour").toString());//实验时长
                    continue;
                }
                if (j == 9) {
                    cell2.setCellValue(course.get("computerHour").toString());//上机时长
                    continue;
                }
                if (j == 10) {
                    cell2.setCellValue(course.get("practiceHour").toString());//实践时长
                    continue;
                }
                if (j == 11) {
                    cell2.setCellValue(course.get("weeklyHour").toString());//周学时分配
                    continue;
                }
                if (j == 12) {
                    cell2.setCellValue(course.get("scoringWay").toString());//积分方式
                    continue;
                }
                if (j == 13) {
                    cell2.setCellValue(course.get("courseHourMethod").toString());//学时单位
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
    @RequestMapping("/downCourses")
    public void down(HttpServletRequest request, HttpServletResponse response,@RequestParam Map condition){
        //1.查询数据
        List<Map<String, Object>> datas = this.getCourseBaseInfosByCondition(condition);
        //2.写入excel
        String dir = ResourcesUtil.getValue("path","courseExcelFile");
        String fileName = DefaultValue.COURSE_DEFAULT_FILENAME;
        String fileQualifyName =  dir + fileName;//生成的excel名字
        this.writeCourse2LocalExcel(datas,fileQualifyName);//写入数据(生成文件)
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
    }
}
