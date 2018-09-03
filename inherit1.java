class inherit1
{
	int x;
	int y;
	void show()
	{
		System.out.println(x);
		System.out.println(y);		
	}	

	class child extends inherit1
	{
	void get(int x,int y)
	{
		this.x=x;
		this.y=y;		
	}
	public static void main(String ... a)
	{
		child c1=new child1();
		c1.get(10,20);
		c1.show();		
	}	
}
}