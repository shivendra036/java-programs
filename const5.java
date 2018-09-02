class const5
{
	int sal;
	const5()
	{
		sal=15000;	
      //this function will return Rid		
	}
	void show()
	{
		System.out.println(sal);
	}		
	public static void main(String ... a)
	{  /*
	   const5() function present in class initialize 
	   sal and return it's Rid which is hold by new const(). 
	   here and as  we know instance data member can be access 
	   using Rid.
	   */
		System.out.println(new const5().sal);
		/*
	    new const5(). has Rid and we can access instance 
	    data member using Rid.
	    */
		new const5().show();
		{
			//showing new const5() holds Rid
			System.out.println(new const5());
		}
	}
		
		
		
}