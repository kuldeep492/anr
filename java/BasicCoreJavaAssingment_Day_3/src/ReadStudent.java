import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadStudent {

	public static void show() throws FileNotFoundException
	{
		Scanner s=new Scanner(new File("readstudent.txt"));
		StringBuilder sb=new StringBuilder();
		
		while(s.hasNextLine())
		{
			sb.append(s.nextLine()+"\n");
			
		}
		sb=new StringBuilder(sb.toString().replace('{', ' '));
		sb=new StringBuilder(sb.toString().replace('}', ' '));
		sb=new StringBuilder(sb.toString().replace('"', ' '));
		// sb1=new  StringBuilder(sb.toString().replace('}', ' '));
		//System.out.println(sb.length());
		System.out.println(sb);
		//System.out.println(sb1);
	}
	public static void main(String[] args) throws FileNotFoundException {
		ReadStudent.show();
	}
}
