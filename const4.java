//showing constructor return Rid
class const4
{	/*
	  'this' will hold the value pass by t
	  and give output and same value of 'this'
	  is return to t,then t will get printed
	*/
	const4()
	{
	System.out.println("first "+this);
	}
	public static void main(String ... a)
	{
		const4 t= new const4();
		System.out.println("second "+t);
		}
}
	