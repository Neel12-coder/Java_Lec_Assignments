//to find maximum of 3 integers
class P1
{
public static void main(String args[])
{
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
if(a>b && a>c)
System.out.println(a+" is maximum");
else if(b>c)
System.out.println(b+" is maximum");
else 
System.out.println(c+" is maximum");
}
}