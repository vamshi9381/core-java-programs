package com.CoreJavaPrograms.basics;


public class TypeCasting {

public static void main(String[] args) {

// =====================================================
// 1. WIDENING TYPE CASTING
// Smaller data type -> Larger data type
// Automatic conversion
// =====================================================

byte b = 10;

short s = b;
 int i = s;
long l = i;
float f = l;
double d = f;

System.out.println("Widening Casting:");
System.out.println("byte   : " + b);
   System.out.println("short  : " + s);
System.out.println("int    : " + i);
System.out.println("long   : " + l);
System.out.println("float  : " + f);
System.out.println("double : " + d);


// =====================================================
// 2. WIDENING CASTING WITH int -> double
// =====================================================

int number = 100;

double decimalNumber = number;

System.out.println("\nint to double:");
  System.out.println("int    : " + number);
System.out.println("double : " + decimalNumber);


// =====================================================
// 3. NARROWING TYPE CASTING
// Larger data type -> Smaller data type
// Manual conversion
// =====================================================

double value = 100.99;

int convertedValue = (int) value;

System.out.println("\nNarrowing Casting:");
  System.out.println("double : " + value);
System.out.println("int    : " + convertedValue);


// =====================================================
// 4. double -> int
// Decimal part is lost
// =====================================================

   double price = 99.75;

int priceInt = (int) price;

System.out.println("\ndouble to int:");
System.out.println("Original : " + price);
  System.out.println("Converted: " + priceInt);


// =====================================================
// 5. int -> byte
// Data loss may occur
// =====================================================

int intValue = 130;

byte byteValue = (byte) intValue;

System.out.println("\nint to byte:");
System.out.println("Original : " + intValue);
System.out.println("Converted: " + byteValue);


// =====================================================
// 6. char -> int
// Widening casting
// =====================================================

char ch = 'A';

int asciiValue = ch;

   System.out.println("\nchar to int:");
System.out.println("Character : " + ch);
System.out.println("ASCII/Unicode value : " + asciiValue);


// =====================================================
// 7. int -> char
// Narrowing casting
// =====================================================

int ascii = 66;

char character = (char) ascii;

System.out.println("\nint to char:");
System.out.println("Integer : " + ascii);
System.out.println("Character : " + character);


// =====================================================
// 8. char -> double
// Widening casting
// =====================================================

char letter = 'A';

double charValue = letter;

System.out.println("\nchar to double:");
     System.out.println("Character : " + letter);
System.out.println("Double : " + charValue);


// =====================================================
// 9. Explicit Casting
// Using the cast operator
// =====================================================

double marks = 85.90;

int intMarks = (int) marks;

System.out.println("\nExplicit Casting:");
System.out.println("Double : " + marks);
System.out.println("Int    : " + intMarks);


// =====================================================
// 10. Implicit Casting
// Java automatically converts the type
// =====================================================

int age = 25;

double newAge = age;

System.out.println("\nImplicit Casting:");
System.out.println("int    : " + age);
System.out.println("double : " + newAge);


// =====================================================
// 11. Data Loss During Narrowing
// =====================================================

int largeNumber = 1000;

byte smallNumber = (byte) largeNumber;

System.out.println("\nData Loss:");
System.out.println("Original int : " + largeNumber);
System.out.println("Converted byte : " + smallNumber);


// =====================================================
// 12. Overflow During Casting
// =====================================================

int number130 = 130;

byte result = (byte) number130;

System.out.println("\nOverflow:");
System.out.println("Original : " + number130);
System.out.println("byte     : " + result);


// =====================================================
// 13. Casting in Arithmetic Operations
// =====================================================

int a = 10;
int c = 3;

double resultDouble = (double) a / c;

System.out.println("\nCasting in Arithmetic:");
System.out.println("10 / 3 = " + resultDouble);


// =====================================================
// 14. Integer Division
// =====================================================

int x = 10;
int y = 3;

int resultInt = x / y;

System.out.println("\nInteger Division:");
System.out.println("10 / 3 = " + resultInt);


// =====================================================
// 15. Casting int division to double
// =====================================================

int p = 10;
int q = 3;

double resultCasting = (double) p / q;

System.out.println("\nint division with casting:");
System.out.println("10 / 3 = " + resultCasting);


// =====================================================
// 16. Object Upcasting
// Child object -> Parent reference
// =====================================================

Dog dog = new Dog();

Animal animal = dog;

System.out.println("\nObject Upcasting:");
animal.sound();


// =====================================================
// 17. Object Downcasting
// Parent reference -> Child reference
// =====================================================

Animal animal2 = new Dog();

Dog dog2 = (Dog) animal2;

System.out.println("\nObject Downcasting:");
dog2.sound();
dog2.run();


// =====================================================
// 18. instanceof with Downcasting
// =====================================================

Animal animal3 = new Dog();

if (animal3 instanceof Dog) {

Dog dog3 = (Dog) animal3;

System.out.println("\ninstanceof + Downcasting:");
dog3.sound();
dog3.run();

}


// =====================================================
// 19. Invalid Downcasting
// ClassCastException example
// =====================================================

Animal animal4 = new Cat();

// Dog dog4 = (Dog) animal4;

// Above statement causes:
// ClassCastException


// =====================================================
// 20. Wrapper Class Conversion
// String -> int
// =====================================================

String numberString = "100";

int parsedNumber = Integer.parseInt(numberString);

System.out.println("\nString to int:");
System.out.println("String : " + numberString);
System.out.println("int    : " + parsedNumber);


// =====================================================
// 21. int -> String
// =====================================================

int valueInt = 500;

String valueString = String.valueOf(valueInt);

System.out.println("\nint to String:");
System.out.println("int    : " + valueInt);
System.out.println("String : " + valueString);


// =====================================================
// 22. String -> double
// =====================================================

String decimalString = "99.50";

double decimalValue = Double.parseDouble(decimalString);

System.out.println("\nString to double:");
System.out.println("String : " + decimalString);
System.out.println("double : " + decimalValue);

}
}


// =====================================================
// Parent Class
// =====================================================

class Animal {

void sound() {

System.out.println("Animal makes sound");

}

}


// =====================================================
// Child Class
// =====================================================

class Dog extends Animal {

void sound() {

System.out.println("Dog barks");

}

void run() {

System.out.println("Dog runs");

}

}


// =====================================================
// Another Child Class
// =====================================================

class Cat extends Animal {

void sound() {

System.out.println("Cat meows");

}

}