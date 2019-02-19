package com.numbersystem.main;

import java.util.Scanner;

import com.numberconvert.util.Binary2Decimal;
import com.numberconvert.util.Hexa2Decimal;
import com.numberconvert.util.NumberValidator;

public class NumberSystemMain {
	static Scanner s=new Scanner(System.in);
	private static int getNumber()
	{
		String bin=s.nextLine();
		if(!NumberValidator.isNumber(bin))
		return getNumber();
		return Integer.parseInt(bin);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the value");
		String bin=s.nextLine();
		Binary2Decimal.show(bin);
		/*NumberValidator.isNumber(bin);
		int num=getNumber();
		System.out.println(num);*/
		//Hexa2Decimal.display(bin);
		
	}
	}

