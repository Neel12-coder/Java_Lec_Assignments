//pallindrom
import java.io.*;
class P4
{
public static void main(String args[])
{
Console c=System.console();
String s=c.readLine("Enter a string ");
StringBuffer b=new StringBuffer(s);
b.reverse();
if(s.equalsIgnoreCase(b.toString()))// we cannot compare string and stringbuffer
System.out.println("It is a pallindrome!! ");
else
System.out.println("Not a pallindrome");
}
}

