//wajp md pro to view, asc sort of prices ,desc sort of prices , asc sort of names , sdesc sort of names
import java.util.*;
import java.io.*;
class Menu implements Comparable<Menu>
{
public String name;
public Double price;
Menu(String name,double price)
{
this.name=name;
this.price=price;
}
public String toString()
{
return name+" "+price;
}

public int compareTo(Menu j)
{
return (int)(price - j.price);
}
}

class As implements Comparator<Menu>
{
public int compare(Menu a,Menu b)
{
return a.name.compareTo(b.name);
}
}
class Test
{
public static void main(String args[])
{
Console c =  System.console();
ArrayList<Menu> m=new ArrayList<>();
m.add(new Menu("IDLI",45.0));
m.add(new Menu("DOSA",70.0));
m.add(new Menu("VADA PAV",50.0));
m.add(new Menu("SAMBOSA",40.0));
m.add(new Menu("DAHI VADA",90.0));
while(true)
{
System.out.println("1.To View 2. To sort in asc order of prices 3.To sort in Desc order of Prices 4.To sort in asc order of names 5.To sort in desc order of names 6.To exit");
int op=Integer.parseInt(c.readLine());
if(op==1)
{
for(Menu p:m)
{
System.out.println(p);
}
}
else if(op==2){
Collections.sort(m);
for(Menu p:m)
{
System.out.println(p);
}
}
else if(op==3){
Comparator<Menu> c1= (Menu m11,Menu m12)  ->{return (int)(m12.price - m11.price);};
Collections.sort(m,c1);
for(Menu p:m)
{
System.out.println(p);
}

}
else if(op==4){
Collections.sort(m, new As());
for(Menu p:m)
{
System.out.println(p);
}

}
else if(op==5){
Comparator<Menu> f = (Menu i,Menu j) -> j.name.compareTo(i.name);
Collections.sort(m,f);
for(Menu p:m)
{
System.out.println(p);
}

}
else if(op==6)
break;
else
System.out.println("Invalid option");
}
}
}
