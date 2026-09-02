package com.CoreJavaPrograms.Strings;


public class StringMethods {

public static void main(String[] args) {

String str = "Hello Java Programming";

System.out.println("Original String: " + str);


// 1. length()
// Returns number of characters
System.out.println("Length: " + str.length());


// 2. charAt()
// Returns character at given index
System.out.println("Character at index 1: " + str.charAt(1));


// 3. toUpperCase()
// Converts string to uppercase
System.out.println("Uppercase: " + str.toUpperCase());


// 4. toLowerCase()
// Converts string to lowercase
System.out.println("Lowercase: " + str.toLowerCase());


// 5. trim()
// Removes spaces from beginning and end
String text = "   Hello Java   ";
System.out.println("Trim: " + text.trim());


// 6. contains()
// Checks whether string contains specified value
System.out.println("Contains Java: " + str.contains("Java"));


// 7. startsWith()
// Checks starting characters
System.out.println("Starts with Hello: " + str.startsWith("Hello"));


// 8. endsWith()
// Checks ending characters
System.out.println("Ends with Programming: " + str.endsWith("Programming"));


// 9. equals()
// Compares two strings
String s1 = "Java";
String s2 = "Java";

System.out.println("Equals: " + s1.equals(s2));


// 10. equalsIgnoreCase()
// Compares strings ignoring uppercase/lowercase
String s3 = "JAVA";
String s4 = "java";

System.out.println("Equals Ignore Case: " + s3.equalsIgnoreCase(s4));


// 11. indexOf()
// Returns first occurrence of character/string
System.out.println("Index of Java: " + str.indexOf("Java"));


// 12. lastIndexOf()
// Returns last occurrence
String word = "Java Programming Java";

System.out.println("Last index of Java: " + word.lastIndexOf("Java"));


// 13. substring()
// Extracts part of a string
System.out.println("Substring: " + str.substring(6));

System.out.println("Substring with start and end: "
+ str.substring(6, 10));


// 14. replace()
// Replaces characters/string
System.out.println("Replace Java: "
+ str.replace("Java", "Python"));


// 15. replaceAll()
// Replaces using regular expression
String numbers = "Java123Programming456";

System.out.println("Replace numbers: "
+ numbers.replaceAll("[0-9]", ""));


// 16. concat()
// Joins two strings
String firstName = "Vamshi";
String lastName = "Goud";

System.out.println("Concat: "
+ firstName.concat(" ").concat(lastName));


// 17. isEmpty()
// Checks whether string length is 0
String empty = "";

System.out.println("Is Empty: " + empty.isEmpty());


// 18. isBlank()
// Checks whether string is empty or contains only spaces
String blank = "   ";

System.out.println("Is Blank: " + blank.isBlank());


// 19. compareTo()
// Compares two strings lexicographically
String a = "Apple";
String b = "Banana";

System.out.println("CompareTo: " + a.compareTo(b));


// 20. compareToIgnoreCase()
// Compares ignoring case
String x = "java";
String y = "JAVA";

System.out.println("CompareToIgnoreCase: "
+ x.compareToIgnoreCase(y));


// 21. split()
// Splits string into multiple parts
String languages = "Java,Python,C++,JavaScript";

String[] result = languages.split(",");

System.out.println("Split:");

for(String language : result) {
System.out.println(language);
}


// 22. toCharArray()
// Converts String into character array
char[] chars = str.toCharArray();

System.out.println("Characters:");

for(char ch : chars) {
System.out.print(ch + " ");
}

System.out.println();


// 23. join()
// Joins multiple strings
String joined = String.join("-", "Java", "Python", "C++");

System.out.println("Join: " + joined);


// 24. repeat()
// Repeats a string
System.out.println("Repeat: " + "Java ".repeat(3));


// 25. valueOf()
// Converts primitive value into String
int number = 100;

String numberString = String.valueOf(number);

System.out.println("ValueOf: " + numberString);


// 26. format()
// Creates formatted String
String name = "Vamshi";
int age = 25;

String message = String.format(
"Name: %s, Age: %d",
name,
age
);

System.out.println(message);


// 27. getBytes()
// Converts String into byte array
String data = "Java";

byte[] bytes = data.getBytes();

System.out.println("Bytes:");

for(byte value : bytes) {
System.out.print(value + " ");
}

System.out.println();


// 28. matches()
// Checks whether String matches a regular expression
String phone = "9876543210";

System.out.println(
"Valid phone: " + phone.matches("[0-9]{10}")
);


// 29. strip()
// Removes leading and trailing whitespace
String spaces = "   Hello Java   ";

System.out.println("Strip: " + spaces.strip());


// 30. lines()
// Splits a multiline String into lines
String multiLine = "Java\nPython\nC++";

System.out.println("Lines:");

multiLine.lines().forEach(System.out::println);

}
}