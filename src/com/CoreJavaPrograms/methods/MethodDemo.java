package com.CoreJavaPrograms.methods;

public class MethodDemo {

public static void main(String[] args) {

// 1. Calling method without parameters
greet();


// 2. Calling method with parameters
add(10, 20);


// 3. Calling method with return value
int result = multiply(5, 4);

System.out.println("Multiplication: " + result);


// 4. Calling method with multiple parameters
displayStudent("Vamshi", 25);


// 5. Calling non-static method
MethodDemo obj = new MethodDemo();

obj.sayHello();

}


// Method without parameters and without return value

static void greet() {

System.out.println("Hello Java");

}


// Method with parameters and without return value

static void add(int a, int b) {

int sum = a + b;

System.out.println("Addition: " + sum);

}


// Method with parameters and with return value

static int multiply(int a, int b) {

return a * b;

}


// Method with multiple parameters

static void displayStudent(String name, int age) {

System.out.println("Name: " + name);
System.out.println("Age: " + age);

}


// Non-static method

void sayHello() {

System.out.println("Hello from non-static method");

}

}