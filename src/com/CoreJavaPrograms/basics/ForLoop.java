package com.CoreJavaPrograms.basics;



import java.util.Scanner;

public class ForLoop {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. BASIC FOR LOOP
// =====================================================

for (int i = 1; i <= 5; i++) {

System.out.println(i);

}


// =====================================================
// 2. PRINT 1 TO 10
// =====================================================

System.out.println("\nNumbers from 1 to 10:");

for (int i = 1; i <= 10; i++) {

System.out.println(i);

}


// =====================================================
// 3. PRINT 10 TO 1
// REVERSE LOOP
// =====================================================

System.out.println("\nNumbers from 10 to 1:");

for (int i = 10; i >= 1; i--) {

System.out.println(i);

}


// =====================================================
// 4. PRINT EVEN NUMBERS
// =====================================================

System.out.println("\nEven numbers from 1 to 20:");

for (int i = 1; i <= 20; i++) {

if (i % 2 == 0) {

System.out.println(i);

}

}


// =====================================================
// 5. PRINT ODD NUMBERS
// =====================================================

System.out.println("\nOdd numbers from 1 to 20:");

for (int i = 1; i <= 20; i++) {

if (i % 2 != 0) {

System.out.println(i);

}

}


// =====================================================
// 6. SUM OF NUMBERS
// =====================================================

int sum = 0;

for (int i = 1; i <= 10; i++) {

sum = sum + i;

}

System.out.println("\nSum from 1 to 10: " + sum);


// =====================================================
// 7. MULTIPLICATION TABLE
// =====================================================

int number = 5;

System.out.println("\nMultiplication table of " + number);

for (int i = 1; i <= 10; i++) {

System.out.println(number + " x " + i + " = " + (number * i));

}


// =====================================================
// 8. FACTORIAL
// =====================================================

int factorialNumber = 5;

int factorial = 1;

for (int i = 1; i <= factorialNumber; i++) {

factorial = factorial * i;

}

System.out.println("\nFactorial of " + factorialNumber + ": " + factorial);


// =====================================================
// 9. COUNT DIGITS
// =====================================================

int value = 12345;

int temp = value;

int digitCount = 0;

for (; temp != 0; temp = temp / 10) {

digitCount++;

}

System.out.println("\nNumber of digits: " + digitCount);


// =====================================================
// 10. REVERSE A NUMBER
// =====================================================

int originalNumber = 12345;

int reverse = 0;

for (int tempNumber = originalNumber;
tempNumber != 0;
tempNumber = tempNumber / 10) {

int digit = tempNumber % 10;

reverse = reverse * 10 + digit;

}

System.out.println("\nOriginal number: " + originalNumber);
System.out.println("Reverse: " + reverse);


// =====================================================
// 11. SUM OF DIGITS
// =====================================================

int digitNumber = 12345;

int digitSum = 0;

for (int tempNumber = digitNumber;
tempNumber != 0;
tempNumber = tempNumber / 10) {

int digit = tempNumber % 10;

digitSum = digitSum + digit;

}

System.out.println("\nSum of digits: " + digitSum);


// =====================================================
// 12. PRIME NUMBER
// =====================================================

int primeNumber = 17;

boolean isPrime = true;

if (primeNumber <= 1) {

isPrime = false;

}
else {

for (int i = 2; i <= Math.sqrt(primeNumber); i++) {

if (primeNumber % i == 0) {

isPrime = false;

break;

}

}

}

if (isPrime) {

System.out.println("\n" + primeNumber + " is Prime");

}
else {

System.out.println("\n" + primeNumber + " is Not Prime");

}


// =====================================================
// 13. FIBONACCI SERIES
// =====================================================

int terms = 10;

int first = 0;
int second = 1;

System.out.println("\nFibonacci Series:");

for (int i = 1; i <= terms; i++) {

System.out.print(first + " ");

int next = first + second;

first = second;
second = next;

}

System.out.println();


// =====================================================
// 14. NESTED FOR LOOP
// =====================================================

System.out.println("\nNested For Loop:");

for (int i = 1; i <= 3; i++) {

for (int j = 1; j <= 3; j++) {

System.out.println("i = " + i + ", j = " + j);

}

}


// =====================================================
// 15. MULTIPLICATION TABLES USING NESTED LOOP
// =====================================================

System.out.println("\nTables from 1 to 5:");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= 10; j++) {

System.out.println(i + " x " + j + " = " + (i * j));

}

System.out.println();

}


// =====================================================
// 16. STAR PATTERN
// =====================================================

System.out.println("\nStar Pattern:");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= i; j++) {

System.out.print("* ");

}

System.out.println();

}


// =====================================================
// 17. NUMBER PATTERN
// =====================================================

System.out.println("\nNumber Pattern:");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= i; j++) {

System.out.print(j + " ");

}

System.out.println();

}


// =====================================================
// 18. BREAK
// =====================================================

System.out.println("\nBreak Example:");

for (int i = 1; i <= 10; i++) {

if (i == 5) {

break;

}

System.out.println(i);

}


// =====================================================
// 19. CONTINUE
// =====================================================

System.out.println("\nContinue Example:");

for (int i = 1; i <= 10; i++) {

if (i == 5) {

continue;

}

System.out.println(i);

}


// =====================================================
// 20. MULTIPLE VARIABLES
// =====================================================

System.out.println("\nMultiple Variables:");

for (int i = 1, j = 10;
i <= 5;
i++, j--) {

System.out.println("i = " + i + ", j = " + j);

}


// =====================================================
// 21. FOR LOOP WITHOUT INITIALIZATION
// =====================================================

System.out.println("\nWithout Initialization:");

int x = 1;

for (; x <= 5; x++) {

System.out.println(x);

}


// =====================================================
// 22. FOR LOOP WITHOUT UPDATE
// =====================================================

System.out.println("\nWithout Update:");

int y = 1;

for (; y <= 5;) {

System.out.println(y);

y++;

}


// =====================================================
// 23. INFINITE FOR LOOP
// =====================================================

// for (;;) {
// System.out.println("Infinite Loop");
// }


// =====================================================
// 24. USER INPUT WITH FOR LOOP
// =====================================================

System.out.println("\nEnter a number:");

int inputNumber = sc.nextInt();

System.out.println("Table of " + inputNumber);

for (int i = 1; i <= 10; i++) {

System.out.println(inputNumber + " x " + i
+ " = " + (inputNumber * i));

}


// =====================================================
// 25. USER INPUT - SUM
// =====================================================

System.out.println("\nEnter limit:");

int limit = sc.nextInt();

int total = 0;

for (int i = 1; i <= limit; i++) {

total = total + i;

}

System.out.println("Sum: " + total);


// =====================================================
// 26. USER INPUT - COUNT EVEN NUMBERS
// =====================================================

System.out.println("\nEnter limit:");

int evenLimit = sc.nextInt();

int evenCount = 0;

for (int i = 1; i <= evenLimit; i++) {

if (i % 2 == 0) {

evenCount++;

}

}

System.out.println("Number of even numbers: " + evenCount);


// =====================================================
// 27. LOOP WITH ARRAY
// =====================================================

int[] numbers = {10, 20, 30, 40, 50};

System.out.println("\nArray elements:");

for (int i = 0; i < numbers.length; i++) {

System.out.println(numbers[i]);

}


// =====================================================
// 28. FOR-EACH LOOP
// =====================================================

System.out.println("\nFor-Each Loop:");

for (int num : numbers) {

System.out.println(num);

}


// =====================================================
// 29. SEARCH ELEMENT
// =====================================================

int search = 30;

boolean found = false;

for (int num : numbers) {

if (num == search) {

found = true;

break;

}

}

if (found) {

System.out.println("\nElement found.");

}
else {

System.out.println("\nElement not found.");

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}
