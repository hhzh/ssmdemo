-- 切换到test数据库
use test;

create table `user` (
	`id` int ,
	`name` varchar (60),
	`age` int
);

insert into `user` (`id`, `name`, `age`) values(1,'John',18);
insert into `user` (`id`, `name`, `age`) values(2,'Sandy',25);
insert into `user` (`id`, `name`, `age`) values(3,'Scott',16);
insert into `user` (`id`, `name`, `age`) values(4,'Tony',33);