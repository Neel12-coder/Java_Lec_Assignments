import java.util.*;
import java.io.*;
class Student
{
int rno;
String name;

Student(String name,int rno)
{
this.name=name;
this.rno=rno;
}

/*public boolean equals(Object o) // imp to prevent duplicates hence override both eql(0 and hashcde() 
{
Student s=(Student)o;
return (rno==s.rno);
}
public int hashCode()
{
return rno;
}*/
public String toString()
{
return name+" "+rno;
}
}
class Test 
{
public static void main(String args[])
{
Student s1= new Student("Neelam" ,9);
Student s2=new Student("Nand" ,9);
HashSet<Student> h=new HashSet<>();
h.add(s1);
h.add(s2);
System.out.println(h);
}
}