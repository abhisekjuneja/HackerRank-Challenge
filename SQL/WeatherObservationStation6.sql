/*
  Solution To: "Weather Observation Station 6"
  Problem Statement: <a href="https://goo.gl/uJrXiW" target="_blank">https://goo.gl/uJrXiW</a>
*/

SELECT CITY
FROM STATION
WHERE LCASE(LEFT(CITY, 1))
IN ('a', 'e', 'i', 'o', 'u');