import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GradeHistoGram {
	public static int[] bins = new int[10];
	public static int grades[];
public static void readGrades(String fileName) throws FileNotFoundException{
	//int num1[]=new int[15];
	File f= new File(fileName);
	Scanner s=new Scanner(f);
	 bins=new int [s.nextInt()];
	int index=0;
	while(s.hasNextInt()){
		bins[index]=(s.nextInt());
		 index++;
	}
	for(int i=0;i<bins.length;i++){
	   System.out.print(i*10+"-"+((i+1)*10-1));
	   for(int j=0;j<bins.length;j++){
	   if(bins[j]>=i*10 && bins[j]<=((i+1)*10-1))
		   System.out.print("*");}
	   System.out.println();   
	}
}
public static void printHistogramVertical(){
	
	for(int i=0;i<bins.length;i++)
	{
		for(int k=0;k<1;k++){
			System.out.print("\t"+i*10+"-"+((i+1)*10-1));
		}
		 for(int j=0;j<bins.length;j++){
			 
			 if(bins[j]>=i*10 && bins[j]<=((i+1)*10-1))
			 {
				 System.out.print("*");
			 }
			 
		 }
		 System.out.println("\t"); 
	}

}
public static void printHistogramHorizontal(){
	for(int i=0;i<bins.length;i++)
	{
		int k=0;
		for(int j=0;j<bins.length;j++)
		{k++;
		if(k==10)
			System.out.print((i*10)-(i+1)*10-1);
			
		}
	}
}

}
