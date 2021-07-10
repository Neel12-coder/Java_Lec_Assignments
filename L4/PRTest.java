class PR2
{
private int length;
private int breadth;
public void Setdata(int l,int w)
{length=l;
breadth=w;}
public double  area()
{
double area=length*breadth;
return area;
}
}
class PRTest
{
public static void main(String args[])
{
PR2 rect1=new PR2();
rect1.Setdata(12,10);
double ans=rect1.area();
System.out.printf("ArEa of Rectangle= %-8.2f%n",ans);
}
}