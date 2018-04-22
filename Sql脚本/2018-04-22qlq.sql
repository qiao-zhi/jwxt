/***
将培养方案的两个表合称一个表
 */

ALTER TABLE `jwxt`.`trainschemeinfo`     ADD COLUMN `trainYears` VARCHAR(5) NULL AFTER `trainingRequire`,     ADD COLUMN `trainDegree` VARCHAR(20) NULL AFTER `trainYears`,     ADD COLUMN `mainCourse` VARCHAR(20) NULL AFTER `trainDegree`,     ADD COLUMN `coreCourse` VARCHAR(300) NULL AFTER `mainCourse`,     ADD COLUMN `mainTestItem` VARCHAR(500) NULL AFTER `coreCourse`,     ADD COLUMN `mainMajorExperience` VARCHAR(500) NULL AFTER `mainTestItem`,     ADD COLUMN `majorfeature` VARCHAR(400) NULL AFTER `mainMajorExperience`;
DROP TABLE `jwxt`.`trainschemeinfo2`;