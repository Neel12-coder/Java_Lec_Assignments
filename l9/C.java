interface Aquatic
{
public default int getNumberOfgills (int input)
{
return 2;
}}
public class C implements Aquatic{
public int getNumberOfgills(int input)
{ 
return 9;}
public static void main(String args[])
{
System.out.println(new C().getNumberOfgills(3));
}
}