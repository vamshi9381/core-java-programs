package com.CoreJavaPrograms.basics;



import java.util.Scanner;

public class DoWhileLoop {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


// =====================================================
// 1. BASIC DO-WHILE LOOP
// =====================================================

int i = 1;

do {

System.out.println(i);

i++;

}
while (i <= 5);


// =====================================================
// 2. PRINT 1 TO 10
// =====================================================

int number = 1;

System.out.println("\nNumbers from 1 to 10:");

do {

System.out.println(number);

number++;

}
while (number <= 10);


// =====================================================
// 3. PRINT 10 TO 1
// =====================================================

int reverse = 10;

System.out.println("\nNumbers from 10 to 1:");

do {

System.out.println(reverse);

reverse--;

}
while (reverse >= 1);


// =====================================================
// 4. PRINT EVEN NUMBERS
// =====================================================

int even = 2;

System.out.println("\nEven numbers:");

do {

System.out.println(even);

even += 2;

}
while (even <= 20);


// =====================================================
// 5. PRINT ODD NUMBERS
// =====================================================

int odd = 1;

System.out.println("\nOdd numbers:");

do {

System.out.println(odd);

odd += 2;

}
while (odd <= 20);


// =====================================================
// 6. SUM OF NUMBERS
// =====================================================

int n = 1;
int sum = 0;

do {

sum = sum + n;

n++;

}
while (n <= 10);

System.out.println("\nSum: " + sum);


// =====================================================
// 7. MULTIPLICATION TABLE
// =====================================================

int tableNumber = 5;
int multiplier = 1;

System.out.println("\nTable of " + tableNumber);

do {

System.out.println(
tableNumber + " x " + multiplier
+ " = " + (tableNumber * multiplier)
);

multiplier++;

}
while (multiplier <= 10);


// =====================================================
// 8. FACTORIAL
// =====================================================

int factorialNumber = 5;
int factorial = 1;
int count = 1;

do {

factorial = factorial * count;

count++;

}
while (count <= factorialNumber);

System.out.println("\nFactorial: " + factorial);


// =====================================================
// 9. REVERSE A NUMBER
// =====================================================

int originalNumber = 12345;
int temp = originalNumber;
int reversed = 0;

do {

int digit = temp % 10;

reversed = reversed * 10 + digit;

temp = temp / 10;

}
while (temp != 0);

System.out.println("\nOriginal: " + originalNumber);
System.out.println("Reverse : " + reversed);


// =====================================================
// 10. SUM OF DIGITS
// =====================================================

int digitNumber = 12345;
int digitSum = 0;

do {

int digit = digitNumber % 10;

digitSum = digitSum + digit;

digitNumber = digitNumber / 10;

}
while (digitNumber != 0);

System.out.println("\nSum of digits: " + digitSum);


// =====================================================
// 11. PALINDROME NUMBER
// =====================================================

int palindromeNumber = 121;

int original = palindromeNumber;
int palindromeReverse = 0;

do {

int digit = palindromeNumber % 10;

palindromeReverse =
palindromeReverse * 10 + digit;

palindromeNumber = palindromeNumber / 10;

}
while (palindromeNumber != 0);

if (original == palindromeReverse) {

System.out.println("\nPalindrome number");

}
else {

System.out.println("\nNot a palindrome number");

}


// =====================================================
// 12. DO-WHILE EXECUTES AT LEAST ONCE
// =====================================================

int value = 10;

do {

System.out.println(
"\nThis statement executes once."
);

value++;

}
while (value < 5);


// =====================================================
// 13. WHILE VS DO-WHILE
// =====================================================

int x = 10;

while (x < 5) {

System.out.println("While loop");

}


// do-while executes once

int y = 10;

do {

System.out.println("Do-while loop executes once.");

}
while (y < 5);


// =====================================================
// 14. USER INPUT
// =====================================================

System.out.println("\nEnter a limit:");

int limit = sc.nextInt();

int start = 1;

if (limit >= 1) {

do {

System.out.println(start);

start++;

}
while (start <= limit);

}
else {

System.out.println("Limit must be greater than 0.");

}


// =====================================================
// 15. USER INPUT - MULTIPLICATION TABLE
// =====================================================

System.out.println("\nEnter table number:");

int inputTable = sc.nextInt();

int tableCount = 1;

do {

System.out.println(
inputTable + " x " + tableCount
+ " = " + (inputTable * tableCount)
);

tableCount++;

}
while (tableCount <= 10);


// =====================================================
// 16. USER INPUT VALIDATION
// Keep asking until valid number
// =====================================================

int userNumber;

do {

System.out.println("\nEnter a positive number:");

userNumber = sc.nextInt();

}
while (userNumber <= 0);

System.out.println("Valid number: " + userNumber);


// =====================================================
// 17. BREAK
// =====================================================

System.out.println("\nBreak Example:");

int breakNumber = 1;

do {

if (breakNumber == 5) {

break;

}

System.out.println(breakNumber);

breakNumber++;

}
while (breakNumber <= 10);


// =====================================================
// 18. CONTINUE
// =====================================================

System.out.println("\nContinue Example:");

int continueNumber = 0;

do {

continueNumber++;

if (continueNumber == 5) {

continue;

}

System.out.println(continueNumber);

}
while (continueNumber <= 10);


// =====================================================
// 19. NESTED DO-WHILE LOOP
// =====================================================

System.out.println("\nNested Do-While:");

int outer = 1;

do {

int inner = 1;

do {

System.out.println(
"Outer = " + outer
+ ", Inner = " + inner
);

inner++;

}
while (inner <= 3);

outer++;

}
while (outer <= 3);


// =====================================================
// 20. STAR PATTERN
// =====================================================

System.out.println("\nStar Pattern:");

int row = 1;

do {

int column = 1;

do {

System.out.print("* ");

column++;

}
while (column <= row);

System.out.println();

row++;

}
while (row <= 5);


// =====================================================
// 21. MENU-DRIVEN PROGRAM
// =====================================================

int choice;

do {

System.out.println("\n--- MENU ---");

System.out.println("1. Add");
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Exit");

System.out.println("Enter choice:");

choice = sc.nextInt();

switch (choice) {

case 1:

System.out.println("10 + 5 = " + (10 + 5));

break;

case 2:

System.out.println("10 - 5 = " + (10 - 5));

break;

case 3:

System.out.println("10 * 5 = " + (10 * 5));

break;

case 4:

System.out.println("Exiting...");

break;

default:

System.out.println("Invalid choice.");

}

}
while (choice != 4);


// =====================================================
// 22. ATM MENU
// =====================================================

double balance = 10000;

int atmChoice;

do {

System.out.println("\n--- ATM MENU ---");

System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");

System.out.println("Enter choice:");

atmChoice = sc.nextInt();

switch (atmChoice) {

case 1:

System.out.println(
"Balance: " + balance
);

break;

case 2:

System.out.println("Enter deposit amount:");

double deposit = sc.nextDouble();

if (deposit > 0) {

balance = balance + deposit;

System.out.println("Deposit successful.");

}
else {

System.out.println("Invalid amount.");

}

break;

case 3:

System.out.println("Enter withdrawal amount:");

double withdraw = sc.nextDouble();

if (withdraw > 0 && withdraw <= balance) {

balance = balance - withdraw;

System.out.println("Withdrawal successful.");

}
else {

System.out.println("Invalid withdrawal.");

}

break;

case 4:

System.out.println("Thank you.");

break;

default:

System.out.println("Invalid choice.");

}

}
while (atmChoice != 4);


// =====================================================
// 23. CLOSE SCANNER
// =====================================================

sc.close();

}

}