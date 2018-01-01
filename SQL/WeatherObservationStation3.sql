/*
  Solution To: "Weather Observation Station 3"
  Problem Statement: <a href="https://goo.gl/FeQq6b" target="_blank">https://goo.gl/FeQq6b</a>
*/

SELECT DISTINCT CITY
FROM STATION
WHERE ID % 2 = 0;