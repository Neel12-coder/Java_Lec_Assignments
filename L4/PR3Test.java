//process of creating a class is called encapsulation .
//encapsulation comprises of state and behavior.
//state is variables of a class and behaviour is methods of a class.
//good encapsulation is keeping variables private and methods public.
//java is strongly typed language i.e static lang. whereas py. is dynamic lang.
//process of creating a variable is called instantiation.

class PR3
{
private double radius;             // instance  variable
final double PI=3.14159;
public void setData(double r)          // instance method
{
radius=r;
}
public double area()
{
double area=PI*radius*radius;           // area is local variable
return area;
}
public double circum()
{
double c=2*PI*radius;
return c;
}
}
class PR3Test
{
 static public void main(String...args)          // args should be one dimensional
{
PR3 cir=new PR3();                  // cir is reference variable
cir.setData(3.14);
double t=cir.area();                //  y and t are primitive variables
double y=cir.circum();
System.out.printf("Area and circumfernce of circle is: %-8.3f %-8.3f%n",t,y);
}
}
