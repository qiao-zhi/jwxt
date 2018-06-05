package cn.xm.jwxt.controller.baseInfo;

import cn.xm.jwxt.bean.arrangeCourse.custom.CampusCodeEnum;
import cn.xm.jwxt.bean.baseInfo.custom.TeacherMajorInfo;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class GenerateTeacherInfoExcel {

    //一级标题名称
    private static final String HEADER_INFO = "教师信息";
    //一级标题字大小
    private static final Short TITLE_FIRST = 16;
    //二级标题字大小
    private static final Short TTILE_SECOND = 13;
    //开始行
    public static final int START_ROW = 2;
    //每一行需要的单元格总数
    public static final int CELL_SUM = 7;

    /**
     * 生成Excel文件
     * @param mapInfo
     * @param fileName
     */
    public static void generateStudentExcelInfo(Map<String,List<TeacherMajorInfo>> mapInfo, String fileName){
        // 创建一个工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //教师相关信息
        List<TeacherMajorInfo> teacherList = mapInfo.get(CampusCodeEnum.MAIN_CAMPUS.getStatus());
        generateMainCampusHearder(teacherList,workbook,CampusCodeEnum.MAIN_CAMPUS);
       /* //华科学院排课相关信息
        List<TeacherMajorInfo> studentListHuaKeCampus = mapInfo.get(CampusCodeEnum.HUAKE_CAMPUS.getStatus());
        generateMainCampusHearder(studentListHuaKeCampus,workbook,CampusCodeEnum.HUAKE_CAMPUS);
        //晋城校区排课相关信息
        List<TeacherMajorInfo> studentListJinChengCampus = mapInfo.get(CampusCodeEnum.JINCHENG_CAMPUS.getStatus());
        generateMainCampusHearder(studentListJinChengCampus,workbook,CampusCodeEnum.JINCHENG_CAMPUS);
*/
        File file = new File(fileName);
        FileOutputStream outputStream = null;
        try {
            //关闭工作簿
            workbook.close();
            file.createNewFile();
            // 打开文件流
            outputStream = FileUtils.openOutputStream(file);
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 生成头信息
     * @param list
     * @param workbook
     */
    public static void generateMainCampusHearder(List<TeacherMajorInfo> list, HSSFWorkbook workbook,CampusCodeEnum codeEnum){

        // 创建一个工作表sheet
        HSSFSheet sheet = workbook.createSheet(codeEnum.getValue());
        // 创建第一行
        HSSFRow row = sheet.createRow(0);
        // 行高
        row.setHeightInPoints(40);
        // 创建一个单元格
        HSSFCell cellFirst = row.createCell(0);
        cellFirst.setCellValue(codeEnum.getValue()+HEADER_INFO);
        // 合并单元格
        mergeCell(sheet, 0, 0, 0, 6);
        //设置单元格格式
        setCellStyle(workbook,cellFirst,TITLE_FIRST);
        //生成教师排课基本信息
        generageStudentInfo(list,sheet,workbook);
    }

    /**
     * 生成教师排课基本信息
     * @param list
     * @param sheet
     * @param workbook
     */
    public static void generageStudentInfo(List<TeacherMajorInfo> list, HSSFSheet sheet, HSSFWorkbook workbook){
        // 标题
        String[] title = { "教师编号","教师姓名","学院","专业","性别","联系电话","职称","职务","学历","学位","毕业学校","毕业专业 ","出身年月","入校时间","是否在职"};
        // 设置列宽
        setColumnWidth(sheet, 16);
        // 创建第2行
        HSSFRow row = sheet.createRow(1);
        // 创建一个单元格
        HSSFCell cell = null;
        // 创建表头
        for (int i = 0; i < title.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
            //设置单元格格式
            setCellStyle(workbook,cell,TTILE_SECOND);
        }
        HSSFRow nextRow;
        // 从第3行开始追加数据
        for (int i = START_ROW, length_l = list.size()+START_ROW; i < length_l; i++) {
            // 创建第i行
            nextRow = sheet.createRow(i);
            TeacherMajorInfo tStudentBaseInfo;
            HSSFCell cell2;
            for (int j = 0; j < CELL_SUM; j++) {
                tStudentBaseInfo = list.get(i-START_ROW);
                cell2 = nextRow.createCell(j);
                if (j == 0) {
                    cell2.setCellValue(tStudentBaseInfo.getTeachernum());
                }
                if (j == 1) {
                    cell2.setCellValue(tStudentBaseInfo.getTeachername());
                }
                if (j == 2) {
                    cell2.setCellValue(tStudentBaseInfo.getCollegename());
                }
                if (j == 3) {
                    cell2.setCellValue(tStudentBaseInfo.getMajorname());
                }
                if (j == 4) {
                    cell2.setCellValue(tStudentBaseInfo.getTeachersex());
                }
                if (j == 5) {
                    cell2.setCellValue(tStudentBaseInfo.getTeachertel());
                }
                if (j == 6) {
                    cell2.setCellValue(tStudentBaseInfo.getPositionaltitle());
                }
                if (j == 7) {
                    cell2.setCellValue(tStudentBaseInfo.getTeacherposition());
                }
                if (j == 8) {
                    cell2.setCellValue(tStudentBaseInfo.getEducation());
                }
                if (j == 9) {
                    cell2.setCellValue(tStudentBaseInfo.getDegree());
                }
                if (j == 10) {
                    cell2.setCellValue(tStudentBaseInfo.getGraduateschool());
                }
                if (j == 11) {
                    cell2.setCellValue(tStudentBaseInfo.getGraduatemajor());
                }
                if (j == 12) {
                    cell2.setCellValue(tStudentBaseInfo.getTeacherbirth());
                }
                if (j == 13) {
                    cell2.setCellValue(tStudentBaseInfo.getJoinschooltime());
                }
                if (j == 14) {
                    cell2.setCellValue(tStudentBaseInfo.getInposition());
                }

            }
        }
    }

    // 设置列宽()
    private static void setColumnWidth(HSSFSheet sheet, int colNum) {
        for (int i = 0; i < colNum; i++) {
            int v = 0;
            v = Math.round(Float.parseFloat("15.0") * 37F);
            v = Math.round(Float.parseFloat("20.0") * 267.5F);
            sheet.setColumnWidth(i, v);
        }
    }
    // 合并单元格
    public static void mergeCell(HSSFSheet sheet, int x, int y, int z, int q) {
        //参数1：起始行 参数2：终止行 参数3：起始列号 参数4：终止列号
        CellRangeAddress region1 = new CellRangeAddress(x, z, (short) y, (short) q);
        sheet.addMergedRegion(region1);
    }
    // 设置标题行的字体和样式
    public static void setCellStyle(HSSFWorkbook workbook, HSSFCell cell,short fontSize) {
        // 设置样式
        HSSFCellStyle cellStyle = workbook.createCellStyle();
        // 设置字体居中
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        // 设置字体
        HSSFFont font = workbook.createFont();
        font.setFontName("宋体");
        font.setFontHeightInPoints(fontSize);
        // 粗体
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);
    }
}
