package com.string.util;
import java.util.Scanner;


public class TestPalindromicPhrase {
 public static void display(String str) {
	
	int vowels=0;
	int consonant=0;	
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			vowels++;
		}
		else if(ch>='a' && ch<='z')
		{
			consonant++;
		}
}
	System.out.println("The vowels in string "+vowels);
	System.out.println("The consonant in string is "+consonant);
}

}
