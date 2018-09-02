//parametrized constructor
class const7
{
	int x;
	int y;
	const7(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}	
	public static void main(String ... a)
	{
		const7 t1=new const7(10,20);
		t1.show();
		const7 t2=new const7(100,200);
		t2.show();		
	}	
}