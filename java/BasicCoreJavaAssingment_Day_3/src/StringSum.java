
public class StringSum {
	public static void sum(String args[])
	{
		String num=args[0];
		int len=num.length();
		int sum=0,a=0;
		System.out.print("The sum of digit = ");
		for(int i=0;i<len;i++)
		{
			a=Integer.parseInt(num.charAt(i)+"");
			System.out.print(a);
			if(i<len-1)
			{
				System.out.print("+");
			}
			sum+=a;
			
		}
		System.out.println(" = "+sum);
	}

}
