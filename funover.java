class funover{
int empid;
int sal;
void show()
{
System.out.println("without arguement");
}
void show(int a)
{
empid=a;
System.out.println("empid="+empid);
}
void show(int a,int b)
{
	empid=a;
	sal=b;
	System.out.println("empid="+empid);
	System.out.println("sal="+sal);
}

public static void main(String[] a)
{
funover e1= new funover();
e1.show();	
e1.show(10);
e1.show(20,30);
}
}