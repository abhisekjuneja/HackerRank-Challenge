/*
  Solution To: 10 Days of JavaScript - Day [1]: Arithmetic Operators
  Problem Statement: https://goo.gl/Yv9TM2
*/

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
  inputString += inputStdin;
});

process.stdin.on('end', _ => {
  inputString = inputString.trim().split('\n').map(string => {
    return string.trim();
  });

  main();
});

/* Start of Solution */

function readLine() {
  return inputString[currentLine++];
}

function getArea(length, width) {
  let area;
  area = length * width;
  return area;
}

function getPerimeter(length, width) {
  let perimeter;
  perimeter = 2 * (length + width);
  return perimeter;
}

/* End of Solution */

function main() {
  const length = +(readLine());
  const width = +(readLine());

  console.log(getArea(length, width));
  console.log(getPerimeter(length, width));
}