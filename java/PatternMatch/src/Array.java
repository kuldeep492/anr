import java.util.Scanner;


public class Array {
 public static void show()
 {
	 int row;
	 int col;
	 int sum=0;
	 
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the row");
	  row=s.nextInt();
	  System.out.println("Enter the col");
	  col=s.nextInt();
	  int arr[][]=new int[row][col];
	  for(int b=0;b<arr.length;b++)
	  {
		  for(int a=0;a<arr[b].length;a++)
		  {
			 arr[b][a]=s.nextInt();
		  }
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr[i].length;j++)
		  {
			  sum+=arr[i][j];
		  }
	  }
	  System.out.println(sum);
	  
 }
 public static void main(String[] args) {
	 Array.show();
}
}