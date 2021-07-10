import java.io.*;
class Ass
{
public static void main(String args[])
{
Console c=System.console();
//char pw[];
String pw;
System.out.println("Enter password");
pw=c.readPassword();
System.out.println("Got pass= "+pw);
}
}