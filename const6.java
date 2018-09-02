//calling method in class level
class const6
{		//here x assign value of function getx() return
	int x=getx();
	int getx()
	{
		//x default value get printed that is 0
		System.out.println(x);
		return 20;
	}
	const6()
	{
		System.out.println(x);
	}		
	public static void main(String ... a)
	{
	//at first new will get to const6() class
	new const6();			
	}		
}