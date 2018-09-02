class localblock
{
	public static void main(String ... a)
	{
		{
		int x=10;
		x=x+10;
		System.out.println(x);		
		}
		/*
		if x is called outside above block
		then give error
		System.out.println(x);	
		*/	
	}
}