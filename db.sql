/* H2 */

CREATE TABLE STUDENTS(ID INT PRIMARY KEY, NAME VARCHAR(255));
INSERT INTO STUDENTS VALUES(1, 'Jules');
INSERT INTO STUDENTS VALUES(2, 'Jim');
SELECT * FROM STUDENTS ORDER BY ID;


/* Postgresql */

CREATE TABLE account
(
    id integer NOT NULL,
    name character varying(30) NOT NULL,
    CONSTRAINT account_pkey PRIMARY KEY (id)
);

INSERT INTO account(
	id, name)
	VALUES (1, 'Han Solo');

INSERT INTO account(
	id, name)
	VALUES (2, 'Princess Leïa');
	
	
/* MySQL */

CREATE TABLE `offices` (
  `ID` int NOT NULL,
  `CITY` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`);
  
INSERT INTO `offices` (`ID`,`CITY`) VALUES (1, 'Bordeaux');
INSERT INTO `offices` (`ID`,`CITY`) VALUES (2, 'Strasbourg');


  
  
