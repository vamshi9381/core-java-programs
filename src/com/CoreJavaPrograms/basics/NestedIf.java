package com.CoreJavaPrograms.basics;


import java.util.Scanner;

public class NestedIf {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. BASIC NESTED IF
// =====================================================

int age = 20;
boolean hasIdCard = true;

if (age >= 18) {

if (hasIdCard) {

System.out.println("You can enter.");

}

}


// =====================================================
// 2. NESTED IF-ELSE
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
// 3. THREE-LEVEL NESTED IF
// =====================================================

int studentAge = 20;
boolean isStudent = true;
boolean hasId = true;

if (studentAge >= 18) {

if (isStudent) {

if (hasId) {

System.out.println("Student is allowed.");

}

}

}


// =====================================================
// 4. NESTED IF - EVEN NUMBER
// =====================================================

int number = 20;

if (number > 0) {

if (number % 2 == 0) {

System.out.println("Positive even number.");

}

}


// =====================================================
// 5. NESTED IF - POSITIVE EVEN OR ODD
// =====================================================

int value = 15;

if (value > 0) {

if (value % 2 == 0) {

System.out.println("Positive even number.");

}
else {

System.out.println("Positive odd number.");

}

}
else {

System.out.println("Number is not positive.");

}


// =====================================================
// 6. NESTED IF - LOGIN
// =====================================================

String username = "admin";
String password = "1234";

if (username.equals("admin")) {

if (password.equals("1234")) {

System.out.println("Login successful.");

}
else {

System.out.println("Incorrect password.");

}

}
else {

System.out.println("Incorrect username.");

}


// =====================================================
// 7. NESTED IF - ATM
// =====================================================

double balance = 10000;
double withdrawAmount = 5000;

if (withdrawAmount > 0) {

if (withdrawAmount <= balance) {

balance = balance - withdrawAmount;

System.out.println("Withdrawal successful.");
System.out.println("Remaining balance: " + balance);

}
else {

System.out.println("Insufficient balance.");

}

}
else {

System.out.println("Invalid withdrawal amount.");

}


// =====================================================
// 8. NESTED IF - STUDENT RESULT
// =====================================================

double marks = 75;

if (marks >= 0 && marks <= 100) {

if (marks >= 40) {

System.out.println("Student passed.");

if (marks >= 75) {

System.out.println("Good performance.");

}

}
else {

System.out.println("Student failed.");

}

}
else {

System.out.println("Invalid marks.");

}


// =====================================================
// 9. NESTED IF - AGE AND GENDER
// =====================================================

int personAge = 25;
char gender = 'M';

if (personAge >= 18) {

if (gender == 'M') {

System.out.println("Adult Male.");

}
else if (gender == 'F') {

System.out.println("Adult Female.");

}
else {

System.out.println("Invalid gender.");

}

}
else {

System.out.println("Minor.");

}


// =====================================================
// 10. NESTED IF - LARGEST OF THREE NUMBERS
// =====================================================

int a = 100;
int b = 200;
int c = 150;

if (a > b) {

if (a > c) {

System.out.println("A is largest.");

}
else {

System.out.println("C is largest.");

}

}
else {

if (b > c) {

System.out.println("B is largest.");

}
else {

System.out.println("C is largest.");

}

}


// =====================================================
// 11. USER INPUT - NESTED IF
// =====================================================

System.out.println("\nEnter your age:");

int inputAge = sc.nextInt();

if (inputAge >= 18) {

System.out.println("Do you have a driving license?");

boolean license = sc.nextBoolean();

if (license) {

System.out.println("You can drive.");

}
else {

System.out.println("You cannot drive without a license.");

}

}
else {

System.out.println("You are under 18.");

}


// =====================================================
// 12. USER INPUT - STUDENT ELIGIBILITY
// =====================================================

System.out.println("\nEnter your marks:");

double inputMarks = sc.nextDouble();

if (inputMarks >= 0 && inputMarks <= 100) {

if (inputMarks >= 40) {

System.out.println("You passed.");

if (inputMarks >= 75) {

System.out.println("You got distinction.");

}

}
else {

System.out.println("You failed.");

}

}
else {

System.out.println("Invalid marks.");

}


// =====================================================
// 13. USER INPUT - LOGIN SYSTEM
// =====================================================

sc.nextLine();

System.out.println("\nEnter username:");

String inputUsername = sc.nextLine();

if (inputUsername.equals("admin")) {

System.out.println("Enter password:");

String inputPassword = sc.nextLine();

if (inputPassword.equals("1234")) {

System.out.println("Login successful.");

}
else {

System.out.println("Wrong password.");

}

}
else {

System.out.println("Wrong username.");

}


// =====================================================
// 14. NESTED IF WITH &&
// =====================================================

int ageValue = 25;
boolean citizen = true;

if (ageValue >= 18) {

if (citizen) {

System.out.println("Eligible to vote.");

}

}


// =====================================================
// 15. NESTED IF WITH OR
// =====================================================

int day = 6;

if (day >= 1 && day <= 7) {

if (day == 6 || day == 7) {

System.out.println("Weekend.");

}
else {

System.out.println("Weekday.");

}

}
else {

System.out.println("Invalid day.");

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}