import java.util.Scanner;


public class PrintPatternB {
public static void Pattern()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Value");
	int num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		for(int j=num;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("#");
		}
		System.out.println(" ");
	}
	
}
}
