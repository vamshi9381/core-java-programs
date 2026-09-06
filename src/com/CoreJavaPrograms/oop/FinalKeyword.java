package com.CoreJavaPrograms.oop;

class FinalParent {

final void display() {
System.out.println("This method cannot be overridden");
}

}

final class FinalChild extends FinalParent {

void show() {
System.out.println("Final class can have normal methods");
}

}

public class FinalKeyword {

public static void main(String[] args) {

final int age = 25;

System.out.println("Age: " + age);

FinalChild child = new FinalChild();

child.display();
child.show();
}
}