class A16
{
static double f;
public static void parse(String str){
try
{
f=Float.parseFloat(str);
}
catch( NumberFormatException e)
{
f=0;
}
finally
{
System.out.println(f);
}
}
public static void main(String args[])
{
parse("in");
}
}