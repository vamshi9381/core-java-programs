package com.CoreJavaPrograms.methods;



public class MethodOverloading {

public static void main(String[] args) {

// 1. Two int parameters
System.out.println("Addition: " + add(10, 20));


// 2. Three int parameters
System.out.println("Addition: " + add(10, 20, 30));


// 3. Two double parameters
System.out.println("Addition: " + add(10.5, 20.5));


// 4. Different data types
System.out.println("Addition: " + add(10, 20.5));


// 5. String parameter
display("Vamshi");


// 6. Two String parameters
display("Vamshi", "Java");

}


// Method 1

static int add(int a, int b) {

return a + b;

}


// Method 2
// Same method name but three parameters

static int add(int a, int b, int c) {

return a + b + c;

}


// Method 3
// Same method name but different data type

static double add(double a, double b) {

return a + b;

}


// Method 4
// Same method name but different parameter types

static double add(int a, double b) {

return a + b;

}


// Method 5

static void display(String name) {

System.out.println("Name: " + name);

}


// Method 6
// Same method name but two parameters

static void display(String name, String course) {

System.out.println("Name: " + name);
System.out.println("Course: " + course);

}

}