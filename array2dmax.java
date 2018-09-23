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
	int temp=0;
	int max=0;
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<rows;j++)
		{
			if(temp>=array[i][j])
			{}
			else
			temp=array[i][j];
		}
		if(i==0)
			max=temp;
		if(temp>=max)
			max=temp;
	}
	System.out.println("maximum of 2d array is: +max);
_}
}