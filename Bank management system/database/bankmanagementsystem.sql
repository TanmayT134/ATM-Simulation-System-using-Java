create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

-- Tables
create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(30), marital varchar(20), address varchar(40), city varchar(25), state varchar(25), pincode varchar(20));

create table signupTwo(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(20), pan_no varchar(20), aadhar_no varchar(20), senior_citizen varchar(20), existing_account varchar(20));

create table signupThree(formno varchar(20), accountType varchar(40), cardnumber varchar(25), pin varchar(10), facility varchar(100));

create table login(formno varchar(20), cardnumber varchar(25), pin varchar(10));

create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));

-- Select Queries
select * from signup;
select * from signupTwo;
select * from signupThree;
select * from login;
select * from bank;

-- Truncate Queries
truncate table signup;
truncate table signupTwo;
truncate table signupThree;
truncate table login;
truncate table bank;