create database SistemParkir;

use SistemParkir;

drop table kendaraan;

create table kendaraan(
id_kendaraan int IDENTITY(1,1) PRIMARY KEY,
plat_nomor varchar(150),
jenis varchar(150),
wkt_tanggal datetime,
wkt_keluar datetime,
tgl date,
biaya int,
status varchar(150)
);


ALTER TABLE kendaraan ADD CONSTRAINT DF_kendaraan22 DEFAULT GETDATE() FOR wkt_tanggal
ALTER TABLE kendaraan ADD CONSTRAINT DF_kendaraan2233 DEFAULT GETDATE() FOR tgl
ALTER TABLE kendaraan ADD CONSTRAINT DF_kendaraan222 DEFAULT 'masuk' FOR status
alter table kendaraan drop constraint df_kendaraan2
drop table kendaraan;
select * from kendaraan;
select jenis,SUM(biaya) as biaya from kendaraan where tgl = '2017-03-31' and status = 'keluar' group by jenis;
select * from administrator;
update kendaraan set wkt_keluar = GETDATE() where id_kendaraan = '1'
select wkt_tanggal,wkt_keluar,DATEDIFF(HOUR,wkt_tanggal,wkt_keluar) as Beda from kendaraan where plat_nomor = 'B74623BRN' and status = 'masuk'
update kendaraan set status = 'keluar' where id_kendaraan = '2';
insert into kendaraan (plat_nomor,jenis) values ('B6543','motor')

create trigger tr_biaya on dbo.kendaraan
after update
as
declare @waktu int
declare @hasil int
declare @idkendaraan int
declare @jenis text
Begin
select @idkendaraan = id_kendaraan from inserted
select @jenis = jenis from inserted
select @waktu = DATEDIFF(HOUR,wkt_tanggal,wkt_keluar) where id_kendaraan = @idkendaraan from inserted
if(@jenis = 'motor')
@hasil = @waktu * 2000
Update kendaraan set biaya = @hasil, status = 'keluar' where id_kendaraan = @idkendaraan
else
if(@jenis = 'mobil')
@hasil = @waktu * 4000
Update kendaraan set biaya = @hasil, status = 'keluar' where id_kendaraan = @idkendaraan
end

alter table dbo.kendaraan drop trigger trg_biaya

create trigger trg_biaya on [dbo].[kendaraan]
after update
as
	declare @hasil int
	declare @waktu int
	declare @jenis varchar(150)
	declare @idkendaraan int
	declare @menambahkan int
	
	select @idkendaraan = kendaraan.id_kendaraan from inserted kendaraan
	select @jenis = kendaraan.jenis from inserted kendaraan;
	select @waktu = DATEDIFF(HOUR,wkt_tanggal,wkt_keluar) from kendaraan where id_kendaraan = @idkendaraan;
	
	if(@jenis = 'motor')
		update kendaraan set biaya = @waktu * 2000, status = 'keluar' where id_kendaraan = @idkendaraan;
	if(@jenis = 'mobil')
		update kendaraan set biaya = @waktu * 4000, status = 'keluar' where id_kendaraan = @idkendaraan
	if(@waktu = 0)
		update kendaraan set biaya = 2000, status = 'keluar' where id_kendaraan = @idkendaraan;
	--	if(@jenis = 'mobil')
	--		update kendaraan set biaya = 4000, status = 'keluar' where id_kendaraan = @idkendaraan
	print 'BERHASIL'
go

use SistemParkir
select * from kendaraan	
select TOP 1 biaya from kendaraan where plat_nomor = 'bb12'
insert into kendaraan (plat_nomor, wkt_tanggal) values ('b123',GETDATE());
update kendaraan set jenis = 'mobil' where id_kendaraan = '10'
update kendaraan set wkt_keluar = GETDATE() where id_kendaraan = '11'
update kendaraan set biaya = null where id_kendaraan = '3'


create table jenis_kendaraan(
id_jenis int IDENTITY(1,1) PRIMARY KEY,
nama_jenis varchar(50),
keterangan text
);
use SistemParkir;

select * from kendaraan where wkt_tanggal = '2017-03-29'

create table administrator(
id_admin int IDENTITY(1,1) PRIMARY KEY,
nama varchar(150),
username varchar(150),
password varchar(150),
jenis_kelamin varchar(50),
tgl_lahir date,
status varchar(50)
);

create table superadmin(
id_admin int IDENTITY(1,1) PRIMARY KEY,
nama varchar(150),
username varchar(150),
password varchar(150),
);

ALTER TABLE administrator ADD CONSTRAINT DF_admin DEFAULT 'aktif' FOR status
select * from superadmin
insert into superadmin (nama,username,password)  values('Super Admin','superadmin','654321');
insert into administrator (nama,username,password,jenis_kelamin,tgl_lahir) values('Admin','admin','123456','Pria','1998-01-01');
drop table administrator

create table trouble(
id_customer int,
jenis_masalah varchar(150),
tgl datetime,
keterangan text,
denda int,
CONSTRAINT PK_Person PRIMARY KEY (id_customer,tgl)
);


ALTER TABLE trouble ADD CONSTRAINT DF_Masalah DEFAULT GETDATE() FOR tgl
update trouble set denda = '50000' where id_customer = '3'
select * from trouble order by tgl desc;
drop table trouble;

create table customer(
id_customer int IDENTITY(1,1) PRIMARY KEY,
customer_name varchar(150),
tgl_lahir date,
jk varchar(150),
jenis_identitas varchar(150),
no_identitas varchar(150),
alamat text,
phoneno varchar(20)
);
use SistemParkir;
select * from customer
drop table customer;

ALTER TABLE kendaraan
ADD CONSTRAINT FK_jenis
FOREIGN KEY (id_jenis) REFERENCES jenis_kendaraan(id_jenis);

ALTER TABLE trouble
ADD CONSTRAINT FK_customer
FOREIGN KEY (id_customer) REFERENCES customer(id_customer);

select * from customer where id_customer ='3';
update trouble set denda = '50000' where id_customer ='1';
select b.customer_name,a.jenis_masalah,a.tgl,a.keterangan,a.denda from trouble a inner join customer b on a.id_customer = b.id_customer order by a.tgl desc

select b.customer_name,a.jenis_masalah,a.tgl,a.keterangan,a.denda from trouble a inner join customer b on a.id_customer = b.id_customer where b.customer_name like '%d%' order by a.tgl desc