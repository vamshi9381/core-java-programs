

import java.util.Scanner;

public class ScannerDemo {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. READ INTEGER
// =====================================================

System.out.println("Enter your age:");

int age = sc.nextInt();

System.out.println("Age: " + age);


// =====================================================
// 2. READ BYTE
// =====================================================

System.out.println("\nEnter a byte value:");

byte byteValue = sc.nextByte();

System.out.println("Byte: " + byteValue);


// =====================================================
// 3. READ SHORT
// =====================================================

System.out.println("\nEnter a short value:");

short shortValue = sc.nextShort();

System.out.println("Short: " + shortValue);


// =====================================================
// 4. READ LONG
// =====================================================

System.out.println("\nEnter a long value:");

long longValue = sc.nextLong();

System.out.println("Long: " + longValue);


// =====================================================
// 5. READ FLOAT
// =====================================================

System.out.println("\nEnter a float value:");

float floatValue = sc.nextFloat();

System.out.println("Float: " + floatValue);


// =====================================================
// 6. READ DOUBLE
// =====================================================

System.out.println("\nEnter a double value:");

double doubleValue = sc.nextDouble();

System.out.println("Double: " + doubleValue);


// =====================================================
// 7. READ BOOLEAN
// =====================================================

System.out.println("\nEnter true or false:");

boolean booleanValue = sc.nextBoolean();

System.out.println("Boolean: " + booleanValue);


// =====================================================
// 8. READ WORD USING next()
// =====================================================

// Consume leftover newline
sc.nextLine();

System.out.println("\nEnter your first name:");

String firstName = sc.next();

System.out.println("First Name: " + firstName);


// =====================================================
// 9. READ COMPLETE LINE USING nextLine()
// =====================================================

System.out.println("\nEnter your full name:");

String fullName = sc.nextLine();

System.out.println("Full Name: " + fullName);


// =====================================================
// 10. READ CHARACTER
// Scanner does not have nextChar()
// So we use charAt(0)
// =====================================================

System.out.println("\nEnter your gender character:");

char gender = sc.next().charAt(0);

System.out.println("Gender: " + gender);


// =====================================================
// 11. READ MULTIPLE VALUES
// =====================================================

System.out.println("\nEnter two numbers:");

int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("First Number : " + a);
System.out.println("Second Number: " + b);
System.out.println("Sum          : " + (a + b));


// =====================================================
// 12. SIMPLE STUDENT INPUT PROGRAM
// =====================================================

sc.nextLine();

System.out.println("\n--- Student Details ---");

System.out.println("Enter student name:");

String studentName = sc.nextLine();

System.out.println("Enter student age:");

int studentAge = sc.nextInt();

System.out.println("Enter student marks:");

double marks = sc.nextDouble();

System.out.println("\nStudent Details:");

System.out.println("Name  : " + studentName);
System.out.println("Age   : " + studentAge);
System.out.println("Marks : " + marks);


// =====================================================
// 13. hasNextInt()
// Check whether next input is an integer
// =====================================================

sc.nextLine();

System.out.println("\nEnter a number:");

if (sc.hasNextInt()) {

int number = sc.nextInt();

System.out.println("You entered: " + number);

}
else {

System.out.println("Input is not an integer.");

}


// =====================================================
// 14. hasNextDouble()
// =====================================================

sc.nextLine();

System.out.println("\nEnter a decimal number:");

if (sc.hasNextDouble()) {

double number = sc.nextDouble();

System.out.println("You entered: " + number);

}
else {

System.out.println("Input is not a decimal number.");

}


// =====================================================
// 15. CLOSE SCANNER
// =====================================================

sc.close();

}

}