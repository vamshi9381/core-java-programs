package com.CoreJavaPrograms.oop;

class StaticStudent {

String name;
int age;

static String college = "ABC College";


// Static variable

static int studentCount = 0;


// Constructor

StaticStudent(String name, int age) {

this.name = name;
this.age = age;

studentCount++;

}


// Instance method

void display() {

System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("College: " + college);

}


// Static method

static void showCollege() {

System.out.println("College: " + college);

}

}


public class StaticKeyword {


// Static block

static {

System.out.println("Static block executed");

}


public static void main(String[] args) {

System.out.println("Main method started");


// Calling static method without object

StaticStudent.showCollege();


// Creating objects

StaticStudent student1 =
new StaticStudent("Vamshi", 25);

StaticStudent student2 =
new StaticStudent("Rahul", 24);


// Calling instance methods

student1.display();

System.out.println();

student2.display();


// Accessing static variable

System.out.println();

System.out.println("Total Students: "
+ StaticStudent.studentCount);

}

}