package com.CoreJavaPrograms.arrays;




import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. SECOND LARGEST - BASIC
// =====================================================

int[] numbers = {10, 50, 30, 90, 20};

int largest = numbers[0];

int secondLargest = Integer.MIN_VALUE;

for (int i = 1; i < numbers.length; i++) {

if (numbers[i] > largest) {

secondLargest = largest;

largest = numbers[i];

}
else if (numbers[i] > secondLargest &&
numbers[i] != largest) {

secondLargest = numbers[i];

}

}

System.out.println("1. Largest: " + largest);

System.out.println(
"Second Largest: " + secondLargest
);


// =====================================================
// 2. SECOND LARGEST WITH NEGATIVE NUMBERS
// =====================================================

int[] negativeNumbers = {
-10,
-50,
-20,
-5,
-30
};

int first = Integer.MIN_VALUE;

int second = Integer.MIN_VALUE;

for (int number : negativeNumbers) {

if (number > first) {

second = first;

first = number;

}
else if (number > second &&
number != first) {

second = number;

}

}

System.out.println("\n2. Largest: " + first);

System.out.println(
"Second Largest: " + second
);


// =====================================================
// 3. SECOND LARGEST WITH DUPLICATES
// =====================================================

int[] duplicateNumbers = {
10,
50,
30,
50,
20
};

int max = Integer.MIN_VALUE;

int secondMax = Integer.MIN_VALUE;

for (int number : duplicateNumbers) {

if (number > max) {

secondMax = max;

max = number;

}
else if (number > secondMax &&
number < max) {

secondMax = number;

}

}

System.out.println(
"\n3. Largest: " + max
);

System.out.println(
"Second Largest: " + secondMax
);


// =====================================================
// 4. SECOND LARGEST ALLOWING DUPLICATE
// Example: 50, 50
// =====================================================

int[] duplicateAllowed = {
10,
50,
30,
50,
20
};

int largestValue = Integer.MIN_VALUE;

int secondValue = Integer.MIN_VALUE;

for (int number : duplicateAllowed) {

if (number >= largestValue) {

secondValue = largestValue;

largestValue = number;

}
else if (number > secondValue) {

secondValue = number;

}

}

System.out.println(
"\n4. Largest: " + largestValue
);

System.out.println(
"Second largest including duplicate: "
+ secondValue
);


// =====================================================
// 5. SECOND LARGEST USING SORTING
// =====================================================

int[] numbers2 = {
10,
50,
30,
90,
20
};

Arrays.sort(numbers2);

int secondLargestSorted =
numbers2[numbers2.length - 2];

System.out.println(
"\n5. Second largest using sorting: "
+ secondLargestSorted
);


// =====================================================
// 6. SECOND LARGEST USING USER INPUT
// =====================================================

System.out.println("\nEnter array size:");

int size = sc.nextInt();

if (size >= 2) {

int[] inputArray = new int[size];

System.out.println(
"Enter " + size + " numbers:"
);

for (int i = 0; i < inputArray.length; i++) {

inputArray[i] = sc.nextInt();

}

int inputLargest = Integer.MIN_VALUE;

int inputSecond = Integer.MIN_VALUE;

for (int number : inputArray) {

if (number > inputLargest) {

inputSecond = inputLargest;

inputLargest = number;

}
else if (number > inputSecond &&
number != inputLargest) {

inputSecond = number;

}

}

System.out.println(
"Largest: " + inputLargest
);

if (inputSecond != Integer.MIN_VALUE) {

System.out.println(
"Second Largest: " + inputSecond
);

}
else {

System.out.println(
"Second largest distinct element does not exist."
);

}

}
else {

System.out.println(
"Array must contain at least 2 elements."
);

}


// =====================================================
// 7. SECOND LARGEST DISTINCT ELEMENT
// =====================================================

int[] values = {
100,
200,
300,
300,
200,
100
};

int largestDistinct = Integer.MIN_VALUE;

int secondDistinct = Integer.MIN_VALUE;

for (int value : values) {

if (value > largestDistinct) {

secondDistinct = largestDistinct;

largestDistinct = value;

}
else if (value > secondDistinct &&
value < largestDistinct) {

secondDistinct = value;

}

}

System.out.println(
"\n7. Largest distinct: "
+ largestDistinct
);

System.out.println(
"Second largest distinct: "
+ secondDistinct
);


// =====================================================
// 8. SECOND LARGEST USING METHOD
// =====================================================

int[] data = {
10,
40,
70,
20,
60
};

int result = findSecondLargest(data);

System.out.println(
"\n8. Second largest using method: "
+ result
);


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}


// =====================================================
// METHOD
// =====================================================

public static int findSecondLargest(int[] array) {

if (array.length < 2) {

throw new IllegalArgumentException(
"Array must contain at least 2 elements."
);

}

int largest = Integer.MIN_VALUE;

int secondLargest = Integer.MIN_VALUE;

for (int number : array) {

if (number > largest) {

secondLargest = largest;

largest = number;

}
else if (number > secondLargest &&
number != largest) {

secondLargest = number;

}

}

if (secondLargest == Integer.MIN_VALUE) {

throw new IllegalArgumentException(
"Second largest distinct element does not exist."
);

}

return secondLargest;

}

}