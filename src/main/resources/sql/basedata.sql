CREATE TABLE IF NOT EXISTS `t_project` (
    `id` bigint auto_increment primary key,
    `name` varchar(20) not null comment '项目名称',
    `owner` varchar(20) not null  comment '维护人',
    `desc` varchar(200) comment '描述',
    `create_date` datetime not null comment '创建时间',
    `update_date` datetime not null comment '更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `t_project` values(1, 'Custom Service', 'jackson', 'custom service',  '2021-11-29 16:49:01', '2021-11-29 16:49:01');
insert into `t_project` values(2, 'Restaurant', 'jackson', 'restaurant','2021-11-29 16:49:01', '2021-11-29 16:49:01');
insert into `t_project` values(3, 'Recipe System', 'jackson','recipe system', '2021-11-29 16:49:01', '2021-11-29 16:49:01');
insert into `t_project` values(4, 'Truck Session', 'jackson','truck session', '2021-11-29 16:49:01', '2021-11-29 16:49:01');

CREATE TABLE IF NOT EXISTS `t_environment` (
    `id` bigint auto_increment primary key,
    `name` varchar(20) not null comment '环境名称',
    `t_project_id` bigint not null comment '管理的项目',
    `owner` varchar(20) comment '维护人',
    `desc` varchar(200) comment '描述',
    `create_date` datetime comment '创建时间',
    `update_date` datetime comment '更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `t_params` (
    `id` bigint auto_increment primary key,
    `t_env_id` bigint not null comment '关联的环境',
    `t_project_id` bigint not null comment '管理的项目',
    `key` varchar(20) not null comment '变量的 key',
    `val` varchar(250) not null comment '变量对应的值',
    `create_date` datetime comment '创建时间',
    `update_date` datetime comment '更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into `t_environment` values(1, 'qa', 'jackson', '环境变量','2021-11-29 16:49:01', '2021-11-29 16:49:01');
insert into `t_environment` values(2, 'uat', 'jackson', '环境变量','2021-11-29 16:49:01', '2021-11-29 16:49:01');
insert into `t_environment` values(3, 'staging', 'jackson', '环境变量','2021-11-29 16:49:01', '2021-11-29 16:49:01');

insert into `t_params` values(1,1, 'env', 'qa','2021-11-29 16:49:01', '2021-11-29 16:49:01');
insert into `t_params` values(2,2, 'env', 'uat','2021-11-29 16:49:01', '2021-11-29 16:49:01');
insert into `t_params` values(3,3, 'env', 'staging','2021-11-29 16:49:01', '2021-11-29 16:49:01');


CREATE TABLE IF NOT EXISTS `t_browser` (
    `id` bigint auto_increment primary key,
    `t_project_id` bigint not null comment '项目',
    `remote_url` varchar(200) not null comment '远程driver 地址',
    `browser_name`  varchar(20) not null comment '浏览器名称',
    `browser_version` varchar(20) not null  comment '浏览器版本',
    `platform` varchar(20) comment '平台',
    `create_date` datetime comment '创建时间',
    `update_date` datetime comment '更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `t_browser` values (1, 1, 'http://127.0.0.1:4444', 'chrome', '95.0.4638.69', 'windows', '2021-11-29 16:49:01', '2021-11-29 16:49:01');