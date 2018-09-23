//find the minimum element of 2d array
import java.util.*;
class array3
{
public static void main(String ... a)
{
    System.out.println("enter 2d array size");
	Scanner sc=new Scanner(System.in);
	int rows=sc.nextInt();
	int col=sc.nextInt();
	int array[][]=new int[rows][col];
	System.out.println("enter array elements");	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<col;j++)
		{
			array[i][j]=sc.nextInt();
		}
	}
	int temp=array[0][0];
	int min=0;
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<rows;j++)
		{
			if(temp<=array[i][j])
			{}
			else
			temp=array[i][j];
		}
		if(i==0)
			min=temp;
		if(temp<=min)
			min=temp;
	}
	System.out.println("manimum of 2d array is:" +min);
}
}