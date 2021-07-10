// wajp to read the string from the user and find number of uppercase and lowercase letter.
import java.io.*;
class P1a
{
public static void main(String args[])
{
Console c= System.console();
String s= c.readLine("Enter a string ");
int uc=0,lc=0;
for(int i=0;i<s.length();i++)
{
char ch= s.charAt(i);
if (ch >='A' && ch<='Z')
uc++;
else if(ch >='a' && ch<='z')
lc++;
}
System.out.println("Upper case letters= "+uc+" Lower case letters are :" +lc);
}
}

