-- 논리적 스키마를 만들고 물리적 스키마를 만들어야 함
-- mysql, oracle : 표준-SQL

create table tbl_board(
   idx int not null auto_increment,
   title varchar(100) not null,
   contents varchar(2000) not null,
   count int default 0,
   writer varchar(100) not null,
   indate datetime default now(),
   primary key(idx)
);

insert into tbl_board(title, contents, writer)
values('스프링 게시판', '스프링게시판', '관리자');

insert into tbl_board(title, contents, writer)
values('스프링 게시판', '스프링게시판', '권누리');

select * from tbl_board;



