/*
  Solution To: "Weather Observation Station 3"
  Problem Statement: https://goo.gl/FeQq6b
*/

SELECT DISTINCT CITY
FROM STATION
WHERE ID % 2 = 0;