//no class exist without a constructor
//and can be seen by decompile .class file 
class const2
{
	/*
	here  non parametrized constructor is inserted by 
	compiler like this and is called default constructor
	
	cons2()
	{}
	
	*/
	void show()
	{
		System.out.println("show");
		
	}	
	public static void main(String ... a)
	{
		/*here we are calling the function constructor 
		  so before calling it, it should be present 
		  in class
		*/
	const2 t=new const2();
    t.show();	
		
		
		
	}
	
}