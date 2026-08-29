package com.CoreJavaPrograms.basics;



import java.util.Scanner;

public class UserInput {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. INTEGER INPUT
// =====================================================

System.out.println("Enter your age:");

int age = sc.nextInt();

System.out.println("Your age is: " + age);


// =====================================================
// 2. DOUBLE INPUT
// =====================================================

System.out.println("\nEnter your salary:");

double salary = sc.nextDouble();

System.out.println("Your salary is: " + salary);


// =====================================================
// 3. STRING INPUT - next()
// =====================================================

System.out.println("\nEnter your first name:");

String firstName = sc.next();

System.out.println("First Name: " + firstName);


// =====================================================
// 4. STRING INPUT - nextLine()
// =====================================================

// Consume leftover newline
sc.nextLine();

System.out.println("\nEnter your full name:");

String fullName = sc.nextLine();

System.out.println("Full Name: " + fullName);


// =====================================================
// 5. CHARACTER INPUT
// =====================================================

System.out.println("\nEnter your gender:");

char gender = sc.next().charAt(0);

System.out.println("Gender: " + gender);


// =====================================================
// 6. BOOLEAN INPUT
// =====================================================

System.out.println("\nAre you a student? Enter true or false:");

boolean isStudent = sc.nextBoolean();

System.out.println("Student: " + isStudent);


// =====================================================
// 7. MULTIPLE INPUTS
// =====================================================

System.out.println("\nEnter two numbers:");

int number1 = sc.nextInt();
int number2 = sc.nextInt();

System.out.println("First Number : " + number1);
System.out.println("Second Number: " + number2);


// =====================================================
// 8. ADDITION USING USER INPUT
// =====================================================

int sum = number1 + number2;

System.out.println("Sum: " + sum);


// =====================================================
// 9. BASIC CALCULATIONS
// =====================================================

System.out.println("\nCalculations:");

System.out.println("Addition       : " + (number1 + number2));
System.out.println("Subtraction    : " + (number1 - number2));
System.out.println("Multiplication : " + (number1 * number2));

if (number2 != 0) {

System.out.println("Division       : " + (number1 / number2));
System.out.println("Remainder      : " + (number1 % number2));

}
else {

System.out.println("Division       : Cannot divide by zero");
System.out.println("Remainder      : Cannot divide by zero");

}


// =====================================================
// 10. EVEN OR ODD
// =====================================================

System.out.println("\nEnter a number to check even or odd:");

int number = sc.nextInt();

if (number % 2 == 0) {

System.out.println(number + " is Even");

}
else {

System.out.println(number + " is Odd");

}


// =====================================================
// 11. POSITIVE, NEGATIVE OR ZERO
// =====================================================

System.out.println("\nEnter a number:");

int value = sc.nextInt();

if (value > 0) {

System.out.println("Positive number");

}
else if (value < 0) {

System.out.println("Negative number");

}
else {

System.out.println("Zero");

}


// =====================================================
// 12. CHECK ELIGIBILITY USING USER INPUT
// =====================================================

System.out.println("\nEnter your age:");

int userAge = sc.nextInt();

if (userAge >= 18) {

System.out.println("You are eligible.");

}
else {

System.out.println("You are not eligible.");

}


// =====================================================
// 13. STUDENT DETAILS
// =====================================================

sc.nextLine();

System.out.println("\n--- Student Details ---");

System.out.println("Enter student name:");

String studentName = sc.nextLine();

System.out.println("Enter roll number:");

int rollNumber = sc.nextInt();

System.out.println("Enter marks:");

double marks = sc.nextDouble();

System.out.println("\nStudent Details:");

System.out.println("Name       : " + studentName);
System.out.println("Roll Number: " + rollNumber);
System.out.println("Marks      : " + marks);

if (marks >= 40) {

System.out.println("Result     : Pass");

}
else {

System.out.println("Result     : Fail");

}


// =====================================================
// 14. SIMPLE CALCULATOR
// =====================================================

System.out.println("\n--- Simple Calculator ---");

System.out.println("Enter first number:");

double first = sc.nextDouble();

System.out.println("Enter second number:");

double second = sc.nextDouble();

System.out.println("Enter operator (+, -, *, /):");

char operator = sc.next().charAt(0);

switch (operator) {

case '+':

System.out.println("Result: " + (first + second));

break;

case '-':

System.out.println("Result: " + (first - second));

break;

case '*':

System.out.println("Result: " + (first * second));

break;

case '/':

if (second != 0) {

System.out.println("Result: " + (first / second));

}
else {

System.out.println("Cannot divide by zero.");

}

break;

default:

System.out.println("Invalid operator.");

}


// =====================================================
// 15. CLOSE SCANNER
// =====================================================

sc.close();

}

}