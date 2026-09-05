package com.CoreJavaPrograms.methods;



public class MethodParameters {

public static void main(String[] args) {

// 1. One parameter
greet("Vamshi");


// 2. Two parameters
add(10, 20);


// 3. Multiple parameters
studentDetails("Vamshi", 25, "Java");


// 4. Parameters with different data types
displayDetails("Vamshi", 25, 45000.50);


// 5. Passing values to a return-type method
int result = multiply(10, 5);

System.out.println("Multiplication: " + result);

}


// Method with one parameter

static void greet(String name) {

System.out.println("Hello " + name);

}


// Method with two parameters

static void add(int a, int b) {

int sum = a + b;

System.out.println("Addition: " + sum);

}


// Method with multiple parameters

static void studentDetails(String name, int age, String course) {

System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Course: " + course);

}


// Parameters with different data types

static void displayDetails(String name, int age, double salary) {

System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Salary: " + salary);

}


// Parameters with return value

static int multiply(int a, int b) {

return a * b;

}

}