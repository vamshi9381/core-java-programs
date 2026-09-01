package com.CoreJavaPrograms.arrays;



import java.util.Scanner;

public class MaxElement {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. FIND MAXIMUM ELEMENT
// =====================================================

int[] numbers = {10, 50, 30, 90, 20};

int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {

if (numbers[i] > max) {

max = numbers[i];

}

}

System.out.println("1. Maximum element: " + max);


// =====================================================
// 2. FIND MAXIMUM USING FOR-EACH
// =====================================================

int[] values = {25, 75, 15, 95, 45};

int maximum = values[0];

for (int value : values) {

if (value > maximum) {

maximum = value;

}

}

System.out.println("\n2. Maximum using for-each: " + maximum);


// =====================================================
// 3. MAXIMUM WITH NEGATIVE NUMBERS
// =====================================================

int[] negativeNumbers = {-50, -10, -30, -5, -100};

int maxNegative = negativeNumbers[0];

for (int i = 1; i < negativeNumbers.length; i++) {

if (negativeNumbers[i] > maxNegative) {

maxNegative = negativeNumbers[i];

}

}

System.out.println(
"\n3. Maximum with negative numbers: "
+ maxNegative
);


// =====================================================
// 4. MAXIMUM USING USER INPUT
// =====================================================

System.out.println("\nEnter array size:");

int size = sc.nextInt();

if (size > 0) {

int[] inputArray = new int[size];

System.out.println("Enter " + size + " numbers:");

for (int i = 0; i < inputArray.length; i++) {

inputArray[i] = sc.nextInt();

}

int inputMax = inputArray[0];

for (int i = 1; i < inputArray.length; i++) {

if (inputArray[i] > inputMax) {

inputMax = inputArray[i];

}

}

System.out.println(
"4. Maximum element: " + inputMax
);

}
else {

System.out.println("Array size must be greater than 0.");

}


// =====================================================
// 5. MAXIMUM AND ITS INDEX
// =====================================================

int[] data = {10, 40, 90, 30, 90, 20};

int largest = data[0];

int maxIndex = 0;

for (int i = 1; i < data.length; i++) {

if (data[i] > largest) {

largest = data[i];

maxIndex = i;

}

}

System.out.println(
"\n5. Maximum: " + largest
);

System.out.println(
"Index: " + maxIndex
);


// =====================================================
// 6. FIND ALL OCCURRENCES OF MAXIMUM
// =====================================================

System.out.println("\n6. Maximum occurrences:");

for (int i = 0; i < data.length; i++) {

if (data[i] == largest) {

System.out.println(
"Maximum found at index: " + i
);

}

}


// =====================================================
// 7. MAXIMUM OF TWO ELEMENTS
// =====================================================

int a = 100;

int b = 200;

int maxTwo;

if (a > b) {

maxTwo = a;

}
else {

maxTwo = b;

}

System.out.println(
"\n7. Maximum of two: " + maxTwo
);


// =====================================================
// 8. MAXIMUM OF THREE ELEMENTS
// =====================================================

int x = 50;

int y = 90;

int z = 70;

int maxThree = x;

if (y > maxThree) {

maxThree = y;

}

if (z > maxThree) {

maxThree = z;

}

System.out.println(
"\n8. Maximum of three: " + maxThree
);


// =====================================================
// 9. MAXIMUM OF 2D ARRAY
// =====================================================

int[][] matrix = {

{10, 20, 30},

{40, 90, 60},

{70, 80, 50}

};

int matrixMax = matrix[0][0];

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

if (matrix[i][j] > matrixMax) {

matrixMax = matrix[i][j];

}

}

}

System.out.println(
"\n9. Maximum of 2D array: "
+ matrixMax
);


// =====================================================
// 10. MAXIMUM OF EACH ROW
// =====================================================

System.out.println("\n10. Maximum of each row:");

for (int i = 0; i < matrix.length; i++) {

int rowMax = matrix[i][0];

for (int j = 1; j < matrix[i].length; j++) {

if (matrix[i][j] > rowMax) {

rowMax = matrix[i][j];

}

}

System.out.println(
"Row " + (i + 1)
+ " maximum: " + rowMax
);

}


// =====================================================
// 11. MAXIMUM OF EACH COLUMN
// =====================================================

System.out.println("\n11. Maximum of each column:");

for (int j = 0; j < matrix[0].length; j++) {

int columnMax = matrix[0][j];

for (int i = 1; i < matrix.length; i++) {

if (matrix[i][j] > columnMax) {

columnMax = matrix[i][j];

}

}

System.out.println(
"Column " + (j + 1)
+ " maximum: " + columnMax
);

}


// =====================================================
// 12. SECOND LARGEST ELEMENT
// =====================================================

int[] numbers2 = {10, 50, 30, 90, 20};

int first = Integer.MIN_VALUE;

int second = Integer.MIN_VALUE;

for (int number : numbers2) {

if (number > first) {

second = first;

first = number;

}
else if (number > second && number != first) {

second = number;

}

}

System.out.println(
"\n12. Largest: " + first
);

if (second != Integer.MIN_VALUE) {

System.out.println(
"Second largest: " + second
);

}
else {

System.out.println(
"Second largest does not exist."
);

}


// =====================================================
// 13. MAXIMUM USING METHOD
// =====================================================

int result = findMax(numbers);

System.out.println(
"\n13. Maximum using method: " + result
);


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}


// =====================================================
// METHOD TO FIND MAXIMUM
// =====================================================

public static int findMax(int[] array) {

int max = array[0];

for (int i = 1; i < array.length; i++) {

if (array[i] > max) {

max = array[i];

}

}

return max;

}

}