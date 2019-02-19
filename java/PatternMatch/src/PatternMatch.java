import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String pattern="[a-z A-Z]+"; // we can not match the two String pattern like this//+"[A-Z]+";
   String text="Now is the line";
   String p1="hello";
   Pattern p =Pattern.compile(pattern);
   Matcher m=p.matcher(text);
   while(m.find())
   {
	   System.out.print(text.substring(m.start(),m.end())+ " * ");
	   
   }
   System.out.println(m.replaceFirst("how")); //to replace the The any word  from the string.
   System.out.println(m.replaceAll(p1));
  // System.out.println(m.find("i"));
	}

}
