/*修改了系统管理的一些表*/
drop table if exists logtable;

/*==============================================================*/
/* Table: logtable                                              */
/*==============================================================*/
create table logtable
(
   logid                int not null auto_increment,
   operatorName         varchar(5),
   operatorId           varchar(30),
   operatorType         varchar(5),
   operatorUnitName     varchar(40),
   operateDescription   varchar(100),
   operateResult        varchar(2),
   operateClass         varchar(50),
   operateMethod        varchar(50),
   remark               varchar(20),
   primary key (logid)
);

alter table logtable comment '用于记录系统的日志信息(谁对系统做了哪些操作)';


/*[11:22:53][ 344 ms]*/ ALTER TABLE `jwxt`.`user_role` DROP FOREIGN KEY  `FK_Reference_13` ;
/*[11:22:56][ 266 ms]*/ ALTER TABLE `jwxt`.`user_role` DROP FOREIGN KEY  `FK_Reference_14` ;

DROP TABLE IF EXISTS USER;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
CREATE TABLE USER
(
   userID               VARCHAR(40) NOT NULL,
   userCode             VARCHAR(20),
   userName             VARCHAR(25),
   PASSWORD             VARCHAR(20),
   userSort             VARCHAR(30),
   userStuTeaNum        VARCHAR(50),
   userUnitName         VARCHAR(30),
   userUnitNum          VARCHAR(30),
   isUse                VARCHAR(2),
   remark1              VARCHAR(20),
   PRIMARY KEY (userID)
);


/*[11:24:29][ 344 ms]*/ ALTER TABLE `jwxt`.`rolepermission` DROP FOREIGN KEY  `FK_Reference_68` ;
/*[11:24:32][ 296 ms]*/ ALTER TABLE `jwxt`.`rolepermission` DROP FOREIGN KEY  `FK_Reference_69` ;
DROP TABLE IF EXISTS role;

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
CREATE TABLE role
(
   roleID               VARCHAR(40) NOT NULL,
   roleName             VARCHAR(25),
   roleStatus           VARCHAR(2),
   description          VARCHAR(200),
   InsituteID           VARCHAR(40),
   isUse                VARCHAR(2),
   remark               VARCHAR(40),
   PRIMARY KEY (roleID)
);


