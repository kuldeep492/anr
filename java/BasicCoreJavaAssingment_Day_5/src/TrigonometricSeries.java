import java.util.Scanner;


public class TrigonometricSeries {
 
	public static void sin(double x, int numTerms)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Value");
		x=s.nextInt();
		double n=0;
		double n1=0;
		double num = 0;
		for(int i=1;i<=10;i=i++){
		//	if(i%2==0)
		/*//n+=Math.pow(x, i)/;
			else
			{
				n1+=Math.pow(x, i)/;
			}
		*/
		}
		num=n1-n;
		System.out.println(num);
		//return num;
		
	}
	public static double getFact(double y)
	{
		
		if(y==1){
			return 1;
		}
		else
		{
			return y*y--;
		}
	}
}
