class Travel
{
public static void main(String args[])
{
System.out.println("HELLO MR "+args[1]);
}
}
class Traveller
{
public static void main(String args[])
{
Travel.main(args);
System.out.println("PASSED");
}
}