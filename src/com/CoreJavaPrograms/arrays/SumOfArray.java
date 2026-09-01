package com.CoreJavaPrograms.arrays;



import java.util.Scanner;

public class SumOfArray {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. BASIC SUM OF ARRAY
// =====================================================

int[] numbers = {10, 20, 30, 40, 50};

int sum = 0;

for (int i = 0; i < numbers.length; i++) {

sum = sum + numbers[i];

}

System.out.println("1. Sum of Array: " + sum);


// =====================================================
// 2. SUM USING FOR-EACH LOOP
// =====================================================

int[] values = {5, 10, 15, 20, 25};

int total = 0;

for (int value : values) {

total = total + value;

}

System.out.println("\n2. Sum using for-each: " + total);


// =====================================================
// 3. SUM USING WHILE LOOP
// =====================================================

int[] data = {10, 20, 30, 40, 50};

int whileSum = 0;

int i = 0;

while (i < data.length) {

whileSum = whileSum + data[i];

i++;

}

System.out.println("\n3. Sum using while: " + whileSum);


// =====================================================
// 4. SUM USING DO-WHILE LOOP
// =====================================================

int[] numbers2 = {1, 2, 3, 4, 5};

int doWhileSum = 0;

int index = 0;

if (numbers2.length > 0) {

do {

doWhileSum = doWhileSum + numbers2[index];

index++;

}
while (index < numbers2.length);

}

System.out.println(
"\n4. Sum using do-while: " + doWhileSum
);


// =====================================================
// 5. SUM OF USER INPUT ARRAY
// =====================================================

System.out.println("\nEnter array size:");

int size = sc.nextInt();

int[] inputArray = new int[size];

int inputSum = 0;

System.out.println("Enter " + size + " numbers:");

for (int j = 0; j < inputArray.length; j++) {

inputArray[j] = sc.nextInt();

inputSum = inputSum + inputArray[j];

}

System.out.println("5. Sum: " + inputSum);


// =====================================================
// 6. SUM OF POSITIVE NUMBERS
// =====================================================

int[] mixedNumbers = {
10,
-20,
30,
-40,
50
};

int positiveSum = 0;

for (int number : mixedNumbers) {

if (number > 0) {

positiveSum = positiveSum + number;

}

}

System.out.println(
"\n6. Sum of positive numbers: "
+ positiveSum
);


// =====================================================
// 7. SUM OF NEGATIVE NUMBERS
// =====================================================

int negativeSum = 0;

for (int number : mixedNumbers) {

if (number < 0) {

negativeSum = negativeSum + number;

}

}

System.out.println(
"\n7. Sum of negative numbers: "
+ negativeSum
);


// =====================================================
// 8. SUM OF EVEN NUMBERS
// =====================================================

int evenSum = 0;

for (int number : mixedNumbers) {

if (number % 2 == 0) {

evenSum = evenSum + number;

}

}

System.out.println(
"\n8. Sum of even numbers: "
+ evenSum
);


// =====================================================
// 9. SUM OF ODD NUMBERS
// =====================================================

int oddSum = 0;

for (int number : mixedNumbers) {

if (number % 2 != 0) {

oddSum = oddSum + number;

}

}

System.out.println(
"\n9. Sum of odd numbers: "
+ oddSum
);


// =====================================================
// 10. SUM OF ELEMENTS AT EVEN INDEX
// =====================================================

int[] array = {
10,
20,
30,
40,
50,
60
};

int evenIndexSum = 0;

for (int j = 0; j < array.length; j++) {

if (j % 2 == 0) {

evenIndexSum = evenIndexSum + array[j];

}

}

System.out.println(
"\n10. Sum at even indexes: "
+ evenIndexSum
);


// =====================================================
// 11. SUM OF ELEMENTS AT ODD INDEX
// =====================================================

int oddIndexSum = 0;

for (int j = 0; j < array.length; j++) {

if (j % 2 != 0) {

oddIndexSum = oddIndexSum + array[j];

}

}

System.out.println(
"\n11. Sum at odd indexes: "
+ oddIndexSum
);


// =====================================================
// 12. SUM OF FIRST HALF
// =====================================================

int halfSum = 0;

for (int j = 0; j < array.length / 2; j++) {

halfSum = halfSum + array[j];

}

System.out.println(
"\n12. Sum of first half: "
+ halfSum
);


// =====================================================
// 13. SUM OF SECOND HALF
// =====================================================

int secondHalfSum = 0;

for (int j = array.length / 2;
j < array.length;
j++) {

secondHalfSum =
secondHalfSum + array[j];

}

System.out.println(
"\n13. Sum of second half: "
+ secondHalfSum
);


// =====================================================
// 14. SUM OF 2D ARRAY
// =====================================================

int[][] matrix = {

{1, 2, 3},

{4, 5, 6},

{7, 8, 9}

};

int matrixSum = 0;

for (int row = 0; row < matrix.length; row++) {

for (int column = 0;
column < matrix[row].length;
column++) {

matrixSum =
matrixSum + matrix[row][column];

}

}

System.out.println(
"\n14. Sum of 2D Array: "
+ matrixSum
);


// =====================================================
// 15. SUM OF EACH ROW
// =====================================================

System.out.println("\n15. Sum of Each Row:");

for (int row = 0; row < matrix.length; row++) {

int rowSum = 0;

for (int column = 0;
column < matrix[row].length;
column++) {

rowSum =
rowSum + matrix[row][column];

}

System.out.println(
"Row " + (row + 1) + " Sum: " + rowSum
);

}


// =====================================================
// 16. SUM OF EACH COLUMN
// =====================================================

System.out.println("\n16. Sum of Each Column:");

for (int column = 0;
column < matrix[0].length;
column++) {

int columnSum = 0;

for (int row = 0;
row < matrix.length;
row++) {

columnSum =
columnSum + matrix[row][column];

}

System.out.println(
"Column " + (column + 1)
+ " Sum: " + columnSum
);

}


// =====================================================
// 17. SUM USING METHOD
// =====================================================

int result = calculateSum(numbers);

System.out.println(
"\n17. Sum using method: "
+ result
);


// =====================================================
// 18. AVERAGE OF ARRAY
// =====================================================

int[] marks = {
80,
90,
70,
60,
100
};

int marksSum = 0;

for (int mark : marks) {

marksSum = marksSum + mark;

}

double average =
(double) marksSum / marks.length;

System.out.println(
"\n18. Average: " + average
);


sc.close();

}


// =====================================================
// METHOD TO CALCULATE SUM
// =====================================================

public static int calculateSum(int[] array) {

int sum = 0;

for (int number : array) {

sum = sum + number;

}

return sum;

}

}
