


create database QLSV
go
use QLSV
CREATE TABLE loginfrom (
  usename varchar(150)  primary key,
  password varchar(150) ,
  role varchar(150) 
) 
--login
INSERT INTO loginfrom VALUES ('qlsv', '1', 'adminqlsv')
INSERT INTO loginfrom VALUES ('qld', '1', 'adminqld')




---- quan ly sinh vien
CREATE TABLE sinhvien (

MaSV varchar(150) primary key,
HoTen varchar(150),
Email varchar(150),
SDT nvarchar(11),
GioTinh varchar(150) ,
DiaChi varchar(250) ,
HinhAnh image 
)


------

insert into sinhvien values('PH05318','LE THANH HIEN','hienlt@fpt.edu.vn','02847229381','Nam','Nhatrang','null')
insert into sinhvien values('PH05319','DO THI XUAN','xuandt@fpt.edu.vn','938479993','Nu','Hanoi','null')
insert into sinhvien values('PH05320','LE THANH TUAN','tuanlt@fpt.edu.vn','55304993821','Nam','nhatrang','null')
insert into sinhvien values('PH05321','LE THANH TU','tult@fpt.edu.vn','85937449204','Nu','Tay nguyen','null')
insert into sinhvien values('PH05322','CAO THAI SON','sonct@fpt.edu.vn','4829382732','Nam','Ho chi minh','null')

----bang diem
create table grade
(
ID int primary key,
MaSV varchar(150),
HoTenSV varchar(150),
Tienganh nvarchar(5),
Tinhoc nvarchar(5) ,
GDTC nvarchar(5),
DiemTB nvarchar(5) 
CONSTRAINT PK_grade_sinhvien FOREIGN KEY(MaSV) REFERENCES sinhvien(MaSV),
)
go
--
-- Dumping data for table `grade`
--

INSERT INTO grade VALUES(1, 'PH05318', 'LE THANH HIEN', 9, 9, 10, 9)
INSERT INTO grade VALUES(2, 'PH05319', 'DO THI XUAN', 10, 10, 10, 10)
INSERT INTO grade VALUES(3, 'PH05320', 'LE THANH TUAN', 8.5, 10, 10, 9.5)
INSERT INTO grade VALUES(4, 'PH05321', 'LE THANH TU', 10, 10, 10, 5)
INSERT INTO grade VALUES(5, 'PH05321', 'CAO THAI SON', 10, 10, 10, 5)

