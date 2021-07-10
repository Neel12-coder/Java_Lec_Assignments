// LinkedList
import java.util.*;
class Link
{
public static void main(String args[])
{
LinkedList<String> ll=new LinkedList <>();
ll.add("C");
ll.add("java");
ll.add("c++");
ll.add("PHP");
System.out.println("The contents of list are : "+ll);
ll.addFirst("Python");
System.out.println("The contents of list are : "+ll);
ll.removeLast();
System.out.println("The contents of list are : "+ll);
ll.addLast("Go Programming");
System.out.println("The contents of list are : "+ll);
ll.removeFirst();
System.out.println("The contents of list are : "+ll);
}
}