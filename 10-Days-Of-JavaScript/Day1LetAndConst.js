/*
  Solution To: 10 Days of JavaScript - Day [1]: Let & Const
  Problem Statement: https://goo.gl/FQLcEK
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

function main() {
  /* Start of Solution */

  const PI = Math.PI;
  let radius = +(readLine());
  let area = PI * radius * radius;
  console.log(area);
  let perimeter = 2 * PI * radius;
  console.log(perimeter);

  /* End of Solution */
  try {
    // Attempt to redefine the value of constant variable PI
    PI = 0;
    // Attempt to print the value of PI
    console.log(PI);
  } catch (error) {
    console.error("You correctly declared 'PI' as a constant.");
  }
}