class P1
{
private String s="neelam";
private int no;
P1(int number)
{
no=number;
}
public String toString()
{
return s+" " +no;
}
}
class Test
{
public static void main(String args[])
{
P1 p=new P1(3);
System.out.println(p.getClass());
System.out.println(p);
}
}