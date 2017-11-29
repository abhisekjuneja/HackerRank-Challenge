/*
  Solution To: 10 Days of JavaScript - Day [1]: Functions
  Problem Statement: https://goo.gl/G7Am3K
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

function readLine() {
  return inputString[currentLine++];
}

/* Start of Solution */

function factorial(n) {
  let factorial = 1;
  while (n > 1) {
    factorial *= n;
    n--;
  }
  return factorial
}

/* End of Solution */

function main() {
  const n = +(readLine());
  
  console.log(factorial(n));
}