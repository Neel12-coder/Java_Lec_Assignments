// wajp to read a str from user and remove the vowels from string
import java.io.*;
class P3
{
public static void main(String args[])
{
Console c=System.console();
String str= c.readLine("Enter a string ");
String s="";

for(int i=0;i<str.length();i++)
{
char ch= str.charAt(i);
if (! (ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='a' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ))
 s=s+ch;
}
System.out.println(str+ " "+s);
}
}

