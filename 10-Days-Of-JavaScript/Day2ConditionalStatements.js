/*
  Solution To: 10 Days of JavaScript - Day [2]: Conditional Statements: If-Else
  Problem Statement: <a href="https://goo.gl/jiFu4K" target="_blank">https://goo.gl/jiFu4K</a>
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

function getGrade(score) {
    let grade;

    if (score > 25 && score <= 30)
        grade = 'A';
    if (score > 20 && score <= 25)
        grade = 'B';
    if (score > 15 && score <= 20)
        grade = 'C';
    if (score > 10 && score <= 15)
        grade = 'D';
    if (score > 5 && score <= 10)
        grade = 'E';
    if (score > 0 && score <= 5)
        grade = 'F';

    return grade;
}

/* End of Solution */

function main() {
    const score = +(readLine());

    console.log(getGrade(score));
}