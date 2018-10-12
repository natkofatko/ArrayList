select * from LOCATION;

select CONDO_ID,CATEGORY_NUM,EST_HOURS, EST_HOURS * 35 as EstlabourCost from Service_Request;

select * from CONDO_UNIT;

select * from OWNER;

select * from service_category;

select * from service_REQUEST;

SELECT *FROM OWNER; 

select * from SERVICE_REQUEST where description LIKE 'pan'; 

SELECT SUM(CONDO_FEE) FROM CONDO_UNIT; 

SELECT OWNER_NUM, LAST_NAME, FIRST_NAME FROM OWNER; 

SELECT * FROM LOCATION; 

SELECT LAST_NAME, FIRST_NAME FROM OWNER WHERE CITY='BOWTON'; 

SELECT LAST_NAME, FIRST_NAME FROM OWNER WHERE CITY<>'BOWTON';

SELECT COUNT(*) FROM CONDO_UNIT WHERE BDRMS=1;  
