package AssingmentDay1;

import java.text.DecimalFormat;

public class SumOfTheSquare {
    public static void show()
    { 
    	
    	int num=0;
    	double count=0;
    	for(int i=1;i<=100;i++)
    	{
    		num=num+i*i;
    		count++;
    	
    	}
    	System.out.println("The sum of No is "+num);
    	//double avg=(double)num/count;
    	DecimalFormat df=new DecimalFormat("00.00");
		System.out.println("the Avage of Sum of Squares Number is  : "+(df.format((double)num/count)));
    	
    }
}
