create database SistemParkir;

use SistemParkir;

create table kendaraan(
id_kendaraan int IDENTITY(1,1) PRIMARY KEY,
plat_nomor varchar(150),
jenis varchar(150),
wkt_tanggal datetime,
wkt_keluar datetime,
biaya int
);
ALTER TABLE kendaraan ADD CONSTRAINT DF_kendaraan DEFAULT GETDATE() FOR wkt_tanggal
drop table kendaraan;
select * from kendaraan
insert into kendaraan (plat_nomor,jenis) values ('B6543','motor')

create table jenis_kendaraan(
id_jenis int IDENTITY(1,1) PRIMARY KEY,
nama_jenis varchar(50),
keterangan text
);

create table administrator(
id_admin int IDENTITY(1,1) PRIMARY KEY,
nama varchar(150),
username varchar(150),
password varchar(150),
jenis_kelamin varchar(50),
tgl_lahir date
);
drop table administrator

create table trouble(
id_customer int,
jenis_masalah varchar(150),
tgl datetime,
denda int,
CONSTRAINT PK_Person PRIMARY KEY (id_customer,tgl)
);
ALTER TABLE trouble ADD CONSTRAINT DF_Masalah DEFAULT GETDATE() FOR tgl

select * from trouble;
drop table trouble;

create table customer(
id_customer int IDENTITY(1,1) PRIMARY KEY,
customer_name varchar(150),
tgl_lahir varchar(150),
jk varchar(150),
jenis_identitas varchar(150),
no_identitas varchar(150),
alamat text,
phoneno varchar(20)
);
select * from customer
drop table customer;

ALTER TABLE kendaraan
ADD CONSTRAINT FK_jenis
FOREIGN KEY (id_jenis) REFERENCES jenis_kendaraan(id_jenis);

ALTER TABLE trouble
ADD CONSTRAINT FK_customer
FOREIGN KEY (id_customer) REFERENCES customer(id_customer);

select * from customer;