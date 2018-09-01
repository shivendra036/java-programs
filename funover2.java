//function overloading by changing datatype of arguement
class funover2{
char nameinitial;
int sal;
void show()
{
System.out.println("without arguement");
}
void show(char a)
{
	nameinitial=a;
	System.out.println("nameinitial="+nameinitial);
}
void show(int a)
{
	sal=a;
    System.out.println("sal="+sal);
}
void show(double a)
{
	double sal=a;
	System.out.println("sal="+sal);
}
public static void main(String[] a)
{
funover e1= new funover();
e1.show();	
e1.show('s');
e1.show(30);
e1.show(2500.25);
}
}