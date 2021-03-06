DROP TABLE IF EXISTS userq;

CREATE TABLE userq
(
	id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
	version INT(8) NULL COMMENT '版本',
	PRIMARY KEY (id)
);
