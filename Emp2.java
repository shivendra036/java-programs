class Emp2
{
String name;
int salary;
static String cname="TCS";
void get(String s1,int s2)
{
name=s1;
salary=s2;	
}
void show()
{
	System.out.println(name);
	System.out.println(salary);
        System.out.println(cname);
}
public static void main(String... a)
{
	Emp2 e1=new Emp2();
	e1.get("lal", 400000);
	e1.show();
	
}
	
	
}