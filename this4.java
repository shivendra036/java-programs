//use of this  as argument
class this4
{
	int x=10;
	//passing this as an argument in reference function it must be first argument
	void show(this4 this,int y)
	{
		System.out.println(this.x);
		System.out.println(y);
	}
	public static void main(String ... a)
	{
		this4 t=new this4();
		t.show(20);		
		System.out.println(t);
	}	
}