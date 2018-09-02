//program showing 'this' use
class this5
{
	int x=10;
	void get(int x)
	{
		//printing the value in 'this' 
		System.out.println(this+"get");
		//'this' hold the Rid and using Rid. can access instance data member  
		System.out.println(this.x);
		System.out.println(x);
	}
	public static void main(String ... s)
		{
		this5 mt=new this5();
		//print the Rid of mt
		System.out.println(mt+"main");
		mt.get(16);
	}
}