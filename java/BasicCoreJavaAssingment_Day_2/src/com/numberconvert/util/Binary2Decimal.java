package com.numberconvert.util;

public class Binary2Decimal {

	static int  num=0;
	int temp=0;
	public static void show(String bin){
		//StringBuilder sb=new StringBuilder();
		for(int i=bin.length()-1 ;i>=0; i--)
		{
		   // sb.append(bin.charAt(i));
			num+=(Math.pow(2, i)*Integer.parseInt(bin.charAt(bin.length()-1-i)+""));
		}
		//System.out.println(sb);
		System.out.println("The Decimal value of binary no is " + num);
		
	}
}
