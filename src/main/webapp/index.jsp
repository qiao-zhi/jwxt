<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>太原科技大学教研室管理系统</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"  content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="shortcut icon" href="./favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
</head>
<body>
<%-- qlq引入的公共的JSP --%>
<%@include file="/tag.jsp"%>
<!-- 顶部开始 -->
<div class="container">
    <div class="logo"><a href="./index.jsp">教研室管理系统</a></div>
    <div class="left_open">
        <i title="展开左侧栏" class="iconfont">&#xe699;</i>
    </div>
    <ul class="layui-nav right" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;">admin</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onclick="x_admin_show('个人信息','http://www.baidu.com')">个人信息</a></dd>
                <dd><a onclick="x_admin_show('切换帐号','http://www.baidu.com')">切换帐号</a></dd>
                <dd><a onclick="x_admin_show('切换帐号','http://www.baidu.com')">帮助</a></dd>
                <dd><a href="./login.html">退出</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item to-index"><a href="index.jsp">首页</a></li>
    </ul>
</div>
<!-- 顶部结束 -->

<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<div class="left-nav">
    <div id="side-nav">
        <ul id="nav">
            <!--课程管理-->
            <li>
                <a href="javascript:;">
                    <cite>课程管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="pages/courseManage/courseInfo.jsp">
                            <cite>课程信息</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <!--排课管理-->
             <li>
                <a href="javascript:;">
                    <cite>排课管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="pages/arrangeCourse/adviceBook.jsp">
                            <cite>通知书管理</cite>
                        </a>
                    </li>
                	<li>
                        <a _href="pages/arrangeCourse/scheduleTask.html">
                            <cite>任务管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/arrangeCourse/scheduleArrange.html">
                            <cite>安排课程</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/arrangeCourse/scheduleCheck.html">
                            <cite>任务审核</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <!--教材管理-->
            <li>
                <a href="javascript:;">
                    <cite>教材管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="pages/textbookManage/textbookInfo.html">
                            <cite>教材库管理</cite>
                        </a>
                    </li>
                     <li>
                        <a _href="pages/textbookManage/orderTextbook.html">
                            <cite>订购教材</cite>
                        </a>
                    </li>
                     <li>
                        <a _href="pages/textbookManage/teacherConfirm.html">
                            <cite>教师确认订单</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/textbookManage/orderInfo.html">
                            <cite>订单管理</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <!--课程设计-->
            <li>
                <a href="javascript:;">
                    <cite>课程设计</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="pages/courseDesign/courseDesign.html">
                            <cite>课设分配</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/courseDesign/courseDesignReport.html">
                            <cite>上传课设报告</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/courseDesign/courseDesignReport-progress.html">
                            <cite>报告上传情况</cite>
                        </a>
                    </li>
                </ul>
            </li>
			<!--教学工作量-->
			 <li>
                <a href="javascript:;">
                    <cite>教学工作量</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="pages/workLoad/statistics.html">
                            <cite>工作量统计</cite>
                        </a>
                    </li>
                </ul>
            </li>
              <!--毕业设计管理-->
            <li>
                <a href="javascript:;">
                    <cite>毕业设计管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <!--审核通过后，学生选择课题
                        可以选择  可以查看选择情况  可以调剂-->
                    <li>
                        <a href="javascript:;">
                            <cite>课题管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i>
                        </a>
                        <ul class="sub-menu">
                            <!--毕业课题管理 课题申请表与审核-->
                            <li>
                                <a _href="pages/graduateProgram/projectManage/project-AC.html">
                                    <cite>课题添加及审核</cite><!--增删改查  列里边有院长审核情况和教研室审核情况-->
                                </a><!--教研室主任和院长  可以统计 导出，最下边有发布-->
                            </li>
                            <li>
                                <a _href="pages/graduateProgram/projectManage/chooseProject.html">
                                    <cite>选择课题</cite><!--学生 选择两个 提交-->
                                </a>
                            </li>
                            <li>
                                <a _href="pages/graduateProgram/projectManage/chooseGPStudent.html">
                                    <cite>选择毕设学生</cite><!--老师 确认学生 填写任务书，
                            填写论文评语，查看中期检查，毕业答辩情况-->
                                </a>
                            </li>
                            <li>
                                <a _href="pages/graduateProgram/projectManage/projectManage.html">
                                    <cite>课题管理</cite><!--教研室主任  看谁没报（导出），
							看那个老师报的人数的多少，调剂学生通知（哪些学生还可以选择那些老师和课题）
							发布结果  查看任务书填写情况 -->
                                </a>
                            </li>
                        </ul>
                    </li>
                    <!--中期答辩管理  设定答辩，答辩结果统计-->
                    <li>
                        <a href="javascript:;">
                            <cite>中期检查管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a _href="pages/graduateProgram/middleReport/middleReportGroup.html">
                                    <cite>中期检查小组管理</cite><!--教研室主任 3组，互分。这个怎么安排，是写算法还是？-->
                                </a>
                            </li>
                            <li>
                                <a _href="pages/graduateProgram/middleReport/middleReportManage.html">
                                    <cite>中期检查审核管理</cite><!--教师 查看中期答辩所负责的学生情况，填写答辩结果-->
                                </a>
                            </li>
                        </ul>
                    </li>
                    <!--毕业答辩管理  设定答辩，答辩结果统计-->
                    <li>
                        <a href="javascript:;">
                            <cite>毕业答辩管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a _href="pages/graduateProgram/graduateReport/graduateReportGroup.html">
                                    <cite>毕业答辩小组管理</cite><!--教研室主任 3组，互分。这个怎么安排，是写算法还是？-->
                                </a>
                            </li>
                            <li>
                                <a _href="pages/graduateProgram/graduateReport/ThesisManage.html">
                                    <cite>论文管理</cite><!--老师 确认学生 填写任务书，
                            填写论文评语，查看中期检查，毕业答辩情况-->
                                </a>
                            </li>
                            <li>
                                <a _href="pages/graduateProgram/graduateReport/graduateReportManage.html">
                                    <cite>毕业答辩审核管理</cite><!--教师 查看答辩安排，
							        填写论文评语 可以下载查看 考勤表？？？ 查看答辩结果（未审核）
							        查看历年毕业设计 审核学生的资料-->
                                </a>
                            </li>
                        </ul>
                    </li>
                    <!--校外毕设管理 -->
                    <li>
                        <a href="javascript:;">
                            <cite>校外毕设管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a _href="pages/graduateProgram/outGraduateProgram/outGraduateApply.html">
                                    <cite>校外毕设申请</cite><!--添加申请及上传相关材料-->
                                </a>
                            </li>
                            <li>
                                <a _href="pages/graduateProgram/outGraduateProgram/outGraduateManage.html">
                                    <cite>校外毕设审核管理</cite><!-- 上传资料，教研室主任审核及意见，院长审核意见-->
                                </a>
                            </li>
                        </ul>
                    </li>
                    <!--学生-毕设管理-->
                    <li>
                        <a _href="pages/graduateProgram/studentGPM/studentGPM.html">
                            <cite>学生-毕设管理</cite><!--学生，根据老师的任务书 填写进程表-->
                            <!--学生 查看答辩安排，
                            提交论文，下载资料 查看答辩结果（未审核）
                            提交论文还需要教师的审核
                        -->
                        </a>
                    </li>
                    <!-- 文件审核管理-->
                    <li>
                        <a _href="pages/graduateProgram/fileManage/fileManage.html">
                            <cite>文件管理</cite><!--学生，根据老师的任务书 填写进程表-->
                            <!--学生 查看答辩安排，
                            提交论文，下载资料 查看答辩结果（未审核）
                            提交论文还需要教师的审核
                        -->
                        </a>
                    </li>
                    <!--成绩管理 查看成绩信息，查看统计信息。
                    成绩录入在中期检查和毕业答辩中，点击相关按钮进行，填表录入，可以根据权限，控制，录入内容-->
                    <li>
                        <a href="javascript:;">
                            <cite>成绩管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i>
                        </a>
                        <ul class="sub-menu">
                            <li>
                                <a _href="pages/graduateProgram/gradeManage/gradeView.html">
                                    <cite>成绩查询</cite>
                                </a>
                            </li>
                            <li>
                                <a _href="pages/graduateProgram/gradeManage/gradeStatistics.html">
                                    <cite>成绩统计</cite>
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
            <!--培养方案管理-->
            <li>
                <a href="javascript:;">
                    <cite>培养方案管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="pages/trainingScheme/trainingScheme.html">
                            <cite>培养方案管理</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <!--基础信息管理-->
            <li>
                <a href="javascript:;">
                    <cite>基础信息管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="pages/baseinfo/major.html">
                            <cite>专业信息</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/baseinfo/clazz.html">
                            <cite>班级信息</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/baseinfo/teacher.html">
                            <cite>教师信息</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/baseinfo/student.html">
                            <cite>学生信息</cite>
                        </a>
                    </li>
                </ul>
            </li>
           <!--系统管理-->
            <li>
                <a href="javascript:;">
                    <cite>系统管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="pages/system/college.html">
                            <cite>学院初始化</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/system/user.html">
                            <cite>用户管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/system/role.html">
                            <cite>角色管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/system/authority.html">
                            <cite>权限管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/system/dictionary.html">
                            <cite>字典管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="pages/system/loginfo.html">
                            <cite>日志管理</cite>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>
<!-- 左侧菜单结束 -->

<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li>我的桌面</li>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='./welcome.html' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
        </div>
    </div>
</div>
<div class="page-content-bg"></div>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->

<!-- 底部开始 -->
<div class="footer">
    <div class="copyright" style="text-align: center"><span>2018 &copy;</span>太原科技大学--软件教研室,版权所有</div>
</div>
<!-- 底部结束 -->
</body>
</html>