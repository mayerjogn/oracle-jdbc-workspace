/*
01. 계열 정보를 저장할 카테고리 테이블을 만들려고 한다. 다음과 같은 테이블을 작성하시오.
테이블 이름
TB_CATEGORY
컬럼
NAME, VARCHAR2(10)
USE_YN, CHAR(1), 기본값은 Y가 들어가도록
*/
--DROP TABLE TB_CATEGORY;

CREATE TABLE TB_CATEGORY(
        CATEGORY_NAME VARCHAR2(10),
        USE_YN CHAR(1)
);



/*
02. 과목 구분을 저장할 테이블을 만들려고 한다. 다음과 같은 테이블을 작성하시오.
테이블 이름
TB_CLASS_TYPE
컬럼
NO, VARCHAR2(5), PRIMARY KEY
NAME, VARCHAR2(10)
*/
CREATE TABLE TB_CLASS_TYPE(
        TB_CLASS_TYPE_NO VARCHAR2(5) PRIMARY KEY,
        TB_CLASS_TYPE_NAME VARCHAR(10)
        );