/*对自我管理协议书增加学院名称和学生身份证号*/
ALTER TABLE `jwxt`.`outsidegradesignagreemen`     ADD COLUMN `collegeName` VARCHAR(40) NULL AFTER `agreementName`,     ADD COLUMN `studentIdCard` VARCHAR(20) NULL AFTER `collegeName`;
/*对附件信息表进行修改，增加附件内容信息表*/
DROP TABLE IF EXISTS outattachmentcontent;

/*==============================================================*/
/* Table: attachmentcontent                                     */
/*==============================================================*/
CREATE TABLE outattachmentcontent
(
   contentID            VARCHAR(40) NOT NULL,
   attachmentID         VARCHAR(40),
   contentNum           VARCHAR(40),
   contentURL           VARCHAR(40),
   remark               VARCHAR(40),
   PRIMARY KEY (contentID)
);
ALTER TABLE `jwxt`.`outsidegradesignattachment` DROP COLUMN `attachmentOldName`, DROP COLUMN `newName`, DROP COLUMN `attachmentAddr`;
ALTER TABLE `jwxt`.`outsidegradesignattachment`     ADD COLUMN `iscommit` VARCHAR(10) NULL AFTER `uploadDate`,    CHANGE `remark` `remark` VARCHAR(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL ;
ALTER TABLE `jwxt`.`outgradesignsurebook`     CHANGE `sureStatus` `iscommit` VARCHAR(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL ;