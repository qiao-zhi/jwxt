/*修改校外毕设申请表增加学年字段*/
ALTER TABLE `jwxt`.`outgradesigninfo`     ADD COLUMN `stadyyear` VARCHAR(10) NULL AFTER `StudentTitleresultID`;