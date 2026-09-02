package com.CoreJavaPrograms.Strings;



public class RemoveDuplicates {

public static void main(String[] args) {

String str = "programming";

String result = "";

for(int i = 0; i < str.length(); i++) {

char ch = str.charAt(i);

// Check whether character is already present
if(result.indexOf(ch) == -1) {

result = result + ch;

}

}

System.out.println("Original String: " + str);
System.out.println("After Removing Duplicates: " + result);

}
}