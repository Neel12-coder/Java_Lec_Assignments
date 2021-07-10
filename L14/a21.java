import java.util.*;
class Drink implements Comparable
{
public String name;
public int compareTo(Object o)
{
return 0;
}

public String toString()
{
return name;
}
}
class a21
{
public static void main(String...args)
{
Drink one = new Drink();
Drink two= new Drink();
Drink three= new Drink();

one.name="Tea";
two.name="Coffe";
three.name="Soda";
TreeSet set= new TreeSet();
set.add(one);
set.add(two);
set.add(three);
System.out.println(set);
}
}
