-- noinspection SqlNoDataSourceInspectionForFile

DROP TABLE IF EXISTS userq;

CREATE TABLE userq
(
  id      BIGINT (20) NOT NULL COMMENT '主键ID',
  name    VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
  age     INT (11) NULL DEFAULT NULL COMMENT '年龄',
  email   VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
  operator VARCHAR(30) NULL DEFAULT NULL COMMENT '操作员',
  PRIMARY KEY (id)
);
