CREATE TABLE IF NOT EXISTS `t_case` (
    `id` bigint auto_increment primary key,
    `t_project_id` bigint not null comment '关联的项目',
    `name` varchar(20) not null comment '用例名称',
    `owner` varchar(20) not null  comment '维护人',
    `desc` varchar(200) comment '描述',
    `create_date` datetime not null comment '创建时间',
    `update_date` datetime not null comment '更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `t_case_browser` (
    `id` bigint auto_increment primary key,
    `t_project_id` bigint not null comment '关联的项目',
    `t_browser_id` bigint not null comment '浏览器',
    `t_case_id` bigint not null comment '测试用例'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `t_case_param` (
    `id` bigint auto_increment primary key,
    `t_project_id` bigint not null comment '关联的项目',
    `t_case_id` bigint not null comment '管理的测试用例',
    `key` varchar(20) not null comment '变量的 key',
    `val` varchar(250) not null comment '变量对应的值',
    `create_date` datetime not null comment '创建时间',
    `update_date` datetime not null comment '更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `t_case_step` (
    `id` bigint auto_increment primary key,
    `t_project_id` bigint not null comment '关联的项目',
    `t_case_id` bigint not null comment '管理的测试用例',
    `action` varchar(20) not null comment '动作',
    `selector` varchar(20) comment '选择器名称，有 xpath ,cssSelector, id...',
    `element` varchar(250) comment '元素名称',
    `value` varchar(200) comment '传值'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;