//when init and super block both present in constructor
class base
{//init block
	{
	System.out.println("parent");
	}
	base()
	{
	System.out.println("base");
	}
	
}
class child extends base
{
	child()
	{
		System.out.println("child");
	}
	//init block
	{
		System.out.println("hey");
	}
}
class inherit9
{
	public static void main(String ... a)
	{
		new child();
	}
}
