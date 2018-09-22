import java.util.*;
class array2
{
public static void main(String ... a)
{
    int x[];
	System.out.println("enter size");
	int x1=new Scanner (System.in).nextInt();
	x=new int[x1];
	
	for(int i=0;i<x.length;i++)
	{
		x[i]=new Scanner (System.in).nextInt();
		
	}
	int max=x[0];
	for(int i=0;i<x.length;i++)
	{
		if(max>=x[i])
		
		else
			max=x[i];		
	}
	System.out.println("maximum no. is"+ max);
}
}