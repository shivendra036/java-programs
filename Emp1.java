class Emp1
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
	Emp1 e1=new Emp1();
	e1.get("lalu", 400000);
	e1.show();
	
}
	
	
}