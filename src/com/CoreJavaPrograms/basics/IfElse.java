package com.CoreJavaPrograms.basics;

import java.util.Scanner;

public class IfElse {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. BASIC IF-ELSE
// =====================================================

int age = 20;

if (age >= 18) {

System.out.println("Eligible to vote.");

}
else {

System.out.println("Not eligible to vote.");

}


// =====================================================
// 2. EVEN OR ODD
// =====================================================

int number = 15;

if (number % 2 == 0) {

System.out.println("Even number.");

}
else {

System.out.println("Odd number.");

}


// =====================================================
// 3. POSITIVE OR NEGATIVE
// =====================================================

int value = -10;

if (value >= 0) {

System.out.println("Positive number or zero.");

}
else {

System.out.println("Negative number.");

}


// =====================================================
// 4. GREATER OF TWO NUMBERS
// =====================================================

int a = 50;
int b = 30;

if (a > b) {

System.out.println("a is greater.");

}
else {

System.out.println("b is greater or equal.");

}


// =====================================================
// 5. EQUAL OR NOT EQUAL
// =====================================================

int x = 100;
int y = 100;

if (x == y) {

System.out.println("Both numbers are equal.");

}
else {

System.out.println("Numbers are not equal.");

}


// =====================================================
// 6. PASS OR FAIL
// =====================================================

int marks = 65;

if (marks >= 40) {

System.out.println("Student passed.");

}
else {

System.out.println("Student failed.");

}


// =====================================================
// 7. ELIGIBILITY FOR DRIVING
// =====================================================

int drivingAge = 21;

if (drivingAge >= 18) {

System.out.println("Eligible for driving license.");

}
else {

System.out.println("Not eligible for driving license.");

}


// =====================================================
// 8. DIVISIBLE BY 5
// =====================================================

int n = 25;

if (n % 5 == 0) {

System.out.println("Number is divisible by 5.");

}
else {

System.out.println("Number is not divisible by 5.");

}


// =====================================================
// 9. LARGER NUMBER USING USER INPUT
// =====================================================

System.out.println("\nEnter first number:");

int firstNumber = sc.nextInt();

System.out.println("Enter second number:");

int secondNumber = sc.nextInt();

if (firstNumber > secondNumber) {

System.out.println("First number is greater.");

}
else {

System.out.println("Second number is greater or equal.");

}


// =====================================================
// 10. EVEN OR ODD USING USER INPUT
// =====================================================

System.out.println("\nEnter a number:");

int inputNumber = sc.nextInt();

if (inputNumber % 2 == 0) {

System.out.println("Even.");

}
else {

System.out.println("Odd.");

}


// =====================================================
// 11. PASS OR FAIL USING USER INPUT
// =====================================================

System.out.println("\nEnter your marks:");

double inputMarks = sc.nextDouble();

if (inputMarks >= 40) {

System.out.println("Pass.");

}
else {

System.out.println("Fail.");

}


// =====================================================
// 12. ADULT OR MINOR
// =====================================================

System.out.println("\nEnter your age:");

int userAge = sc.nextInt();

if (userAge >= 18) {

System.out.println("Adult.");

}
else {

System.out.println("Minor.");

}


// =====================================================
// 13. LOGIN CHECK
// =====================================================

sc.nextLine();

System.out.println("\nEnter username:");

String username = sc.nextLine();

System.out.println("Enter password:");

String password = sc.nextLine();

if (username.equals("admin") && password.equals("1234")) {

System.out.println("Login successful.");

}
else {

System.out.println("Invalid username or password.");

}


// =====================================================
// 14. VOTING ELIGIBILITY
// =====================================================

System.out.println("\nEnter your age:");

int votingAge = sc.nextInt();

if (votingAge >= 18) {

System.out.println("You can vote.");

}
else {

System.out.println("You cannot vote.");

}


// =====================================================
// 15. CHECK NUMBER RANGE
// =====================================================

System.out.println("\nEnter a number:");

int rangeNumber = sc.nextInt();

if (rangeNumber >= 1 && rangeNumber <= 100) {

System.out.println("Number is between 1 and 100.");

}
else {

System.out.println("Number is outside the range.");

}


// =====================================================
// 16. CHECK CHARACTER
// =====================================================

System.out.println("\nEnter a character:");

char ch = sc.next().charAt(0);

if (ch == 'A') {

System.out.println("Character is A.");

}
else {

System.out.println("Character is not A.");

}


// =====================================================
// 17. CHECK LEAP YEAR
// =====================================================

System.out.println("\nEnter year:");

int year = sc.nextInt();

if (year % 400 == 0 ||
(year % 4 == 0 && year % 100 != 0)) {

System.out.println("Leap year.");

}
else {

System.out.println("Not a leap year.");

}


// =====================================================
// 18. CHECK GREATER THAN 100
// =====================================================

System.out.println("\nEnter a number:");

int checkNumber = sc.nextInt();

if (checkNumber > 100) {

System.out.println("Number is greater than 100.");

}
else {

System.out.println("Number is 100 or less.");

}


// =====================================================
// 19. TERNARY EQUIVALENT
// =====================================================

int score = 75;

String result;

if (score >= 40) {

result = "Pass";

}
else {

result = "Fail";

}

System.out.println("Result: " + result);


// =====================================================
// 20. NESTED IF-ELSE
// =====================================================

int studentAge = 20;
boolean hasId = true;

if (studentAge >= 18) {

if (hasId) {

System.out.println("Student can enter.");

}
else {

System.out.println("ID card required.");

}

}
else {

System.out.println("Student is under 18.");

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}
