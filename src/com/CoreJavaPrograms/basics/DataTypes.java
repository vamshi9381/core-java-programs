package com.CoreJavaPrograms.basics;


public class DataTypes {

    public static void main(String[] args) {

        // =====================================================
        // 1. BYTE
        // =====================================================
        byte byteValue = 100;

        System.out.println("BYTE");
        System.out.println("Value : " + byteValue);
        System.out.println("Size  : " + Byte.BYTES + " byte");
        System.out.println("Min   : " + Byte.MIN_VALUE);
        System.out.println("Max   : " + Byte.MAX_VALUE);


        // =====================================================
        // 2. SHORT
        // =====================================================
        short shortValue = 30000;

        System.out.println("\nSHORT");
        System.out.println("Value : " + shortValue);
        System.out.println("Size  : " + Short.BYTES + " bytes");
        System.out.println("Min   : " + Short.MIN_VALUE);
        System.out.println("Max   : " + Short.MAX_VALUE);


        // =====================================================
        // 3. INT
        // =====================================================
        int intValue = 100000;

        System.out.println("\nINT");
        System.out.println("Value : " + intValue);
        System.out.println("Size  : " + Integer.BYTES + " bytes");
        System.out.println("Min   : " + Integer.MIN_VALUE);
        System.out.println("Max   : " + Integer.MAX_VALUE);


        // =====================================================
        // 4. LONG
        // =====================================================
        long longValue = 10000000000L;

        System.out.println("\nLONG");
        System.out.println("Value : " + longValue);
        System.out.println("Size  : " + Long.BYTES + " bytes");
        System.out.println("Min   : " + Long.MIN_VALUE);
        System.out.println("Max   : " + Long.MAX_VALUE);


        // =====================================================
        // 5. FLOAT
        // =====================================================
        float floatValue = 25.5f;

        System.out.println("\nFLOAT");
        System.out.println("Value : " + floatValue);
        System.out.println("Size  : " + Float.BYTES + " bytes");
        System.out.println("Min   : " + Float.MIN_VALUE);
        System.out.println("Max   : " + Float.MAX_VALUE);


        // =====================================================
        // 6. DOUBLE
        // =====================================================
        double doubleValue = 12345.6789;

        System.out.println("\nDOUBLE");
        System.out.println("Value : " + doubleValue);
        System.out.println("Size  : " + Double.BYTES + " bytes");
        System.out.println("Min   : " + Double.MIN_VALUE);
        System.out.println("Max   : " + Double.MAX_VALUE);


        // =====================================================
        // 7. CHAR
        // =====================================================
        char charValue = 'A';

        System.out.println("\nCHAR");
        System.out.println("Value : " + charValue);
        System.out.println("Unicode Value : " + (int) charValue);
        System.out.println("Min   : " + (int) Character.MIN_VALUE);
        System.out.println("Max   : " + (int) Character.MAX_VALUE);


        // =====================================================
        // 8. BOOLEAN
        // =====================================================
        boolean booleanValue = true;

        System.out.println("\nBOOLEAN");
        System.out.println("Value : " + booleanValue);


        // =====================================================
        // 9. STRING - Reference Data Type
        // =====================================================
        String name = "Vamshi";

        System.out.println("\nSTRING");
        System.out.println("Value : " + name);


        // =====================================================
        // 10. ARRAY - Reference Data Type
        // =====================================================
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\nARRAY");
        System.out.println("First Element : " + numbers[0]);
        System.out.println("Array Length  : " + numbers.length);


        // =====================================================
        // 11. OBJECT - Reference Data Type
        // =====================================================
        DataTypes object = new DataTypes();

        System.out.println("\nOBJECT");
        System.out.println("Object : " + object);


        // =====================================================
        // 12. TYPE CASTING
        // =====================================================

        // Widening Casting
        int number = 100;
        double widenedNumber = number;

        System.out.println("\nWIDENING CASTING");
        System.out.println("int value    : " + number);
        System.out.println("double value : " + widenedNumber);


        // Narrowing Casting
        double decimalNumber = 100.99;
        int narrowedNumber = (int) decimalNumber;

        System.out.println("\nNARROWING CASTING");
        System.out.println("double value : " + decimalNumber);
        System.out.println("int value    : " + narrowedNumber);


        // =====================================================
        // 13. LITERALS
        // =====================================================

        int decimal = 100;
        int binary = 0b1010;
        int octal = 012;
        int hexadecimal = 0xA;

        long longLiteral = 100L;
        float floatLiteral = 10.5F;
        double doubleLiteral = 10.5D;
        char charLiteral = 'A';
        boolean booleanLiteral = true;

        System.out.println("\nLITERALS");
        System.out.println("Decimal      : " + decimal);
        System.out.println("Binary       : " + binary);
        System.out.println("Octal        : " + octal);
        System.out.println("Hexadecimal  : " + hexadecimal);
        System.out.println("Long         : " + longLiteral);
        System.out.println("Float        : " + floatLiteral);
        System.out.println("Double       : " + doubleLiteral);
        System.out.println("Character    : " + charLiteral);
        System.out.println("Boolean      : " + booleanLiteral);


        // =====================================================
        // 14. var - Local Variable Type Inference
        // =====================================================

        var age = 25;
        var studentName = "Vamshi";
        var salary = 25000.50;
        var isJavaEasy = true;

        System.out.println("\nVAR");
        System.out.println("Age          : " + age);
        System.out.println("Name         : " + studentName);
        System.out.println("Salary       : " + salary);
        System.out.println("Java Easy?   : " + isJavaEasy);
    }
}