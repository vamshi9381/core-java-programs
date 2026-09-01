package com.CoreJavaPrograms.arrays;



import java.util.Scanner;

public class ArrayInput {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. INTEGER ARRAY INPUT
// =====================================================

System.out.println("Enter size of integer array:");

int size = sc.nextInt();

int[] numbers = new int[size];

System.out.println("Enter " + size + " numbers:");

for (int i = 0; i < numbers.length; i++) {

numbers[i] = sc.nextInt();

}

System.out.println("\nInteger Array:");

for (int i = 0; i < numbers.length; i++) {

System.out.println(numbers[i]);

}


// =====================================================
// 2. INTEGER ARRAY INPUT USING FOR-EACH
// =====================================================

System.out.println("\nArray using for-each:");

for (int number : numbers) {

System.out.println(number);

}


// =====================================================
// 3. STRING ARRAY INPUT
// =====================================================

System.out.println("\nEnter size of String array:");

int stringSize = sc.nextInt();

sc.nextLine();

String[] names = new String[stringSize];

System.out.println("Enter " + stringSize + " names:");

for (int i = 0; i < names.length; i++) {

names[i] = sc.nextLine();

}

System.out.println("\nNames:");

for (String name : names) {

System.out.println(name);

}


// =====================================================
// 4. DOUBLE ARRAY INPUT
// =====================================================

System.out.println("\nEnter size of double array:");

int doubleSize = sc.nextInt();

double[] prices = new double[doubleSize];

System.out.println("Enter " + doubleSize + " values:");

for (int i = 0; i < prices.length; i++) {

prices[i] = sc.nextDouble();

}

System.out.println("\nDouble Array:");

for (double price : prices) {

System.out.println(price);

}


// =====================================================
// 5. CHARACTER ARRAY INPUT
// =====================================================

System.out.println("\nEnter size of character array:");

int charSize = sc.nextInt();

char[] characters = new char[charSize];

System.out.println("Enter " + charSize + " characters:");

for (int i = 0; i < characters.length; i++) {

characters[i] = sc.next().charAt(0);

}

System.out.println("\nCharacter Array:");

for (char character : characters) {

System.out.println(character);

}


// =====================================================
// 6. BOOLEAN ARRAY INPUT
// =====================================================

System.out.println("\nEnter size of boolean array:");

int booleanSize = sc.nextInt();

boolean[] status = new boolean[booleanSize];

System.out.println("Enter true or false:");

for (int i = 0; i < status.length; i++) {

status[i] = sc.nextBoolean();

}

System.out.println("\nBoolean Array:");

for (boolean value : status) {

System.out.println(value);

}


// =====================================================
// 7. ARRAY INPUT AND SUM
// =====================================================

System.out.println("\nEnter size for sum:");

int sumSize = sc.nextInt();

int[] values = new int[sumSize];

int sum = 0;

System.out.println("Enter numbers:");

for (int i = 0; i < values.length; i++) {

values[i] = sc.nextInt();

sum = sum + values[i];

}

System.out.println("Sum: " + sum);


// =====================================================
// 8. ARRAY INPUT AND AVERAGE
// =====================================================

System.out.println("\nEnter size for average:");

int averageSize = sc.nextInt();

int[] marks = new int[averageSize];

int total = 0;

System.out.println("Enter marks:");

for (int i = 0; i < marks.length; i++) {

marks[i] = sc.nextInt();

total = total + marks[i];

}

double average = (double) total / marks.length;

System.out.println("Average: " + average);


// =====================================================
// 9. 2D ARRAY INPUT
// =====================================================

System.out.println("\nEnter number of rows:");

int rows = sc.nextInt();

System.out.println("Enter number of columns:");

int columns = sc.nextInt();

int[][] matrix = new int[rows][columns];

System.out.println("Enter matrix elements:");

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

matrix[i][j] = sc.nextInt();

}

}

System.out.println("\nMatrix:");

for (int i = 0; i < matrix.length; i++) {

for (int j = 0; j < matrix[i].length; j++) {

System.out.print(matrix[i][j] + " ");

}

System.out.println();

}


// =====================================================
// 10. ARRAY INPUT AND FIND LARGEST
// =====================================================

System.out.println("\nEnter size:");

int largestSize = sc.nextInt();

int[] data = new int[largestSize];

System.out.println("Enter numbers:");

for (int i = 0; i < data.length; i++) {

data[i] = sc.nextInt();

}

int largest = data[0];

for (int i = 1; i < data.length; i++) {

if (data[i] > largest) {

largest = data[i];

}

}

System.out.println("Largest: " + largest);


// =====================================================
// 11. ARRAY INPUT AND FIND SMALLEST
// =====================================================

System.out.println("\nEnter size:");

int smallestSize = sc.nextInt();

int[] data2 = new int[smallestSize];

System.out.println("Enter numbers:");

for (int i = 0; i < data2.length; i++) {

data2[i] = sc.nextInt();

}

int smallest = data2[0];

for (int i = 1; i < data2.length; i++) {

if (data2[i] < smallest) {

smallest = data2[i];

}

}

System.out.println("Smallest: " + smallest);


// =====================================================
// 12. ARRAY INPUT AND COUNT EVEN / ODD
// =====================================================

System.out.println("\nEnter size:");

int countSize = sc.nextInt();

int[] countArray = new int[countSize];

int evenCount = 0;

int oddCount = 0;

System.out.println("Enter numbers:");

for (int i = 0; i < countArray.length; i++) {

countArray[i] = sc.nextInt();

if (countArray[i] % 2 == 0) {

evenCount++;

}
else {

oddCount++;

}

}

System.out.println("Even count: " + evenCount);

System.out.println("Odd count: " + oddCount);


// =====================================================
// 13. SEARCH ELEMENT FROM USER INPUT
// =====================================================

System.out.println("\nEnter size:");

int searchSize = sc.nextInt();

int[] searchArray = new int[searchSize];

System.out.println("Enter numbers:");

for (int i = 0; i < searchArray.length; i++) {

searchArray[i] = sc.nextInt();

}

System.out.println("Enter number to search:");

int search = sc.nextInt();

boolean found = false;

for (int i = 0; i < searchArray.length; i++) {

if (searchArray[i] == search) {

found = true;

break;

}

}

if (found) {

System.out.println("Element found.");

}
else {

System.out.println("Element not found.");

}


// =====================================================
// 14. ARRAY INPUT WITH VALIDATION
// Marks must be 0-100
// =====================================================

System.out.println("\nEnter number of students:");

int studentCount = sc.nextInt();

int[] studentMarks = new int[studentCount];

for (int i = 0; i < studentMarks.length; i++) {

System.out.println("Enter marks for student " + (i + 1) + ":");

int mark = sc.nextInt();

if (mark >= 0 && mark <= 100) {

studentMarks[i] = mark;

}
else {

System.out.println("Invalid marks.");

i--;

}

}

System.out.println("\nStudent Marks:");

for (int mark : studentMarks) {

System.out.println(mark);

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}