class PR1
{
public static void main(String args[])
{
final double PI=3.14159;
double radius=Double.parseDouble(args[0]);
double area=2*PI*radius;
System.out.println("area= "+area);
System.out.printf("Area= %8.2f%n",area);
System.out.printf("Area=%-8.2f%n",area);
System.out.printf("Area=%08.2f%n",area);
}
}
