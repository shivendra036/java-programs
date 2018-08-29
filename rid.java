class rid
{
	String name;
	int salary;
	void get(String s1,int s2)
	{
		name=s1;
		salary=s2;
	}
	void show()
	{
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String... a)
	{
	rid r1=new rid();
	System.out.println(r1);
	r1.name="lalu";
	
	rid r2=r1;
	System.out.println(r2);
	}
}