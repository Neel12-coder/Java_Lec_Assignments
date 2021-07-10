import java.util.*;
class Trail
{
public static void main(String args[])
{
ArrayList<Integer> al=new ArrayList<>();
al.add(9);
al.add(10);
al.add(90);
al.add(20);
System.out.println(al);
al.add(4,30);
for(int i=0;i<al.size();i++)
{
System.out.print(al.get(i));
}
System.out.println();
al.remove(new Integer(10));                           // to add data new Integer is necessary else it will be considered index...
for(int l:al)
System.out.print(l+" ");
System.out.print(al.contains(30));                          // contains not contain....
al.set(0,1);
Iterator p = al.iterator();                                       // to iterate in Arraylist
while(p.hasNext())                                              // to check arraylist
{
System.out.print(p.next()+" ");
}
System.out.println();
}}
																																																																														