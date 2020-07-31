select * from sys_user

select * from sm_efforts where userid='chenli4'
---�������µ�username
--update sm_efforts  set username=(select top 1 username from sys_user u where u.account=sm_efforts.userid and u.username is not null) 
--update sm_efforts  set username=userid where username is null or username ='null'
--delete from sm_efforts where userid='SYSTEM'


select distinct userid,username from sm_efforts 

select * into sm_effort20200609 from sm_efforts

