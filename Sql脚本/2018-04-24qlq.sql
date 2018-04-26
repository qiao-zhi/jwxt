/**
修改培养方案课程类别表，增加培养方案编号
 */
ALTER TABLE `jwxt`.`coursetypeinfo`     ADD COLUMN `trainingSchemeID` VARCHAR(40) NULL COMMENT '培养方案编号' AFTER `typeName`;


/**
删除能力表的外键约束
 */
ALTER TABLE `jwxt`.`coursecapacityrequireinfo` DROP FOREIGN KEY  `FK_Reference_93` ;
ALTER TABLE `jwxt`.`coursecapacityrequireinfo` DROP FOREIGN KEY  `FK_Reference_92` ;
ALTER TABLE `jwxt`.`coursecapacityrequireinfo` DROP FOREIGN KEY  `FK_Reference_43` ;


/**
将课程编号外键改为关联培养方案课程
 */
 ALTER TABLE `jwxt`.`coursecapacityrequireinfo`     CHANGE `courseID` `trainCourseID` INT NULL ;


