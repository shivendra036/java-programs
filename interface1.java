        //developer class-interface
interface my
{
	void show();
}
        //developer class-registration class
class myregister
{
	    //child class passes it's reference
	public void register(my n)
	{
		n.show();
	}
}
class child implements my
{
	    //override abstract method of an interface
	    /*we has to make it public because interface method 
	    by default are public*/
	public void show()
	{
		System.out.println("show");
	}
}
class interface1
{
	public static void main(String ... a)
	{
		child c1=new child();
		myregister mr=new myregister();
		mr.register(c1);
	}
}

