import java.util.Scanner;


public class PrintPatternD {
public static void pattern()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Plz Enter The Value");
	int num=s.nextInt();
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=num;j++)
		{
			if((i==1 || i==num) || (j==i) )
			{
				System.out.print("#");
			}
			
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}
}
