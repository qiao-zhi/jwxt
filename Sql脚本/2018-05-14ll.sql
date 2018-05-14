/*分配课程来源视图*/
CREATE ALGORITHM = UNDEFINED DEFINER = `root`@`localhost` SQL SECURITY DEFINER VIEW `distribute_course_source` AS SELECT
	`ap_task_notice_detail_info`.`notice_book_id` AS `notice_book_id`,
	`ap_task_notice_detail_info`.`course_code` AS `course_code`,
	`ap_task_notice_detail_info`.`course_name` AS `course_name`,
	`ap_task_notice_detail_info`.`teach_plan_num` AS `teach_plan_num`,
	`ap_task_notice_detail_info`.`major_name` AS `major_name`,
	`ap_task_notice_detail_info`.`campus_code` AS `campus_code`,
	group_concat(
		`ap_task_notice_detail_info`.`class_name`
		ORDER BY
			`ap_task_notice_detail_info`.`class_name` ASC SEPARATOR ','
	) AS `class_name`,
	`ap_task_notice_detail_info`.`grade` AS `grade`,
	`ap_task_notice_detail_info`.`major_students_number` AS `major_students_number`,
	`ap_task_notice_detail_info`.`test_method` AS `test_method`,
	`ap_task_notice_detail_info`.`week_period` AS `week_period`,
	`ap_task_notice_detail_info`.`total_period` AS `total_period`,
	`ap_task_notice_detail_info`.`start_stop_week` AS `start_stop_week`,
	`ap_task_notice_detail_info`.`contact_time` AS `contact_time`,
	`ap_task_notice_detail_info`.`experimental_time` AS `experimental_time`,
	`ap_task_notice_detail_info`.`course_character` AS `course_character`
FROM
	`ap_task_notice_detail_info`
GROUP BY
	`ap_task_notice_detail_info`.`notice_book_id`,
	`ap_task_notice_detail_info`.`major_name`,
	`ap_task_notice_detail_info`.`course_code`
ORDER BY
	CONVERT (`ap_task_notice_detail_info`.`major_name` USING gbk),
	`ap_task_notice_detail_info`.`grade`