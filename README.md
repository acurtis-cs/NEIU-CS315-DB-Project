# NEIU-CS315-DB-Project

A Java console application demonstrating basic Create, Read, Update, Delete operations against a MySQL database from Northeastern Illinios University.
Website used: phpMyAdmin

## Features
- Create records (INSERT)
- Read records (SELECT)
- Update records (UPDATE)
- Delete records (DELETE)

## Tech
- Java
- MySQL
- MySQL Connector/J (JDBC Driver)

## Requirements
- Java (JDK 8+ recommended)
- MySQL database access
- MySQL Connector/J (JDBC driver)

## Setup

### 1) Install MySQL Connector/J
Download MySQL Connector/J from the official MySQL site and add the `.jar` to your classpath:
https://dev.mysql.com/downloads/connector/j/

### 2) Configure Database Credentials
This project does not hold credentials so no secrets are stored in the code.

Look within each java file except main for

//MUST UPDATE BELOW WITH YOUR CLASS LINK AND PASSWORD////////////////////
      String url = "CLASS_LINK_HERE phpMyAdmin_SQL";
      url += "PERSONAL_PASSWORD_FROM_CLASS";
//MUST UPDATE ABOVE WITH YOUR CLASS LINK AND PASSWORD/////////////////////

Insert your credentials in each file. 

### 3) Run
I used jGRASP as my IDE with the JDBC driver inserted within my folder.
