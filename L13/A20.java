import java.util.*;
class A20
{
public static Iterator reverse(List list)
{
Collections.reverse(list);
return list.iterator();
}
public static void main(String args[])
{
List list= new ArrayList();
list.add("1");
list.add("2");
list.add("3");
Iterator i= reverse(list);
while(i.hasNext())
{
System.out.print(i.next()+" ");
}
}
}
