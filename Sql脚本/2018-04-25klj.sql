drop table if exists t_courseDesign_info_arrange;

/*==============================================================*/
/* Table: t_courseDesign_info_arrange                           */
/*==============================================================*/
create table t_courseDesign_info_arrange
(
   courseDesignArrangeID varchar(40) not null,
   trainCourseID        varchar(40),
   majorID              varchar(40) not null,
   startTime            varchar(20),
   endTime              varchar(20),
   semester             varchar(20),
   yearNum              varchar(20),
   courseDesignName     varchar(50),
   courseDesignNum     varchar(20),
   CourseArrangeInfo    varchar(200),
   CourseArrangeTeacher varchar(10),
   CourseArrangeTime    datetime,
   isArrange            varchar(10),
   display              varchar(10),
   remark2              varchar(50),
   primary key (courseDesignArrangeID)
);



drop table if exists t_courseDesign_teacher_arrange;

/*==============================================================*/
/* Table: t_courseDesign_teacher_arrange                        */
/*==============================================================*/
create table t_courseDesign_teacher_arrange
(
   courseDesignTeacherArrangeID varchar(40) not null,
   courseDesignArrangeID varchar(40),
   teacherID            varchar(40),
   classNames           varchar(40),
   stuCount             VARCHAR(10),
   display              varchar(10),
   primary key (courseDesignTeacherArrangeID)
);


drop table if exists t_courseDesign_TeacherStudent;

/*==============================================================*/
/* Table: t_courseDesign_TeacherStudent                         */
/*==============================================================*/
create table t_courseDesign_TeacherStudent
(
   courseDesignTeacherStudentID varchar(40) not null,
   courseDesignTeacherArrangeID varchar(40),
   studentID            varchar(40),
   courseDesignArrangeNum varchar(40),
   courseDesignReportName varchar(50),
   courseDesignReportStore varchar(50),
   uploadTime           datetime,
   uploadStatus         varchar(5),
   checkStatus          varchar(5),
   checkAdvice          varchar(200),
   display              varchar(10),
   remark               varchar(20),
   primary key (courseDesignTeacherStudentID)
);




drop table if exists t_courseDesign_class_arrange;

/*==============================================================*/
/* Table: t_courseDesign_class_arrange                          */
/*==============================================================*/
create table t_courseDesign_class_arrange
(
   courseDesignClassArrangeID varchar(40) not null,
   courseDesignArrangeID varchar(40),
   classID              varchar(40),
   grade                varchar(10),
   display              varchar(10),
   primary key (courseDesignClassArrangeID)
);


