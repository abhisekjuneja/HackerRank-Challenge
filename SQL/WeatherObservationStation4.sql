/*
  Solution To: "Weather Observation Station 4"
  Problem Statement: https://goo.gl/9MnsLp
*/

SELECT COUNT(CITY) - COUNT(DISTINCT CITY)
FROM STATION;