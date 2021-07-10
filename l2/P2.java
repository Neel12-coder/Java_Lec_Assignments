//to swap two integers from cla 1)using third variable 2)without using third var.
class P2
{
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
System.out.println("Swapping using third variable");
System.out.println("Before swapping numbers are: "+n1 +" "+n2);
int n3;
n3=n1;
n1=n2;
n2=n3;
System.out.println("After swapping numbers are: "+n1 +" "+n2);
}
}