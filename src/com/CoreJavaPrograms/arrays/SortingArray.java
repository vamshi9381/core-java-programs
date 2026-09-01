package com.CoreJavaPrograms.arrays;


import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. ASCENDING ORDER USING NESTED LOOPS
// =====================================================

int[] numbers = {50, 20, 40, 10, 30};

for (int i = 0; i < numbers.length - 1; i++) {

for (int j = i + 1; j < numbers.length; j++) {

if (numbers[i] > numbers[j]) {

int temp = numbers[i];

numbers[i] = numbers[j];

numbers[j] = temp;

}

}

}

System.out.println("1. Ascending Order:");

for (int number : numbers) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 2. DESCENDING ORDER USING NESTED LOOPS
// =====================================================

int[] values = {50, 20, 40, 10, 30};

for (int i = 0; i < values.length - 1; i++) {

for (int j = i + 1; j < values.length; j++) {

if (values[i] < values[j]) {

int temp = values[i];

values[i] = values[j];

values[j] = temp;

}

}

}

System.out.println("\n2. Descending Order:");

for (int value : values) {

System.out.print(value + " ");

}

System.out.println();


// =====================================================
// 3. ASCENDING USING Arrays.sort()
// =====================================================

int[] data = {90, 30, 70, 10, 50};

Arrays.sort(data);

System.out.println("\n3. Using Arrays.sort():");

for (int number : data) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 4. DESCENDING USING Arrays.sort()
// =====================================================

Integer[] descending = {
90,
30,
70,
10,
50
};

Arrays.sort(
descending,
java.util.Collections.reverseOrder()
);

System.out.println("\n4. Descending using Arrays.sort():");

for (int number : descending) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 5. SORT USER INPUT ARRAY
// =====================================================

System.out.println("\nEnter array size:");

int size = sc.nextInt();

int[] inputArray = new int[size];

System.out.println("Enter " + size + " numbers:");

for (int i = 0; i < inputArray.length; i++) {

inputArray[i] = sc.nextInt();

}

Arrays.sort(inputArray);

System.out.println("Sorted Array:");

for (int number : inputArray) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 6. SORT STRING ARRAY
// =====================================================

String[] names = {
"Vamshi",
"Ravi",
"Arun",
"Rahul",
"John"
};

Arrays.sort(names);

System.out.println("\n6. Sorted String Array:");

for (String name : names) {

System.out.println(name);

}


// =====================================================
// 7. SORT CHARACTER ARRAY
// =====================================================

char[] characters = {
'D',
'A',
'C',
'B',
'E'
};

Arrays.sort(characters);

System.out.println("\n7. Sorted Character Array:");

for (char character : characters) {

System.out.print(character + " ");

}

System.out.println();


// =====================================================
// 8. BUBBLE SORT - ASCENDING
// =====================================================

int[] bubble = {
50,
30,
40,
10,
20
};

for (int i = 0; i < bubble.length - 1; i++) {

for (int j = 0;
j < bubble.length - 1 - i;
j++) {

if (bubble[j] > bubble[j + 1]) {

int temp = bubble[j];

bubble[j] = bubble[j + 1];

bubble[j + 1] = temp;

}

}

}

System.out.println("\n8. Bubble Sort:");

for (int number : bubble) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 9. BUBBLE SORT - DESCENDING
// =====================================================

int[] bubbleDescending = {
50,
30,
40,
10,
20
};

for (int i = 0;
i < bubbleDescending.length - 1;
i++) {

for (int j = 0;
j < bubbleDescending.length - 1 - i;
j++) {

if (bubbleDescending[j] <
bubbleDescending[j + 1]) {

int temp = bubbleDescending[j];

bubbleDescending[j] =
bubbleDescending[j + 1];

bubbleDescending[j + 1] = temp;

}

}

}

System.out.println("\n9. Bubble Sort Descending:");

for (int number : bubbleDescending) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 10. SELECTION SORT
// =====================================================

int[] selection = {
64,
25,
12,
22,
11
};

for (int i = 0; i < selection.length - 1; i++) {

int minIndex = i;

for (int j = i + 1;
j < selection.length;
j++) {

if (selection[j] <
selection[minIndex]) {

minIndex = j;

}

}

int temp = selection[i];

selection[i] = selection[minIndex];

selection[minIndex] = temp;

}

System.out.println("\n10. Selection Sort:");

for (int number : selection) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 11. INSERTION SORT
// =====================================================

int[] insertion = {
5,
2,
4,
6,
1,
3
};

for (int i = 1;
i < insertion.length;
i++) {

int key = insertion[i];

int j = i - 1;

while (j >= 0 &&
insertion[j] > key) {

insertion[j + 1] = insertion[j];

j--;

}

insertion[j + 1] = key;

}

System.out.println("\n11. Insertion Sort:");

for (int number : insertion) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 12. FIND ARRAY ALREADY SORTED OR NOT
// =====================================================

int[] sortedArray = {
10,
20,
30,
40,
50
};

boolean sorted = true;

for (int i = 0;
i < sortedArray.length - 1;
i++) {

if (sortedArray[i] >
sortedArray[i + 1]) {

sorted = false;

break;

}

}

System.out.println(
"\n12. Is array sorted? " + sorted
);


// =====================================================
// 13. SORT ONLY PART OF ARRAY
// =====================================================

int[] partial = {
50,
40,
30,
20,
10
};

Arrays.sort(partial, 1, 4);

System.out.println("\n13. Partial Sorting:");

for (int number : partial) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 14. COPY AND SORT WITHOUT CHANGING ORIGINAL
// =====================================================

int[] original = {
40,
10,
30,
20,
50
};

int[] sortedCopy =
Arrays.copyOf(original, original.length);

Arrays.sort(sortedCopy);

System.out.println(
"\n14. Original Array:"
);

for (int number : original) {

System.out.print(number + " ");

}

System.out.println();

System.out.println(
"Sorted Copy:"
);

for (int number : sortedCopy) {

System.out.print(number + " ");

}

System.out.println();


// =====================================================
// 15. SORT 2D ARRAY ROW-WISE
// =====================================================

int[][] matrix = {

{30, 10, 20},

{60, 40, 50},

{90, 70, 80}

};

for (int i = 0; i < matrix.length; i++) {

Arrays.sort(matrix[i]);

}

System.out.println("\n15. Row-wise 2D Sorting:");

for (int i = 0; i < matrix.length; i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

System.out.print(matrix[i][j] + " ");

}

System.out.println();

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}