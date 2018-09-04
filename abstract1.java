//ABSTRACTION VIA ABSTRACT CLASS
//abstract class
abstract class base
{
	int x;
	int y;
	void show()
	{
		
		System.out.println(x);
		System.out.println(y);
	}
	//abstract function without body
	abstract void display();
}
//developer provide a method in which child passes their reference
class myregister
{
	void register(base b)
	{
		b.display();
	}	
}
class child extends base
{
	void get(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	//child class has to override all the abstract class
	void display()
	{
		System.out.println("display");
	}
}
class abstract1
{
	public static void main(String ... a)
	{
		child c1=new child();
		//child class has to register itself by passing a reference to parent class
		myregister mr=new myregister();
		mr.register(c1);
	}
}
	
	
	
	
	
