package com.string.util;

public class StringReverse {
	public static void rev(String str)
	 {
		StringBuilder rev=new StringBuilder();
		 for(int i=str.length()-1;i>0;i--)
		 {
			 rev.append(str.charAt(i));
		 }
		 System.out.println(rev);
		
	 }
}
