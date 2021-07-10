//to find wheather number is even or odd using condition op.
class P4
{
public static void main(String args[])
{
int n1=Integer.parseInt(args[0]);
int temp=n1%2;
String result=temp==0? "even" : "odd";
System.out.println("Number is :"+result);
}}
