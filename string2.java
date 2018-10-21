import java.util.*;
class spacecount
{
	public static void main(String ... a)
	{
		String s;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.nextLine();
		System.out.println("Entered String is "+s);
		char ch[]=s.toCharArray();
		char x=' ';
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i]==x)
			  count=count+1;
		}
		System.out.println("Spacecount is "+ count);
	}
}