package com.CoreJavaPrograms.arrays;


import java.util.Scanner;

public class ReverseArray {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. REVERSE ARRAY USING FOR LOOP
// =====================================================

int[] numbers = {10, 20, 30, 40, 50};

System.out.println("1. Reverse Array:");

for (int i = numbers.length - 1; i >= 0; i--) {

System.out.print(numbers[i] + " ");

}

System.out.println();


// =====================================================
// 2. REVERSE ARRAY USING WHILE LOOP
// =====================================================

System.out.println("\n2. Reverse using while:");

int i = numbers.length - 1;

while (i >= 0) {

System.out.print(numbers[i] + " ");

i--;

}

System.out.println();


// =====================================================
// 3. STORE REVERSE IN NEW ARRAY
// =====================================================

System.out.println("\n3. Reverse in New Array:");

int[] reversed = new int[numbers.length];

int index = 0;

for (int j = numbers.length - 1; j >= 0; j--) {

reversed[index] = numbers[j];

index++;

}

for (int value : reversed) {

System.out.print(value + " ");

}

System.out.println();


// =====================================================
// 4. REVERSE ARRAY IN-PLACE
// =====================================================

System.out.println("\n4. Reverse In-Place:");

int[] values = {10, 20, 30, 40, 50};

int start = 0;

int end = values.length - 1;

while (start < end) {

int temp = values[start];

values[start] = values[end];

values[end] = temp;

start++;

end--;

}

for (int value : values) {

System.out.print(value + " ");

}

System.out.println();


// =====================================================
// 5. REVERSE USER INPUT ARRAY
// =====================================================

System.out.println("\n5. User Input Array:");

System.out.println("Enter array size:");

int size = sc.nextInt();

int[] inputArray = new int[size];

System.out.println("Enter " + size + " numbers:");

for (int j = 0; j < inputArray.length; j++) {

inputArray[j] = sc.nextInt();

}

System.out.println("Reversed Array:");

for (int j = inputArray.length - 1;
j >= 0;
j--) {

System.out.print(inputArray[j] + " ");

}

System.out.println();


// =====================================================
// 6. REVERSE STRING ARRAY
// =====================================================

String[] names = {
"Java",
"Python",
"C++",
"JavaScript"
};

System.out.println("\n6. Reverse String Array:");

for (int j = names.length - 1;
j >= 0;
j--) {

System.out.println(names[j]);

}


// =====================================================
// 7. REVERSE CHARACTER ARRAY
// =====================================================

char[] characters = {
'A',
'B',
'C',
'D',
'E'
};

System.out.println("\n7. Reverse Character Array:");

for (int j = characters.length - 1;
j >= 0;
j--) {

System.out.print(characters[j] + " ");

}

System.out.println();


// =====================================================
// 8. REVERSE EVEN INDEX ELEMENTS
// =====================================================

int[] data = {
10,
20,
30,
40,
50,
60
};

System.out.println("\n8. Reverse Array:");

for (int j = data.length - 1;
j >= 0;
j--) {

if (j % 2 == 0) {

System.out.print(data[j] + " ");

}

}

System.out.println();


// =====================================================
// 9. REVERSE ARRAY USING METHOD
// =====================================================

System.out.println("\n9. Reverse using method:");

reverseArray(numbers);


// =====================================================
// 10. REVERSE ARRAY IN-PLACE USING METHOD
// =====================================================

int[] array = {
1,
2,
3,
4,
5
};

reverseInPlace(array);

System.out.println("\n10. In-place reverse:");

for (int value : array) {

System.out.print(value + " ");

}

System.out.println();


// =====================================================
// 11. REVERSE 2D ARRAY ROW ORDER
// =====================================================

int[][] matrix = {

{1, 2, 3},

{4, 5, 6},

{7, 8, 9}

};

System.out.println("\n11. Reverse 2D Array Rows:");

for (int row = matrix.length - 1;
row >= 0;
row--) {

for (int column = 0;
column < matrix[row].length;
column++) {

System.out.print(matrix[row][column] + " ");

}

System.out.println();

}


// =====================================================
// 12. REVERSE EACH ROW OF 2D ARRAY
// =====================================================

System.out.println("\n12. Reverse Each Row:");

for (int row = 0;
row < matrix.length;
row++) {

for (int column = matrix[row].length - 1;
column >= 0;
column--) {

System.out.print(matrix[row][column] + " ");

}

System.out.println();

}


sc.close();

}


// =====================================================
// METHOD TO PRINT ARRAY IN REVERSE
// =====================================================

public static void reverseArray(int[] array) {

for (int i = array.length - 1;
i >= 0;
i--) {

System.out.print(array[i] + " ");

}

System.out.println();

}


// =====================================================
// METHOD TO REVERSE ARRAY IN-PLACE
// =====================================================

public static void reverseInPlace(int[] array) {

int start = 0;

int end = array.length - 1;

while (start < end) {

int temp = array[start];

array[start] = array[end];

array[end] = temp;

start++;

end--;

}

}

}