package com.CoreJavaPrograms.basics;

import java.util.Scanner;

public class WhileLoop {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. BASIC WHILE LOOP
// =====================================================

int i = 1;

while (i <= 5) {

System.out.println(i);

i++;

}


// =====================================================
// 2. PRINT 1 TO 10
// =====================================================

int number = 1;

System.out.println("\nNumbers from 1 to 10:");

while (number <= 10) {

System.out.println(number);

number++;

}


// =====================================================
// 3. PRINT 10 TO 1
// =====================================================

int reverse = 10;

System.out.println("\nNumbers from 10 to 1:");

while (reverse >= 1) {

System.out.println(reverse);

reverse--;

}


// =====================================================
// 4. PRINT EVEN NUMBERS
// =====================================================

int even = 2;

System.out.println("\nEven numbers from 1 to 20:");

while (even <= 20) {

System.out.println(even);

even += 2;

}


// =====================================================
// 5. PRINT ODD NUMBERS
// =====================================================

int odd = 1;

System.out.println("\nOdd numbers from 1 to 20:");

while (odd <= 20) {

System.out.println(odd);

odd += 2;

}


// =====================================================
// 6. SUM OF NUMBERS
// =====================================================

int n = 1;
int sum = 0;

while (n <= 10) {

sum = sum + n;

n++;

}

System.out.println("\nSum: " + sum);


// =====================================================
// 7. MULTIPLICATION TABLE
// =====================================================

int tableNumber = 5;
int multiplier = 1;

System.out.println("\nTable of " + tableNumber);

while (multiplier <= 10) {

System.out.println(
tableNumber + " x " + multiplier
+ " = " + (tableNumber * multiplier)
);

multiplier++;

}


// =====================================================
// 8. FACTORIAL
// =====================================================

int factorialNumber = 5;
int factorial = 1;
int count = 1;

while (count <= factorialNumber) {

factorial = factorial * count;

count++;

}

System.out.println("\nFactorial: " + factorial);


// =====================================================
// 9. COUNT DIGITS
// =====================================================

int value = 12345;
int temp = value;
int digitCount = 0;

while (temp != 0) {

digitCount++;

temp = temp / 10;

}

System.out.println("\nNumber of digits: " + digitCount);


// =====================================================
// 10. SUM OF DIGITS
// =====================================================

int digitNumber = 12345;
int digitSum = 0;

while (digitNumber != 0) {

int digit = digitNumber % 10;

digitSum = digitSum + digit;

digitNumber = digitNumber / 10;

}

System.out.println("\nSum of digits: " + digitSum);


// =====================================================
// 11. REVERSE A NUMBER
// =====================================================

int originalNumber = 12345;
int tempNumber = originalNumber;
int reversedNumber = 0;

while (tempNumber != 0) {

int digit = tempNumber % 10;

reversedNumber = reversedNumber * 10 + digit;

tempNumber = tempNumber / 10;

}

System.out.println("\nOriginal: " + originalNumber);
System.out.println("Reverse : " + reversedNumber);


// =====================================================
// 12. PALINDROME NUMBER
// =====================================================

int palindromeNumber = 121;
int original = palindromeNumber;
int reversed = 0;

while (palindromeNumber != 0) {

int digit = palindromeNumber % 10;

reversed = reversed * 10 + digit;

palindromeNumber = palindromeNumber / 10;

}

if (original == reversed) {

System.out.println("\nPalindrome number");

}
else {

System.out.println("\nNot a palindrome number");

}


// =====================================================
// 13. PRIME NUMBER
// =====================================================

int primeNumber = 17;
int divisor = 2;
boolean isPrime = true;

while (divisor <= Math.sqrt(primeNumber)) {

if (primeNumber % divisor == 0) {

isPrime = false;

break;

}

divisor++;

}

if (primeNumber <= 1) {

isPrime = false;

}

if (isPrime) {

System.out.println("\nPrime number");

}
else {

System.out.println("\nNot a prime number");

}


// =====================================================
// 14. USER INPUT
// =====================================================

System.out.println("\nEnter a limit:");

int limit = sc.nextInt();

int start = 1;

while (start <= limit) {

System.out.println(start);

start++;

}


// =====================================================
// 15. USER INPUT - SUM
// =====================================================

System.out.println("\nEnter a number:");

int inputLimit = sc.nextInt();

int current = 1;
int total = 0;

while (current <= inputLimit) {

total = total + current;

current++;

}

System.out.println("Sum: " + total);


// =====================================================
// 16. USER INPUT - MULTIPLICATION TABLE
// =====================================================

System.out.println("\nEnter table number:");

int inputTable = sc.nextInt();

int tableCount = 1;

while (tableCount <= 10) {

System.out.println(
inputTable + " x " + tableCount
+ " = " + (inputTable * tableCount)
);

tableCount++;

}


// =====================================================
// 17. BREAK
// =====================================================

System.out.println("\nBreak Example:");

int breakNumber = 1;

while (breakNumber <= 10) {

if (breakNumber == 5) {

break;

}

System.out.println(breakNumber);

breakNumber++;

}


// =====================================================
// 18. CONTINUE
// =====================================================

System.out.println("\nContinue Example:");

int continueNumber = 0;

while (continueNumber < 10) {

continueNumber++;

if (continueNumber == 5) {

continue;

}

System.out.println(continueNumber);

}


// =====================================================
// 19. NESTED WHILE LOOP
// =====================================================

System.out.println("\nNested While Loop:");

int outer = 1;

while (outer <= 3) {

int inner = 1;

while (inner <= 3) {

System.out.println(
"Outer = " + outer
+ ", Inner = " + inner
);

inner++;

}

outer++;

}


// =====================================================
// 20. STAR PATTERN
// =====================================================

System.out.println("\nStar Pattern:");

int row = 1;

while (row <= 5) {

int column = 1;

while (column <= row) {

System.out.print("* ");

column++;

}

System.out.println();

row++;

}


// =====================================================
// 21. WHILE LOOP WITH STRING
// =====================================================

String name = "Vamshi";

int index = 0;

System.out.println("\nCharacters:");

while (index < name.length()) {

System.out.println(name.charAt(index));

index++;

}


// =====================================================
// 22. ARRAY WITH WHILE LOOP
// =====================================================

int[] numbers = {10, 20, 30, 40, 50};

int arrayIndex = 0;

System.out.println("\nArray Elements:");

while (arrayIndex < numbers.length) {

System.out.println(numbers[arrayIndex]);

arrayIndex++;

}


// =====================================================
// 23. INFINITE WHILE LOOP
// =====================================================

// while (true) {

// System.out.println("Infinite loop");

// }


// =====================================================
// 24. MENU USING WHILE LOOP
// =====================================================

int choice = 0;

while (choice != 4) {

System.out.println("\n--- MENU ---");

System.out.println("1. Add");
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Exit");

System.out.println("Enter choice:");

choice = sc.nextInt();

switch (choice) {

case 1:

System.out.println("10 + 5 = " + (10 + 5));

break;

case 2:

System.out.println("10 - 5 = " + (10 - 5));

break;

case 3:

System.out.println("10 * 5 = " + (10 * 5));

break;

case 4:

System.out.println("Program exited.");

break;

default:

System.out.println("Invalid choice.");

}

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}