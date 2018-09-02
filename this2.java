//program showing this is hidden 

class this2
{
	int x=10;
	/*here Temp this is hidden which will catch the Rid given by t*/
	void show(int x /*,Temp this*/)
	{
		//calling local variable but due to shadowing o/p x will be of main x
		System.out.println("main x= "+x);
		System.out.println("accessing the local variable x= "+this.x);
	}		
	public static void main(String ... a)
	{
		this2 t=new this2();
		t.show(20);
		System.out.println("t.x= "+t.x);
	}
	
}