create database xiguanquan;
use xiguanquan;
create table users -- 用户
(
Usernid int(10) primary key  auto_increment,
UserName varchar(20) ,
upassword varchar(10),
Nickname varchar(20),
Occupation varchar(20)
);
create table acircle(  -- 用户关注的圈子
aid int(10)primary key auto_increment,
circleid int(10),
Usernid int(8),
ctitle char(100)
);
create table trend -- 动态
(
trendid int(10)primary key  auto_increment,
Usernid int(10),
tword varchar(200),
tpic_data varchar(100),
trelease_time date,
tlikes int,
tcomments char(200)
);
create table circle -- 圈子
(
circleid int(10)primary key  auto_increment,
ctitle varchar(100),
creatorid int(10),
cword varchar(200),
cpic_data varchar(100),
crelease_time date,
clikes int,
ccomments char(200)
);
create table habit -- 习惯
(
habitid int(10)primary key auto_increment,
Usernid int(10),
hname char(100),
hclockinnum int
);