package com.CoreJavaPrograms.Strings;


public class StringDemo {

public static void main(String[] args) {


// =====================================================
// 1. STRING CREATION
// =====================================================

String s1 = "Java";

String s2 = new String("Java");

System.out.println("1. s1: " + s1);

System.out.println("s2: " + s2);


// =====================================================
// 2. STRING LITERAL
// =====================================================

String name = "Vamshi";

System.out.println("\n2. String Literal: " + name);


// =====================================================
// 3. EMPTY STRING
// =====================================================

String empty = "";

System.out.println(
"\n3. Empty String Length: "
+ empty.length()
);


// =====================================================
// 4. STRING LENGTH
// =====================================================

String text = "Hello Java";

System.out.println(
"\n4. Length: " + text.length()
);


// =====================================================
// 5. charAt()
// =====================================================

System.out.println(
"\n5. First Character: "
+ text.charAt(0)
);

System.out.println(
"Last Character: "
+ text.charAt(text.length() - 1)
);


// =====================================================
// 6. PRINT EACH CHARACTER
// =====================================================

System.out.println("\n6. Characters:");

for (int i = 0; i < text.length(); i++) {

System.out.println(text.charAt(i));

}


// =====================================================
// 7. CONCATENATION USING +
// =====================================================

String firstName = "Vamshi";

String lastName = "Goud";

String fullName = firstName + " " + lastName;

System.out.println(
"\n7. Full Name: " + fullName
);


// =====================================================
// 8. concat()
// =====================================================

String first = "Hello ";

String second = "Java";

String result = first.concat(second);

System.out.println(
"\n8. concat(): " + result
);


// =====================================================
// 9. equals()
// =====================================================

String a = "Java";

String b = "Java";

if (a.equals(b)) {

System.out.println(
"\n9. Strings are equal"
);

}
else {

System.out.println(
"\n9. Strings are not equal"
);

}


// =====================================================
// 10. equalsIgnoreCase()
// =====================================================

String username = "VAMSHI";

if (username.equalsIgnoreCase("vamshi")) {

System.out.println(
"\n10. Strings are equal ignoring case"
);

}


// =====================================================
// 11. == VS equals()
// =====================================================

String x = "Java";

String y = "Java";

String z = new String("Java");

System.out.println(
"\n11. x == y: " + (x == y)
);

System.out.println(
"x == z: " + (x == z)
);

System.out.println(
"x.equals(z): " + x.equals(z)
);


// =====================================================
// 12. toUpperCase()
// =====================================================

String lower = "java programming";

System.out.println(
"\n12. Uppercase: "
+ lower.toUpperCase()
);


// =====================================================
// 13. toLowerCase()
// =====================================================

String upper = "JAVA PROGRAMMING";

System.out.println(
"\n13. Lowercase: "
+ upper.toLowerCase()
);


// =====================================================
// 14. trim()
// =====================================================

String spaces = "   Java   ";

System.out.println(
"\n14. Before trim: [" + spaces + "]"
);

System.out.println(
"After trim: ["
+ spaces.trim()
+ "]"
);


// =====================================================
// 15. contains()
// =====================================================

String sentence =
"Java is a programming language";

System.out.println(
"\n15. Contains Java: "
+ sentence.contains("Java")
);

System.out.println(
"Contains Python: "
+ sentence.contains("Python")
);


// =====================================================
// 16. startsWith()
// =====================================================

System.out.println(
"\n16. Starts with Java: "
+ sentence.startsWith("Java")
);


// =====================================================
// 17. endsWith()
// =====================================================

System.out.println(
"\n17. Ends with language: "
+ sentence.endsWith("language")
);


// =====================================================
// 18. indexOf()
// =====================================================

String word = "programming";

System.out.println(
"\n18. Index of 'g': "
+ word.indexOf('g')
);


// =====================================================
// 19. lastIndexOf()
// =====================================================

System.out.println(
"\n19. Last index of 'g': "
+ word.lastIndexOf('g')
);


// =====================================================
// 20. indexOf(String)
// =====================================================

System.out.println(
"\n20. Index of 'gram': "
+ word.indexOf("gram")
);


// =====================================================
// 21. substring()
// =====================================================

String language = "JavaProgramming";

System.out.println(
"\n21. substring(4): "
+ language.substring(4)
);

System.out.println(
"substring(0, 4): "
+ language.substring(0, 4)
);


// =====================================================
// 22. replace()
// =====================================================

String message = "I like Java";

String newMessage =
message.replace("Java", "Python");

System.out.println(
"\n22. Replace: " + newMessage
);


// =====================================================
// 23. replace CHARACTERS
// =====================================================

String characters = "banana";

System.out.println(
"\n23. Replace a with o: "
+ characters.replace('a', 'o')
);


// =====================================================
// 24. replaceAll()
// =====================================================

String numbers = "Java123Programming456";

System.out.println(
"\n24. Remove numbers: "
+ numbers.replaceAll("[0-9]", "")
);


// =====================================================
// 25. split()
// =====================================================

String courses =
"Java,Python,C++,JavaScript";

String[] coursesArray =
courses.split(",");

System.out.println("\n25. Split:");

for (String course : coursesArray) {

System.out.println(course);

}


// =====================================================
// 26. STRING TO char ARRAY
// =====================================================

String letters = "HELLO";

char[] chars = letters.toCharArray();

System.out.println(
"\n26. char Array:"
);

for (char c : chars) {

System.out.println(c);

}


// =====================================================
// 27. STRING COMPARISON
// =====================================================

String str1 = "Apple";

String str2 = "Banana";

int comparison =
str1.compareTo(str2);

System.out.println(
"\n27. compareTo(): "
+ comparison
);


// =====================================================
// 28. compareToIgnoreCase()
// =====================================================

String str3 = "JAVA";

String str4 = "java";

System.out.println(
"\n28. compareToIgnoreCase(): "
+ str3.compareToIgnoreCase(str4)
);


// =====================================================
// 29. isEmpty()
// =====================================================

String emptyString = "";

System.out.println(
"\n29. isEmpty(): "
+ emptyString.isEmpty()
);


// =====================================================
// 30. isBlank()
// =====================================================

String blankString = "   ";

System.out.println(
"\n30. isBlank(): "
+ blankString.isBlank()
);


// =====================================================
// 31. repeat()
// =====================================================

String star = "*";

System.out.println(
"\n31. Repeat: "
+ star.repeat(5)
);


// =====================================================
// 32. STRING IMMUTABILITY
// =====================================================

String immutable = "Java";

immutable.concat(" Programming");

System.out.println(
"\n32. Without assigning concat: "
+ immutable
);

immutable =
immutable.concat(" Programming");

System.out.println(
"After assigning concat: "
+ immutable
);


// =====================================================
// 33. STRING BUILDER
// =====================================================

StringBuilder builder =
new StringBuilder("Java");

builder.append(" Programming");

builder.append(" Language");

System.out.println(
"\n33. StringBuilder: "
+ builder
);


// =====================================================
// 34. STRING BUILDER reverse()
// =====================================================

builder.reverse();

System.out.println(
"\n34. StringBuilder Reverse: "
+ builder
);


// =====================================================
// 35. STRING BUILDER insert()
// =====================================================

StringBuilder insert =
new StringBuilder("Java Language");

insert.insert(5, "Programming ");

System.out.println(
"\n35. StringBuilder Insert: "
+ insert
);


// =====================================================
// 36. STRING BUILDER delete()
// =====================================================

StringBuilder delete =
new StringBuilder("Java Programming");

delete.delete(5, 17);

System.out.println(
"\n36. StringBuilder Delete: "
+ delete
);


// =====================================================
// 37. STRING BUILDER replace()
// =====================================================

StringBuilder replace =
new StringBuilder("Java Language");

replace.replace(5, 13, "Programming");

System.out.println(
"\n37. StringBuilder Replace: "
+ replace
);


// =====================================================
// 38. STRING BUFFER
// =====================================================

StringBuffer buffer =
new StringBuffer("Hello");

buffer.append(" Java");

System.out.println(
"\n38. StringBuffer: "
+ buffer
);


// =====================================================
// 39. STRING TO INTEGER
// =====================================================

String numberString = "100";

int number =
Integer.parseInt(numberString);

System.out.println(
"\n39. String to int: "
+ number
);


// =====================================================
// 40. INTEGER TO STRING
// =====================================================

int value = 500;

String valueString =
String.valueOf(value);

System.out.println(
"\n40. int to String: "
+ valueString
);


// =====================================================
// 41. COUNT CHARACTERS
// =====================================================

String countText = "banana";

int count = 0;

for (int i = 0;
i < countText.length();
i++) {

if (countText.charAt(i) == 'a') {

count++;

}

}

System.out.println(
"\n41. Count of 'a': " + count
);


// =====================================================
// 42. COUNT VOWELS
// =====================================================

String vowelText = "Java Programming";

int vowels = 0;

for (int i = 0;
i < vowelText.length();
i++) {

char c =
Character.toLowerCase(
vowelText.charAt(i)
);

if (c == 'a' ||
c == 'e' ||
c == 'i' ||
c == 'o' ||
c == 'u') {

vowels++;

}

}

System.out.println(
"\n42. Vowel Count: " + vowels
);


// =====================================================
// 43. COUNT WORDS
// =====================================================

String sentence2 =
"Java is easy to learn";

String[] words =
sentence2.trim().split("\\s+");

System.out.println(
"\n43. Word Count: "
+ words.length
);


// =====================================================
// 44. REVERSE STRING
// =====================================================

String reverseText = "Java";

String reversed = "";

for (int i =
reverseText.length() - 1;
i >= 0;
i--) {

reversed =
reversed + reverseText.charAt(i);

}

System.out.println(
"\n44. Reversed String: "
+ reversed
);


// =====================================================
// 45. PALINDROME CHECK
// =====================================================

String palindrome = "madam";

String reverse = "";

for (int i =
palindrome.length() - 1;
i >= 0;
i--) {

reverse =
reverse + palindrome.charAt(i);

}

if (palindrome.equals(reverse)) {

System.out.println(
"\n45. Palindrome"
);

}
else {

System.out.println(
"\n45. Not Palindrome"
);

}


// =====================================================
// 46. REMOVE SPACES
// =====================================================

String withSpaces =
"Java is very easy";

String withoutSpaces =
withSpaces.replace(" ", "");

System.out.println(
"\n46. Without spaces: "
+ withoutSpaces
);


// =====================================================
// 47. FIND DUPLICATE CHARACTERS
// =====================================================

String duplicateText = "programming";

System.out.println(
"\n47. Duplicate Characters:"
);

for (int i = 0;
i < duplicateText.length();
i++) {

for (int j = i + 1;
j < duplicateText.length();
j++) {

if (duplicateText.charAt(i) ==
duplicateText.charAt(j)) {

System.out.println(
duplicateText.charAt(i)
);

break;

}

}

}


// =====================================================
// 48. STRING ARRAY
// =====================================================

String[] names = {
"Vamshi",
"Ravi",
"Rahul",
"Arun"
};

System.out.println(
"\n48. String Array:"
);

for (String item : names) {

System.out.println(item);

}


// =====================================================
// 49. STRING JOIN
// =====================================================

String joined =
String.join("-", "Java",
"Python", "C++");

System.out.println(
"\n49. String.join(): "
+ joined
);


// =====================================================
// 50. NULL STRING
// =====================================================

String nullString = null;

if (nullString == null) {

System.out.println(
"\n50. String is null"
);

}

}

}