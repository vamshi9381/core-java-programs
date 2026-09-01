package com.CoreJavaPrograms.arrays;



public class ArrayTraversal {

public static void main(String[] args) {


// =====================================================
// 1. BASIC ARRAY TRAVERSAL USING FOR LOOP
// =====================================================

int[] numbers = {10, 20, 30, 40, 50};

System.out.println("1. Traversal using for loop:");

for (int i = 0; i < numbers.length; i++) {

System.out.println(numbers[i]);

}


// =====================================================
// 2. TRAVERSAL USING FOR-EACH LOOP
// =====================================================

System.out.println("\n2. Traversal using for-each:");

for (int number : numbers) {

System.out.println(number);

}


// =====================================================
// 3. TRAVERSAL USING WHILE LOOP
// =====================================================

System.out.println("\n3. Traversal using while loop:");

int i = 0;

while (i < numbers.length) {

System.out.println(numbers[i]);

i++;

}


// =====================================================
// 4. TRAVERSAL USING DO-WHILE LOOP
// =====================================================

System.out.println("\n4. Traversal using do-while:");

int j = 0;

if (numbers.length > 0) {

do {

System.out.println(numbers[j]);

j++;

}
while (j < numbers.length);

}


// =====================================================
// 5. FORWARD TRAVERSAL WITH INDEX
// =====================================================

System.out.println("\n5. Index and Value:");

for (int index = 0; index < numbers.length; index++) {

System.out.println(
"Index: " + index
+ ", Value: " + numbers[index]
);

}


// =====================================================
// 6. REVERSE TRAVERSAL
// =====================================================

System.out.println("\n6. Reverse Traversal:");

for (int index = numbers.length - 1;
index >= 0;
index--) {

System.out.println(numbers[index]);

}


// =====================================================
// 7. REVERSE TRAVERSAL WITH INDEX
// =====================================================

System.out.println("\n7. Reverse Index and Value:");

for (int index = numbers.length - 1;
index >= 0;
index--) {

System.out.println(
"Index: " + index
+ ", Value: " + numbers[index]
);

}


// =====================================================
// 8. TRAVERSE ONLY EVEN ELEMENTS
// =====================================================

System.out.println("\n8. Even Elements:");

for (int number : numbers) {

if (number % 2 == 0) {

System.out.println(number);

}

}


// =====================================================
// 9. TRAVERSE ONLY ODD ELEMENTS
// =====================================================

System.out.println("\n9. Odd Elements:");

for (int number : numbers) {

if (number % 2 != 0) {

System.out.println(number);

}

}


// =====================================================
// 10. TRAVERSE POSITIVE ELEMENTS
// =====================================================

int[] values = {-10, 20, -30, 40, 50};

System.out.println("\n10. Positive Elements:");

for (int value : values) {

if (value > 0) {

System.out.println(value);

}

}


// =====================================================
// 11. TRAVERSE NEGATIVE ELEMENTS
// =====================================================

System.out.println("\n11. Negative Elements:");

for (int value : values) {

if (value < 0) {

System.out.println(value);

}

}


// =====================================================
// 12. TRAVERSE STRING ARRAY
// =====================================================

String[] names = {
"Vamshi",
"Ravi",
"Rahul",
"Arun"
};

System.out.println("\n12. String Array:");

for (int index = 0;
index < names.length;
index++) {

System.out.println(names[index]);

}


// =====================================================
// 13. STRING ARRAY USING FOR-EACH
// =====================================================

System.out.println("\n13. String Array using for-each:");

for (String name : names) {

System.out.println(name);

}


// =====================================================
// 14. CHARACTER ARRAY
// =====================================================

char[] characters = {
'A',
'B',
'C',
'D',
'E'
};

System.out.println("\n14. Character Array:");

for (char character : characters) {

System.out.println(character);

}


// =====================================================
// 15. DOUBLE ARRAY
// =====================================================

double[] prices = {
10.5,
20.75,
30.25,
40.50
};

System.out.println("\n15. Double Array:");

for (double price : prices) {

System.out.println(price);

}


// =====================================================
// 16. 2D ARRAY TRAVERSAL
// =====================================================

int[][] matrix = {

{1, 2, 3},

{4, 5, 6},

{7, 8, 9}

};

System.out.println("\n16. 2D Array:");

for (int row = 0;
row < matrix.length;
row++) {

for (int column = 0;
column < matrix[row].length;
column++) {

System.out.print(matrix[row][column] + " ");

}

System.out.println();

}


// =====================================================
// 17. 2D ARRAY USING FOR-EACH
// =====================================================

System.out.println("\n17. 2D Array using for-each:");

for (int[] row : matrix) {

for (int value : row) {

System.out.print(value + " ");

}

System.out.println();

}


// =====================================================
// 18. REVERSE TRAVERSAL OF STRING ARRAY
// =====================================================

System.out.println("\n18. Reverse String Array:");

for (int index = names.length - 1;
index >= 0;
index--) {

System.out.println(names[index]);

}


// =====================================================
// 19. TRAVERSE ALTERNATE ELEMENTS
// =====================================================

System.out.println("\n19. Alternate Elements:");

for (int index = 0;
index < numbers.length;
index += 2) {

System.out.println(numbers[index]);

}


// =====================================================
// 20. TRAVERSE FROM SPECIFIC INDEX
// =====================================================

System.out.println("\n20. From Index 2:");

for (int index = 2;
index < numbers.length;
index++) {

System.out.println(numbers[index]);

}


// =====================================================
// 21. TRAVERSE ARRAY USING METHOD
// =====================================================

System.out.println("\n21. Traversal using method:");

printArray(numbers);


// =====================================================
// 22. TRAVERSE 2D ARRAY USING METHOD
// =====================================================

System.out.println("\n22. 2D Traversal using method:");

printMatrix(matrix);

}


// =====================================================
// METHOD FOR 1D ARRAY
// =====================================================

public static void printArray(int[] array) {

for (int i = 0; i < array.length; i++) {

System.out.println(array[i]);

}

}


// =====================================================
// METHOD FOR 2D ARRAY
// =====================================================

public static void printMatrix(int[][] matrix) {

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

System.out.print(matrix[i][j] + " ");

}

System.out.println();

}

}

}