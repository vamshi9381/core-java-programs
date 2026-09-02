package com.CoreJavaPrograms.Strings;



public class StringComparison {

public static void main(String[] args) {

// 1. equals()
// Compares String content

String s1 = "Java";
String s2 = "Java";

System.out.println("equals(): " + s1.equals(s2));


// 2. equalsIgnoreCase()
// Compares content without considering uppercase/lowercase

String s3 = "Java";
String s4 = "JAVA";

System.out.println("equalsIgnoreCase(): "
+ s3.equalsIgnoreCase(s4));


// 3. == operator
// Compares String references, NOT content

String a = "Java";
String b = "Java";

System.out.println("Using == : " + (a == b));


// 4. == with new String()
// Different objects are created

String x = new String("Java");
String y = new String("Java");

System.out.println("new String() using == : " + (x == y));

System.out.println("new String() using equals(): "
+ x.equals(y));


// 5. compareTo()
// Compares Strings lexicographically

String first = "Apple";
String second = "Banana";

System.out.println("compareTo(): "
+ first.compareTo(second));


// 6. compareTo() with equal Strings

String p = "Java";
String q = "Java";

System.out.println("Equal compareTo(): "
+ p.compareTo(q));


// 7. compareTo() when first String is greater

String m = "Java";
String n = "Apple";

System.out.println("Greater compareTo(): "
+ m.compareTo(n));


// 8. compareToIgnoreCase()
// Compares lexicographically without case

String str1 = "java";
String str2 = "JAVA";

System.out.println("compareToIgnoreCase(): "
+ str1.compareToIgnoreCase(str2));


// 9. startsWith()
// Checks whether String starts with specified value

String text = "Java Programming";

System.out.println("startsWith Java: "
+ text.startsWith("Java"));


// 10. endsWith()
// Checks whether String ends with specified value

System.out.println("endsWith Programming: "
+ text.endsWith("Programming"));


// 11. contains()
// Checks whether String contains specified value

System.out.println("contains Java: "
+ text.contains("Java"));


// 12. Case-sensitive comparison

String name1 = "Vamshi";
String name2 = "vamshi";

System.out.println("Case-sensitive equals: "
+ name1.equals(name2));

System.out.println("Case-insensitive equals: "
+ name1.equalsIgnoreCase(name2));


// 13. Comparing user input

String username = "admin";
String input = "admin";

if(username.equals(input)) {
System.out.println("Username matched");
}
else {
System.out.println("Username not matched");
}


// 14. Comparing password

String password = "Java@123";
String enteredPassword = "Java@123";

if(password.equals(enteredPassword)) {
System.out.println("Login successful");
}
else {
System.out.println("Invalid password");
}

}
}