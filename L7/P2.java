// count num of vowels and consonents
// javap java.lang.StringBeffer
import java.io.*;
class P2
{
public static void main(String args[])
{
Console c= System.console();
int vc=0,cc=0;
String s= c.readLine("Enter a string :");
 for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if (Character.isLetter(ch))
{
switch (ch)
{
case 'a' ,'e' ,'i' ,'o' ,'u' ,'A' ,'E','I', 'O','U'-> vc++;
default  -> cc++;
}
}
}
System.out.println("No. of vowels= "+vc+" No. consonents " +cc);
}
}