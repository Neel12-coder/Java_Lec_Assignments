class P5
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
char c='A';
for(int i=n;i>0;i--)
{
for(int j=i;j>0;j--)
{
System.out.print(c+" ");
}
c++;
System.out.println();
}
}
}