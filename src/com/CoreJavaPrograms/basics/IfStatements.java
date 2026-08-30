package com.CoreJavaPrograms.basics;


import java.util.Scanner;

public class IfStatements {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. SIMPLE IF STATEMENT
// =====================================================

int age = 20;

if (age >= 18) {

System.out.println("You are eligible to vote.");

}


// =====================================================
// 2. IF WITH BOOLEAN CONDITION
// =====================================================

boolean isJavaEasy = true;

if (isJavaEasy) {

System.out.println("Java is easy to learn.");

}


// =====================================================
// 3. IF-ELSE STATEMENT
// =====================================================

int number = 10;

if (number % 2 == 0) {

System.out.println("Number is Even.");

}
else {

System.out.println("Number is Odd.");

}


// =====================================================
// 4. CHECK POSITIVE OR NEGATIVE
// =====================================================

int value = -5;

if (value > 0) {

System.out.println("Positive number.");

}
else {

System.out.println("Negative number.");

}


// =====================================================
// 5. IF-ELSE-IF LADDER
// =====================================================

int marks = 75;

if (marks >= 90) {

System.out.println("Grade A+");

}
else if (marks >= 80) {

System.out.println("Grade A");

}
else if (marks >= 70) {

System.out.println("Grade B");

}
else if (marks >= 60) {

System.out.println("Grade C");

}
else if (marks >= 40) {

System.out.println("Grade D");

}
else {

System.out.println("Fail");

}


// =====================================================
// 6. NESTED IF
// =====================================================

int studentAge = 20;
boolean hasIdCard = true;

if (studentAge >= 18) {

if (hasIdCard) {

System.out.println("Student can enter.");

}

}


// =====================================================
// 7. NESTED IF-ELSE
// =====================================================

int userAge = 25;
boolean hasLicense = true;

if (userAge >= 18) {

if (hasLicense) {

System.out.println("You can drive.");

}
else {

System.out.println("You need a driving license.");

}

}
else {

System.out.println("You are under 18.");

}


// =====================================================
// 8. MULTIPLE CONDITIONS USING &&
// =====================================================

int ageValue = 25;

if (ageValue >= 18 && ageValue <= 60) {

System.out.println("Age is between 18 and 60.");

}


// =====================================================
// 9. MULTIPLE CONDITIONS USING ||
// =====================================================

int day = 6;

if (day == 6 || day == 7) {

System.out.println("Weekend.");

}


// =====================================================
// 10. NOT OPERATOR
// =====================================================

boolean isLoggedIn = false;

if (!isLoggedIn) {

System.out.println("Please login.");

}


// =====================================================
// 11. COMPARE TWO NUMBERS
// =====================================================

int a = 50;
int b = 30;

if (a > b) {

System.out.println("a is greater than b.");

}
else if (a < b) {

System.out.println("b is greater than a.");

}
else {

System.out.println("Both are equal.");

}


// =====================================================
// 12. FIND LARGEST OF THREE NUMBERS
// =====================================================

int x = 100;
int y = 200;
int z = 150;

if (x >= y && x >= z) {

System.out.println("x is largest.");

}
else if (y >= x && y >= z) {

System.out.println("y is largest.");

}
else {

System.out.println("z is largest.");

}


// =====================================================
// 13. CHECK LEAP YEAR
// =====================================================

int year = 2024;

if (year % 400 == 0 ||
(year % 4 == 0 && year % 100 != 0)) {

System.out.println(year + " is a Leap Year.");

}
else {

System.out.println(year + " is not a Leap Year.");

}


// =====================================================
// 14. USER INPUT WITH IF
// =====================================================

System.out.println("\nEnter your age:");

int inputAge = sc.nextInt();

if (inputAge >= 18) {

System.out.println("You are eligible to vote.");

}
else {

System.out.println("You are not eligible to vote.");

}


// =====================================================
// 15. USER INPUT - EVEN OR ODD
// =====================================================

System.out.println("\nEnter a number:");

int inputNumber = sc.nextInt();

if (inputNumber % 2 == 0) {

System.out.println("Even number.");

}
else {

System.out.println("Odd number.");

}


// =====================================================
// 16. USER INPUT - PASS OR FAIL
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
// 17. MARKS VALIDATION
// =====================================================

System.out.println("\nEnter marks between 0 and 100:");

double marksInput = sc.nextDouble();

if (marksInput < 0 || marksInput > 100) {

System.out.println("Invalid marks.");

}
else if (marksInput >= 90) {

System.out.println("Grade A+");

}
else if (marksInput >= 80) {

System.out.println("Grade A");

}
else if (marksInput >= 70) {

System.out.println("Grade B");

}
else if (marksInput >= 60) {

System.out.println("Grade C");

}
else if (marksInput >= 40) {

System.out.println("Grade D");

}
else {

System.out.println("Fail.");

}


// =====================================================
// 18. LOGIN EXAMPLE
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
// 19. STRING COMPARISON
// =====================================================

String name = "Vamshi";

if (name.equals("Vamshi")) {

System.out.println("Name matched.");

}


// =====================================================
// 20. STRING IGNORE CASE
// =====================================================

String city = "Hyderabad";

if (city.equalsIgnoreCase("hyderabad")) {

System.out.println("City matched.");

}


// =====================================================
// 21. EMPTY STRING CHECK
// =====================================================

String text = "";

if (text.isEmpty()) {

System.out.println("String is empty.");

}


// =====================================================
// 22. NULL CHECK
// =====================================================

String valueString = null;

if (valueString == null) {

System.out.println("String is null.");

}


// =====================================================
// 23. SHORT-CIRCUIT CONDITION
// =====================================================

String userName = null;

if (userName != null && userName.length() > 0) {

System.out.println("Username is available.");

}
else {

System.out.println("Username is empty or null.");

}


// =====================================================
// 24. IF WITHOUT BRACES
// =====================================================

int n = 10;

if (n > 5)
System.out.println("n is greater than 5.");


// =====================================================
// 25. CONDITIONAL OPERATOR WITH IF
// =====================================================

int score = 80;

String result;

if (score >= 40) {

result = "Pass";

}
else {

result = "Fail";

}

System.out.println("Result: " + result);


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}