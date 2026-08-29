package com.CoreJavaPrograms.basics;


public class Operators {

public static void main(String[] args) {

// =====================================================
// 1. ARITHMETIC OPERATORS
// +  -  *  /  %
// =====================================================

int a = 20;
int b = 6;

System.out.println("ARITHMETIC OPERATORS");

System.out.println("Addition       : " + (a + b));
System.out.println("Subtraction    : " + (a - b));
  System.out.println("Multiplication : " + (a * b));
System.out.println("Division       : " + (a / b));
System.out.println("Modulus        : " + (a % b));


// =====================================================
// 2. RELATIONAL OPERATORS
// ==  !=  >  <  >=  <=
// =====================================================

System.out.println("\nRELATIONAL OPERATORS");

System.out.println("a == b : " + (a == b));
System.out.println("a != b : " + (a != b));
System.out.println("a > b  : " + (a > b));
System.out.println("a < b  : " + (a < b));
System.out.println("a >= b : " + (a >= b));
System.out.println("a <= b : " + (a <= b));


// =====================================================
// 3. ASSIGNMENT OPERATORS
// =  +=  -=  *=  /=  %=
// =====================================================

System.out.println("\nASSIGNMENT OPERATORS");

int x = 10;

System.out.println("Initial x : " + x);

x += 5;
System.out.println("x += 5 : " + x);

x -= 3;
System.out.println("x -= 3 : " + x);

x *= 2;
System.out.println("x *= 2 : " + x);

x /= 4;
System.out.println("x /= 4 : " + x);

x %= 3;
System.out.println("x %= 3 : " + x);


// =====================================================
// 4. UNARY OPERATORS
// +  -  ++  --  !
// =====================================================

System.out.println("\nUNARY OPERATORS");

int number = 10;

System.out.println("Positive : " + (+number));
System.out.println("Negative : " + (-number));

number++;

System.out.println("After ++ : " + number);

number--;

System.out.println("After -- : " + number);

boolean flag = true;

System.out.println("NOT : " + (!flag));


// =====================================================
// 5. PRE-INCREMENT
// =====================================================

System.out.println("\nPRE-INCREMENT");

int pre = 10;

System.out.println("Original : " + pre);
System.out.println("++pre    : " + (++pre));
System.out.println("After    : " + pre);


// =====================================================
// 6. POST-INCREMENT
// =====================================================

System.out.println("\nPOST-INCREMENT");

int post = 10;

System.out.println("Original : " + post);
System.out.println("post++   : " + (post++));
System.out.println("After    : " + post);


// =====================================================
// 7. PRE-DECREMENT
// =====================================================

System.out.println("\nPRE-DECREMENT");

int preDec = 10;

System.out.println("Original : " + preDec);
System.out.println("--preDec : " + (--preDec));
System.out.println("After    : " + preDec);


// =====================================================
// 8. POST-DECREMENT
// =====================================================

System.out.println("\nPOST-DECREMENT");

int postDec = 10;

System.out.println("Original : " + postDec);
System.out.println("postDec--: " + (postDec--));
System.out.println("After    : " + postDec);


// =====================================================
// 9. LOGICAL OPERATORS
// &&  ||  !
// =====================================================

System.out.println("\nLOGICAL OPERATORS");

boolean p = true;
boolean q = false;

System.out.println("p && q : " + (p && q));
System.out.println("p || q : " + (p || q));
System.out.println("!p     : " + (!p));
System.out.println("!q     : " + (!q));


// =====================================================
// 10. SHORT-CIRCUIT AND
// &&
// =====================================================

System.out.println("\nSHORT-CIRCUIT AND");

int age = 20;

if (age >= 18 && age <= 60) {

System.out.println("Eligible");

}


// =====================================================
// 11. SHORT-CIRCUIT OR
// ||
// =====================================================

System.out.println("\nSHORT-CIRCUIT OR");

int day = 6;

if (day == 6 || day == 7) {

System.out.println("Weekend");

}


// =====================================================
// 12. BITWISE OPERATORS
// &  |  ^  ~
// =====================================================

System.out.println("\nBITWISE OPERATORS");

int m = 5;
int n = 3;

System.out.println("m & n : " + (m & n));
System.out.println("m | n : " + (m | n));
System.out.println("m ^ n : " + (m ^ n));
System.out.println("~m    : " + (~m));


// =====================================================
// 13. BITWISE AND
// =====================================================

System.out.println("\nBITWISE AND");

System.out.println("5 & 3 = " + (5 & 3));


// =====================================================
// 14. BITWISE OR
// =====================================================

System.out.println("\nBITWISE OR");

System.out.println("5 | 3 = " + (5 | 3));


// =====================================================
// 15. BITWISE XOR
// =====================================================

System.out.println("\nBITWISE XOR");

System.out.println("5 ^ 3 = " + (5 ^ 3));


// =====================================================
// 16. LEFT SHIFT
// <<
// =====================================================

System.out.println("\nLEFT SHIFT");

int left = 5;

System.out.println("5 << 1 = " + (left << 1));
System.out.println("5 << 2 = " + (left << 2));


// =====================================================
// 17. RIGHT SHIFT
// >>
// =====================================================

System.out.println("\nRIGHT SHIFT");

int right = 20;

System.out.println("20 >> 1 = " + (right >> 1));
System.out.println("20 >> 2 = " + (right >> 2));


// =====================================================
// 18. UNSIGNED RIGHT SHIFT
// >>>
// =====================================================

System.out.println("\nUNSIGNED RIGHT SHIFT");

int unsigned = 20;

System.out.println("20 >>> 1 = " + (unsigned >>> 1));


// =====================================================
// 19. TERNARY OPERATOR
// condition ? value1 : value2
// =====================================================

System.out.println("\nTERNARY OPERATOR");

int marks = 75;

String result = marks >= 40 ? "Pass" : "Fail";

System.out.println("Result : " + result);


// =====================================================
// 20. NESTED TERNARY OPERATOR
// =====================================================

System.out.println("\nNESTED TERNARY");

int score = 85;

String grade = score >= 90 ? "A+" :
score >= 80 ? "A" :
score >= 70 ? "B" :
score >= 60 ? "C" :
score >= 40 ? "D" : "Fail";

System.out.println("Grade : " + grade);


// =====================================================
// 21. instanceof OPERATOR
// =====================================================

System.out.println("\nINSTANCEOF OPERATOR");

String name = "Vamshi";

System.out.println(name instanceof String);


// =====================================================
// 22. STRING CONCATENATION
// + operator
// =====================================================

System.out.println("\nSTRING CONCATENATION");

String firstName = "Vamshi";
String lastName = "Goud";

System.out.println(firstName + " " + lastName);


// =====================================================
// 23. OPERATOR PRECEDENCE
// =====================================================

System.out.println("\nOPERATOR PRECEDENCE");

int result1 = 10 + 20 * 2;

System.out.println("10 + 20 * 2 = " + result1);

int result2 = (10 + 20) * 2;

System.out.println("(10 + 20) * 2 = " + result2);


// =====================================================
// 24. DIVISION AND MODULUS
// =====================================================

System.out.println("\nDIVISION AND MODULUS");

int value1 = 17;
int value2 = 5;

System.out.println("17 / 5 = " + (value1 / value2));
System.out.println("17 % 5 = " + (value1 % value2));

}

}