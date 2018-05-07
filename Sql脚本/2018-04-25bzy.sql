

DROP TABLE IF EXISTS cancelLeave;

DROP TABLE IF EXISTS checkLeave;

DROP TABLE IF EXISTS checkOutGraDesignInfo;

DROP TABLE IF EXISTS graDesignLeaveApply;

DROP TABLE IF EXISTS outGraDesignInfo;

DROP TABLE IF EXISTS outGraDesignTitleApply;

DROP TABLE IF EXISTS outsideGraDesignAgreemen;

DROP TABLE IF EXISTS outsideGraDesignAttachment;

DROP TABLE IF EXISTS projectCheck;

/*==============================================================*/
/* Table: cancelLeave                                           */
/*==============================================================*/
CREATE TABLE cancelLeave
(
   cancelLeaveID        INT                            NOT NULL,
   leaveID              INT                            NULL,
   cancelTime           DATETIME                       NULL,
   passStartTime        DATETIME                       NULL,
   passEndTime          DATETIME                       NULL,
   CONSTRAINT PK_CANCELLEAVE PRIMARY KEY (cancelLeaveID)
);

/*==============================================================*/
/* Table: checkLeave                                            */
/*==============================================================*/
CREATE TABLE checkLeave
(
   checkLeaveID         INT                            NOT NULL,
   leaveID              INT                            NULL,
   checkPeople          VARCHAR(20)                    NULL,
   checkOpinion         VARCHAR(50)                    NULL,
   teacherSign          VARCHAR(40)                    NULL,
   result               VARCHAR(2)                     NULL,
   applyTime            DATETIME                       NULL,
   remark               VARCHAR(20)                    NULL,
   CONSTRAINT PK_CHECKLEAVE PRIMARY KEY (checkLeaveID)
);

/*==============================================================*/
/* Table: checkOutGraDesignInfo                                 */
/*==============================================================*/
CREATE TABLE checkOutGraDesignInfo
(
   checkOutApplyID      VARCHAR(40)                    NOT NULL,
   outsideApplyID       VARCHAR(40)                    NULL,
   checkPeople          VARCHAR(20)                    NULL,
   checkAdvice          VARCHAR(50)                    NULL,
   teacherSign          VARCHAR(40)                    NULL,
   result               VARCHAR(2)                     NULL,
   applyTime            DATETIME                       NULL,
   remark               VARCHAR(20)                    NULL,
   CONSTRAINT PK_CHECKOUTGRADESIGNINFO PRIMARY KEY (checkOutApplyID)
);

/*==============================================================*/
/* Table: graDesignLeaveApply                                   */
/*==============================================================*/
CREATE TABLE graDesignLeaveApply
(
   leaveID              VARCHAR(40)                    NOT NULL,
   outsideApplyID       VARCHAR(40)                    NULL,
   tableName            VARCHAR(20)                    NULL,
   studentName          VARCHAR(40)                    NULL,
   studentNum           VARCHAR(20)                    NULL,
   major                VARCHAR(20)                    NULL,
   startDate            DATETIME                       NULL,
   endDate              DATETIME                       NULL,
   leaveDays            INT                            NULL,
   leaveAddress         VARCHAR(40)                    NULL,
   studentTel           VARCHAR(20)                    NULL,
   homeAddress          VARCHAR(40)                    NULL,
   homeTel              VARCHAR(20)                    NULL,
   leaveReason          VARCHAR(100)                   NULL,
   checkStatus          VARCHAR(2)                     NULL,
   isOk                 VARCHAR(2)                     NULL,
   isCancel             VARCHAR(2)                     NULL,
   remark               VARCHAR(20)                    NULL,
   CONSTRAINT PK_GRADESIGNLEAVEAPPLY PRIMARY KEY (leaveID)
);


/*==============================================================*/
/* Table: outGraDesignInfo                                      */
/*==============================================================*/
CREATE TABLE outGraDesignInfo
(
   outsideApplyID       VARCHAR(40)                    NOT NULL,
   StudentTitleresultID VARCHAR(40)                    NULL,
   tableName            VARCHAR(20)                    NULL,
   studentName          VARCHAR(10)                    NULL,
   sex                  VARCHAR(2)                     NULL,
   majorClass           VARCHAR(20)                    NULL,
   inTeacherName        VARCHAR(10)                    NULL,
   receiveUnit          VARCHAR(40)                    NULL,
   applyReason          VARCHAR(100)                   NULL,
   applyDate            DATETIME                       NULL,
   stuSignUrl           VARCHAR(40)                    NULL,
   STATUS               VARCHAR(2)                     NULL,
   isCommit             VARCHAR(2)                     NULL,
   remark1              VARCHAR(20)                    NULL,
   CONSTRAINT PK_OUTGRADESIGNINFO PRIMARY KEY (outsideApplyID)
);

/*==============================================================*/
/* Table: outGraDesignTitleApply                                */
/*==============================================================*/
CREATE TABLE outGraDesignTitleApply
(
   outGraDesignApplyID  VARCHAR(40)                    NOT NULL,
   outsideApplyID       VARCHAR(40)                    NULL,
   tableName            VARCHAR(20)                    NULL,
   courseName           VARCHAR(40)                    NULL,
   outUnitName          VARCHAR(50)                    NULL,
   outUnitPhone         VARCHAR(18)                    NULL,
   outUnitAddr          VARCHAR(40)                    NULL,
   studentPhone         VARCHAR(18)                    NULL,
   stuParentPhone       VARCHAR(18)                    NULL,
   inTeacherName        VARCHAR(10)                    NULL,
   inTeacherPhone       VARCHAR(18)                    NULL,
   outTeacherName       VARCHAR(18)                    NULL,
   outTeacherPhone      VARCHAR(18)                    NULL,
   courseDescription    VARCHAR(500)                   NULL,
   testContent          VARCHAR(500)                   NULL,
   testStandard         VARCHAR(500)                   NULL,
   resultType           VARCHAR(20)                    NULL,
   checkStatus          VARCHAR(2)                     NULL,
   isOk                 VARCHAR(2)                     NULL,
   remark1              VARCHAR(50)                    NULL,
   remark2              VARCHAR(50)                    NULL,
   CONSTRAINT PK_OUTGRADESIGNTITLEAPPLY PRIMARY KEY (outGraDesignApplyID)
);


/*==============================================================*/
/* Table: outsideGraDesignAgreemen                              */
/*==============================================================*/
CREATE TABLE outsideGraDesignAgreemen
(
   agreementID          INT                            NOT NULL,
   outsideApplyID       VARCHAR(40)                    NULL,
   agreementName        VARCHAR(20)                    NULL,
   schoolSign           VARCHAR(40)                    NULL,
   schoolSignDate       DATETIME                       NULL,
   studentSign          VARCHAR(40)                    NULL,
   studentSignDate      DATETIME                       NULL,
   applyStatus          VARCHAR(2)                     NULL,
   remark               VARCHAR(20)                    NULL,
   CONSTRAINT PK_OUTSIDEGRADESIGNAGREEMEN PRIMARY KEY (agreementID)
);



/*==============================================================*/
/* Table: outsideGraDesignAttachment                            */
/*==============================================================*/
CREATE TABLE outsideGraDesignAttachment
(
   attachmentID         VARCHAR(40)                    NOT NULL,
   outsideApplyID       VARCHAR(40)                    NULL,
   attachmentName       VARCHAR(20)                    NULL,
   attachmentOldName    VARCHAR(40)                    NULL,
   newName              VARCHAR(40)                    NULL,
   attachmentAddr       VARCHAR(40)                    NULL,
   uploadDate           DATETIME                       NULL,
   attachmentType       CHAR(6)                        NULL,
   remark               VARCHAR(20)                    NULL,
   CONSTRAINT PK_OUTSIDEGRADESIGNATTACHMENT PRIMARY KEY (attachmentID)
);


/*==============================================================*/
/* Table: projectCheck                                          */
/*==============================================================*/
CREATE TABLE projectCheck
(
   check_id             VARCHAR(40)                    NOT NULL,
   outGraDesignApplyID  VARCHAR(40)                    NULL,
   checkPeople          VARCHAR(20)                    NULL,
   checkOpinion         VARCHAR(50)                    NULL,
   teacherSign          VARCHAR(40)                    NULL,
   checkResult          VARCHAR(2)                     NULL,
   applyTime            DATETIME                       NULL,
   remark               VARCHAR(20)                    NULL,
   CONSTRAINT PK_PROJECTCHECK PRIMARY KEY (check_id)
);

ALTER TABLE `jwxt`.`cancelleave`     CHANGE `cancelLeaveID` `cancelLeaveID` VARCHAR(40) NOT NULL,     CHANGE `leaveID` `leaveID` VARCHAR(40) NULL ;
ALTER TABLE `jwxt`.`checkleave`     CHANGE `checkLeaveID` `checkLeaveID` VARCHAR(40) NOT NULL,     CHANGE `leaveID` `leaveID` VARCHAR(40) NULL ;


CREATE     VIEW `jwxt`.`OGD_result_titleApply_teacherInfo`
	AS (
		SELECT str.StudentTitleresultID,str.teacherTitleID,s.*,
			t.teacherName,t.teacherID,coll.collegeName,coll.collegePresidentF,c.className,m.majorName,m.majorID
		FROM studentTitleResult str,teacherGreDesignTitle togdt,t_teacher_base_info t,t_student_base_info s,
			t_class_base_info c,t_major_base_info m,t_college_base_info coll
		WHERE str.studentID=s.studentID AND str.teacherTitleID=togdt.teacherTitleID AND togdt.teacherId=t.teacherID
			AND s.classID=c.classID AND c.majorID=m.majorID AND m.collegeID=coll.collegeId);


ALTER TABLE `jwxt`.`outsidegradesignagreemen`     CHANGE `agreementID` `agreementID` VARCHAR(40) NOT NULL;


CREATE TABLE outGraDesignSureBook
(
   sureID               VARCHAR(40) NOT NULL,
   outsideApplyID       VARCHAR(40),
   sureName             VARCHAR(40),
   studentSignUrl       VARCHAR(40),
   signTime             DATETIME,
   sureStatus           VARCHAR(10),
   remark               VARCHAR(40),
   PRIMARY KEY (sureID)
);
