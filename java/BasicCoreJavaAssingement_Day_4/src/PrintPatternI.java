import java.util.Scanner;

public class PrintPatternI {
public static void Pattern()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Value");
	int num=s.nextInt();
	for(int i=num;i>=1;i--)
	{
		for(int k=i;k<num;k++)
		{
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
		}
		System.out.println("");
	}
}
}