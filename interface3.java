interface my
{
	void show();
}
//inheritence in interface
interface my1 extends my
{
	void display();
}
class child implements my,my1
{
	public void show()
	{
		System.out.println("show");
	}
	public void display()
	{
		System.out.println("display");
	}
}
class interface3
{
	public static void main(String ... a)
		{
			my n=new child();
			n.show();
			my1 n1=new child();
			n1.show();
			n1.display();
		}
}