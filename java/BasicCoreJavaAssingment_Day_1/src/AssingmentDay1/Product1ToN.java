package AssingmentDay1;

import java.util.Scanner;

public class Product1ToN {

	public static void show()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the First  No ");
	int range=s.nextInt();
	System.out.println("Enter the second no");
	int secondNo=s.nextInt();
	int product=1;
	int p=1;
	
	
	for(int i=secondNo;i>=1;i--)
	{
			p=p*i;
			product=p*i;
		
		
	}
	System.out.println("The Product of "+range+" To  "+secondNo+ " is "+product);
	}
	
}
