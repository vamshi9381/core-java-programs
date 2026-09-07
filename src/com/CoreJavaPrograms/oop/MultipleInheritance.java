package com.CoreJavaPrograms.oop;

interface FatherFeature {

void money();
}

interface MotherFeature {

void property();
}

class MultipleChild implements FatherFeature, MotherFeature {

@Override
public void money() {
System.out.println("Child gets father's money");
}

@Override
public void property() {
System.out.println("Child gets mother's property");
}
}

public class MultipleInheritance {

public static void main(String[] args) {

MultipleChild child = new MultipleChild();

child.money();
child.property();
}
}