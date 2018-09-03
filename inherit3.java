//inheritence in parent's parent class
class Base extends dadaji
{
	int x=50;
}
class dadaji
{
	int x=80;
}
class child extends Base
{
	int x=20;
	void show()
	{//print local variable
		System.out.println(x);
	//print parent class(Base) variable
		System.out.println(super.x);
		/*
		taking value of x from dadaji class 
		and	putting it into Rid hold by 'this'
		*/
	//print parent's parent class variable
		System.out.println(((dadaji)this).x);
	//print parent class(Base) variable
		System.out.println(((Base)this).x);
	}
}
class inherit3
{
	public static void main(String[] args)
	{
		child c1=new child();
		c1.show();
		/*
		taking value of x from dadaji class 
		and	putting it into Rid hold by c1
		*/
		System.out.println(((dadaji)c1).x);
	}
}
		