package com.CoreJavaPrograms.arrays;



import java.util.Scanner;

public class TwoDimensionalArray {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. 2D ARRAY CREATION
// =====================================================

int[][] numbers = new int[3][3];

System.out.println("1. 2D Array Creation");

for (int i = 0; i < numbers.length; i++) {

for (int j = 0; j < numbers[i].length; j++) {

System.out.print(numbers[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 2. 2D ARRAY INITIALIZATION
// =====================================================

int[][] matrix = {

{1, 2, 3},

{4, 5, 6},

{7, 8, 9}

};

System.out.println("\n2. 2D Array Initialization");

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

System.out.print(matrix[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 3. ACCESSING ELEMENTS
// =====================================================

System.out.println("\n3. Accessing Elements");

System.out.println("First element: " + matrix[0][0]);

System.out.println("Center element: " + matrix[1][1]);

System.out.println("Last element: " + matrix[2][2]);


// =====================================================
// 4. MODIFYING ELEMENT
// =====================================================

matrix[1][1] = 50;

System.out.println("\n4. After Modification");

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

System.out.print(matrix[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 5. 2D ARRAY INPUT FROM USER
// =====================================================

System.out.println("\n5. User Input");

System.out.println("Enter number of rows:");

int rows = sc.nextInt();

System.out.println("Enter number of columns:");

int columns = sc.nextInt();

int[][] inputMatrix = new int[rows][columns];

System.out.println("Enter matrix elements:");

for (int i = 0; i < inputMatrix.length; i++) {

for (int j = 0;
j < inputMatrix[i].length;
j++) {

inputMatrix[i][j] = sc.nextInt();

}

}

System.out.println("Entered Matrix:");

for (int i = 0; i < inputMatrix.length; i++) {

for (int j = 0;
j < inputMatrix[i].length;
j++) {

System.out.print(inputMatrix[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 6. ROW COUNT AND COLUMN COUNT
// =====================================================

System.out.println("\n6. Rows and Columns");

System.out.println(
"Rows: " + matrix.length
);

System.out.println(
"Columns: " + matrix[0].length
);


// =====================================================
// 7. SUM OF ALL ELEMENTS
// =====================================================

int sum = 0;

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

sum = sum + matrix[i][j];

}

}

System.out.println(
"\n7. Sum: " + sum
);


// =====================================================
// 8. SUM OF EACH ROW
// =====================================================

System.out.println("\n8. Row-wise Sum");

for (int i = 0; i < matrix.length; i++) {

int rowSum = 0;

for (int j = 0; j < matrix[i].length; j++) {

rowSum = rowSum + matrix[i][j];

}

System.out.println(
"Row " + (i + 1)
+ " Sum: " + rowSum
);

}


// =====================================================
// 9. SUM OF EACH COLUMN
// =====================================================

System.out.println("\n9. Column-wise Sum");

for (int j = 0; j < matrix[0].length; j++) {

int columnSum = 0;

for (int i = 0; i < matrix.length; i++) {

columnSum = columnSum + matrix[i][j];

}

System.out.println(
"Column " + (j + 1)
+ " Sum: " + columnSum
);

}


// =====================================================
// 10. FIND MAXIMUM ELEMENT
// =====================================================

int max = matrix[0][0];

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

if (matrix[i][j] > max) {

max = matrix[i][j];

}

}

}

System.out.println(
"\n10. Maximum: " + max
);


// =====================================================
// 11. FIND MINIMUM ELEMENT
// =====================================================

int min = matrix[0][0];

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

if (matrix[i][j] < min) {

min = matrix[i][j];

}

}

}

System.out.println(
"\n11. Minimum: " + min
);


// =====================================================
// 12. MAIN DIAGONAL
// =====================================================

System.out.println("\n12. Main Diagonal");

for (int i = 0; i < matrix.length; i++) {

System.out.println(matrix[i][i]);

}


// =====================================================
// 13. SECONDARY DIAGONAL
// =====================================================

System.out.println("\n13. Secondary Diagonal");

int n = matrix.length;

for (int i = 0; i < n; i++) {

System.out.println(
matrix[i][n - 1 - i]
);

}


// =====================================================
// 14. SUM OF MAIN DIAGONAL
// =====================================================

int diagonalSum = 0;

for (int i = 0; i < matrix.length; i++) {

diagonalSum = diagonalSum + matrix[i][i];

}

System.out.println(
"\n14. Main Diagonal Sum: "
+ diagonalSum
);


// =====================================================
// 15. SUM OF SECONDARY DIAGONAL
// =====================================================

int secondarySum = 0;

for (int i = 0; i < n; i++) {

secondarySum =
secondarySum + matrix[i][n - 1 - i];

}

System.out.println(
"\n15. Secondary Diagonal Sum: "
+ secondarySum
);


// =====================================================
// 16. TRANSPOSE OF MATRIX
// =====================================================

System.out.println("\n16. Transpose");

for (int j = 0; j < matrix[0].length; j++) {

for (int i = 0; i < matrix.length; i++) {

System.out.print(matrix[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 17. MATRIX ADDITION
// =====================================================

int[][] matrixA = {

{1, 2},

{3, 4}

};

int[][] matrixB = {

{5, 6},

{7, 8}

};

int[][] result = new int[2][2];

for (int i = 0; i < matrixA.length; i++) {

for (int j = 0;
j < matrixA[i].length;
j++) {

result[i][j] =
matrixA[i][j] + matrixB[i][j];

}

}

System.out.println("\n17. Matrix Addition");

for (int i = 0; i < result.length; i++) {

for (int j = 0;
j < result[i].length;
j++) {

System.out.print(result[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 18. MATRIX SUBTRACTION
// =====================================================

int[][] subtraction = new int[2][2];

for (int i = 0; i < matrixA.length; i++) {

for (int j = 0;
j < matrixA[i].length;
j++) {

subtraction[i][j] =
matrixA[i][j] - matrixB[i][j];

}

}

System.out.println("\n18. Matrix Subtraction");

for (int i = 0; i < subtraction.length; i++) {

for (int j = 0;
j < subtraction[i].length;
j++) {

System.out.print(subtraction[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 19. DIAGONAL ELEMENT CHECK
// =====================================================

System.out.println("\n19. Diagonal Elements");

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

if (i == j ||
i + j == matrix.length - 1) {

System.out.print(matrix[i][j] + " ");

}

}

}

System.out.println();


// =====================================================
// 20. UPPER TRIANGULAR MATRIX
// =====================================================

System.out.println("\n20. Upper Triangle");

for (int i = 0; i < matrix.length; i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

if (i <= j) {

System.out.print(matrix[i][j] + " ");

}
else {

System.out.print("0 ");

}

}

System.out.println();

}


// =====================================================
// 21. LOWER TRIANGULAR MATRIX
// =====================================================

System.out.println("\n21. Lower Triangle");

for (int i = 0; i < matrix.length; i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

if (i >= j) {

System.out.print(matrix[i][j] + " ");

}
else {

System.out.print("0 ");

}

}

System.out.println();

}


// =====================================================
// 22. SEARCH ELEMENT
// =====================================================

System.out.println("\n22. Search Element");

int search = 8;

boolean found = false;

for (int i = 0; i < matrix.length; i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

if (matrix[i][j] == search) {

System.out.println(
"Found at row " + i
+ ", column " + j
);

found = true;

}

}

}

if (!found) {

System.out.println("Element not found.");

}


// =====================================================
// 23. FOR-EACH TRAVERSAL
// =====================================================

System.out.println("\n23. For-each Traversal");

for (int[] row : matrix) {

for (int value : row) {

System.out.print(value + " ");

}

System.out.println();

}


// =====================================================
// 24. JAGGED ARRAY
// =====================================================

int[][] jagged = {

{1, 2},

{3, 4, 5},

{6, 7, 8, 9}

};

System.out.println("\n24. Jagged Array");

for (int i = 0; i < jagged.length; i++) {

for (int j = 0;
j < jagged[i].length;
j++) {

System.out.print(jagged[i][j] + " ");

}

System.out.println();

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}