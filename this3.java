//printing the value hold by Rid
class this3
{
	int x=10;
	void show()
	{
		System.out.println(this);	
	}
	public static void main(String ... a)
	{
		this3 t=new this3();
		System.out.println(t);
		t.show();
	}
}