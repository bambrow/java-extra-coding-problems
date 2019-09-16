/*
Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.

+---------+------------+------------------+
| Id(INT) | Date(DATE) | Temperature(INT) |
+---------+------------+------------------+
|       1 | 2015-01-01 |               10 |
|       2 | 2015-01-02 |               25 |
|       3 | 2015-01-03 |               20 |
|       4 | 2015-01-04 |               30 |
+---------+------------+------------------+
For example, return the following Ids for the above Weather table:
+----+
| Id |
+----+
|  2 |
|  4 |
+----+
*/

/*
Schema:

Create table If Not Exists Weather (Id int, Date date, Temperature int);
Truncate table Weather;
insert into Weather (Id, Date, Temperature) values ('1', '2015-01-01', '10');
insert into Weather (Id, Date, Temperature) values ('2', '2015-01-02', '25');
insert into Weather (Id, Date, Temperature) values ('3', '2015-01-03', '20');
insert into Weather (Id, Date, Temperature) values ('4', '2015-01-04', '30');
*/

# Write your MySQL query statement below
select w1.Id from Weather w1 inner join Weather w2 on TO_DAYS(w1.Date) = TO_DAYS(w2.Date)+1 where w1.Temperature > w2.Temperature

# Another solution
select w1.Id from Weather w1, Weather w2 where DATEDIFF(w1.Date,w2.Date)=1 and w1.Temperature > w2.Temperature

# Another solution
select w1.Id from Weather w1 inner join Weather w2 on w2.Date = SUBDATE(w1.Date,1) where w1.Temperature > w2.Temperature

# Another solution
select w1.Id from Weather w1, Weather w2 where TO_DAYS(w1.Date) - TO_DAYS(w2.Date) = 1 and w1.Temperature > w2.Temperature
