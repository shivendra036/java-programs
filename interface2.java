        //multiple interface
interface my
{
	void show();
}
interface my1
{
	void display();
}
        //registration class
class myregister
{
	    //child class passes it's reference
	public void register(my n)
	{
		n.show();
	}
}
		//name of both the interface 
class child implements my,my1
{
	    //override abstract method of both the interface
	    /*we has to make it public because interface method 
	    by default are public*/
	public void show()
	{
		System.out.println("show");
	}
	public void display()
	{
		System.out.println("display");
	}
}
		//main class
class interface2
{
	public static void main(String ... a)
	{
		child c1=new child();
		my n=new child();
		n.show();
		my1 n1=new child();
		n1.display();
	}
}

