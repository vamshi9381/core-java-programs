
package com.CoreJavaPrograms.oop;

class Employee {

String name = "Vamshi";
int salary = 50000;

void work() {

System.out.println(name + " is working");

}

void displaySalary() {

System.out.println("Salary: " + salary);

}

}


class Developer extends Employee {

String programmingLanguage = "Java";

void writeCode() {

System.out.println("Developer is writing " + programmingLanguage + " code");

}

}


public class SingleInheritance {

public static void main(String[] args) {

Developer developer = new Developer();


// Parent class variables

System.out.println("Name: " + developer.name);
System.out.println("Salary: " + developer.salary);


// Parent class methods

developer.work();
developer.displaySalary();


// Child class method

developer.writeCode();

}

}