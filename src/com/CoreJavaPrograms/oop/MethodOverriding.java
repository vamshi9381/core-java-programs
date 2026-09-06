package com.CoreJavaPrograms.oop;

class OverrideAnimal {

void sound() {

System.out.println("Animal makes a sound");

}

}


class OverrideDog extends OverrideAnimal {

@Override
void sound() {

System.out.println("Dog barks");

}

}


class OverrideCat extends OverrideAnimal {

@Override
void sound() {

System.out.println("Cat meows");

}

}


public class MethodOverriding {

public static void main(String[] args) {

OverrideDog dog = new OverrideDog();

dog.sound();


OverrideCat cat = new OverrideCat();

cat.sound();

}

}