// wap fo the following specification
/*
class employee :
           IV- eid,ename,esalary;
           SV: cname
            PC: for eid,ename, and esalary
            IM: show and calcyearlysalary()*/
import java.io.*;
class Employee
{
private int eid;
private String ename;
private int esalary;
public static String cname="NCS";

public Employee(int eid,String ename, int esalary)
{
this.eid=eid;
this.ename=ename;
this.esalary=esalary;
}

public void show()
{
System.out.println("The details are "+eid+" "+ename+" "+esalary);
}
 public void calcyearlysalary()
{
int y=12*esalary;
System.out.println("The yearly salary is : "+y);
}
}
class EmployeeTest
{
public static void main(String args[]) //throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter employee id");
int eid=Integer.parseInt(br.readLine());

System.out.println("Enter employee name");
String ename=br.readLine();

System.out.println("Enter employee salary");
int esalary=Integer.parseInt(br.readLine());

System.out.println("---------------------" + Employee.cname + "--------------------");
Employee e1=new Employee(eid,ename,esalary);
e1.show();
e1.calcyearlysalary();
}
}

      