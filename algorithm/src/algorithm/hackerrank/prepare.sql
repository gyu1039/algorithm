SELECT * FROM city WHERE population > 100000 and countrycode = 'USA';

SELECT name FROM city WHERE countrycode = 'USA' and population > 120000;

SELECT * from city;

SELECT * FROM city WHERE id = 1661;

SELECT * FROM city WHERE countrycode = 'JPN';

SELECT name FROM city WHERE countrycode = 'JPN';

SELECT city, state FROM station;

SELECT distinct city FROM station WHERE id % 2 = 0;

SELECT count(*) - count(distinct city) FROM station;

