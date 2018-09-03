/* inheritence*/
//parent class
class Base1
{
int x;
int y;
void show()
{
	System.out.println(x);
    System.out.println(y);
}
}
//child class
class child extends Base1
{
void get(int x,int y)
{
	this.x=x;
	this.y=y;
}
}
//main class
class inherit1
{
public static void main(String a[])
{
	child c1=new child();
	c1.get(10,20);
	c1.show();
}
}