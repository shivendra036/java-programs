//copy constructor
class const8
{
	int x;
	int y;
	const8(int x,int y)
	{// x and y value store at Rid of t1
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.println("1 "+x);
		System.out.println("2 "+y);
	}
	const8(const8 z)
	{  /*
	   t1 Rid is catch by z so z.x and z.y
	   gives value of old x and y
	   this. holds the Rid of t2 therefore 
	   this.x and this.y assign value to 
	   x and y of object t2
	   */	   
		this.x=z.x;
		this.y=z.y;
	}	
	public static void main(String ... a)
	{
		const8 t1=new const8(10,20);
		t1.show();
		const8 t2=new const8(t1);
		t2.show();	
	}
	
	
	
	
}