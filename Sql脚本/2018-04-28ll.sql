/* 修改教学任务通知书基本信息表学年字段的长度*/
ALTER TABLE `ap_task_notice_base_info`
MODIFY COLUMN `academic_year`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL AFTER `notice_book_name`;

