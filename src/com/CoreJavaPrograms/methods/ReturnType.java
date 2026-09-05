package com.CoreJavaPrograms.methods;



public class ReturnType {

public static void main(String[] args) {

// 1. int return type

int sum = add(10, 20);

System.out.println("Addition: " + sum);


// 2. double return type

double result = divide(10, 3);

System.out.println("Division: " + result);


// 3. String return type

String message = getMessage();

System.out.println("Message: " + message);


// 4. boolean return type

boolean status = isEligible(20);

System.out.println("Eligible: " + status);


// 5. char return type

char grade = getGrade();

System.out.println("Grade: " + grade);


// 6. void return type

display();

}


// int return type

static int add(int a, int b) {

return a + b;

}


// double return type

static double divide(double a, double b) {

return a / b;

}


// String return type

static String getMessage() {

return "Welcome to Java";

}


// boolean return type

static boolean isEligible(int age) {

return age >= 18;

}


// char return type

static char getGrade() {

return 'A';

}


// void means no value is returned

static void display() {

System.out.println("This method does not return a value");

}

}