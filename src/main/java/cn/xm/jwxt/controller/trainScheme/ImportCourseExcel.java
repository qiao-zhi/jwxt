package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TCourseBaseInfo;
import cn.xm.jwxt.service.trainScheme.CourseBaseInfoService;
import cn.xm.jwxt.utils.FileHandleUtil;
import cn.xm.jwxt.utils.ResourcesUtil;
import cn.xm.jwxt.utils.ResposeResult;
import cn.xm.jwxt.utils.UUIDUtil;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qlq
 * @Description 导入课程信息(以Excel模板的形式导入)
 * @Date: 11:04 2018/5/5
 */

/**
 * 导入课程(以Excel的形式导入)
 * 1.导入文件，将文件保存到本地
 * 2.读取Excel提取课程信息
 * 3.进行数据库保存
 * 4.反馈导入信息
 */
@Controller
public class ImportCourseExcel {
    private Logger logger = Logger.getLogger(ImportCourseExcel.class);//日志记录器
    @Autowired
    private CourseBaseInfoService courseBaseInfoService;//课程service
    /**
     * 导入课程信息(以课程信息导入)
     * @param file
     * @return
     */
    @RequestMapping("/uploadCourseExcel")
    public @ResponseBody
    ResposeResult uploadCourseExcel(MultipartFile file){
        ResposeResult resposeResult = new ResposeResult();
        String fileOriName = null;
        String fileNowName = null;
        if(file == null){
            resposeResult.setMsg("请上传正确的Excel文件");
            return resposeResult;
        }
        //1.保存文件到本地
        fileOriName = file.getOriginalFilename();//获取原名称
        fileNowName = UUIDUtil.getUUID2()+"."+ FilenameUtils.getExtension(fileOriName);//生成唯一的名字

        try {
            fileNowName  = FileHandleUtil.uploadSpringMVCFile(file, "courseExcelFileImport", fileNowName);//保存文件
        } catch (Exception e) {
            resposeResult.setMsg("请上传正确的Excel文件");
            logger.error("导入课程信息失败失败",e);
        }
        //2.读取文件
        String fileQualifyName = ResourcesUtil.getValue("path","courseExcelFileImport")+fileNowName;//生成文件全路径
        List<TCourseBaseInfo> tCourseBaseInfos = this.readExcelData(fileQualifyName);//读取的Excel数据
        if(tCourseBaseInfos == null || tCourseBaseInfos.size()==0){
            resposeResult.setMsg("您上传的文件没有课程信息，请重新编辑");
            return resposeResult;
        }
        //3.保存数据库
        List<String> repeatCourseNums = null;
        try {
                repeatCourseNums = courseBaseInfoService.addCourseBaseInfoBatch(tCourseBaseInfos);
        } catch (SQLException e) {
            resposeResult.setMsg("保存数据库的时候出错");
            logger.error("保存数据库出错");
        }
        //4.根据返回结果判断重复的数据与条数。
        int allTotal = tCourseBaseInfos.size();
        // 4.1如果重复的集合为空则证明全部上传成功
        if(repeatCourseNums == null || repeatCourseNums.size()==0){
            resposeResult.setMsg(allTotal+"条课程信息全部上传成功");
        }else {//4.2如果有重复提示哪些重复了
            int repeatSize = repeatCourseNums.size();
            resposeResult.setMsg("总共"+allTotal+"条数据，成功上传"+(allTotal - repeatSize)+"条,重复了"+repeatSize+"条。"+"重复的课程编号为"+repeatCourseNums.toString());
        }
        return resposeResult;
    }

    /**
     * 读取Excel提取数据(返回提取的数据集合)
     * @param fileQualifyName
     * @return
     */
    private List<TCourseBaseInfo> readExcelData(String fileQualifyName) {
        List<TCourseBaseInfo> datas = null;
        File file = new File(fileQualifyName);
        try {
//            获取一个工作簿
            HSSFWorkbook workbook = new HSSFWorkbook(FileUtils.openInputStream(file));
//            获取一个工作表两种方式
//            HSSFSheet sheet = workbook.getSheet("sheet0");
//            获取工作表的第二种方式
            HSSFSheet sheet = workbook.getSheetAt(0);
            int firstRow = 1;
//            获取sheet的最后一行
            int lastRow = sheet.getLastRowNum();
            if(lastRow <2){//如果只有1行或者0行就直接退出
                return null;
            }
            datas =  new ArrayList<TCourseBaseInfo>();//用于返回的数据集合
            //循环内不要创建对象引用(集合中存的是对象的引用)
            TCourseBaseInfo courseBaseInfo = null;
            for(int i=firstRow;i<=lastRow;i++){
                courseBaseInfo = new TCourseBaseInfo();
                HSSFRow row = sheet.getRow(i);
                int lastCol = row.getLastCellNum();
                if(lastCol != 14){
                    //如果不是14列就不读这一行了。
                    continue;
                }
                for(int j=0;j<lastCol;j++){
                    HSSFCell cell= row.getCell(j);//获取一个cell
                    if (j == 0) {
                        courseBaseInfo.setCoursenum(cell.getStringCellValue());//课程编号
                        continue;
                    }
                    if (j == 1) {
                        courseBaseInfo.setCourseplatform(cell.getStringCellValue());//课程平台
                        continue;
                    }
                    if (j == 2) {
                        courseBaseInfo.setCoursenature(cell.getStringCellValue());//课程性质
                        continue;
                    }
                    if (j == 3) {
                        courseBaseInfo.setCoursenamecn(cell.getStringCellValue());//中文名称
                        continue;
                    }
                    if (j == 4) {
                        courseBaseInfo.setCoursenameen(cell.getStringCellValue());//英文名称
                        continue;
                    }
                    if (j == 5) {
                        courseBaseInfo.setCredit(cell.getStringCellValue());//学分
                        continue;
                    }
                    if (j == 6) {
                        courseBaseInfo.setCoursehour(cell.getStringCellValue());//学时
                        continue;
                    }
                    if (j == 7) {
                        courseBaseInfo.setTeachhour(cell.getStringCellValue());//讲课时长
                        continue;
                    }
                    if (j == 8) {
                        courseBaseInfo.setExperimenthour(cell.getStringCellValue());//实验时长
                        continue;
                    }
                    if (j == 9) {
                        courseBaseInfo.setComputerhour(cell.getStringCellValue());//上机时长
                        continue;
                    }
                    if (j == 10) {
                        courseBaseInfo.setPracticehour(cell.getStringCellValue());//实践时长
                        continue;
                    }
                    if (j == 11) {
                        courseBaseInfo.setWeeklyhour(cell.getStringCellValue());//周学时分配
                        continue;
                    }
                    if (j == 12) {
                        courseBaseInfo.setScoringway(cell.getStringCellValue());//计分方式
                        continue;
                    }
                    if (j == 13) {
                        courseBaseInfo.setCoursehourmethod(cell.getStringCellValue());//学时单位
                        continue;
                    }
                }
                //读完一行将数据塞进去
                datas.add(courseBaseInfo);
            }
        } catch (IOException e) {
            logger.error("读取上传的Excel出错");
        }
        return datas;
    }
}
