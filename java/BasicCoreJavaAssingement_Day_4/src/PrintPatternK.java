import java.util.Scanner;


public class PrintPatternK {
	public static void Pattern()
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
			for(int k=num;k>i;k--){
				System.out.print(" ");
				}
			for(int k=num;k>i;k--){
				System.out.print(" ");
				}
			for(int m=i;m>=1;m--)
			{
				System.out.print(m);
			}
			System.out.println("");
		}
		}
		
		
	}

