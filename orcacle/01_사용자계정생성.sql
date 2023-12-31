-- 사용자 계정 생성하는 구문 : 관리자 계정만이 할 수 있는 역할
-- [표현법] CREATE USER 계정명 IDENTIFIED BY 비밀번호;
CREATE USER kh IDENTIFIED BY kh;
DROP USER team4 cascade;
CREATE USER TEAM4 IDENTIFIED BY TEAM4;
GRANT RESOURCE, CONNECT TO TEAM4;
GRANT UNLIMITED TABLESPACE TO TEAM4;
-- 위에서 만들어진 사용자 계정에게 최소한의 권한(데이터관리, 접속) 부여
-- [표현법] GRANT 권한 1, 권한 2, ... TO 계정명;
-- RESOURCE는 객체(생성, 수정, 삭제), 데이터(입력, 수정, 조회, 삭제) 권한 
-- CONNECT 권한이 없으면 해당 유저로 접속이 되지 않음
GRANT RESOURCE, CONNECT TO kh;

-- TABLESPACE에 대한 권한 부여
GRANT UNLIMITED TABLESPACE TO kh;

ALTER USER kh ACCOUNT UNLOCK;


-- 과제 관련 계정 
CREATE USER study IDENTIFIED BY study;
GRANT RESOURCE, CONNECT TO study;
GRANT UNLIMITED TABLESPACE TO study;


-- DDL 관련 계정
CREATE USER ddl IDENTIFIED BY ddl;
GRANT RESOURCE, CONNECT TO ddl;
GRANT UNLIMITED TABLESPACE TO ddl;

-- JDBC 관련 계정
CREATE USER jdbc IDENTIFIED BY jdbc;
GRANT RESOURCE, CONNECT TO jdbc;
GRANT UNLIMITED TABLESPACE TO jdbc;

CREATE USER youtube IDENTIFIED BY youtube;
GRANT RESOURCE, CONNECT TO youtube;
GRANT UNLIMITED TABLESPACE TO youtube;


-- 자바 21c 버전에서! 주의!! 사용자 아이디에는 c## 더해서! 비밀번호는 안돼요!!
CREATE USER c##kh IDENTIFIED BY kh;
GRANT RESOURCE, CONNECT TO c##kh;
GRANT UNLIMITED TABLESPACE TO c##kh;

CREATE USER c##study IDENTIFIED BY study;
GRANT RESOURCE, CONNECT TO c##study;
GRANT UNLIMITED TABLESPACE TO c##study;

CREATE USER c##ddl IDENTIFIED BY ddl;
GRANT RESOURCE, CONNECT TO c##ddl;
GRANT UNLIMITED TABLESPACE TO c##ddl;


-- JDBC 관련 계정
CREATE USER c##jdbc IDENTIFIED BY jdbc;
GRANT RESOURCE, CONNECT TO c##jdbc;
GRANT UNLIMITED TABLESPACE TO c##jdbc;

-- YOUTUBE 관련 계정
CREATE USER youtube IDENTIFIED BY youtube;
GRANT RESOURCE, CONNECT TO youtube;
GRANT UNLIMITED TABLESPACE TO youtube;

GRANT CREATE SEQUENCE TO sample;
GRANT RESOURCE, CONNECT TO sample;
GRANT UNLIMITED TABLESPACE TO sample;













