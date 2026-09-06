package com.CoreJavaPrograms.oop;

abstract class AbstractionVehicle {

abstract void start();

void stop() {
System.out.println("Vehicle stopped");
}
}

class AbstractionCar extends AbstractionVehicle {

@Override
void start() {
System.out.println("Car starts with a key");
}
}

public class Abstraction {

public static void main(String[] args) {

AbstractionVehicle vehicle = new AbstractionCar();

vehicle.start();
vehicle.stop();
}
}