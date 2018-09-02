//constructor overloading
class const3
{
	void show()
	{
		System.out.println("show");
	}
	const3()
	{
		System.out.println("without argument");		
	}
	const3(int x)
	{
		System.out.println(x);
	}
	public static void main(String ... a)
	{
		//inserting int value in const() call the const3(int x) function
	const3 t=new const3();
	t.show();
	}
}