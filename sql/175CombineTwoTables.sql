/*
Table: Person

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
PersonId is the primary key column for this table.
Table: Address

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
AddressId is the primary key column for this table.

Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:

FirstName, LastName, City, State
*/

/*
Schema:

Create table If Not Exists Person (PersonId int, FirstName varchar(255), LastName varchar(255));
Create table If Not Exists Address (AddressId int, PersonId int, City varchar(255), State varchar(255));
Truncate table Person;
insert into Person (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen');
Truncate table Address;
insert into Address (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York');
*/

# 这道题真是猝不及防SQL。用到了left join，下面的解释摘自网络，方便复习。
# left join(左联接) 返回包括左表中的所有记录和右表中联结字段相等的记录 
# right join(右联接) 返回包括右表中的所有记录和左表中联结字段相等的记录
# inner join(等值连接) 只返回两个表中联结字段相等的行

# Write your MySQL query statement below
select FirstName,LastName,City,State from Person left join Address on Person.PersonId = Address.PersonId;
