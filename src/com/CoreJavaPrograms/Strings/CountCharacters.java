package com.CoreJavaPrograms.Strings;



public class CountCharacters {

public static void main(String[] args) {

String str = "Java 123";

int characters = 0;
int letters = 0;
int digits = 0;
int spaces = 0;
int vowels = 0;
int consonants = 0;


// Traverse each character

for(int i = 0; i < str.length(); i++) {

char ch = str.charAt(i);


// Count characters

characters++;


// Check letter

if(Character.isLetter(ch)) {

letters++;


// Check vowel

if(ch == 'a' || ch == 'e' || ch == 'i' ||
ch == 'o' || ch == 'u' ||
ch == 'A' || ch == 'E' || ch == 'I' ||
ch == 'O' || ch == 'U') {

vowels++;

}
else {

consonants++;

}

}


// Check digit

else if(Character.isDigit(ch)) {

digits++;

}


// Check space

else if(Character.isWhitespace(ch)) {

spaces++;

}

}


// Print results

System.out.println("String: " + str);
System.out.println("Total Characters: " + characters);
System.out.println("Letters: " + letters);
System.out.println("Digits: " + digits);
System.out.println("Spaces: " + spaces);
System.out.println("Vowels: " + vowels);
System.out.println("Consonants: " + consonants);

}
}