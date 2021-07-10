class A10
{
public static void main(String args[])
{
String o="";
z:
for(int x=2;x<7;x++)
{
if(x==3 || x==5) continue;
if(x==7) break z;
o=o+x;
}
System.out.println(o);
}
}
