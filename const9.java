//constructor chaining
class const9
{
	const9()
	{
		this(10);
		System.out.println("default");
	}
	const9(int x)
	{
		this(10,20);
		System.out.println(x);
	}
	const9(int x,int y)
	{
		System.out.println(x+y);
	}
	public static void main(String ... a)
	{
	new const9();		
	}	
}