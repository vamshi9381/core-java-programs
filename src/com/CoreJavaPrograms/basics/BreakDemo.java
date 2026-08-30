package com.CoreJavaPrograms.basics;



import java.util.Scanner;

public class BreakDemo {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. BASIC BREAK
// =====================================================

for (int i = 1; i <= 10; i++) {

if (i == 5) {

break;

}

System.out.println(i);

}


// =====================================================
// 2. BREAK IN WHILE LOOP
// =====================================================

System.out.println("\nBreak in while loop:");

int i = 1;

while (i <= 10) {

if (i == 6) {

break;

}

System.out.println(i);

i++;

}


// =====================================================
// 3. BREAK IN DO-WHILE LOOP
// =====================================================

System.out.println("\nBreak in do-while:");

int number = 1;

do {

if (number == 5) {

break;

}

System.out.println(number);

number++;

}
while (number <= 10);


// =====================================================
// 4. BREAK WHEN NUMBER IS FOUND
// =====================================================

System.out.println("\nSearch Example:");

int[] numbers = {10, 20, 30, 40, 50};

int search = 30;

for (int value : numbers) {

if (value == search) {

System.out.println("Number found: " + value);

break;

}

}


// =====================================================
// 5. BREAK WHEN NUMBER IS NOT FOUND
// =====================================================

System.out.println("\nSearch with Result:");

int[] values = {10, 20, 30, 40, 50};

int target = 70;

boolean found = false;

for (int value : values) {

if (value == target) {

found = true;

break;

}

}

if (found) {

System.out.println("Number found.");

}
else {

System.out.println("Number not found.");

}


// =====================================================
// 6. BREAK IN NESTED LOOP
// =====================================================

System.out.println("\nBreak in Nested Loop:");

for (int row = 1; row <= 3; row++) {

for (int column = 1; column <= 5; column++) {

if (column == 3) {

break;

}

System.out.println(
"Row = " + row
+ ", Column = " + column
);

}

}


// =====================================================
// 7. BREAK ONLY INNER LOOP
// =====================================================

System.out.println("\nBreak Inner Loop:");

for (int outer = 1; outer <= 3; outer++) {

System.out.println("Outer: " + outer);

for (int inner = 1; inner <= 5; inner++) {

if (inner == 3) {

break;

}

System.out.println("Inner: " + inner);

}

}


// =====================================================
// 8. LABELED BREAK
// Breaks the outer loop
// =====================================================

System.out.println("\nLabeled Break:");

outerLoop:

for (int row = 1; row <= 3; row++) {

for (int column = 1; column <= 5; column++) {

if (column == 3) {

break outerLoop;

}

System.out.println(
"Row = " + row
+ ", Column = " + column
);

}

}


// =====================================================
// 9. BREAK WITH USER INPUT
// Stop when user enters 0
// =====================================================

System.out.println("\nEnter numbers. Enter 0 to stop:");

while (true) {

int input = sc.nextInt();

if (input == 0) {

break;

}

System.out.println("You entered: " + input);

}


// =====================================================
// 10. BREAK WHEN NEGATIVE NUMBER IS ENTERED
// =====================================================

System.out.println("\nEnter positive numbers:");

while (true) {

int input = sc.nextInt();

if (input < 0) {

break;

}

System.out.println("Number: " + input);

}

System.out.println("Negative number entered. Loop stopped.");


// =====================================================
// 11. FIND FIRST EVEN NUMBER
// =====================================================

int[] data = {11, 13, 15, 18, 21, 24};

for (int value : data) {

if (value % 2 == 0) {

System.out.println(
"First even number: " + value
);

break;

}

}


// =====================================================
// 12. FIND FIRST NUMBER GREATER THAN 50
// =====================================================

int[] data2 = {10, 20, 40, 60, 70};

for (int value : data2) {

if (value > 50) {

System.out.println(
"First number greater than 50: " + value
);

break;

}

}


// =====================================================
// 13. BREAK IN SWITCH
// =====================================================

System.out.println("\nSwitch Break:");

int day = 2;

switch (day) {

case 1:

System.out.println("Monday");

break;

case 2:

System.out.println("Tuesday");

break;

case 3:

System.out.println("Wednesday");

break;

default:

System.out.println("Invalid day");

}


// =====================================================
// 14. SWITCH WITHOUT BREAK
// FALL-THROUGH
// =====================================================

System.out.println("\nSwitch Fall-Through:");

int value = 2;

switch (value) {

case 1:

System.out.println("One");

break;

case 2:

System.out.println("Two");

// No break

case 3:

System.out.println("Three");

break;

}


// =====================================================
// 15. BREAK IN INFINITE LOOP
// =====================================================

System.out.println("\nBreak from Infinite Loop:");

int count = 1;

while (true) {

System.out.println(count);

count++;

if (count > 5) {

break;

}

}


// =====================================================
// 16. USER INPUT - SEARCH
// =====================================================

System.out.println("\nEnter 5 numbers:");

int searchNumber;

System.out.println("Enter number to search:");

searchNumber = sc.nextInt();

boolean numberFound = false;

for (int j = 1; j <= 5; j++) {

System.out.println("Enter number " + j + ":");

int input = sc.nextInt();

if (input == searchNumber) {

numberFound = true;

break;

}

}

if (numberFound) {

System.out.println("Number found.");

}
else {

System.out.println("Number not found.");

}


// =====================================================
// 17. STOP AT FIRST MULTIPLE OF 7
// =====================================================

System.out.println("\nFirst multiple of 7:");

for (int j = 1; j <= 100; j++) {

if (j % 7 == 0) {

System.out.println(j);

break;

}

}


// =====================================================
// 18. BREAK IN PRIME CHECK
// =====================================================

int primeNumber = 29;

boolean isPrime = true;

for (int divisor = 2;
divisor <= Math.sqrt(primeNumber);
divisor++) {

if (primeNumber % divisor == 0) {

isPrime = false;

break;

}

}

if (isPrime) {

System.out.println("\nPrime number");

}
else {

System.out.println("\nNot a prime number");

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}