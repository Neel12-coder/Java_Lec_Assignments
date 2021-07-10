//wajp to reverse the given number using do while loop.
class P3
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int rev=0;
do
{
int r=n%10;
rev=rev*10+r;// imp step
n=n/10;
}while(n>0);
System.out.println("Reverse is "+rev);
}
}
// drawback is reverse of 100 we will get 1 or 10020 i.e 2001.
// The above program will ignore the leading and the trailing zeros.
