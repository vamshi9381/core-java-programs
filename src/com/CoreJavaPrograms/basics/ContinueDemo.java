package com.CoreJavaPrograms.basics;



import java.util.Scanner;

public class ContinueDemo {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. BASIC CONTINUE
// =====================================================

for (int i = 1; i <= 10; i++) {

if (i == 5) {

continue;

}

System.out.println(i);

}


// =====================================================
// 2. SKIP EVEN NUMBERS
// Print only odd numbers
// =====================================================

System.out.println("\nOdd numbers:");

for (int i = 1; i <= 10; i++) {

if (i % 2 == 0) {

continue;

}

System.out.println(i);

}


// =====================================================
// 3. SKIP ODD NUMBERS
// Print only even numbers
// =====================================================

System.out.println("\nEven numbers:");

for (int i = 1; i <= 10; i++) {

if (i % 2 != 0) {

continue;

}

System.out.println(i);

}


// =====================================================
// 4. SKIP MULTIPLES OF 3
// =====================================================

System.out.println("\nNumbers except multiples of 3:");

for (int i = 1; i <= 20; i++) {

if (i % 3 == 0) {

continue;

}

System.out.println(i);

}


// =====================================================
// 5. CONTINUE IN WHILE LOOP
// =====================================================

System.out.println("\nContinue in while:");

int number = 0;

while (number < 10) {

number++;

if (number == 5) {

continue;

}

System.out.println(number);

}


// =====================================================
// 6. CONTINUE IN DO-WHILE LOOP
// =====================================================

System.out.println("\nContinue in do-while:");

int value = 0;

do {

value++;

if (value == 5) {

continue;

}

System.out.println(value);

}
while (value < 10);


// =====================================================
// 7. SKIP NEGATIVE NUMBERS
// =====================================================

System.out.println("\nSkip negative numbers:");

int[] numbers = {10, -5, 20, -10, 30, -15};

for (int num : numbers) {

if (num < 0) {

continue;

}

System.out.println(num);

}


// =====================================================
// 8. SKIP ZERO
// =====================================================

System.out.println("\nSkip zero:");

int[] values = {10, 0, 20, 0, 30};

for (int num : values) {

if (num == 0) {

continue;

}

System.out.println(num);

}


// =====================================================
// 9. CONTINUE WITH STRING
// Skip spaces
// =====================================================

System.out.println("\nCharacters without spaces:");

String text = "Java Programming";

for (int i = 0; i < text.length(); i++) {

char ch = text.charAt(i);

if (ch == ' ') {

continue;

}

System.out.print(ch);

}

System.out.println();


// =====================================================
// 10. SKIP VOWELS
// =====================================================

System.out.println("\nString without vowels:");

String word = "programming";

for (int i = 0; i < word.length(); i++) {

char ch = word.charAt(i);

if (ch == 'a' ||
ch == 'e' ||
ch == 'i' ||
ch == 'o' ||
ch == 'u') {

continue;

}

System.out.print(ch);

}

System.out.println();


// =====================================================
// 11. CONTINUE IN NESTED LOOP
// =====================================================

System.out.println("\nNested Loop:");

for (int i = 1; i <= 3; i++) {

for (int j = 1; j <= 5; j++) {

if (j == 3) {

continue;

}

System.out.println(
"i = " + i + ", j = " + j
);

}

}


// =====================================================
// 12. CONTINUE ONLY INNER LOOP
// =====================================================

System.out.println("\nSkip 2 in inner loop:");

for (int i = 1; i <= 3; i++) {

for (int j = 1; j <= 4; j++) {

if (j == 2) {

continue;

}

System.out.print(j + " ");

}

System.out.println();

}


// =====================================================
// 13. CONTINUE WITH USER INPUT
// Skip negative numbers
// =====================================================

System.out.println("\nEnter 5 numbers:");

for (int i = 1; i <= 5; i++) {

int input = sc.nextInt();

if (input < 0) {

continue;

}

System.out.println("Positive: " + input);

}


// =====================================================
// 14. CONTINUE WITH MARKS
// Skip invalid marks
// =====================================================

System.out.println("\nEnter marks for 5 students:");

for (int i = 1; i <= 5; i++) {

System.out.println("Student " + i + ":");

double marks = sc.nextDouble();

if (marks < 0 || marks > 100) {

System.out.println("Invalid marks. Skipped.");

continue;

}

if (marks >= 40) {

System.out.println("Pass");

}
else {

System.out.println("Fail");

}

}


// =====================================================
// 15. CONTINUE WITH ARRAY
// Print values greater than 50
// =====================================================

int[] data = {10, 60, 20, 80, 30, 90};

System.out.println("\nValues greater than 50:");

for (int num : data) {

if (num <= 50) {

continue;

}

System.out.println(num);

}


// =====================================================
// 16. CONTINUE WITH PRIME NUMBERS
// Print only prime numbers
// =====================================================

System.out.println("\nPrime numbers from 1 to 20:");

for (int num = 2; num <= 20; num++) {

boolean isPrime = true;

for (int divisor = 2;
divisor <= Math.sqrt(num);
divisor++) {

if (num % divisor == 0) {

isPrime = false;

break;

}

}

if (!isPrime) {

continue;

}

System.out.println(num);

}


// =====================================================
// 17. CONTINUE IN MULTIPLICATION
// Skip multiples of 5
// =====================================================

System.out.println("\nNumbers except multiples of 5:");

for (int i = 1; i <= 30; i++) {

if (i % 5 == 0) {

continue;

}

System.out.println(i);

}


// =====================================================
// 18. CONTINUE WITH CONDITION
// Print numbers from 1 to 20 except 10-15
// =====================================================

System.out.println("\nNumbers except 10 to 15:");

for (int i = 1; i <= 20; i++) {

if (i >= 10 && i <= 15) {

continue;

}

System.out.println(i);

}


// =====================================================
// 19. CONTINUE IN INFINITE LOOP
// Be careful with update
// =====================================================

int count = 0;

while (count < 10) {

count++;

if (count == 5) {

continue;

}

System.out.println(count);

}


// =====================================================
// 20. BREAK + CONTINUE TOGETHER
// =====================================================

System.out.println("\nBreak + Continue:");

for (int i = 1; i <= 20; i++) {

if (i % 2 == 0) {

continue;

}

if (i > 15) {

break;

}

System.out.println(i);

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}