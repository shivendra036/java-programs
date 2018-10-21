// counting the number of words
import java.util.*;
class Wordcount
{
public static void main(String ... a)
{
		String s; 
		int count=0;	
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a string"); 
 		s = sc.nextLine();  
		System.out.println("You entered String "+s);
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			count=count+1;
		}
		System.out.println("Wordcount "+count);
} 
}