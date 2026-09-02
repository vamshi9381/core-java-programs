package com.CoreJavaPrograms.Strings;



public class ReverseString {

public static void main(String[] args) {

String str = "Java";

System.out.println("Original String: " + str);


// Method 1: Using for loop

String reverse = "";

for(int i = str.length() - 1; i >= 0; i--) {
reverse = reverse + str.charAt(i);
}

System.out.println("Reverse using for loop: " + reverse);


// Method 2: Using StringBuilder

StringBuilder sb = new StringBuilder(str);

System.out.println("Reverse using StringBuilder: "
+ sb.reverse());


// Method 3: Using character array

char[] chars = str.toCharArray();

String reverseArray = "";

for(int i = chars.length - 1; i >= 0; i--) {
reverseArray = reverseArray + chars[i];
}

System.out.println("Reverse using char array: "
+ reverseArray);


// Method 4: Using StringBuilder with append

StringBuilder result = new StringBuilder();

for(int i = str.length() - 1; i >= 0; i--) {
result.append(str.charAt(i));
}

System.out.println("Reverse using append: "
+ result);

}
}