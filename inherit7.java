// constructor in inheritance
class a
{//immediate parent class constructor will run first i.e .object class
	a()
	{
		System.out.println("a");
	}
}
class b extends a
{//immediate parent class constructor will run first 
	b()
	{
		System.out.println("b");
	}
}
class c extends b
{//immediate parent class constructor will run first 
	c()
	{
		System.out.println("c");
	}
	c(int x)
	{
		System.out.println(x);
	}
}
class inherit7
{
	public static void main(String ... a)
	{
		new c();
		new c(10);
	}
}