// wamdjp with exception handling to check if the number is even or odd
import java.io.*;
import java.util.*;
class P2
{
public static void main(String args[])
{
Console c=System.console();
while (true)
{
try{
System.out.println("Enter----> 1.To check 2.To exit");
int n=Integer.parseInt(c.readLine());
if (n==1)
try{
System.out.println("Enter number to check :  ");
int q=Integer.parseInt(c.readLine());
if(q%2==0)
System.out.println(q+" is an even number");
else
System.out.println(q+" is an odd number");
}
catch(NumberFormatException e)
{
System.out.println(e+" has occured, Please enter valid number........");
}
catch(Exception r)
{
System.out.println("Negative number not allowed......");
}
else if(n==2)
{
break;
}
else
{
System.out.println("Enter number which is valid...");
}
}
catch(NumberFormatException i)
{
System.out.println("Sooorryyyy In valid option...");
}
finally
{
System.out.println("Byee byeee");}
}}
}
