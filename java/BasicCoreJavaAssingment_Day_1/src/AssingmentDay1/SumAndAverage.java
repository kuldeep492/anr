package AssingmentDay1;

import java.text.DecimalFormat;

public class SumAndAverage {
	public static void show(){
		int sum=0;
		int upparBound=100;
		int lowerBound=1;
		int number=lowerBound;
		DecimalFormat df=new DecimalFormat("00.00");
		
		/*for(int i=number;i<=upparBound;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of No 1 t0 100 is "+sum);
		double avg=(double)sum/100;
		System.out.println("Average of No 1 to 100 is "+df.format(avg));*/
		
					//using while - do loop
		
		
		/*while(number<=upparBound){
			sum+=number;
			number++;
		}
		System.out.println("The Sum Of No Is "+sum);
		double avg=(double)sum/100;
		System.out.println("Average of No 1 to 100 is "+df.format(avg));*/
		
					//using do-while loop
		
		/*do
		{
			sum+=number;
			number++;
		}
		while(number<=upparBound);
		
			System.out.println("The Sum Of Number is "+sum);
			double avg=(double)sum/100;
			System.out.println("Average of No 1 to 100 is "+df.format(avg));*/
		
					
		
				//********** Modify Program sum of Even Odd Number*************
		
		/*int count=0;
		int lowerBound=1;
		int upparBound=1000;
		int Evensum=0;
		int oddSum=0;
		for(int i=1;i<upparBound;i++)
		{
			if(i%2==0)
			{
				Evensum+=i;
			}
			
			else if(i%2==1)
			{
				oddSum+=i;
				
			}
			count++;
		}
			System.out.println("The Sum of Even no is " +Evensum);
			System.out.println("The sum of even no is " +oddSum );
			System.out.println(count);
			double avg=(double)Evensum/count;
			System.out.println("The average of even no is " +df.format(avg));*/
		
		//**********************************************************************
		
				/* ******* Sum of Number 1 to 100 Is divisble by 7
		
		int upaarBound=100;
		int sum=0;
		int count=0;
		for(int i=1;i<upaarBound;i++)
		{
			if(i%7==0)
			{
				sum+=i;
			}
			count++;
			
		}
		System.out.println("The Sum of No which is Divisbile by 7 "+sum);
			double avg=(double)sum/count;
			System.out.println("The average of no is "+df.format(avg));*/
		
		
		
		}
		
		
	}


