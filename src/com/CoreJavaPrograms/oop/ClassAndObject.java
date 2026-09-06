package com.CoreJavaPrograms.oop;

class Student {

String name;
int age;
String course;

void displayDetails() {

System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Course: " + course);

}

}


public class ClassAndObject {

public static void main(String[] args) {

Student student1 = new Student();

student1.name = "Vamshi";
student1.age = 25;
student1.course = "Java";

Student student2 = new Student();

student2.name = "Rahul";
student2.age = 24;
student2.course = "Python";

System.out.println("Student 1:");

student1.displayDetails();

System.out.println();

System.out.println("Student 2:");

student2.displayDetails();

}

}