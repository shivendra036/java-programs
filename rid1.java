class encap
{
 String name;
 int sal;
 void get (String s1,int s2)
 {
	name=s1;
	sal=s2;
 }
void show()
{
System.out.println(name);
System.out.println(sal);
}
public static void main(String[] a)
{
	encap e=new encap();
	System.out.println(e);
}
}