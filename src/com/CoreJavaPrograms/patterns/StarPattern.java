package com.CoreJavaPrograms.patterns;


import java.util.Scanner;

public class StarPattern {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. SQUARE PATTERN
// =====================================================

System.out.println("1. Square Pattern");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= 5; j++) {

System.out.print("* ");

}

System.out.println();

}


// =====================================================
// 2. RECTANGLE PATTERN
// =====================================================

System.out.println("\n2. Rectangle Pattern");

for (int i = 1; i <= 4; i++) {

for (int j = 1; j <= 6; j++) {

System.out.print("* ");

}

System.out.println();

}


// =====================================================
// 3. RIGHT ANGLE TRIANGLE
// =====================================================

System.out.println("\n3. Right Angle Triangle");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= i; j++) {

System.out.print("* ");

}

System.out.println();

}


// =====================================================
// 4. INVERTED RIGHT ANGLE TRIANGLE
// =====================================================

System.out.println("\n4. Inverted Right Angle Triangle");

for (int i = 5; i >= 1; i--) {

for (int j = 1; j <= i; j++) {

System.out.print("* ");

}

System.out.println();

}


// =====================================================
// 5. RIGHT ALIGNED TRIANGLE
// =====================================================

System.out.println("\n5. Right Aligned Triangle");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= 5 - i; j++) {

System.out.print("  ");

}

for (int j = 1; j <= i; j++) {

System.out.print("* ");

}

System.out.println();

}


// =====================================================
// 6. INVERTED RIGHT ALIGNED TRIANGLE
// =====================================================

System.out.println("\n6. Inverted Right Aligned Triangle");

for (int i = 5; i >= 1; i--) {

for (int j = 1; j <= 5 - i; j++) {

System.out.print("  ");

}

for (int j = 1; j <= i; j++) {

System.out.print("* ");

}

System.out.println();

}


// =====================================================
// 7. PYRAMID
// =====================================================

System.out.println("\n7. Pyramid");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= 5 - i; j++) {

System.out.print(" ");

}

for (int j = 1; j <= (2 * i - 1); j++) {

System.out.print("*");

}

System.out.println();

}


// =====================================================
// 8. INVERTED PYRAMID
// =====================================================

System.out.println("\n8. Inverted Pyramid");

for (int i = 5; i >= 1; i--) {

for (int j = 1; j <= 5 - i; j++) {

System.out.print(" ");

}

for (int j = 1; j <= (2 * i - 1); j++) {

System.out.print("*");

}

System.out.println();

}


// =====================================================
// 9. DIAMOND
// =====================================================

System.out.println("\n9. Diamond");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= 5 - i; j++) {

System.out.print(" ");

}

for (int j = 1; j <= (2 * i - 1); j++) {

System.out.print("*");

}

System.out.println();

}

for (int i = 4; i >= 1; i--) {

for (int j = 1; j <= 5 - i; j++) {

System.out.print(" ");

}

for (int j = 1; j <= (2 * i - 1); j++) {

System.out.print("*");

}

System.out.println();

}


// =====================================================
// 10. HOLLOW SQUARE
// =====================================================

System.out.println("\n10. Hollow Square");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= 5; j++) {

if (i == 1 ||
i == 5 ||
j == 1 ||
j == 5) {

System.out.print("* ");

}
else {

System.out.print("  ");

}

}

System.out.println();

}


// =====================================================
// 11. HOLLOW RECTANGLE
// =====================================================

System.out.println("\n11. Hollow Rectangle");

for (int i = 1; i <= 4; i++) {

for (int j = 1; j <= 6; j++) {

if (i == 1 ||
i == 4 ||
j == 1 ||
j == 6) {

System.out.print("* ");

}
else {

System.out.print("  ");

}

}

System.out.println();

}


// =====================================================
// 12. HOLLOW RIGHT TRIANGLE
// =====================================================

System.out.println("\n12. Hollow Right Triangle");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= i; j++) {

if (j == 1 ||
j == i ||
i == 5) {

System.out.print("* ");

}
else {

System.out.print("  ");

}

}

System.out.println();

}


// =====================================================
// 13. HOLLOW PYRAMID
// =====================================================

System.out.println("\n13. Hollow Pyramid");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= 5 - i; j++) {

System.out.print(" ");

}

for (int j = 1; j <= (2 * i - 1); j++) {

if (i == 5 ||
j == 1 ||
j == (2 * i - 1)) {

System.out.print("*");

}
else {

System.out.print(" ");

}

}

System.out.println();

}


// =====================================================
// 14. X PATTERN
// =====================================================

System.out.println("\n14. X Pattern");

int size = 5;

for (int i = 1; i <= size; i++) {

for (int j = 1; j <= size; j++) {

if (i == j ||
i + j == size + 1) {

System.out.print("* ");

}
else {

System.out.print("  ");

}

}

System.out.println();

}


// =====================================================
// 15. PLUS PATTERN
// =====================================================

System.out.println("\n15. Plus Pattern");

int plusSize = 5;

for (int i = 1; i <= plusSize; i++) {

for (int j = 1; j <= plusSize; j++) {

if (i == (plusSize + 1) / 2 ||
j == (plusSize + 1) / 2) {

System.out.print("* ");

}
else {

System.out.print("  ");

}

}

System.out.println();

}


// =====================================================
// 16. STAR HOURGLASS
// =====================================================

System.out.println("\n16. Hourglass");

for (int i = 5; i >= 1; i--) {

for (int j = 1; j <= 5 - i; j++) {

System.out.print(" ");

}

for (int j = 1; j <= (2 * i - 1); j++) {

System.out.print("*");

}

System.out.println();

}

for (int i = 2; i <= 5; i++) {

for (int j = 1; j <= 5 - i; j++) {

System.out.print(" ");

}

for (int j = 1; j <= (2 * i - 1); j++) {

System.out.print("*");

}

System.out.println();

}


// =====================================================
// 17. STAR BOW-TIE
// =====================================================

System.out.println("\n17. Bow-Tie");

for (int i = 1; i <= 5; i++) {

for (int j = 1; j <= i; j++) {

System.out.print("*");

}

for (int j = 1; j <= 2 * (5 - i); j++) {

System.out.print(" ");

}

for (int j = 1; j <= i; j++) {

System.out.print("*");

}

System.out.println();

}

for (int i = 4; i >= 1; i--) {

for (int j = 1; j <= i; j++) {

System.out.print("*");

}

for (int j = 1; j <= 2 * (5 - i); j++) {

System.out.print(" ");

}

for (int j = 1; j <= i; j++) {

System.out.print("*");

}

System.out.println();

}


// =====================================================
// 18. USER INPUT PATTERN
// =====================================================

System.out.println("\n18. User Input Triangle");

System.out.println("Enter number of rows:");

int rows = sc.nextInt();

for (int i = 1; i <= rows; i++) {

for (int j = 1; j <= i; j++) {

System.out.print("* ");

}

System.out.println();

}


// =====================================================
// 19. USER INPUT SQUARE
// =====================================================

System.out.println("\n19. User Input Square");

System.out.println("Enter size:");

int squareSize = sc.nextInt();

for (int i = 1; i <= squareSize; i++) {

for (int j = 1; j <= squareSize; j++) {

System.out.print("* ");

}

System.out.println();

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}
