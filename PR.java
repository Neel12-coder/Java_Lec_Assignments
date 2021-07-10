import java.io.*;
import java.util.*;

class Student implements Serializable
{
int rno;
String name;

Student(int rno, String name){
this.rno= rno;
this.name= name;
}

public String toString()
{
return "Name "+name+"Roll number "+rno;
}
}
class PR
{
public static void main(String...a) throws Exception
{
Console c = System.console();
ArrayList<Student> s = new ArrayList<>();
String filename = "Student_data.ser";

//code for deserialization---- restoring the object 
File r1 = new File(filename);
if(r1.exists())
{
FileInputStream f= new FileInputStream(r1);
BufferedInputStream br = new BufferedInputStream(f);
ObjectInputStream o = new ObjectInputStream(br);
s=(ArrayList<Student>)o.readObject();
o.close();
}

while(true)
{
System.out.println("1. add 2. view 3. delete 4. update and 5. exit");
int op= Integer.parseInt(c.readLine("Enter option "));

if(op==1)
{
int rno=Integer.parseInt(c.readLine("Add rnoll "));
String nme=c.readLine("Enter name ");
s.add(new Student(rno,nme));
System.out.println("record saved");
}
else if(op==2)
{
for(Student t:s)
System.out.println(t);
}
else if(op==3)
{
int rno= Integer.parseInt(c.readLine("Enter rno to delete "));
for(Student t: s)
{
if(t.rno==rno)
{
s.remove(t);
}
}
System.out.println("Record has been deleted ");
}
else if(op==4)
{
int ron= Integer.parseInt(c.readLine("Enter rno to be updated "));
for (Student t : s)
{
if(ron == t.rno)
{
String name= c.readLine("Enter name ");
t.name = name;
}
}
}
else if (op==5)
{
// code for serialization 
FileOutputStream fo = new FileOutputStream(filename);
BufferedOutputStream br = new BufferedOutputStream(fo);
ObjectOutputStream d = new ObjectOutputStream(br);
d.writeObject(s);
d.close();
break;
}
else
{
System.out.println(" Invalid ");
}
}
}
}