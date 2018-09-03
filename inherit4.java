//function overriding
class Base
{
	void show()
	{
		System.out.println("Base");
	}
}
class child extends Base
{
	void show()
	{
		System.out.println("child");
		//parent class function can be access by using super keyword
		super.show();
	}
}
class inherit4
{
	public static void main(String ... a)
	{
		child c1= new child();
		//access parent class function
		c1.show();
	}
}