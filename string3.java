//revesing the string
import java.util.*;
class stringreverse
{
	public static void main(String ... a)
	{
		String s;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word");
		s=sc.nextLine();
		byte b[]=s.getBytes();
		System.out.println("Reserse String is:");
		for(int i=s.length()-1;i>=0;i--)
		{
		System.out.print((char) b[i]);
		}
	}
}