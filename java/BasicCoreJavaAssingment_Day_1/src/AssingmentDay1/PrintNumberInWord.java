package AssingmentDay1;

import java.util.Scanner;

public class PrintNumberInWord {
  public static void show()
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Plz Enter a Number between 1 to 9");
	  int num=s.nextInt();
	  /*if(num==1)
	  {
		  System.out.println("one");
	  }
	  else if(num==2)
	  {
		  System.out.println("Two");
	  }
	  else if(num==3)
	  {
		  System.out.println("Three");
	  }
	  else if(num==4){
		  System.out.println("Four");
	  }
	  else if(num==5){
		  System.out.println("Five");
		 
	  }
	  else if(num==6)
	  {
		  System.out.println("six");
	  }
	  else if(num==7){
		  System.out.println("seven");
  }
	  else if(num==8){
		  System.out.println("Eight");
         }
	  else if(num==9){
		  System.out.println("Nine");
	  }
	  else
	  {
		  System.out.println("Enter again number between 1 to 9");
	  }*/
	  
	  
	  
	  				//*** using Switch case
	  switch(num)
	  {
	  case 1: System.out.println("One");
	  break;
	  case 2: System.out.println("Two");
	  break;
	  case 3: System.out.println("Three");
	  break;
	  case 4: System.out.println("Four");
	  break;
	  case 5: System.out.println("Five");
	  break;
	  case 6: System.out.println("Six");
	  break;
	  case 7: System.out.println("Seven");
	  break;
	  case 8: System.out.println("Eight");
	  break;
	  case 9: System.out.println("Nine");
	  default:
	  
	  case 10: System.out.println("Plz input number between 1 to 9");
	  
	  
	  
	  }
  }
}
