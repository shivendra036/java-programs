import java.util.*;
class array3
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
	int min=x[0];
	for(int i=0;i<x.length;i++)
	{
		if(min<=x[i])
		{}
	else
		   min=x[i];			
	}
	System.out.println("maximum no. is"+ min);
}
}