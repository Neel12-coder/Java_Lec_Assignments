import java.util.*;
class PR2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuffer str=new StringBuffer(s);
int p;
p=str.capacity();
System.out.println(p);
str.append(" youu");
System.out.println(str);
str.replace(2,4,"was");
System.out.println(str);
str.delete(4,5);
System.out.println(str);
str.reverse();
System.out.println(str);
str.deleteCharAt(2);
System.out.println(str);
str.insert(5,"humpty");
System.out.println(str);
}
}