class Person
{
String name="no name";
public Person(String nm)
{
name=nm;
}
}
class Employee extends Person
{
String empid= "0000";
public Employee(String id){empid=id;}
}
class EmployeeTest
{
public static void main(String args[])
{
Employee e=new Employee("453");
System.out.println(e.empid);
}
}