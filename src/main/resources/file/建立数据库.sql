create table sm_applist(
	id int identity,
	app_id varchar(5),
	app_name varchar(100),
	app_describ varchar(255),
	app_owner varchar(20),
	owner_email varchar(50),
	app_maintenance varchar(20),
	maintenance_email varchar(50),
	app_url1 varchar(255),
	app_url2 varchar(255),
	app_url3 varchar(255),
	is_deleted char(1),
	create_time char(19),
	update_time char(19),
	chk char(5)
)


select * from sm_applist
--DROP TABLE sm_applist


insert into sm_applist values('10729','CDR-AV','��ҵ�ͻ���Ϣ���й���ϵͳ-AVCRM-UAT','leo luo','xian.luo1@metlife.com','George Chan','george.chan@metlife.com','http://10.164.25.102:8080/login.html','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');
insert into sm_applist values('10729','CDR-AV','��ҵ�ͻ���Ϣ���й���ϵͳ-AVCRM-PROD','leo luo','xian.luo1@metlife.com','George Chan','george.chan@metlife.com','http://avcrm.metlife.cn/login.html','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');
insert into sm_applist values('10729','CDR-AV','��ҵ�ͻ���Ϣ���й���ϵͳ-CDR-UAT','leo luo','xian.luo1@metlife.com','George Chan','george.chan@metlife.com','http://10.164.25.132:8888/GPWebServiceES','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');
insert into sm_applist values('10729','CDR-AV','��ҵ�ͻ���Ϣ���й���ϵͳ-CDR-PROD','leo luo','xian.luo1@metlife.com','George Chan','george.chan@metlife.com','http://10.164.3.109/GPWebServiceEB','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');

insert into sm_applist values('7373','CIRC Report','������ϱ�ƽ̨','Tie haibo','haibo.tie@metlife.com','Kevin Li','kevin.li@metlife.com','http://circ-new.metlife.cn','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');
insert into sm_applist values('7373','CIRC Report','������ϱ�ƽ̨-UAT','Tie haibo','haibo.tie@metlife.com','Kevin Li','kevin.li@metlife.com','http://circ.trspt.metlife.com.cn','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');

insert into sm_applist values('11360','Email Management System','���ӱ����ʼ����ͺ͹���ϵͳ-UAT','Feng Yu','yu.feng@metlife.com','George Chan','george.chan@metlife.com','http://email-a-uat.metlifechina.local/mlemail/client/MailManagementFlex.html','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');
insert into sm_applist values('11360','Email Management System','���ӱ����ʼ����ͺ͹���ϵͳ-PROD','Feng Yu','yu.feng@metlife.com','George Chan','george.chan@metlife.com','http://email-a.metlifechina.local:8080/mlemail/client/MailManagementFlex.html','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');

--insert into sm_applist values('10779','Printing','���ӱ����ʼ����ͺ͹���ϵͳ-PROD','Jiang Wei','wei.jiang@metlife.com','Cao Chen','chen.cao@metlife.com','http://','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');
insert into sm_applist values('10778','FileNet','Ӱ��洢ƽ̨','Leo luo','xian.luo1@metlife.com','Cao Chen','chen.cao@metlife.com','http://','','','0',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');


--update sm_applist set maintenance_email='george.chan@metlife.com' where id='9'
chen.cao@metlife.com


--drop table sm_applist


create table sm_result(
	id int identity,
	app_id varchar(5),
	app_name varchar(100),
	app_owner varchar(20),
	app_describ varchar(255),
	status varchar(10),
	result varchar(255),
	create_time char(19),
	chk char(5)
)

select * from sm_result order by create_time desc

insert into sm_result values('','','','','','','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
--drop table sm_result

create table sm_config(
	id int identity,
	type varchar(20),
	ckey varchar(20),
	cval1 varchar(50),
	cval2 varchar(50),
	cval3 varchar(50),
	cval4 text,
	create_time char(19),
	chk char(5)
)

select * from sm_config where type='scheduler'
update sm_config set cval4='com.cognizant.ams.scheduler.KaiJiangPLCScheduler' where id ='54'
update sm_config set cval1='0 30 09 9-23 * *'  where id ='53'
--delete from sm_config where id ='52'
--mail.ccUser=george.chan@metlife.com,kevin.li@metlife.com,327052186@qq.com

insert into sm_config values('scheduler','kaijiangplc','0 */10 * * * *','','','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')

insert into sm_config values('email','subjectSuccess','(uat����)AMS������άϵͳ��������','','','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('email','subjectFail','(uat����)AMS��ά��ϵͳ����崻� ��','','','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('email','tail','<p/><p/>AMS��ά�Ŷ�','','','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('email','ccUser','','','','george.chan@metlife.com,kevin.li@metlife.com,327052186@qq.com',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('email','scheduler','0 */60 * * * *','','','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')

insert into sm_config values('scheduler','scheduler','0 30 13 * * *','','','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('sla','INC','1','15','120','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('sla','INC','2','30','180','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('sla','INC','3','60','360','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('sla','INC','4','120','480','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('sla','INC','5','120','480','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')

insert into sm_config values('sla','TASK','1','30','60','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('sla','TASK','2','30','60','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('sla','TASK','3','60','180','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('sla','TASK','4','120','300','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')
insert into sm_config values('sla','TASK','5','120','300','',(select CONVERT(varchar(100), GETDATE(), 120)),'false')


--update sm_config set cval1='0 */60 * * * *' where id =5

select * from sm_config where type='scheduler' 

 
select * from sys_menu

update sys_menu set node_name='APP Portal'where id='10'

SELECT * FROM sys_menu WHERE node_code IN(select node_code from sys_role_menu WHERE role_code IN(select role_code from sys_role WHERE role_name='��֪����ά��'))
select * from sys_role_menu

select * from sys_role
select * from sys_role_menu
select * from sys_user
select * from Organization



create table sm_sn(
	id int identity,
	ticket_no varchar(20),
	app_name varchar(50),
	incident_state varchar(50),
	assign_to varchar(50),
	priority varchar(10),
	caller varchar(50),
	assignment_group varchar(50),
	create_time char(25),
	wip_time varchar(50),
	pending_time char(25),
	resolved_time varchar(20),
	SLA_Flag char(50),
	chk char(5)
)

--drop table sm_sn
select * from sm_sn where incident_state!='Resolved'
delete from sm_sn where id>10


 select * from sm_sn

  select * from sm_config where type='workday' and ckey='holiday' and cval1='2020'


  insert into sys_role values('200','Test',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 


  alter table sys_role alter column chk char(5)




  --4.����͸
create table sm_fun(
	id int identity,
	type varchar(20),
	fkey varchar(10),
	fval1  char(2),
	fval2  char(2),
	fval3  char(2),
	fval4  char(2),
	fval5  char(2),
	fval6  char(2),
	fval7  char(2),
	fval8  varchar(50),
	fval9  varchar(50),
	fval10 text,
	create_time char(25),
	chk char(5)
)
--alter table sm_fun alter column fval10 text
select * from sm_fun WHERE type ='PLC' 

insert into sm_fun values(?,?,?,?,?,?,?,?,?,?,'','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
PLC(String), 20200006(String), 0(String), 3(String), 0(String), "С"(String), null, null, null, SYSTEM(String)


insert into sm_fun values('DLT','20200005','03','07','09','17','21','03','06','','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
insert into sm_fun values('DLT','20200006','01','07','23','24','26','03','07','','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
insert into sm_fun values('DLT','20200007','04','08','19','31','35','01','02','','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
insert into sm_fun values('DLT','20200008','01','06','07','09','10','02','11','','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
insert into sm_fun values('PLC','20200001','01','06','07','��','','','','sys','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
insert into sm_fun values('PLC','20200002','05','02','08','С','','','','sys','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
insert into sm_fun values('PLC','20200003','09','04','07','С','','','','sys','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
insert into sm_fun values('PLC','20200004','03','02','04','��','','','','sys','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
insert into sm_fun values('PLC','20200005','06','02','07','С','','','','sys','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 
insert into sm_fun values('PLC','20200006','01','02','09','��','','','','sys','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,'false' ); 

SELECT * FROM sm_fun order by fkey desc

select * from sm_fun WHERE type ='DLT' and fval8 = 'sys'  order by fkey desc 
select max(fkey)+1 from sm_fun where fval8='sys' 
delete from  sm_fun  WHERE type ='DLT'  and fval8 in(   'SYSTEM') AND FKEY='20200010' AND ID>201
--update sm_fun set fkey='20200003' where id='3'

select * from sm_fun WHERE type ='DLT'  and fval8 in(   'SYSTEM') AND FKEY='20200010'
--197	DLT	20200009	6 	7 	12	17	31	7 	12	sys			2020-05-23 15:20:00      	false

insert into sm_fun values('DLT','ssss','','','','','','','','','','','' ,'false' ); 

--206	DLT	20200010	8 	12	20	29	30	9 	11	sys			2020-05-24 09:30:01      	false

select * from sm_fun WHERE type ='DLT'  and fval8 in(   'likev') and fkey='20200010'


update sm_fun set fval1='2',	fval2='10',	fval3='11',	fval4='17',	fval5='26',	fval6='3',	fval7='9' where id='198'
update sm_fun set fval1='5',	fval2='6',	fval3='16',	fval4='26',	fval5='32',	fval6='5',	fval7='6' where id='199'
update sm_fun set fval1='1',	fval2='4',	fval3='11',	fval4='29',	fval5='30',	fval6='9',	fval7='11' where id='200'

update sm_fun set fval1='2',	fval2='5',	fval3='11',	fval4='13',	fval5='27',	fval6='1',	fval7='6' where id='210'

select * from sys_user

create table sm_userjf(
	id int identity,
	account varchar(20),
	total_val  varchar(10),
	update_time char(25),
	create_time char(25),
	chk char(5)
)
insert into sm_userjf values('SYSTEM','10000',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');

create table sm_userjfmx(
	id int identity,
	account varchar(20),
	total_val  varchar(10),
	op_type    varchar(20),
	op_val    varchar(10),
	bak1       varchar(20),
	bak2       varchar(20),
	update_time char(25),
	create_time char(25),
	chk char(5)
)

update sm_userjf  set total_val ='10000' ,update_time='2020-05-26 12:06:33'  where id =1
insert into sm_userjfmx values('SYSTEM','10000','���ֳ�ֵ','+ 10000','','',(select CONVERT(varchar(100), GETDATE(), 120)) ,(select CONVERT(varchar(100), GETDATE(), 120)),'false');



SELECT * FROM sm_userjf where account='SYSTEM'order by update_time
SELECT * FROM sm_userjfmx  where account='likev' order by update_time
select * from sys_user

select max(fkey) from sm_fun where fval8='sys' and type='PLC' and  len(fval1)>0
select * from sm_fun WHERE type='PLC' and fval8='likev' and fkey='20200033'

select * from sm_fun WHERE type='PLC' and fkey = '20200025' 
--delete from sm_fun where fval8='sys' and id=247

 update sm_fun set fval9='��' where fval8='sys'  and type='PLC'  and id<250
 
 1(String), 4(String), 8(String), null, null, null, null, ��(String), PLC(String), PLC(String), PLC(String), PLC(String)

 update 


 insert into sm_fun values( ?,(select max(fkey)+1 from sm_fun where fval8='sys' and type=?),'','','','','','','','sys','','','' ,'false' ); 
 
20200013


create table sm_gonggao(
	id int identity,
	title varchar(50),
	discrib varchar(250),
	timestamp  char(19),
	type varchar(20),
	contentType varchar(20),
	href varchar(255),
	artical text,
	views varchar(10),
	favo  varchar(10),
	commNum  varchar(10),
	author varchar(50),
	is_Hot   char(5),
	bg varchar(50),
	update_time char(19),
	chk char(5)
)


create table sm_comments(
	id int identity,
	articalId int,
  commentUser varchar(50),
	comment  varchar(255),
	cval1 varchar(255),
	cval2 varchar(255),
	cval3 varchar(255),
	update_time char(19),
	chk char(5)
)



create table sm_useraction(
	id int identity,
	reader varchar(50),
	articalId int,
	author varchar(50),
	dianz  char(5),
  shouc  char(5),
	views  char(5),
	update_time char(19),
	chk char(5)
)


create table sm_efforts(
 id int identity,
 userid varchar(20), 
 username varchar(100),
 workday varchar(20),
 tasktype varchar(100),
 eai_code varchar(20),
 appname varchar(100),
 appower varchar(100),
 ticket_number varchar(500),
 efforts_hours varchar(20),
 create_time varchar(20),
 chk char(5),
 chk1 char(5)
)


select * from sys_user

--drop table sm_efforts

insert into sm_efforts (userid, workday, tasktype, eai_code, ticket_number, efforts_hours, create_time, chk, chk1) values
 ('likev', '2020-5-13', 'Production - Service Management (DP / DR / UC)', 'ARS', '1', '8', '2020-5-13 17:36:06', null, null) 

 insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10281','ARS','Zhang Xingwu','10281')
 insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10281','ARS','Zhang Xingwu','10281')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10727','AURA','Zhang Xingwu','10727')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10279','BMP','Jiang Wei','10279')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10729','CDR-AV','Leo luo','10729')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','7373','CIRC Report','Tie haibo','7373')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','7374','CIRC Audit','Tie haibo','7374')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11862','Demand Management Tools(JIRA)','Feng Yu','11862')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10302','DHT','Leo luo','10302')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','9500','Digital (GSvP)','Leo luo','9500')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11430','DTC-SWAN','Zhang Xingwu','11430')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10904','EB WeChat','Leo luo','10904')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11225','ECLAIM','Jiang Wei','11225')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11360','Email Management System','Feng Yu','11360')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11465','ENotice','Jiang Wei','11465')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10739','e-opening/e-recruiting','Zhang Xingwu','10739')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10838','EZT','Jiang Wei','10838')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10778','FileNet','Leo luo','10778')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10740','Gonghui Database-Shanghai','Tie haibo','10740')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10074','iBox EB','Jiang Wei','10074')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11714','iMAP2.0','Zhang Xingwu','11714')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10742','MDES','Jiang Wei','10742')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','6857','MTS','Zhang Xingwu','6857')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','8886','ODS','Tie haibo','8886')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','7200','One Quotation','Jiang Wei','7200')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10736','PASS','Feng Yu','10736')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10779','Printing','Jiang Wei','10779')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10321','RPIS','Zhang Xingwu','10321')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10777','Scanning','Feng Yu','10777')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','9165','SMS','Feng Yu','9165')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10839','VMS','Leo luo','10839')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','9166','Web Portal','Zhang Xingwu','9166')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','9591','WeChat Platform','Leo luo','9591')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11239','XieHui Database-Beijing','Tie haibo','11239')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','9160','SAP-BO Reporting','Tie haibo','9160')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10730','Cognos Reporting CSO','Tie haibo','10730')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11466','SMIS','Tie haibo','11466')

insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11714','iMAP2.0','Zhang Xingwu','11714')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','11430','DTC-SWAN','Zhang Xingwu','11430')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','8883','iMAP','Zhang Xingwu','8883')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('applist','10638','Cognos Reporting DMTM BI','Tie haibo','10638')

	



8883	iMAP

11714	iMAP2.0
11430	DTC-SWAN

insert into sm_config(type,ckey,cval1) values('effortuserlist','likev','Kevin')
insert into sm_config(type,ckey,cval1) values('effortuserlist','change','George')
insert into sm_config(type,ckey,cval1) values('effortuserlist','lanti','Tim')

//�����

Cylee
Neal
haibiz
zhangsong
zengmei
Yongming Su
chen lixian
genghaijing
Changjo
wangpengfei
Luo Shutao
Jonny
Hujunh
zhanghaibo
Oliver Wang
Andy
Neal
Chen��Li
Cylee
caochen
Byron
delete from sm_efforts
insert into sm_config(type,ckey,cval1) values('effortuserlist','chaoche','Kevin')
insert into sm_config(type,ckey,cval1) values('effortuserlist','likev','Kevin')
insert into sm_config(type,ckey,cval1) values('effortuserlist','likev','Kevin')
insert into sm_config(type,ckey,cval1) values('effortuserlist','likev','Kevin')
insert into sm_config(type,ckey,cval1) values('effortuserlist','likev','Kevin')
insert into sm_config(type,ckey,cval1) values('effortuserlist','likev','Kevin')
insert into sm_config(type,ckey,cval1) values('effortuserlist','likev','Kevin')
insert into sm_config(type,ckey,cval1) values('effortuserlist','likev','Kevin')
insert into sm_config(type,ckey,cval1) values('effortuserlist','likev','Kevin')
insert into sm_efforts (userid,username, workday, tasktype, eai_code, appname,appower,ticket_number, efforts_hours, create_time, chk, chk1)
values('caoche', 'cao, chen', '2020-05-06', 'Email Discussion & Query', '10779', 'Printing', 'Jiang Wei', '��ӡ������', '2.0', null,'','')

insert into sm_config(type,ckey,cval1,cval2,cval3) values('monthhourslist','202005','2020-05-01','2020-05-31','152')
insert into sm_config(type,ckey,cval1,cval2,cval3) values('monthhourslist','202006','2020-06-01','2020-06-30','168')
insert into sm_config(type,ckey,cval1) values('monthhourslist','likev','Kevin')
 select * from sm_config where type='monthhourslist'

 create table sm_worktime(
 id int identity,
 workmonth varchar(20),
 workday varchar(20)
)
insert into sm_worktime(workmonth,workday) values('202005','2020-05-01');


select account,username from sys_user



















