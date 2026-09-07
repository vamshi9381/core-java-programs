package com.CoreJavaPrograms.oop;

class MultiPerson {

String name = "Vamshi";

void eat() {

System.out.println("Person is eating");

}

}


class MultiEmployee extends MultiPerson {

int salary = 50000;

void work() {

System.out.println("Employee is working");

}

}


class MultiDeveloper extends MultiEmployee {

String language = "Java";

void writeCode() {

System.out.println("Developer is writing " + language + " code");

}

}


public class MultilevelInheritance {

public static void main(String[] args) {

MultiDeveloper developer = new MultiDeveloper();

System.out.println("Name: " + developer.name);

developer.eat();

System.out.println("Salary: " + developer.salary);

developer.work();

System.out.println("Language: " + developer.language);

developer.writeCode();

}

}