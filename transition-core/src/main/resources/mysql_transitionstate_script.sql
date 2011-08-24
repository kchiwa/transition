CREATE TABLE valuemap (id BIGINT AUTO_INCREMENT NOT NULL, format varchar(100) NOT NULL,field varchar(100) NOT NULL,lookup varchar(100) NOT NULL,zettvalue varchar(100) NOT NULL, categoryid INT, updatedtime numeric(15) NOT NULL, PRIMARY KEY (id))TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;
CREATE INDEX index_updatedtime_on_valuemap ON valuemap (updatedtime);

CREATE TABLE filestate (id BIGINT AUTO_INCREMENT NOT NULL, clientname varchar(50) NOT NULL,customerformat varchar(50) NOT NULL,createdtime numeric(15) NOT NULL,filename varchar(1024) NOT NULL,filesize BIGINT NOT NULL, status INT, errorlog_id BIGINT,parent_id BIGINT, filetype INT NOT NULL, filepath varchar(120) NOT NULL, PRIMARY KEY (id),Foreign Key (parent_id) references filestate(id) on delete cascade on update cascade)TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;
CREATE INDEX index_createdtime_on_filestate ON filestate (createdtime);

CREATE TABLE adstate (id BIGINT AUTO_INCREMENT NOT NULL,filestate_id BIGINT,zadobjectid INT,zclientid INT,shahash VARCHAR(100),modifiedtime numeric(15),createdtime numeric(15),status int,adexternalref varchar(100), errorlog_id BIGINT,PRIMARY KEY (id),Foreign Key (filestate_id) references filestate(id) on delete cascade ,UNIQUE (zclientid,adexternalref) )TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;

CREATE INDEX index_zclientid_on_adstate ON adstate (zclientid);
CREATE INDEX index_adexternalref_zclientid_on_adstate ON adstate (adexternalref, zclientid);

CREATE TABLE mediastate (id BIGINT AUTO_INCREMENT NOT NULL,adstate_id BIGINT,contenttype INT,sequencenum INT,title VARCHAR(255),md5hash VARCHAR(60),status int, prodref varchar(255), extref varchar(255), lastmodified numeric(15), infomessage varchar(255), PRIMARY KEY (id),Foreign Key (adstate_id) references adstate(id) on delete cascade )TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;

CREATE INDEX index_adstate_id_on_mediastate ON mediastate(adstate_id);

CREATE TABLE clientmap (id BIGINT AUTO_INCREMENT NOT NULL,format character varying(20) NOT NULL,source_id character varying(20) NOT NULL,zett_id character varying(10) NOT NULL,folder_name character varying(20) NOT NULL,comment character varying(80),PRIMARY KEY (id))TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;


CREATE TABLE errorlog (id BIGINT AUTO_INCREMENT NOT NULL, objectid BIGINT, objecttype INT, errormessage LONGTEXT, jmsmessageid VARCHAR(255), createdtime numeric(15), PRIMARY KEY(id))TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;

CREATE TABLE partnerlogin (id BIGINT AUTO_INCREMENT NOT NULL, customerformat VARCHAR(100), login VARCHAR(100), protocol INT, loginpassword VARCHAR(100) , receipt INT ,  PRIMARY KEY (id) )TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;
CREATE UNIQUE INDEX index_unique_login_on_partnerlogin ON partnerlogin (login);


CREATE TABLE partnermap (id BIGINT AUTO_INCREMENT NOT NULL, partnerlogin_id BIGINT NOT NULL, identifier VARCHAR(255) NOT NULL, zclientid INT NOT NULL, description VARCHAR(255) NOT NULL, partnermappassword VARCHAR(255), PRIMARY KEY(id), FOREIGN KEY(partnerlogin_id) REFERENCES partnerlogin(id) ON DELETE CASCADE )TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;
CREATE UNIQUE INDEX index_unique_identifier_on_partnermap ON partnermap (identifier);

CREATE TABLE ftprouterstatus (id BIGINT AUTO_INCREMENT NOT NULL,customerformat VARCHAR(50) NOT NULL,active INT  NOT NULL,PRIMARY KEY (id))TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;

CREATE TABLE schedulerstatus (id BIGINT AUTO_INCREMENT NOT NULL,schedulername VARCHAR(50) NOT NULL, customerformat VARCHAR(50) NOT NULL, clientname VARCHAR(50) NOT NULL, crontrigger VARCHAR(200) NOT NULL,active INT  NOT NULL,PRIMARY KEY (id))TYPE=INNODB  CHARSET=UTF8 COLLATE utf8_general_ci;