/*
  Solution To: "Weather Observation Station 4"
  Problem Statement: <a href="https://goo.gl/9MnsLp" target="_blank">https://goo.gl/9MnsLp</a>
*/

SELECT COUNT(CITY) - COUNT(DISTINCT CITY)
FROM STATION;