import java.util.Scanner;


public class PrintPatternH {
	public static void pattern()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Value");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
