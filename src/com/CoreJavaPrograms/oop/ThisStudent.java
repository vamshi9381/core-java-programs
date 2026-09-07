package com.CoreJavaPrograms.oop;

class ThisStudent {

String name;
int age;

ThisStudent(String name, int age) {

// this.name → instance variable
// name → constructor parameter

this.name = name;
this.age = age;

}

void display() {

System.out.println("Name: " + this.name);
System.out.println("Age: " + this.age);

}

void show() {

this.display();

}

}


public class ThisKeyword {

public static void main(String[] args) {

ThisStudent student = new ThisStudent("Vamshi", 25);

student.display();

student.show();

}

}