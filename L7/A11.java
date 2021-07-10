import java.util.*;
class A11
{
public static void main(String args[])
{
String s="Gaur.-.peter.-.son.-.timm";
Scanner scan=new Scanner(s);
scan.useDelimiter(".-.");
while(scan.hasNext())
System.out.println(scan.next());
}
}
