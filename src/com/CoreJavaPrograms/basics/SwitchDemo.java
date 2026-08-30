package com.CoreJavaPrograms.basics;

import java.util.Scanner;

public class SwitchDemo {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. BASIC SWITCH
// =====================================================

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
// 2. SWITCH WITH CHAR
// =====================================================

char grade = 'A';

switch (grade) {

case 'A':

System.out.println("Excellent");

break;

case 'B':

System.out.println("Very Good");

break;

case 'C':

System.out.println("Good");

break;

case 'D':

System.out.println("Pass");

break;

default:

System.out.println("Invalid grade");

}


// =====================================================
// 3. SWITCH WITH STRING
// =====================================================

String city = "Hyderabad";

switch (city) {

case "Hyderabad":

System.out.println("Telangana");

break;

case "Chennai":

System.out.println("Tamil Nadu");

break;

case "Bangalore":

System.out.println("Karnataka");

break;

default:

System.out.println("Unknown city");

}


// =====================================================
// 4. SWITCH WITH USER INPUT
// =====================================================

System.out.println("\nEnter a number from 1 to 7:");

int inputDay = sc.nextInt();

switch (inputDay) {

case 1:

System.out.println("Monday");

break;

case 2:

System.out.println("Tuesday");

break;

case 3:

System.out.println("Wednesday");

break;

case 4:

System.out.println("Thursday");

break;

case 5:

System.out.println("Friday");

break;

case 6:

System.out.println("Saturday");

break;

case 7:

System.out.println("Sunday");

break;

default:

System.out.println("Invalid day");

}


// =====================================================
// 5. MULTIPLE CASES
// =====================================================

System.out.println("\nEnter day number:");

int weekendDay = sc.nextInt();

switch (weekendDay) {

case 6:
case 7:

System.out.println("Weekend");

break;

default:

System.out.println("Weekday");

}


// =====================================================
// 6. FALL-THROUGH
// =====================================================

int number = 2;

switch (number) {

case 1:

System.out.println("One");

case 2:

System.out.println("Two");

case 3:

System.out.println("Three");

break;

default:

System.out.println("Other");

}


// =====================================================
// 7. SWITCH CALCULATOR
// =====================================================

System.out.println("\nEnter first number:");

double first = sc.nextDouble();

System.out.println("Enter second number:");

double second = sc.nextDouble();

System.out.println("Enter operator:");

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

System.out.println("Cannot divide by zero");

}

break;

default:

System.out.println("Invalid operator");

}


// =====================================================
// 8. MENU-DRIVEN PROGRAM
// =====================================================

System.out.println("\n--- MENU ---");

System.out.println("1. Add");
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Divide");

System.out.println("Enter your choice:");

int choice = sc.nextInt();

int a = 20;
int b = 10;

switch (choice) {

case 1:

System.out.println("Addition: " + (a + b));

break;

case 2:

System.out.println("Subtraction: " + (a - b));

break;

case 3:

System.out.println("Multiplication: " + (a * b));

break;

case 4:

System.out.println("Division: " + (a / b));

break;

default:

System.out.println("Invalid choice");

}


// =====================================================
// 9. NESTED SWITCH
// =====================================================

int department = 1;
int option = 2;

switch (department) {

case 1:

System.out.println("IT Department");

switch (option) {

case 1:

System.out.println("Java");

break;

case 2:

System.out.println("Python");

break;

default:

System.out.println("Invalid option");

}

break;

case 2:

System.out.println("HR Department");

break;

default:

System.out.println("Unknown department");

}


// =====================================================
// 10. SWITCH WITH ENUM
// =====================================================

Day today = Day.MONDAY;

switch (today) {

case MONDAY:

System.out.println("Start of the week");

break;

case FRIDAY:

System.out.println("Almost weekend");

break;

case SATURDAY:
case SUNDAY:

System.out.println("Weekend");

break;

default:

System.out.println("Weekday");

}


// =====================================================
// 11. MODERN SWITCH EXPRESSION
// Java 14+
// =====================================================

int month = 3;

String monthName = switch (month) {

case 1 -> "January";

case 2 -> "February";

case 3 -> "March";

case 4 -> "April";

default -> "Invalid month";

};

System.out.println("\nMonth: " + monthName);


// =====================================================
// 12. SWITCH EXPRESSION WITH yield
// =====================================================

int marks = 85;

String result = switch (marks / 10) {

case 10, 9 -> "A+";

case 8 -> "A";

case 7 -> "B";

case 6 -> "C";

case 5, 4 -> "D";

default -> "Fail";

};

System.out.println("Grade: " + result);


// =====================================================
// 13. SWITCH WITH MULTIPLE VALUES
// Modern Syntax
// =====================================================

int dayNumber = 6;

String dayType = switch (dayNumber) {

case 6, 7 -> "Weekend";

case 1, 2, 3, 4, 5 -> "Weekday";

default -> "Invalid day";

};

System.out.println("Day type: " + dayType);


// =====================================================
// 14. SWITCH EXPRESSION WITH BLOCK
// =====================================================

int score = 75;

String performance = switch (score / 10) {

case 10, 9 -> "Excellent";

case 8 -> "Very Good";

case 7 -> {

System.out.println("Score is in the 70s");

yield "Good";

}

case 6 -> "Average";

default -> "Needs Improvement";

};

System.out.println("Performance: " + performance);


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}


// =====================================================
// ENUM
// =====================================================

enum Day {

MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
SATURDAY,
SUNDAY

}