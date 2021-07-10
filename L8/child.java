class A11
{
public float Computepay(double d)
{
System.out.println("In parent");
return 0.0f;
}
}
class Child extends A11
{
public float Computepay(double d)
{
System.out.println("In child");
return 0.0;
}
public static void main(String args[])
{
new Child().Computepay(0.0);
}
}