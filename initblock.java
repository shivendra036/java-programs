class initblock
{
	{
		System.out.println("init block");
	}
	initblock()
	{
		System.out.println("default");
	}
	initblock(int x)
	{
		System.out.println(x);
	}	
	public static void main(String ... a)
	{
	new initblock();
	new initblock(10);
	new initblock();	
	}	
}