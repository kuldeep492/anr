import java.util.Scanner;


public class PrintPatternJ {

	public static void Pattern()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Value");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
	for(int j=1;j<=2*num-1;j++)
			{
		if(j>=i && j<=(num*2)-i)
					System.out.print(j);
				else
					System.out.print(" ");
				}	
			/*for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}*/
			System.out.println(" ");
			}
			
		}	
		}


