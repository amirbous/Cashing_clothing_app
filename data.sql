--creating table users
create table employees( employee_first_name varchar (255) NOT NULL, employee_last_name varchar (255) NOT NULL, employee_enrollement_date DATE NOT NULL, employee_last_signout datetime NOT NULL,  CONSTRAINT employee_authen PRIMARY KEY (employee_first_name, employee_last_name));

--inserting example function data
inset into employees values
("amir", "bouslama", CURRENT_DATE, CURRENT_TIMESTAMP),
("raed", "khouya", CURRENT_DATE, CURRENT_TIMESTAMP),
("janus", "hannover", CURRENT_DATE, CURRENT_TIMESTAMP);

