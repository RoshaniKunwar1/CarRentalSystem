/* 


CREATE DATABASE carproject;


CREATE TABLE caronrent (
    regNo INT PRIMARY KEY NOT NULL,
    custName VARCHAR(255),
    returnDate DATE,
    delay INT,
    fine INT
);


CREATE TABLE carrental (
    regno INT PRIMARY KEY NOT NULL,
    cName VARCHAR(255),
    rentDate DATE,
    returnDate DATE,
    fees INT
);


CREATE TABLE ManageCar (
    id INT PRIMARY KEY NOT NULL,
    brand VARCHAR(255),
    price VARCHAR(255),
    model VARCHAR(255),
    status VARCHAR(255)
);


CREATE TABLE Managecust (
    id INT PRIMARY KEY NOT NULL,
    name VARCHAR(255),
    address VARCHAR(255),
    phone VARCHAR(255)
);


CREATE TABLE user (
    id INT PRIMARY KEY NOT NULL,
    fullname VARCHAR(255),
    username VARCHAR(255),
    password VARCHAR(255),
    phone VARCHAR(255),
    email VARCHAR(255)
);
*/