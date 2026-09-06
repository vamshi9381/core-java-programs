package com.CoreJavaPrograms.oop;

class ConstructorStudent {

String name;
int age;

ConstructorStudent() {

name = "Unknown";
age = 0;

}

ConstructorStudent(String name, int age) {

this.name = name;
this.age = age;

}

void display() {

System.out.println("Name: " + name);
System.out.println("Age: " + age);

}

}


public class Constructor {

public static void main(String[] args) {

ConstructorStudent student1 = new ConstructorStudent();

student1.display();


ConstructorStudent student2 =
new ConstructorStudent("Vamshi", 25);

student2.display();

}

}