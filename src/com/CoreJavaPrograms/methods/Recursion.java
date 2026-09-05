package com.CoreJavaPrograms.methods;


public class Recursion {

public static void main(String[] args) {

// 1. Count down
System.out.println("Countdown:");

countDown(5);


// 2. Factorial
int factorialResult = factorial(5);

System.out.println("Factorial of 5: " + factorialResult);


// 3. Sum of numbers
int sum = sum(5);

System.out.println("Sum of 1 to 5: " + sum);


// 4. Fibonacci
System.out.println("Fibonacci:");

for(int i = 0; i < 7; i++) {

System.out.print(fibonacci(i) + " ");

}

}


// Recursion example

static void countDown(int n) {

if(n == 0) {
return;
}

System.out.println(n);

countDown(n - 1);

}


// Factorial using recursion

static int factorial(int n) {

if(n == 0 || n == 1) {
return 1;
}

return n * factorial(n - 1);

}


// Sum using recursion

static int sum(int n) {

if(n == 0) {
return 0;
}

return n + sum(n - 1);

}


// Fibonacci using recursion

static int fibonacci(int n) {

if(n == 0) {
return 0;
}

if(n == 1) {
return 1;
}

return fibonacci(n - 1) + fibonacci(n - 2);

}

}