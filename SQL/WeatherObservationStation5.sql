/*
  Solution To: "Weather Observation Station 5"
  Problem Statement: <a href="https://goo.gl/gLHUXq" target="_blank">https://goo.gl/gLHUXq</a>
*/

SELECT CITY, LENGTH(CITY)
FROM STATION 
WHERE LENGTH(CITY) = 
    (SELECT MIN(LENGTH(CITY))
    FROM STATION)
ORDER BY CITY
LIMIT 1;

SELECT CITY, LENGTH(CITY)
FROM STATION 
WHERE LENGTH(CITY) = 
    (SELECT MAX(LENGTH(CITY))
    FROM STATION)
ORDER BY CITY
LIMIT 1;