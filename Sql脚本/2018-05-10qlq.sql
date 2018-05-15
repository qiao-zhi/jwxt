/**
增加了个日志表
 */
DROP TABLE IF EXISTS logtable;

/*==============================================================*/
/* Table: logtable                                              */
/*==============================================================*/
CREATE TABLE logtable
(
   logid                INT NOT NULL AUTO_INCREMENT,
   operatorName         VARCHAR(5),
   operateDescription   VARCHAR(100),
   operateResult        VARCHAR(2),
   operateClass         VARCHAR(50),
   operatorId           VARCHAR(30),
   operateMethod        VARCHAR(50),
   remark               VARCHAR(20),
   PRIMARY KEY (logid)
);

ALTER TABLE logtable COMMENT '用于记录系统的日志信息(谁对系统做了哪些操作)';
