//data hiding
class Base
{
	int x=50;
}
class child extends Base
{
	int x=20;
	void show()
	{
		//local class data member hide parent class data member
		System.out.println(x);
		//super keyword used to access parent class data member
		System.out.println(super.x);
	}
}
//main class
class inherit2
{
	public static void main(String ... a)
	{
	child c1=new child();
	c1.show();		
	}	
}