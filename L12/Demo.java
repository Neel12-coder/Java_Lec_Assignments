class P3
{
public static void foo(Integer a)
{
System.out.println("Hello this is Wrapper Integer");
}
public static void foo(String...b)
{
System.out.println("Hellooo this is varargs String");
}
public static void foo(float f)
{
System.out.println("heloo this is primitive float");
}
public static void foo(int n)
{
System.out.println("hello this is primitive int");
}
public static void foo(Number n)
{
System.out.println("Heyy number nice to see you !! ");
}
}
class Demo
{
 public static void main(String args[])
{
long l=9;
Byte b=5;
int i=7;
String s="neelam";
double d=8.99;

P3.foo(d); //Autoboxing
P3.foo(i); //Exact
P3.foo(b); //autoboxing
P3.foo(s); //varargs
P3.foo(l); //widening
}
}
