package com.CoreJavaPrograms.oop;

class HierarchicalAnimal {

String name = "Animal";

void eat() {

System.out.println("Animal is eating");

}

void sleep() {

System.out.println("Animal is sleeping");

}

}


class HierarchicalDog extends HierarchicalAnimal {

void bark() {

System.out.println("Dog is barking");

}

}


class HierarchicalCat extends HierarchicalAnimal {

void meow() {

System.out.println("Cat is meowing");

}

}


public class HierarchicalInheritance {

public static void main(String[] args) {


// Dog object

HierarchicalDog dog = new HierarchicalDog();

System.out.println("Dog:");

dog.eat();
dog.sleep();
dog.bark();


// Cat object

HierarchicalCat cat = new HierarchicalCat();

System.out.println();

System.out.println("Cat:");

cat.eat();
cat.sleep();
cat.meow();

}

}