//constructor calling using super()
class a
{
	a()
	{
		super();
		System.out.println("a");
	}
}
class b extends a
{
	b(int x)
	{
		super();
		System.out.println("b");
	}
	b()
	{
		System.out.println("default");
	}
}
class c extends b
{
	c()
	{
		super(10);
		System.out.println("c");
	}
	c(int x)
	{
		super();
		System.out.println("x");
	}
}
class inherit8
{
	public static void main(String ... a)
	{
		new c();
		new c(10);
	}
}