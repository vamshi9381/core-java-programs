package com.CoreJavaPrograms.arrays;



public class ArrayCreation {

public static void main(String[] args) {


// =====================================================
// 1. DECLARATION
// =====================================================

int[] numbers;

numbers = new int[5];

System.out.println("1. Array Declaration and Creation");

System.out.println("Size: " + numbers.length);


// =====================================================
// 2. CREATION WITH DEFAULT VALUES
// =====================================================

int[] values = new int[5];

System.out.println("\n2. Default Values");

for (int i = 0; i < values.length; i++) {

System.out.println(values[i]);

}


// =====================================================
// 3. CREATION AND INITIALIZATION
// =====================================================

int[] marks = {80, 90, 70, 85, 95};

System.out.println("\n3. Array Initialization");

for (int i = 0; i < marks.length; i++) {

System.out.println(marks[i]);

}


// =====================================================
// 4. NEW KEYWORD WITH VALUES
// =====================================================

int[] numbers2 = new int[] {10, 20, 30, 40, 50};

System.out.println("\n4. Using new Keyword");

for (int i = 0; i < numbers2.length; i++) {

System.out.println(numbers2[i]);

}


// =====================================================
// 5. ARRAY OF STRINGS
// =====================================================

String[] names = {"Java", "Python", "C", "C++"};

System.out.println("\n5. String Array");

for (int i = 0; i < names.length; i++) {

System.out.println(names[i]);

}


// =====================================================
// 6. ARRAY OF CHARACTERS
// =====================================================

char[] letters = {'A', 'B', 'C', 'D', 'E'};

System.out.println("\n6. Character Array");

for (int i = 0; i < letters.length; i++) {

System.out.println(letters[i]);

}


// =====================================================
// 7. ARRAY OF DOUBLE
// =====================================================

double[] prices = {10.5, 20.75, 30.25};

System.out.println("\n7. Double Array");

for (int i = 0; i < prices.length; i++) {

System.out.println(prices[i]);

}


// =====================================================
// 8. ARRAY OF BOOLEAN
// =====================================================

boolean[] status = {true, false, true, true};

System.out.println("\n8. Boolean Array");

for (int i = 0; i < status.length; i++) {

System.out.println(status[i]);

}


// =====================================================
// 9. ACCESSING ARRAY ELEMENTS
// =====================================================

int[] data = {100, 200, 300, 400, 500};

System.out.println("\n9. Accessing Elements");

System.out.println("First: " + data[0]);

System.out.println("Second: " + data[1]);

System.out.println("Last: " + data[data.length - 1]);


// =====================================================
// 10. MODIFYING ARRAY ELEMENT
// =====================================================

int[] numbers3 = {10, 20, 30, 40, 50};

System.out.println("\n10. Before Modification");

System.out.println(numbers3[2]);

numbers3[2] = 100;

System.out.println("After Modification");

System.out.println(numbers3[2]);


// =====================================================
// 11. ARRAY LENGTH
// =====================================================

int[] array = {10, 20, 30, 40};

System.out.println("\n11. Array Length");

System.out.println("Length: " + array.length);


// =====================================================
// 12. ARRAY USING LOOP
// =====================================================

int[] loopArray = new int[5];

for (int i = 0; i < loopArray.length; i++) {

loopArray[i] = i + 1;

}

System.out.println("\n12. Array Created Using Loop");

for (int i = 0; i < loopArray.length; i++) {

System.out.println(loopArray[i]);

}


// =====================================================
// 13. ARRAY WITH SAME VALUE
// =====================================================

int[] sameValues = new int[5];

for (int i = 0; i < sameValues.length; i++) {

sameValues[i] = 10;

}

System.out.println("\n13. Same Values");

for (int i = 0; i < sameValues.length; i++) {

System.out.println(sameValues[i]);

}


// =====================================================
// 14. TWO-DIMENSIONAL ARRAY
// =====================================================

int[][] matrix = new int[2][3];

System.out.println("\n14. Two-Dimensional Array");

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

System.out.print(matrix[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 15. TWO-DIMENSIONAL ARRAY WITH VALUES
// =====================================================

int[][] matrix2 = {

{1, 2, 3},

{4, 5, 6},

{7, 8, 9}

};

System.out.println("\n15. 2D Array with Values");

for (int i = 0; i < matrix2.length; i++) {

for (int j = 0; j < matrix2[i].length; j++) {

System.out.print(matrix2[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 16. JAGGED ARRAY
// =====================================================

int[][] jagged = new int[3][];

jagged[0] = new int[2];

jagged[1] = new int[3];

jagged[2] = new int[4];

System.out.println("\n16. Jagged Array");

for (int i = 0; i < jagged.length; i++) {

for (int j = 0; j < jagged[i].length; j++) {

jagged[i][j] = j + 1;

System.out.print(jagged[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 17. ARRAY OF OBJECTS
// =====================================================

String[] languages = new String[3];

languages[0] = "Java";

languages[1] = "Python";

languages[2] = "C++";

System.out.println("\n17. Array of Objects");

for (int i = 0; i < languages.length; i++) {

System.out.println(languages[i]);

}


// =====================================================
// 18. ANONYMOUS ARRAY
// =====================================================

System.out.println("\n18. Anonymous Array");

printArray(new int[] {10, 20, 30, 40});

}


// =====================================================
// METHOD TO PRINT ARRAY
// =====================================================

public static void printArray(int[] array) {

for (int i = 0; i < array.length; i++) {

System.out.println(array[i]);

}

}

}