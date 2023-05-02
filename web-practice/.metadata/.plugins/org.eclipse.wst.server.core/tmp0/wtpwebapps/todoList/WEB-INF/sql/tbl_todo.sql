CREATE TABLE `tbl_todo` (
  `tno` int NOT NULL AUTO_INCREMENT,
  `todo` varchar(100)  NOT NULL,
  `duedate` date DEFAULT (curdate()),
  `finished` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`tno`)
);

-- DML insert
INSERT INTO project.tbl_todo
(todo, duedate)
VALUES
('JSP 공부', '2023-05-05');

-- DML update
update tbl_todo 
set todo = '청소', duedate = '2023-05-03'
where tno = 2; 

