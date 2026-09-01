package com.CoreJavaPrograms.arrays;



import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElements {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. FIND DUPLICATE ELEMENTS USING NESTED LOOP
// =====================================================

int[] numbers = {10, 20, 30, 20, 40, 10, 50};

System.out.println("1. Duplicate Elements:");

for (int i = 0; i < numbers.length; i++) {

for (int j = i + 1; j < numbers.length; j++) {

if (numbers[i] == numbers[j]) {

System.out.println(numbers[i]);

break;

}

}

}


// =====================================================
// 2. FIND DUPLICATES WITHOUT PRINTING REPEATEDLY
// =====================================================

System.out.println("\n2. Unique Duplicate Elements:");

for (int i = 0; i < numbers.length; i++) {

boolean alreadyPrinted = false;

for (int k = 0; k < i; k++) {

if (numbers[k] == numbers[i]) {

alreadyPrinted = true;

break;

}

}

if (alreadyPrinted) {

continue;

}

for (int j = i + 1; j < numbers.length; j++) {

if (numbers[i] == numbers[j]) {

System.out.println(numbers[i]);

break;

}

}

}


// =====================================================
// 3. FIND DUPLICATES USING HASHSET
// =====================================================

System.out.println("\n3. Duplicates using HashSet:");

HashSet<Integer> seen = new HashSet<>();

HashSet<Integer> duplicates = new HashSet<>();

for (int number : numbers) {

if (!seen.add(number)) {

duplicates.add(number);

}

}

for (int number : duplicates) {

System.out.println(number);

}


// =====================================================
// 4. CHECK WHETHER DUPLICATE EXISTS
// =====================================================

int[] values = {10, 20, 30, 40, 20};

boolean hasDuplicate = false;

HashSet<Integer> set = new HashSet<>();

for (int value : values) {

if (!set.add(value)) {

hasDuplicate = true;

break;

}

}

if (hasDuplicate) {

System.out.println(
"\n4. Array contains duplicate elements."
);

}
else {

System.out.println(
"\n4. Array does not contain duplicates."
);

}


// =====================================================
// 5. COUNT DUPLICATE ELEMENTS
// =====================================================

System.out.println("\n5. Duplicate Counts:");

for (int i = 0; i < numbers.length; i++) {

boolean alreadyChecked = false;

for (int k = 0; k < i; k++) {

if (numbers[k] == numbers[i]) {

alreadyChecked = true;

break;

}

}

if (alreadyChecked) {

continue;

}

int count = 0;

for (int j = 0; j < numbers.length; j++) {

if (numbers[i] == numbers[j]) {

count++;

}

}

if (count > 1) {

System.out.println(
numbers[i] + " occurs " + count + " times"
);

}

}


// =====================================================
// 6. DUPLICATES FROM USER INPUT
// =====================================================

System.out.println("\n6. User Input:");

System.out.println("Enter array size:");

int size = sc.nextInt();

int[] inputArray = new int[size];

System.out.println("Enter " + size + " numbers:");

for (int i = 0; i < inputArray.length; i++) {

inputArray[i] = sc.nextInt();

}

System.out.println("Duplicate elements:");

HashSet<Integer> inputSeen = new HashSet<>();

HashSet<Integer> inputDuplicates = new HashSet<>();

for (int number : inputArray) {

if (!inputSeen.add(number)) {

inputDuplicates.add(number);

}

}

if (inputDuplicates.isEmpty()) {

System.out.println("No duplicates found.");

}
else {

for (int number : inputDuplicates) {

System.out.println(number);

}

}


// =====================================================
// 7. DUPLICATES IN STRING ARRAY
// =====================================================

String[] names = {
"Java",
"Python",
"Java",
"C++",
"Python"
};

HashSet<String> stringSeen = new HashSet<>();

HashSet<String> stringDuplicates = new HashSet<>();

for (String name : names) {

if (!stringSeen.add(name)) {

stringDuplicates.add(name);

}

}

System.out.println("\n7. Duplicate Strings:");

for (String name : stringDuplicates) {

System.out.println(name);

}


// =====================================================
// 8. REMOVE DUPLICATES
// =====================================================

int[] data = {
10,
20,
10,
30,
20,
40
};

HashSet<Integer> unique = new HashSet<>();

for (int number : data) {

unique.add(number);

}

System.out.println("\n8. Unique Elements:");

for (int number : unique) {

System.out.println(number);

}


// =====================================================
// 9. REMOVE DUPLICATES WHILE PRESERVING ORDER
// =====================================================

int[] data2 = {
10,
20,
10,
30,
20,
40
};

HashSet<Integer> orderedSet =
new java.util.LinkedHashSet<>();

for (int number : data2) {

orderedSet.add(number);

}

System.out.println(
"\n9. Unique Elements in Original Order:"
);

for (int number : orderedSet) {

System.out.println(number);

}


// =====================================================
// 10. FIND FIRST DUPLICATE
// =====================================================

int[] firstDuplicateArray = {
10,
20,
30,
40,
20,
50
};

HashSet<Integer> firstSeen = new HashSet<>();

for (int number : firstDuplicateArray) {

if (!firstSeen.add(number)) {

System.out.println(
"\n10. First duplicate: " + number
);

break;

}

}


// =====================================================
// 11. FIND DUPLICATE WITH FREQUENCY
// =====================================================

int[] frequencyArray = {
10,
20,
20,
30,
30,
30,
40
};

System.out.println(
"\n11. Elements occurring more than once:"
);

for (int i = 0; i < frequencyArray.length; i++) {

int count = 0;

for (int j = 0;
j < frequencyArray.length;
j++) {

if (frequencyArray[i] ==
frequencyArray[j]) {

count++;

}

}

if (count > 1) {

boolean printed = false;

for (int k = 0; k < i; k++) {

if (frequencyArray[k] ==
frequencyArray[i]) {

printed = true;

break;

}

}

if (!printed) {

System.out.println(
frequencyArray[i]
+ " occurs "
+ count
+ " times"
);

}

}

}


// =====================================================
// 12. FIND DUPLICATE PAIRS
// =====================================================

int[] pairArray = {
10,
20,
30,
20,
10
};

System.out.println("\n12. Duplicate Pairs:");

for (int i = 0; i < pairArray.length; i++) {

for (int j = i + 1;
j < pairArray.length;
j++) {

if (pairArray[i] == pairArray[j]) {

System.out.println(
pairArray[i]
+ " at indexes "
+ i
+ " and "
+ j
);

}

}

}


// =====================================================
// CLOSE SCANNER
// =====================================================

sc.close();

}

}