import java.util.Scanner;


public class PrintPatternF {
	public static void pattern()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Value");
	int num=s.nextInt();
	for(int i=1;i<=num;i++){
		for(int k=1;k<=num*2-1;k++)
		{
			if(k>=i && k<=(num*2)-i){
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
