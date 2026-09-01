package com.CoreJavaPrograms.arrays;



import java.util.Scanner;

public class MatrixDemo {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. MATRIX DISPLAY
// =====================================================

int[][] matrix = {

{1, 2, 3},

{4, 5, 6},

{7, 8, 9}

};

System.out.println("1. Matrix:");

displayMatrix(matrix);


// =====================================================
// 2. MATRIX ADDITION
// =====================================================

int[][] matrixA = {

{1, 2},

{3, 4}

};

int[][] matrixB = {

{5, 6},

{7, 8}

};

int[][] addition = new int[2][2];

for (int i = 0; i < matrixA.length; i++) {

for (int j = 0; j < matrixA[i].length; j++) {

addition[i][j] =
matrixA[i][j] + matrixB[i][j];

}

}

System.out.println("\n2. Matrix Addition:");

displayMatrix(addition);


// =====================================================
// 3. MATRIX SUBTRACTION
// =====================================================

int[][] subtraction = new int[2][2];

for (int i = 0; i < matrixA.length; i++) {

for (int j = 0; j < matrixA[i].length; j++) {

subtraction[i][j] =
matrixA[i][j] - matrixB[i][j];

}

}

System.out.println("\n3. Matrix Subtraction:");

displayMatrix(subtraction);


// =====================================================
// 4. MATRIX MULTIPLICATION
// =====================================================

int[][] firstMatrix = {

{1, 2},

{3, 4}

};

int[][] secondMatrix = {

{5, 6},

{7, 8}

};

int[][] multiplication = new int[2][2];

for (int i = 0; i < firstMatrix.length; i++) {

for (int j = 0; j < secondMatrix[0].length; j++) {

for (int k = 0;
k < secondMatrix.length;
k++) {

multiplication[i][j] =
multiplication[i][j]
+ firstMatrix[i][k]
* secondMatrix[k][j];

}

}

}

System.out.println("\n4. Matrix Multiplication:");

displayMatrix(multiplication);


// =====================================================
// 5. TRANSPOSE
// =====================================================

System.out.println("\n5. Transpose:");

int[][] transpose = new int[3][3];

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

transpose[j][i] = matrix[i][j];

}

}

displayMatrix(transpose);


// =====================================================
// 6. MAIN DIAGONAL
// =====================================================

System.out.println("\n6. Main Diagonal:");

for (int i = 0; i < matrix.length; i++) {

System.out.print(matrix[i][i] + " ");

}

System.out.println();


// =====================================================
// 7. SECONDARY DIAGONAL
// =====================================================

System.out.println("\n7. Secondary Diagonal:");

int n = matrix.length;

for (int i = 0; i < n; i++) {

System.out.print(
matrix[i][n - 1 - i] + " "
);

}

System.out.println();


// =====================================================
// 8. MAIN DIAGONAL SUM
// =====================================================

int mainDiagonalSum = 0;

for (int i = 0; i < matrix.length; i++) {

mainDiagonalSum =
mainDiagonalSum + matrix[i][i];

}

System.out.println(
"\n8. Main Diagonal Sum: "
+ mainDiagonalSum
);


// =====================================================
// 9. SECONDARY DIAGONAL SUM
// =====================================================

int secondaryDiagonalSum = 0;

for (int i = 0; i < n; i++) {

secondaryDiagonalSum =
secondaryDiagonalSum
+ matrix[i][n - 1 - i];

}

System.out.println(
"\n9. Secondary Diagonal Sum: "
+ secondaryDiagonalSum
);


// =====================================================
// 10. TOTAL MATRIX SUM
// =====================================================

int total = 0;

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

total = total + matrix[i][j];

}

}

System.out.println(
"\n10. Matrix Sum: " + total
);


// =====================================================
// 11. ROW SUM
// =====================================================

System.out.println("\n11. Row Sums:");

for (int i = 0; i < matrix.length; i++) {

int rowSum = 0;

for (int j = 0; j < matrix[i].length; j++) {

rowSum =
rowSum + matrix[i][j];

}

System.out.println(
"Row " + (i + 1)
+ ": " + rowSum
);

}


// =====================================================
// 12. COLUMN SUM
// =====================================================

System.out.println("\n12. Column Sums:");

for (int j = 0;
j < matrix[0].length;
j++) {

int columnSum = 0;

for (int i = 0;
i < matrix.length;
i++) {

columnSum =
columnSum + matrix[i][j];

}

System.out.println(
"Column " + (j + 1)
+ ": " + columnSum
);

}


// =====================================================
// 13. MAXIMUM ELEMENT
// =====================================================

int max = matrix[0][0];

for (int i = 0; i < matrix.length; i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

if (matrix[i][j] > max) {

max = matrix[i][j];

}

}

}

System.out.println(
"\n13. Maximum: " + max
);


// =====================================================
// 14. MINIMUM ELEMENT
// =====================================================

int min = matrix[0][0];

for (int i = 0; i < matrix.length; i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

if (matrix[i][j] < min) {

min = matrix[i][j];

}

}

}

System.out.println(
"\n14. Minimum: " + min
);


// =====================================================
// 15. SEARCH ELEMENT
// =====================================================

int search = 5;

boolean found = false;

for (int i = 0; i < matrix.length; i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

if (matrix[i][j] == search) {

System.out.println(
"\n15. " + search
+ " found at [" + i
+ "][" + j + "]"
);

found = true;

}

}

}

if (!found) {

System.out.println(
"\n15. Element not found."
);

}


// =====================================================
// 16. IDENTITY MATRIX CHECK
// =====================================================

int[][] identity = {

{1, 0, 0},

{0, 1, 0},

{0, 0, 1}

};

boolean isIdentity = true;

for (int i = 0;
i < identity.length;
i++) {

for (int j = 0;
j < identity[i].length;
j++) {

if (i == j) {

if (identity[i][j] != 1) {

isIdentity = false;

}

}
else {

if (identity[i][j] != 0) {

isIdentity = false;

}

}

}

}

System.out.println(
"\n16. Identity Matrix: "
+ isIdentity
);


// =====================================================
// 17. SYMMETRIC MATRIX CHECK
// =====================================================

int[][] symmetric = {

{1, 2, 3},

{2, 4, 5},

{3, 5, 6}

};

boolean isSymmetric = true;

for (int i = 0;
i < symmetric.length;
i++) {

for (int j = 0;
j < symmetric[i].length;
j++) {

if (symmetric[i][j] !=
symmetric[j][i]) {

isSymmetric = false;

}

}

}

System.out.println(
"\n17. Symmetric Matrix: "
+ isSymmetric
);


// =====================================================
// 18. UPPER TRIANGULAR MATRIX
// =====================================================

System.out.println(
"\n18. Upper Triangular Matrix:"
);

for (int i = 0;
i < matrix.length;
i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

if (i <= j) {

System.out.print(
matrix[i][j] + " "
);

}
else {

System.out.print("0 ");

}

}

System.out.println();

}


// =====================================================
// 19. LOWER TRIANGULAR MATRIX
// =====================================================

System.out.println(
"\n19. Lower Triangular Matrix:"
);

for (int i = 0;
i < matrix.length;
i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

if (i >= j) {

System.out.print(
matrix[i][j] + " "
);

}
else {

System.out.print("0 ");

}

}

System.out.println();

}


// =====================================================
// 20. MATRIX INPUT FROM USER
// =====================================================

System.out.println(
"\n20. Enter matrix rows:"
);

int rows = sc.nextInt();

System.out.println(
"Enter matrix columns:"
);

int columns = sc.nextInt();

int[][] userMatrix =
new int[rows][columns];

System.out.println(
"Enter matrix elements:"
);

for (int i = 0;
i < userMatrix.length;
i++) {

for (int j = 0;
j < userMatrix[i].length;
j++) {

userMatrix[i][j] =
sc.nextInt();

}

}

System.out.println(
"Your Matrix:"
);

displayMatrix(userMatrix);


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}


// =====================================================
// DISPLAY MATRIX METHOD
// =====================================================

public static void displayMatrix(int[][] matrix) {

for (int i = 0;
i < matrix.length;
i++) {

for (int j = 0;
j < matrix[i].length;
j++) {

System.out.print(
matrix[i][j] + " "
);

}

System.out.println();

}

}

}