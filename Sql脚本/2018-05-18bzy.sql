/*添加任务书和相应的审核表*/
DROP TABLE IF EXISTS outGraduateAssignment;

CREATE TABLE outGraduateAssignment
(
   assignmentID         VARCHAR(40) NOT NULL,
   outsideApplyID       VARCHAR(40),
   sameGroup            VARCHAR(40),
   startTime            DATETIME,
   endTime              DATETIME,
   title                VARCHAR(40),
   request              VARCHAR(300),
   content              VARCHAR(300),
   submitFile           VARCHAR(40),
   studentsign          VARCHAR(40),
   isok                 VARCHAR(4),
   checkstatus          VARCHAR(4),
   remark1              VARCHAR(40),
   PRIMARY KEY (assignmentID)
);
DROP TABLE IF EXISTS checkAssignment;

/*==============================================================*/
/* Table: checkAssignment                                       */
/*==============================================================*/
CREATE TABLE checkAssignment
(
   check_id             VARCHAR(40) NOT NULL,
   assignmentID         VARCHAR(40),
   checkPeople          VARCHAR(20),
   teacherSign          VARCHAR(40),
   remark               VARCHAR(20),
   PRIMARY KEY (check_id)
);
ALTER TABLE `jwxt`.`outgraduateassignment`     ADD COLUMN `tableName` VARCHAR(40) NULL AFTER `outsideApplyID`;
