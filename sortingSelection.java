//SELECTION SORTING
import java.util.*;
class array7
{
public static void main(String ... a)
{
    int sort[];
	System.out.println("enter size");
	int x1=new Scanner (System.in).nextInt();
	sort=new int[x1];
	for(int i=0;i<sort.length;i++)
	{
		sort[i]=new Scanner (System.in).nextInt();
	}
		int temp=0;
		int temp1=0;
	for(int i=0;i<sort.length;i++)
	{
		int min=sort[i];
		for(int k=i;k<sort.length;k++)
		{
		if(min<=sort[k])
		{}
		else
		{
			min=sort[k];
			temp=k;		   
		}
		}
		if(min!=sort[i])
		{
		temp1=sort[i];
		sort[i]=sort[temp];
		sort[temp]=temp1;
		}
	}
System.out.print("sorted sequence: ");
for(int i=0;i<sort.length;i++)
{
	System.out.print(" "+sort[i]);
}
}
}