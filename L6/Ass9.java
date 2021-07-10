class Ass9
{
public static void main(String args[])
{
test("foura");
test("teee");
public static void test(String str)
{
int check=4;
if(check==str.length())
{
System.out.println(str.charAt(check-=1)+" ");
System.out.printtn(str.replace("a","YY"));
}
else
{
System.out.println("NOO");
}
}
}
}