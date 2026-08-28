package com.CoreJavaPrograms.basics;

public class VariablesInJava {


    // 1. Instance variable
    int instanceVariable = 100;

    // 2. Static / Class variable
    static int staticVariable = 200;

    // 3. final variable (constant)
    final int FINAL_VARIABLE = 300;

    public void displayVariables() {

        // 4. Local variable
        int localVariable = 400;

        // 5. Primitive variables
        byte byteValue = 10;
       short shortValue = 20;
        int intValue = 30;
        long longValue = 40L;
       float floatValue = 50.5f;
        double doubleValue = 60.55;
        char charValue = 'A';
        boolean booleanValue = true;

        // 6. Reference variable
        String name = "Vamshi";

        // Display variables
        System.out.println("Instance Variable : " + instanceVariable);
      System.out.println("Static Variable   : " + staticVariable);
        System.out.println("Final Variable    : " + FINAL_VARIABLE);
       System.out.println("Local Variable    : " + localVariable);

        System.out.println("\n--- Primitive Variables ---");

        System.out.println("byte    : " + byteValue);
       System.out.println("short   : " + shortValue);
        System.out.println("int     : " + intValue);
      System.out.println("long    : " + longValue);
        System.out.println("float   : " + floatValue);
      System.out.println("double  : " + doubleValue);
        System.out.println("char    : " + charValue);
        System.out.println("boolean : " + booleanValue);

        System.out.println("\n--- Reference Variable ---");
        System.out.println("String  : " + name);
    }

    public static void main(String[] args) {

        // Creating object
    	VariablesInJava obj = new VariablesInJava();

        // Calling method
        obj.displayVariables();

        // Accessing instance variable using object
        System.out.println("\nAccessing Instance Variable: "
                + obj.instanceVariable);

        // Accessing static variable using class name
        System.out.println("Accessing Static Variable: "
                + VariablesInJava.staticVariable);

        // Changing instance variable
        obj.instanceVariable = 500;

        // Changing static variable
        VariablesInJava.staticVariable = 600;

        System.out.println("\nAfter Changing Values:");
        System.out.println("Instance Variable : "
                + obj.instanceVariable);
        System.out.println("Static Variable   : "
                + VariablesInJava.staticVariable);

        // Final variable cannot be changed
        // obj.FINAL_VARIABLE = 700; // ERROR
    }
}