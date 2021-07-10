class P2
{
private String name;
private int rup;
static int count=0;
P2(int rup,String name)
{
this.rup=rup;
this.name=name;
}
public String toString()
{
return name+" you have rupees  "+rup;
}
public void finalize()
{
count++;
}
}
class Garbage
{
public static void main(String args[])
{
P2 b=new P2(10000,"Neelam");
System.out.println(b.toString());
b=null;
System.gc();
System.gc();
System.gc();
System.out.println(P2.count);
}}