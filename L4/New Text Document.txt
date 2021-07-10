// wap to find sum of first n positive numbers using cla
class P1
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
if (n<0)
System.out.println("Be positive");
else
{
int sum=0,i=0;// declaration and initilization
while(i<=n)
{
sum+=i;
i++;
}
System.out.println("Sum= "+sum);
}
}
}