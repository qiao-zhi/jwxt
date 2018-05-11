/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CheckgrouppersonController
 * Author:   xuexiaolei
 * Date:     2018/4/23 18:19
 * Description: 检查小组成员控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.controller.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.ArrangeTeacherResult;
import cn.xm.jwxt.bean.graduateDesign.ArrangeTeacherResultNew;
import cn.xm.jwxt.bean.graduateDesign.CheckgrouppersonVo;
import cn.xm.jwxt.bean.graduateDesign.TTeacherInfoVo;
import cn.xm.jwxt.service.graduateDesign.CheckgrouppersonService;
import cn.xm.jwxt.service.graduateDesign.projectManage.ProjectManageService;
import cn.xm.jwxt.utils.UUIDUtil;
import com.alibaba.fastjson.JSON;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈检查小组成员控制器〉
 *
 * @author xuexiaolei
 * @create 2018/4/23
 * @since 1.0.0
 */
@Controller
@RequestMapping("checkgroupperson")
public class CheckgrouppersonController {

    @Autowired
    private CheckgrouppersonService checkgrouppersonService;

    @Autowired
    private ProjectManageService projectManageService;


    /*
    添加一条检查小组成员信息
     */
//    @RequestMapping("add")
//    @ResponseBody
//    public String addCheckgroupperson(Checkgroupperson checkgroupperson){
//        return checkgrouppersonService.insert(checkgroupperson)==true?"success":"false";
//    }

    /*
    删除一条检查小组成员信息
     */
//    @RequestMapping("delete")
//    @ResponseBody
//    public String deleteCheckgroupperson(int gropersonid){
//        return checkgrouppersonService.deleteByPrimaryKey(gropersonid)==true?"success":"false";
//    }

    /*
    更新一条检查小组成员信息
     */
//    @RequestMapping("update")
//    @ResponseBody
//    public String updateCheckgroupperson(int gropersonid){
//        Checkgroupperson checkgroupperson = new Checkgroupperson();
//        checkgroupperson.setGropersonid(gropersonid);
//        String result =  checkgrouppersonService.updateByPrimaryKey(checkgroupperson)==true?"success":"false";
//        return result;
//    }

    /*
    查询出中期检查互审安排结果信息
     */
    @RequestMapping("selectArrangeResult")
    @ResponseBody
    public String selectArrangeResult(){
        StringBuffer result = new StringBuffer();
        //暂时定为没有条件的查询
        Map<String ,Object> map = new HashMap<String ,Object>();
        List<ArrangeTeacherResult> arrangeTeacherResultList = checkgrouppersonService.selectArrangeTeacherResult(map);
        result.append("{\"code\":0,\"msg\":\"\",\"count\":\"\",\"data\":"+JSON.toJSON(arrangeTeacherResultList)+"}");
        return result.toString();
    }

    /*
    查询出毕业答辩互审安排结果信息
     */
    @RequestMapping("selectArrangeResultNew")
    @ResponseBody
    public String selectArrangeResultNew(){
        StringBuffer result = new StringBuffer();
        //暂时定为没有条件的查询
        Map<String ,Object> map = new HashMap<String ,Object>();
        List<ArrangeTeacherResultNew> arrangeTeacherResultNewList = checkgrouppersonService.selectArrangeTeacherResultNew(map);
        result.append("{\"code\":0,\"msg\":\"\",\"count\":\"\",\"data\":"+JSON.toJSON(arrangeTeacherResultNewList)+"}");
        return result.toString();
    }

    /*
    删除中期检查互审信息
     */
    @RequestMapping("deleteArrangeResult")
    @ResponseBody
    public String deleteArrangeResult(String arrangeresultid){
        String msg = null;
        try {
            msg = checkgrouppersonService.deleteArrangeTeacherResultByPrimaryKey(arrangeresultid)?"0":"1";
        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }

    /*
    删除毕业答辩互审信息
     */
    @RequestMapping("deleteArrangeResultNew")
    @ResponseBody
    public String deleteArrangeResultNew(String arrangeresultid){
        String msg = null;
        try {
            msg = checkgrouppersonService.deleteArrangeTeacherResultNewByPrimaryKey(arrangeresultid)?"0":"1";
        }catch (Exception e){
            msg = "error";
        }
        return msg;
    }

    /*
    安排中期检查互审老师
     */
    @RequestMapping("arrangeTeacher")
    @ResponseBody
    public String arrangeTeacher(String data1,String data2){
        String result = null;
        try {
            //页面上选中的两个table中的值
            List<TTeacherInfoVo> tTeacherInfoVoList1 = JSON.parseArray(data1,TTeacherInfoVo.class);
            List<TTeacherInfoVo> tTeacherInfoVoList2 = JSON.parseArray(data2,TTeacherInfoVo.class);
            List<ArrangeTeacherResult> arrangeTeacherResultList = new ArrayList<ArrangeTeacherResult>();
            //准备要插入的对象
            ArrangeTeacherResult arrangeTeacherResult = new ArrangeTeacherResult();
            //互审id
            arrangeTeacherResult.setArrangeresultid(UUIDUtil.getUUID2());
            //左侧老师的信息
            for (TTeacherInfoVo tTeacherInfoVo:tTeacherInfoVoList1){
                //拼接老师名师
                if(arrangeTeacherResult.getTeachernameone()!=null){
                    arrangeTeacherResult.setTeachernameone(arrangeTeacherResult.getTeachernameone()+","+tTeacherInfoVo.getTeachername());
                }else {
                    arrangeTeacherResult.setTeachernameone(tTeacherInfoVo.getTeachername());
                }
                //拼接负责学生人数
                if(arrangeTeacherResult.getStudentCountInTeacherOne()!=null){
                    arrangeTeacherResult.setStudentCountInTeacherOne(arrangeTeacherResult.getStudentCountInTeacherOne()+","+tTeacherInfoVo.getStudentcount());
                }else {
                    arrangeTeacherResult.setStudentCountInTeacherOne(tTeacherInfoVo.getStudentcount());
                }
                //所在小组id
                if(arrangeTeacherResult.getTeacheronegroupid() == null){
                    arrangeTeacherResult.setTeacheronegroupid(tTeacherInfoVo.getGroupid());
                }
            }
            //右侧老师的信息
            for (TTeacherInfoVo tTeacherInfoVo:tTeacherInfoVoList2){
                if(arrangeTeacherResult.getTeachernametwo()!=null){
                    arrangeTeacherResult.setTeachernametwo(arrangeTeacherResult.getTeachernametwo()+","+tTeacherInfoVo.getTeachername());
                }else {
                    arrangeTeacherResult.setTeachernametwo(tTeacherInfoVo.getTeachername());
                }
                if(arrangeTeacherResult.getStudentCountInTeacherTwo()!=null){
                    arrangeTeacherResult.setStudentCountInTeacherTwo(arrangeTeacherResult.getStudentCountInTeacherTwo()+","+tTeacherInfoVo.getStudentcount());
                }else {
                    arrangeTeacherResult.setStudentCountInTeacherTwo(tTeacherInfoVo.getStudentcount());
                }
                //所在小组id
                if(arrangeTeacherResult.getTeachertwogroupid() == null){
                    arrangeTeacherResult.setTeachertwogroupid(tTeacherInfoVo.getGroupid());
                }
            }
            //安排时间
            arrangeTeacherResult.setArrangetime(new Date());
            result = checkgrouppersonService.insertArrangeTeacherResult(arrangeTeacherResult)?"0":"1";
        }catch (Exception e){
            result = "error";
        }

        return result;
    }

    /*
    安排毕业答辩互审老师
     */
    @RequestMapping("arrangeTeacherNew")
    @ResponseBody
    public String arrangeTeacherNew(String data1,String data2){
        String result = null;
        try {
            //页面上选中的两个table中的值
            List<TTeacherInfoVo> tTeacherInfoVoList1 = JSON.parseArray(data1,TTeacherInfoVo.class);
            List<TTeacherInfoVo> tTeacherInfoVoList2 = JSON.parseArray(data2,TTeacherInfoVo.class);
            List<ArrangeTeacherResultNew> arrangeTeacherResultNewList = new ArrayList<ArrangeTeacherResultNew>();
            //准备要插入的对象
            ArrangeTeacherResultNew arrangeTeacherResultNew = new ArrangeTeacherResultNew();
            //互审id
            arrangeTeacherResultNew.setArrangeresultid(UUIDUtil.getUUID2());
            //左侧老师的信息
            for (TTeacherInfoVo tTeacherInfoVo:tTeacherInfoVoList1){
                //拼接老师名师
                if(arrangeTeacherResultNew.getTeachernameone()!=null){
                    arrangeTeacherResultNew.setTeachernameone(arrangeTeacherResultNew.getTeachernameone()+","+tTeacherInfoVo.getTeachername());
                }else {
                    arrangeTeacherResultNew.setTeachernameone(tTeacherInfoVo.getTeachername());
                }
                //拼接负责学生人数
                if(arrangeTeacherResultNew.getStudentCountInTeacherOne()!=null){
                    arrangeTeacherResultNew.setStudentCountInTeacherOne(arrangeTeacherResultNew.getStudentCountInTeacherOne()+","+tTeacherInfoVo.getStudentcount());
                }else {
                    arrangeTeacherResultNew.setStudentCountInTeacherOne(tTeacherInfoVo.getStudentcount());
                }
                //所在小组id
                if(arrangeTeacherResultNew.getTeacheronegroupid() == null){
                    arrangeTeacherResultNew.setTeacheronegroupid(tTeacherInfoVo.getGroupid());
                }
            }
            //右侧老师的信息
            for (TTeacherInfoVo tTeacherInfoVo:tTeacherInfoVoList2){
                if(arrangeTeacherResultNew.getTeachernametwo()!=null){
                    arrangeTeacherResultNew.setTeachernametwo(arrangeTeacherResultNew.getTeachernametwo()+","+tTeacherInfoVo.getTeachername());
                }else {
                    arrangeTeacherResultNew.setTeachernametwo(tTeacherInfoVo.getTeachername());
                }
                if(arrangeTeacherResultNew.getStudentCountInTeacherTwo()!=null){
                    arrangeTeacherResultNew.setStudentCountInTeacherTwo(arrangeTeacherResultNew.getStudentCountInTeacherTwo()+","+tTeacherInfoVo.getStudentcount());
                }else {
                    arrangeTeacherResultNew.setStudentCountInTeacherTwo(tTeacherInfoVo.getStudentcount());
                }
                //所在小组id
                if(arrangeTeacherResultNew.getTeachertwogroupid() == null){
                    arrangeTeacherResultNew.setTeachertwogroupid(tTeacherInfoVo.getGroupid());
                }
            }
            //安排时间
            arrangeTeacherResultNew.setArrangetime(new Date());
            result = checkgrouppersonService.insertArrangeTeacherResultNew(arrangeTeacherResultNew)?"0":"1";
        }catch (Exception e){
            result = "error";
        }

        return result;
    }

    /*
    查询一条中期检查小组下老师和老师所带学生信息
     */
    @RequestMapping("selectTeacherAndStudentCount")
    @ResponseBody
    public String selectOneCheckgroupperson(String groupid) throws Exception {
        StringBuffer result = new StringBuffer();
        //查询出检查小组成员及其老师信息，老师负责学生人数
        List<CheckgrouppersonVo> checkgrouppersonVoList = checkgrouppersonService.selectTeacherAndStudentCountBygroupid(groupid);
        for(CheckgrouppersonVo checkgrouppersonVo:checkgrouppersonVoList){
            checkgrouppersonVo.setStudentcount(10);
//            checkgrouppersonVo.setStudentcount(projectManageService.getSelfStudentNum(null,checkgrouppersonVo.getTeacherid()));
        }
        result.append("{\"code\":0,\"msg\":\"\",\"count\":\"\",\"data\":"+JSON.toJSON(checkgrouppersonVoList)+"}");
        return result.toString();
    }

    /*
    查询一条毕业答辩检查小组下老师和老师所带学生信息
     */
    @RequestMapping("selectTeacherAndStudentCountNew")
    @ResponseBody
    public String selectOneCheckgrouppersonNew(String groupid) throws Exception {
        StringBuffer result = new StringBuffer();
        //查询出毕业答辩检查小组成员及其老师信息，老师负责学生人数
        List<CheckgrouppersonVo> checkgrouppersonVoList = checkgrouppersonService.selectTeacherAndStudentCountNewBygroupid(groupid);
        for(CheckgrouppersonVo checkgrouppersonVo:checkgrouppersonVoList){
            checkgrouppersonVo.setStudentcount(10);
//            checkgrouppersonVo.setStudentcount(projectManageService.getSelfStudentNum(null,checkgrouppersonVo.getTeacherid()));
        }
        result.append("{\"code\":0,\"msg\":\"\",\"count\":\"\",\"data\":"+JSON.toJSON(checkgrouppersonVoList)+"}");
        return result.toString();
    }

    /*
    中期检查小组管理：页面初始化及其条件查询（已完成）
     */
    @RequestMapping("selectPage")
    @ResponseBody
    public String selectCheckgrouppersonListPage(String teachername,String groupname,String groupidIsNull,Integer page,Integer limit) throws Exception {

        //初始化参数
        teachername = teachername == null ? "":teachername;
        groupname = groupname == null ? "":groupname;
        groupidIsNull = groupidIsNull == null?"2":groupidIsNull;
        page = page == null?1:page;
        limit = limit == null?10:limit;

        //准备对象，存放数据和回调页面
        ModelAndView modelAndView = new ModelAndView();
        //前台显示的数据存放在CheckgrouppersonVo中
        List<CheckgrouppersonVo> checkgrouppersonVoList = new ArrayList<CheckgrouppersonVo>();
        //查询条件及分页条件存放在Map中
        Map<String,Object> map = new HashMap<String, Object>();
        //存放条件
        map.put("teachername",teachername);
        map.put("groupname",groupname);
        map.put("groupid",groupidIsNull);
        map.put("page",page);
        map.put("limit", limit);

        //查询出小组信息
        List<TTeacherInfoVo> checkgrouppersonList = checkgrouppersonService.selectCheckgrouppersonList2(map);

        //小组数量
        int checkgrouppersonCount = checkgrouppersonService.selectCheckgrouppersonCount(map);


        //将小组及其附带信息组合，放到checkgrouppersonVoList中
        for (TTeacherInfoVo checkgrouppersoninfo:checkgrouppersonList){
            CheckgrouppersonVo checkgrouppersonVo = new CheckgrouppersonVo();
            checkgrouppersonVo.setGropersonid(checkgrouppersoninfo.getGropersonid());
            checkgrouppersonVo.setTeacherid(checkgrouppersoninfo.getTeacherid());
            checkgrouppersonVo.setGroupid(checkgrouppersoninfo.getGroupid());
            checkgrouppersonVo.setTeachername(checkgrouppersoninfo.getTeachername());
            checkgrouppersonVo.setGroupname(checkgrouppersoninfo.getGroupname());

            //小组组长，没有组为空，有组则查
            String groupLeader = null;
            if("".equals(checkgrouppersoninfo.getGroupid()) || checkgrouppersoninfo.getGroupid() == null){
                groupLeader = "";
            }else {
                groupLeader = checkgrouppersonService.selectGroupLeader(checkgrouppersoninfo.getGroupid());
            }
            checkgrouppersonVo.setGroupleader(groupLeader);
            checkgrouppersonVo.setStudentcount(10);
//            checkgrouppersonVo.setStudentcount(projectManageService.getSelfStudentNum(null,checkgrouppersoninfo.getTeacherid()));


            checkgrouppersonVo.setReplyaddress(checkgrouppersoninfo.getReplyaddress());
            //检查时间取中期检查时间
            checkgrouppersonVo.setArrangetime(checkgrouppersoninfo.getArrangetime());
            checkgrouppersonVo.setReplytime(checkgrouppersoninfo.getReplytime());

            checkgrouppersonVoList.add(checkgrouppersonVo);
        }

        //返回数据
        StringBuffer result = new StringBuffer();
        result.append("{\"code\":0,\"msg\":\"\",\"count\":"+checkgrouppersonCount+",\"data\":"+JSON.toJSON(checkgrouppersonVoList)+"}");

        return result.toString();
    }

    /*
    毕业答辩检查小组管理：页面初始化及其条件查询（已完成）
     */
    @RequestMapping("selectPageNew")
    @ResponseBody
    public String selectCheckgrouppersonListPageNew(String teachername,String groupname,String groupidIsNull,Integer page,Integer limit) throws Exception {

        //初始化参数
        teachername = teachername == null ? "":teachername;
        groupname = groupname == null ? "":groupname;
        groupidIsNull = groupidIsNull == null?"2":groupidIsNull;
        page = page == null?1:page;
        limit = limit == null?10:limit;

        //准备对象，存放数据和回调页面
        ModelAndView modelAndView = new ModelAndView();
        //前台显示的数据存放在CheckgrouppersonVo中
        List<CheckgrouppersonVo> checkgrouppersonVoList = new ArrayList<CheckgrouppersonVo>();
        //查询条件及分页条件存放在Map中
        Map<String,Object> map = new HashMap<String, Object>();
        //存放条件
        map.put("teachername",teachername);
        map.put("groupname",groupname);
        map.put("groupid",groupidIsNull);
        map.put("page",page);
        map.put("limit", limit);

        //查询出小组信息
        List<TTeacherInfoVo> checkgrouppersonList = checkgrouppersonService.selectCheckgrouppersonList2New(map);

        //小组数量
        int checkgrouppersonCount = checkgrouppersonService.selectCheckgrouppersonNewCount(map);


        //将小组及其附带信息组合，放到checkgrouppersonVoList中
        for (TTeacherInfoVo checkgrouppersoninfo:checkgrouppersonList){
            CheckgrouppersonVo checkgrouppersonVo = new CheckgrouppersonVo();
            checkgrouppersonVo.setGropersonid(checkgrouppersoninfo.getGropersonid());
            checkgrouppersonVo.setTeacherid(checkgrouppersoninfo.getTeacherid());
            checkgrouppersonVo.setGroupid(checkgrouppersoninfo.getGroupid());
            checkgrouppersonVo.setTeachername(checkgrouppersoninfo.getTeachername());
            checkgrouppersonVo.setGroupname(checkgrouppersoninfo.getGroupname());

            //小组组长，没有组为空，有组则查
            String groupLeader = null;
            if("".equals(checkgrouppersoninfo.getGroupid()) || checkgrouppersoninfo.getGroupid() == null){
                groupLeader = "";
            }else {
                groupLeader = checkgrouppersonService.selectGroupLeaderNew(checkgrouppersoninfo.getGroupid());
            }
            checkgrouppersonVo.setGroupleader(groupLeader);
            checkgrouppersonVo.setStudentcount(10);
//            checkgrouppersonVo.setStudentcount(projectManageService.getSelfStudentNum(null,checkgrouppersoninfo.getTeacherid()));

            checkgrouppersonVo.setReplyaddress(checkgrouppersoninfo.getReplyaddress());
            checkgrouppersonVo.setReplytime(checkgrouppersoninfo.getReplytime());

            checkgrouppersonVoList.add(checkgrouppersonVo);
        }

        //返回数据
        StringBuffer result = new StringBuffer();
        result.append("{\"code\":0,\"msg\":\"\",\"count\":"+checkgrouppersonCount+",\"data\":"+JSON.toJSON(checkgrouppersonVoList)+"}");

        return result.toString();
    }

    @RequestMapping("downloadExcel")
    @ResponseBody
    public void downloadPersonInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Object> map = new HashMap<String ,Object>();
        //需要导出的数据
        List<TTeacherInfoVo> tTeacherInfoVoList = checkgrouppersonService.selectCheckgrouppersonList2(map);
        //文件名称
        String filename = "中期检查人员信息表";
        //创建一个HSSFWorkbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        //在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet();
        //在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        HSSFRow row = sheet.createRow(0);
        //创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        // 设置表头
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("老师ID");
        cell.setCellStyle(style);

        cell = row.createCell(1);
        cell.setCellValue("老师姓名");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("检查小组成员ID");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("检查小组ID");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("检查小组名称");
        cell.setCellStyle(style);

        cell = row.createCell(5);
        cell.setCellValue("中期检查基本信息ID");
        cell.setCellStyle(style);

        cell = row.createCell(6);
        cell.setCellValue("角色");
        cell.setCellStyle(style);

        cell = row.createCell(7);
        cell.setCellValue("答辩地点");
        cell.setCellStyle(style);

        cell = row.createCell(8);
        cell.setCellValue("检查时间");
        cell.setCellStyle(style);

        //写入数据
        for(int i = 0;i<tTeacherInfoVoList.size();i++){
            row = sheet.createRow((int) i + 1);
            TTeacherInfoVo tTeacherInfoVo = tTeacherInfoVoList.get(i);
            row.createCell(0).setCellValue(tTeacherInfoVo.getTeacherid());
            row.createCell(1).setCellValue(tTeacherInfoVo.getTeachername());
            if(tTeacherInfoVo.getGropersonid()==null){
                row.createCell(2).setCellValue("");
            }else {
                row.createCell(2).setCellValue(tTeacherInfoVo.getGropersonid());
            }
            row.createCell(3).setCellValue(tTeacherInfoVo.getGroupid()==null?"":tTeacherInfoVo.getGroupid());
            row.createCell(4).setCellValue(tTeacherInfoVo.getGroupname()==null?"":tTeacherInfoVo.getGroupname());
            row.createCell(5).setCellValue(tTeacherInfoVo.getCencheckinfoid()==null?"":tTeacherInfoVo.getCencheckinfoid());
            row.createCell(6).setCellValue(tTeacherInfoVo.getGrouprole()==null?"":tTeacherInfoVo.getGrouprole());
            row.createCell(7).setCellValue(tTeacherInfoVo.getReplyaddress()==null?"":tTeacherInfoVo.getReplyaddress());
            row.createCell(8).setCellValue(tTeacherInfoVo.getArrangetime()==null?"":tTeacherInfoVo.getArrangetime());
        }

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        wb.write(os);
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="
                + new String((filename + ".xls").getBytes(), "iso-8859-1"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
        return;
    }

    @RequestMapping("downloadExcel2")
    @ResponseBody
    public void downloadPersonInfo2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Object> map = new HashMap<String ,Object>();
        //需要导出的数据
        List<TTeacherInfoVo> tTeacherInfoVoList = checkgrouppersonService.selectCheckgrouppersonList2(map);
        //文件名称
        String filename = "毕业答辩人员信息表";
        //创建一个HSSFWorkbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        //在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet();
        //在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        HSSFRow row = sheet.createRow(0);
        //创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        // 设置表头
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("老师ID");
        cell.setCellStyle(style);

        cell = row.createCell(1);
        cell.setCellValue("老师姓名");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("检查小组成员ID");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("检查小组ID");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("检查小组名称");
        cell.setCellStyle(style);

        cell = row.createCell(5);
        cell.setCellValue("中期检查基本信息ID");
        cell.setCellStyle(style);

        cell = row.createCell(6);
        cell.setCellValue("角色");
        cell.setCellStyle(style);

        cell = row.createCell(7);
        cell.setCellValue("答辩地点");
        cell.setCellStyle(style);

        cell = row.createCell(8);
        cell.setCellValue("答辩时间");
        cell.setCellStyle(style);

        //写入数据
        for(int i = 0;i<tTeacherInfoVoList.size();i++){
            row = sheet.createRow((int) i + 1);
            TTeacherInfoVo tTeacherInfoVo = tTeacherInfoVoList.get(i);
            row.createCell(0).setCellValue(tTeacherInfoVo.getTeacherid());
            row.createCell(1).setCellValue(tTeacherInfoVo.getTeachername());
            if(tTeacherInfoVo.getGropersonid()==null){
                row.createCell(2).setCellValue("");
            }else {
                row.createCell(2).setCellValue(tTeacherInfoVo.getGropersonid());
            }
            row.createCell(3).setCellValue(tTeacherInfoVo.getGroupid()==null?"":tTeacherInfoVo.getGroupid());
            row.createCell(4).setCellValue(tTeacherInfoVo.getGroupname()==null?"":tTeacherInfoVo.getGroupname());
            row.createCell(5).setCellValue(tTeacherInfoVo.getCencheckinfoid()==null?"":tTeacherInfoVo.getCencheckinfoid());
            row.createCell(6).setCellValue(tTeacherInfoVo.getGrouprole()==null?"":tTeacherInfoVo.getGrouprole());
            row.createCell(7).setCellValue(tTeacherInfoVo.getReplyaddress()==null?"":tTeacherInfoVo.getReplyaddress());
            row.createCell(8).setCellValue(tTeacherInfoVo.getReplytime()==null?"":tTeacherInfoVo.getReplytime());
        }

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        wb.write(os);
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="
                + new String((filename + ".xls").getBytes(), "iso-8859-1"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
        return;
    }
}