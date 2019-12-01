create database xiguanquan;
use xiguanquan;
create table users -- 用户
(
Usernid char(8) primary key,
UserName char(20) ,
Nickname char(20),
Occupation char(20),
care_userid char(8),
care_circleid char(10)
);
create table trend -- 动态
(
trendid char(10)primary key,
Usernid char(8),
t_word char(200),
t_pic_data mediumblob,
t_release_time date,
t_likes int,
t_comments char(200)
);
create table circle -- 圈子
(
circleid char(10)primary key,
Usernid char(8),
c_word char(200),
c_pic_data mediumblob,
c_release_time date,
c_likes int,
c_comments char(200)
);
create table habit -- 习惯
(
habitid char(10)primary key,
Usernid char(8),
h_name char(100),
h_clockinnum int
);