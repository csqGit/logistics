-- 创建管理员表
drop database if EXISTS hqbzc
create database hqbzc;
use hqbzc;
create table admin(
	id int primary key auto_increment,
	admin_name varchar(30),
	admin_id varchar(30),
	admin_university varchar(30)
);

-- 创建新闻表

drop table if exists newInfo;
create table newInfo (
	id int primary key auto_increment,
	title varchar(30),
	type varchar (30),
	time varchar(30),
	admin_id int
);

--食堂投诉表
drop table if EXISTS canteen_ts_tb;
create table canteen_ts_tb(
	id int PRIMARY KEY auto_increment,
	ts_canteen_number VARCHAR(255) default NULL COMMENT '几号食堂',
	ts_tower_number VARCHAR (255) DEFAULT NULL COMMENT '几楼',
	ts_window_number VARCHAR (255) DEFAULT NULL COMMENT '几号窗口',
	ts_reason VARCHAR (255) DEFAULT NULL COMMENT '投诉原因',
	ts_time VARCHAR (255) default null COMMENT '投诉时间',
	remark VARCHAR (255) DEFAULT NULL COMMENT '备注'
);