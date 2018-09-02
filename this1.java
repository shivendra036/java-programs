     /*program showing instance data member of object can only be 
	   access using RID.*/
class Temp
{
int x=10;
    // here z will access the Rid from t
void show(int x,Temp z)
{
  System.out.println("1 "+x);
    /*  object can't be local or private or public 
		so object can be access from anywhere
		object can be created anywhere
		here z. contain RID of object*/
System.out.println("2 "+z.x);
}
public static void main(String ... a)
{
		// new will create an object and t will store RID
	Temp t=new Temp();
		/* show(20,t) here t will hold Rid of object
		two actual argument and 2 formal argument*/
    t.show(20,t);
	System.out.println("3 "+t.x);	
}
}