import java.util.Scanner;


public class Beverage {

	public static void show()
	{
		int volume;
		int radius;
		double cost;
		double height;
		
		Scanner s=new Scanner(System.in);
	int num=1;
		
		do
		{
			System.out.println("Enter The Volume");
			volume=s.nextInt();
			System.out.println("Enter The Radius");
			radius=s.nextInt();
			System.out.println(height=volume/(3.14*radius*radius));
			System.out.println(cost=(2*3.14*radius)/(radius+height));
				
		}
		while(num<=2);
		
	}
}
