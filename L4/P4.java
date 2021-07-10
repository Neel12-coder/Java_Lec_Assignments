// wap to generate the following pattern /*
//*
//* *
//* * * */
class P4
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)       // <= hona chaeye....take care else ek baar cum chalega.
{
System.out.print("* ");
}
System.out.println();
}
}
}
