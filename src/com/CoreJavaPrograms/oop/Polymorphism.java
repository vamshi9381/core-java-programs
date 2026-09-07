package com.CoreJavaPrograms.oop;


// Parent class

class PolyAnimal {

void sound() {

System.out.println("Animal makes a sound");

}

}


// Child class 1

class PolyDog extends PolyAnimal {

@Override
void sound() {

System.out.println("Dog barks");

}

}


// Child class 2

class PolyCat extends PolyAnimal {

@Override
void sound() {

System.out.println("Cat meows");

}

}


// Main class

public class Polymorphism {

public static void main(String[] args) {


// Runtime polymorphism

PolyAnimal animal1 = new PolyDog();

animal1.sound();


PolyAnimal animal2 = new PolyCat();

animal2.sound();


// Compile-time polymorphism

System.out.println();


System.out.println("Addition: " + add(10, 20));

System.out.println("Addition: " + add(10, 20, 30));

System.out.println("Addition: " + add(10.5, 20.5));

}


// Method overloading

static int add(int a, int b) {

return a + b;

}


static int add(int a, int b, int c) {

return a + b + c;

}


static double add(double a, double b) {

return a + b;

}

}