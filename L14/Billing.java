import java.util.*;
import java.io.*;
class Billing
{
public static void main(String args[])
{
Console c=System.console();
HashMap<String,Double> hm=new HashMap<>();
hm.put("IDLI",28.0);
hm.put("DOSA",40.00);
hm.put("MOMOS",70.00);
hm.put("SAMBOSA",25.00);

Double amount=0.0;
while(true)
{
System.out.println("Enter 1.to add 2.to view bill 3.to exit");
int op=Integer.parseInt(c.readLine());
if(op==1)
{
String order=c.readLine("Enter what dou you want ");
if(hm.get(order)!=null)
{
int qu=Integer.parseInt(c.readLine("Enter how many plates "));
Double price= hm.get(order);
amount=amount+(qu*price);
}
else
{System.out.print("Cannot you see menu ");}
}
else if(op==2)
{
System.out.println("The bill is : "+amount);
}
else
break;
}
}
}