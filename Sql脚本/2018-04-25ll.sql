/*==============================================================*/
/* 修改排课的相关表结构*/
/*==============================================================*/

/*==============================================================*/
/* 删除旧的排课表*/
/*==============================================================*/
drop table if exists courseArrangeCheckInfo;
drop table if exists teacherCourseInfo;
drop table if exists CourseArrangementBaseInfo;
drop table if exists courseArrangeInfo2;
ALTER TABLE `textbook_order2` DROP FOREIGN KEY `FK_Reference_101`;
drop table if exists noticeDetailInfo;
drop table if exists noticeInfo;



drop table if exists ap_arrange_course_audit;

drop table if exists ap_arrange_course_task;

drop table if exists ap_class_teacher;

drop table if exists ap_task_arrange_course;

drop table if exists ap_task_notice_base_info;

drop table if exists ap_task_notice_detail_info;

drop table if exists ap_teacher_course;

/*==============================================================*/
/* Table: ap_arrange_course_audit                               */
/*==============================================================*/
create table ap_arrange_course_audit
(
   audit_id             varchar(40) not null,
   arrange_task_id      varchar(40),
   auditor_name         varchar(20),
   auditor_id           varchar(40),
   audit_time           datetime,
   audit_suggestion     varchar(200),
   audit_result         char(2) comment '0不通过；1通过',
   remark               varchar(20),
   primary key (audit_id)
);

/*==============================================================*/
/* Table: ap_arrange_course_task                                */
/*==============================================================*/
create table ap_arrange_course_task
(
   arrange_task_id      varchar(40) not null,
   notice_book_id       varchar(40),
   notice_book_name     varchar(100),
   major_name           varchar(20),
   major_id             varchar(40),
   academic_year        varchar(20),
   term                 char(2) comment '1 第一学期；2第二学期',
   originator_name      varchar(20),
   originator_id        varchar(40),
   task_create_time     datetime,
   task_receipt_time    datetime,
   task_receipt_name    varchar(20),
   task_receipt_id      varchar(40),
   task_status          char(5) comment '1未分配； 2未发送； 3未接收； 4待排课； 5待审核； 6通过审核； 7不通过审核	',
   is_delete            char(2) comment '0 删除；1未删除',
   remark               varchar(20),
   primary key (arrange_task_id)
);

/*==============================================================*/
/* Table: ap_class_teacher                                      */
/*==============================================================*/
create table ap_class_teacher
(
   class_teacher_id     varchar(40) not null,
   teacher_course_id    varchar(40),
   class_name           varchar(40),
   class_size           int,
   remark               varchar(20),
   primary key (class_teacher_id)
);

/*==============================================================*/
/* Table: ap_task_arrange_course                                */
/*==============================================================*/
create table ap_task_arrange_course
(
   arrange_course_id    varchar(40) not null,
   arrange_task_id      varchar(40),
   course_name          varchar(20),
   course_code          varchar(20),
   major_name           varchar(50),
   class_name           varchar(500),
   major_students_number int,
   total_period         int,
   campus_code          char(2),
   is_use_multimedia    char(2) comment '0不使用;1使用',
   remark               varchar(20),
   primary key (arrange_course_id)
);

/*==============================================================*/
/* Table: ap_task_notice_base_info                              */
/*==============================================================*/
create table ap_task_notice_base_info
(
   notice_book_id       varchar(40) not null,
   notice_book_name     varchar(100),
   academic_year        varchar(10),
   term                 char(2),
   academic_id          varchar(40),
   academic_name        varchar(20),
   creater_name         varchar(20),
   creater_id           varchar(40),
   create_time          datetime,
   is_input             char(2) comment '0 未导入；1导入',
   is_delete            varchar(2) comment '0 删除 ；1 未删除',
   remark               varchar(20),
   primary key (notice_book_id)
);

/*==============================================================*/
/* Table: ap_task_notice_detail_info                            */
/*==============================================================*/
create table ap_task_notice_detail_info
(
   notice_detail_id     int not null,
   notice_book_id       varchar(40),
   datail_sort          varchar(3),
   course_code          varchar(20),
   course_name          varchar(20),
   teach_plan_num       varchar(20),
   major_name           varchar(20) comment '1主校区；2华科校区；3晋城校区',
   campus_code          varchar(20),
   class_name           varchar(20),
   class_student_num    int,
   grade                varchar(10),
   major_students_number int,
   test_method          varchar(10),
   week_period          varchar(10),
   total_period         varchar(10),
   start_stop_week      varchar(10),
   contact_time         varchar(10),
   experimental_time    varchar(10),
   course_character     varchar(10),
   remark               varchar(20),
   primary key (notice_detail_id)
);

/*==============================================================*/
/* Table: ap_teacher_course                                     */
/*==============================================================*/
create table ap_teacher_course
(
   teacher_course_id    varchar(40) not null,
   arrange_course_id    varchar(40),
   academic_year        varchar(20),
   term                 char(2) comment '1 第一学期；2第二学期',
   course_code          varchar(20),
   teacher_id           varchar(40),
   teacher_number       varchar(40),
   teacher_name         varchar(20),
   remark               varchar(20),
   primary key (teacher_course_id)
);

alter table ap_arrange_course_audit add constraint FK_Reference_108 foreign key (arrange_task_id)
      references ap_arrange_course_task (arrange_task_id) on delete restrict on update restrict;

alter table ap_arrange_course_task add constraint FK_Reference_99 foreign key (notice_book_id)
      references ap_task_notice_base_info (notice_book_id) on delete restrict on update restrict;

alter table ap_class_teacher add constraint FK_Reference_107 foreign key (teacher_course_id)
      references ap_teacher_course (teacher_course_id) on delete restrict on update restrict;

alter table ap_task_arrange_course add constraint FK_Reference_105 foreign key (arrange_task_id)
      references ap_arrange_course_task (arrange_task_id) on delete restrict on update restrict;

alter table ap_task_notice_detail_info add constraint FK_Reference_98 foreign key (notice_book_id)
      references ap_task_notice_base_info (notice_book_id) on delete restrict on update restrict;

alter table ap_teacher_course add constraint FK_Reference_106 foreign key (arrange_course_id)
      references ap_task_arrange_course (arrange_course_id) on delete restrict on update restrict;

