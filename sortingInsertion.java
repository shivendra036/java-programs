//INSERTION SORTING
import java.util.*;
class array6
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
		for(int j=0;j<sort.length-1;j++)
		{			
		if(sort[j]>sort[j+1])
		{
			temp=sort[j];
			sort[j]=sort[j+1];
			sort[j+1]=temp;
			
		}
		System.out.print(sort[j]);
		for(int k=i;k>0;k--)
			{
				if(sort[k-1]>sort[k])
				{
					temp1=sort[k-1];
					sort[k-1]=sort[k];
					sort[k]=temp1;
				}
			}
		}
		System.out.println();
	}
System.out.print("sorted sequence: ");
for(int i=0;i<=sort.length-1;i++)
{
	System.out.print(" "+sort[i]);
}	
}
}