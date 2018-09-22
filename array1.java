//showing data in array
import java.util.*;
class array1
{
public static void main(String ... a)
{
    int z[];
	System.out.println("entr size");
	int x1=new Scanner (System.in).nextInt();
	z=new int[x1];
	
	for(int i=0;i<z.length;i++)
	{
		z[i]=new Scanner (System.in).nextInt();
		
	}
	System.out.println("print the array");
	for(int i=0;i<z.length;i++)
	{
		
		System.out.print(z[i]);
		System.out.print(" ");
}
}
}