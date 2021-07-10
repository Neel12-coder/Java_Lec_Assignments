/* wap for student clss with following info:
state :rno, name, p,c, m
behaviour: setdata(),display() and average() */
class Student
{
private int rno,p,c,m;
private String name;
 public void setData(int rno,int p,int c,int m, String name)
{
this.rno=rno;
this.p=p;
this.c=c;
this.m=m;
this.name=name;
}
public void display()
{
System.out.println("The details of the student are: "+name+" "+rno+" "+p+" "+c+" "+m);
}
public double average(int p,int c,int m)
{
int sum=p+c+m;
double average=sum/3.0;
return average;
}
}
class StudentTest
{
public static void main(String args[])
{
Student s1=new Student();
s1.setData(4,99,90,100,"Neelam");
s1.display();
double r	=s1.average(99,90,100);
System.out.println("Average= "+r);
}
}