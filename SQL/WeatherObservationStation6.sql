/*
  Solution To: <span class="problem-statement-code-heading">
    "Weather Observation Station 6"
  </span>
  Problem Statement: <a href="https://goo.gl/uJrXiW" target="_blank" class="problem-statement-link">
    https://goo.gl/uJrXiW
  </a>
*/

SELECT CITY
FROM STATION
WHERE LCASE(LEFT(CITY, 1))
IN ('a', 'e', 'i', 'o', 'u');