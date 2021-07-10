// wap to find sum of the digits provided by the user thrgh cla using while loop
class P2
{
public static void main(String args[])
{
int p=Integer.parseInt(args[0]);
int sum=0;
while(p>0)
{
int g=p%10;
sum+=g;
p=p/10;
}
System.out.println("Sum of "+"="+sum);
}
}
