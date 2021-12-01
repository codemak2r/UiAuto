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
    `value` varchar(200) comment '传值',
    `desc` varchar(250) comment '步骤描述'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `aot`.`t_case`(`id`, `t_project_id`, `t_browser_id`, `name`, `owner`, `desc`, `create_date`, `update_date`) VALUES (1, 1, 2, 'baidu测试', 'jackson', 'xx', '2021-12-01 11:33:38', '2021-12-01 11:33:40');
INSERT INTO `aot`.`t_case_step`(`id`, `t_project_id`, `t_case_id`, `action`, `selector`, `element`, `value`, `desc`) VALUES (1, 1, 1, 'open', NULL, NULL, 'https://www.baidu.com', '打开百度');
INSERT INTO `aot`.`t_case_step`(`id`, `t_project_id`, `t_case_id`, `action`, `selector`, `element`, `value`, `desc`) VALUES (2, 1, 1, 'click', 'xpath', '//*[@id=\"s-top-left\"]/a[1]', NULL, '点击新闻');
INSERT INTO `aot`.`t_case_step`(`id`, `t_project_id`, `t_case_id`, `action`, `selector`, `element`, `value`, `desc`) VALUES (3, 1, 1, 'switchNextWindow', NULL, NULL, NULL, '移动到下一个窗口');
INSERT INTO `aot`.`t_case_step`(`id`, `t_project_id`, `t_case_id`, `action`, `selector`, `element`, `value`, `desc`) VALUES (4, 1, 1, 'input', 'id', 'ww', '元宇宙', '输入搜索字符：元宇宙');
INSERT INTO `aot`.`t_case_step`(`id`, `t_project_id`, `t_case_id`, `action`, `selector`, `element`, `value`, `desc`) VALUES (5, 1, 1, 'click', 'id', 's_btn_wr', NULL, '点击查询');
INSERT INTO `aot`.`t_case_step`(`id`, `t_project_id`, `t_case_id`, `action`, `selector`, `element`, `value`, `desc`) VALUES (6, 1, 1, 'sleep', NULL, NULL, '5000', '暂停一会儿');
