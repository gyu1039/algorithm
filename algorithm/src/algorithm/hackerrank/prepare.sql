SELECT concat(name, '(', left(occupation, 1),')') FROM occupations ORDER BY name;
SELECT concat('There are a total of ', count(occupation), ' ', lower(occupation), 's.') FROM occupations GROUP BY occupation ORDER BY count(occupation);

SELECT CASE 
    WHEN A+B<=C or B+C<=A or A+C<=B THEN 'Not A Triangle'
    WHEN A=B and B=C THEN 'Equilateral'
    WHEN (A=B and B!=C) or (B=C and C!=A) or (A=C and A!=B) THEN 'Isosceles'
    WHEN A<>B and B<>C and C<>A THEN 'Scalene'
    END
FROM triangles;

SELECT name FROM employee WHERE SALARY > 2000 AND months < 10 ORDER BY employee_id asc;

SELECT name FROM employee ORDER BY name;

SELECT name FROM students WHERE marks > 75 ORDER BY right(name, 3), id;

SELECT * FROM city WHERE population > 100000 and countrycode = 'USA';

SELECT name FROM city WHERE countrycode = 'USA' and population > 120000;

SELECT * from city;

SELECT * FROM city WHERE id = 1661;

SELECT * FROM city WHERE countrycode = 'JPN';

SELECT name FROM city WHERE countrycode = 'JPN';

SELECT city, state FROM station;

SELECT distinct city FROM station WHERE id % 2 = 0;

SELECT count(*) - count(distinct city) FROM station;

SELECT city, length(city) FROM station ORDER BY length(city), city limit 1;
SELECT city, length(city) FROM station ORDER BY length(city) desc, city limit 1;

SELECT city FROM station WHERE city like 'a%' or city like 'e%' or city like 'i%' 
    or city like 'o%' or city like 'u%';
SELECT distinct(city) FROM station WHERE city like 'a%' or city like 'e%' or city like 'i%' or city like 'o%' or city like 'u%';

SELECT distinct city FROM station WHERE substring(city, -1, 1) in ('a', 'e', 'i','o','u');

SELECT city FROM station WHERE substring(city, 1, 1) in ('a', 'e', 'i', 'o', 'u') and substring(city, -1, 1) in ('a', 'e', 'i', 'o', 'u');
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY,1) IN ('A','E','I','O','U') AND LEFT(CITY,1) IN ('A','E','I','O','U');
SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP "^[aeiou]" AND CITY REGEXP "[aeiou]$"

SELECT distinct city FROM station WHERE city REGEXP "^[^aeiou]";

SELECT distinct city FROM station WHERE city REGEXP "[^aeiou]$";

SELECT distinct city FROM station WHERE city REGEXP "^[^aeiou]" or city REGEXP "[^aeiou]$";

SELECT distinct city FROM station WHERE city REGEXP "^[^aeiou]" and city REGEXP "[^aeiou]$";
