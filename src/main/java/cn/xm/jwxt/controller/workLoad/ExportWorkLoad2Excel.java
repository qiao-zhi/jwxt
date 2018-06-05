package cn.xm.jwxt.controller.workLoad;

import cn.xm.jwxt.annotation.MyLogAnnotation;
import cn.xm.jwxt.service.impl.workLoad.WorkLoadServiceImpl;
import cn.xm.jwxt.service.workLoad.CourseDesignWorkLoadService;
import cn.xm.jwxt.service.workLoad.CourseWorkLoadService;
import cn.xm.jwxt.service.workLoad.GrduateDesignWorkLoadService;
import cn.xm.jwxt.service.workLoad.WorkLoadService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ResourcesUtil;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/exportWorkLoadFile")
public class ExportWorkLoad2Excel {
    private Logger logger = Logger.getLogger(ExportWorkLoad2Excel.class);
    @Autowired
    private WorkLoadService allService;
    @Autowired
    private WorkLoadServiceImpl allServiceImpl;

    // 1.查询数据
    public List<Map<String,Object>> findDownloadInfo(@RequestParam Map<String,Object> condition){
        List<Map<String,Object>> datas = null;
        int courseType = 0;

        try {
            if(((String) condition.get("courseType")).equals("")||(String) condition.get("courseType")==null){
                datas = allService.findAllWorkLoad(condition);
            }else {
                courseType = Integer.parseInt((String) condition.get("courseType"));
            }
            if(courseType==1){
                datas = allServiceImpl.findCourseWorkLoad(condition);
            }else if(courseType==2){
                datas = allServiceImpl.findCourseDesignWorkLoad(condition);
            }else if(courseType==3){
                datas = allServiceImpl.findGrduateDesignWorkLoad(condition);
            }else{
                datas = allService.findAllWorkLoad(condition);
            }

        } catch (SQLException e) {
            logger.error("下载查询失败",e);
        }
        return datas;
    }

    // 2. 写文件到excel

    /**
     *  写数据到本地磁盘
     * @param datas  要写入的数据
     * @param fileQualifyName 文件全路径（eg:C:/USER/XXX.xlsx）
     */
    public void writeWorkLoad2LocalExcel(List<Map<String,Object>> datas,String fileQualifyName){



        String[] title = {"教师名称","教师编号","学年","学期","教学类型","课程名称","任课班级","人数"};
        // 2.1 写入表头信息
        // 创建一个工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 创建一个工作表sheet
        HSSFSheet sheet = workbook.createSheet();
        // 设置列宽
        this.setColumnWith(sheet,14);
        // 创建第一行
        HSSFRow row = sheet.createRow(0);
        // 创建一个单元格
        HSSFCell cell = null;
        // 创建表头
        for(int i=0;i<title.length;i++){
            cell = row.createCell(i);
            // 设置样式
            HSSFCellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 字体居中
            // 设置字体
            HSSFFont font = workbook.createFont();
            font.setFontName("宋体");
            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体加粗
            font.setFontHeightInPoints((short)13);
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
            Map<String, Object> data = datas.get(i - 1);
            for (int j = 0; j < 8; j++) {
                HSSFCell cell2 = nextRow.createCell(j);
                cell2.setCellStyle(cellStyle);
                if (j == 0) {
                    cell2.setCellValue(data.get("teacherName").toString());//教师名称
                    continue;
                }
                if (j == 1) {
                    cell2.setCellValue(data.get("teacherNum").toString());//教师编号
                    continue;
                }
                if (j == 2) {
                    cell2.setCellValue(data.get("yearNum").toString());//学年
                    continue;
                }
                if (j == 3) {
                    cell2.setCellValue(data.get("semester").toString());//学期
                    continue;
                }
                if (j == 4) {
                    cell2.setCellValue(data.get("typeCN").toString());//教学类型
                    continue;
                }
                if (j == 5) {
                    cell2.setCellValue(data.get("workName").toString());//课程名称
                    continue;
                }
                if (j == 6) {
                    cell2.setCellValue(data.get("classNames").toString());//任课班级
                    continue;
                }
                if (j == 7) {
                    cell2.setCellValue(data.get("stuCount").toString());//人数
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
     * 设置列宽
     * @param sheet  sheet 对哪个sheet进行设置
     * @param colNum
     */
    private void setColumnWith(HSSFSheet sheet,int colNum){
        for(int i=0;i<colNum;i++){
            int v = 0;
            v = Math.round(Float.parseFloat("15.0")*37F);
            v = Math.round(Float.parseFloat("16.0")*267.5F);
            sheet.setColumnWidth(i,v);
        }
    }

    /**
     * 3.打开流提供下载
     * @param request
     * @param response
     * @param condition
     */
    @ResponseBody
    @MyLogAnnotation(operateDescription = "下载了教学工作量信息")
    @RequestMapping("/downWorkLoadInfo.do")
    public boolean down(HttpServletRequest request, HttpServletResponse response, @RequestParam Map condition){
        boolean result = false;
        // 1. 查询数据
        List<Map<String,Object>> datas = this.findDownloadInfo(condition);
        // 2. 写入excel
        String dir = ResourcesUtil.getValue("path","workLoadExcelFile");
        String fileName = "工作量信息.xls";  //  默认下载的名字
        String fileQualifyName = dir + fileName; // 生成的excel名字
        this.writeWorkLoad2LocalExcel(datas,fileQualifyName);
        // 3. 打开文件流下载
        // 获取输出流
        try {
            InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileQualifyName)));
            fileName = URLEncoder.encode(fileName,"utf-8");
            // 设置文件下载头
            response.addHeader("Content-Disposition","attachment;filename="+fileName);
            // 1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
            response.setContentType("multipart/form-data");
            BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
            int len = 0;
            while ((len = bis.read()) != -1){
                out.write(len);
                out.flush();
            }
            out.close();
        } catch (Exception e) {
            logger.error("下载工作量信息出错",e);
            result = true;
        }

        return result;
    }


}
