DROP TABLE IF EXISTS APPLICATION;

CREATE TABLE APPLICATION
(
number INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR2(20) NOT NULL,
cost FLOAT(24) NOT NULL,
date DATE NOT NULL

);
