/*
  Solution To: 10 Days of JavaScript - Day [0]: Hello World
  Problem Statement: https://goo.gl/5jsN8c
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

function greeting(parameterVariable) {
  console.log('Hello, World!');
  console.log(parameterVariable);
}

function main() {
  const parameterVariable = readLine();

  greeting(parameterVariable);
}