package com.CoreJavaPrograms.Strings;



public class Palindrome {

public static void main(String[] args) {

String str = "madam";

String reverse = "";


// Reverse the String

for(int i = str.length() - 1; i >= 0; i--) {
reverse = reverse + str.charAt(i);
}


// Compare original and reverse

if(str.equals(reverse)) {
System.out.println(str + " is a Palindrome");
}
else {
System.out.println(str + " is not a Palindrome");
}

}
}