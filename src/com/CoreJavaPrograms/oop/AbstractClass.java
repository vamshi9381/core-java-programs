package com.CoreJavaPrograms.oop;

abstract class AbstractVehicle {

String brand = "Toyota";

abstract void start();

void stop() {
System.out.println("Vehicle stopped");
}

void displayBrand() {
System.out.println("Brand: " + brand);
}
}

class AbstractCar extends AbstractVehicle {

@Override
void start() {
System.out.println("Car starts using a key");
}
}

public class AbstractClass {

public static void main(String[] args) {

AbstractCar car = new AbstractCar();

car.displayBrand();
car.start();
car.stop();
}
}