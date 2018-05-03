DROP TABLE IF EXISTS t_courseDesign_info_arrange;

/*==============================================================*/
/* Table: t_courseDesign_info_arrange                           */
/*==============================================================*/
CREATE TABLE t_courseDesign_info_arrange
(
   courseDesignArrangeID VARCHAR(40) NOT NULL,
   trainningSchemeID    VARCHAR(40),
   majorID              VARCHAR(40) NOT NULL,
   startTime            VARCHAR(20),
   endTime              VARCHAR(20),
   semester             VARCHAR(20),
   yearNum              VARCHAR(20),
   courseDesignName     VARCHAR(50),
   CourseArrangeInfo    VARCHAR(200),
   CourseArrangeTeacher VARCHAR(10),
   CourseArrangeTime    DATETIME,
   isArrange            VARCHAR(10),
   remark1              VARCHAR(50),
   remark2              VARCHAR(50),
   PRIMARY KEY (courseDesignArrangeID)
);



DROP TABLE IF EXISTS t_courseDesign_TeacherStudent;

/*==============================================================*/
/* Table: t_courseDesign_TeacherStudent                         */
/*==============================================================*/
CREATE TABLE t_courseDesign_TeacherStudent
(
   courseDesignTeacherStudentID VARCHAR(40) NOT NULL,
   courseDesignTeacherArrangeID VARCHAR(40),
   studentID            VARCHAR(40),
   courseDesignArrangeNum VARCHAR(40),
   courseDesignReportName VARCHAR(50),
   courseDesignReportStore VARCHAR(50),
   uploadTime           DATETIME,
   uploadStatus         VARCHAR(5),
   checkStatus          VARCHAR(5),
   checkAdvice          VARCHAR(200),
   remark               VARCHAR(20),
   PRIMARY KEY (courseDesignTeacherStudentID)
);

DROP TABLE IF EXISTS t_courseDesign_class_arrange;

/*==============================================================*/
/* Table: t_courseDesign_class_arrange                          */
/*==============================================================*/
CREATE TABLE t_courseDesign_class_arrange
(
   courseDesignClassArrangeID VARCHAR(40) NOT NULL,
   courseDesignArrangeID VARCHAR(40),
   classID              VARCHAR(40),
   PRIMARY KEY (courseDesignClassArrangeID)
);



