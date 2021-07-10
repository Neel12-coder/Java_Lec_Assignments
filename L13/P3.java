// wajp to create two sets: java and android
// r1 = total number of students in java and android 
// r2 = students in java but not in android
// r3 = common students in java and android
import java.util.*;
import java.io.*;
class P2
{
public static void main(String args[])
{ 
HashSet<String> java = new HashSet<>();
HashSet<String> android = new HashSet<>();
Console c = System.console();
String reply=c.readLine("do you want to enter name in java y/n ");
while(reply.equals('y'))
{
String name=c.readLine("Enter name ");
java.add(name);
reply=c.readLine("do you want to enter name in java y/n ");
}

String r=c.readLine("do you want to enter name in java y/n ");
while(r.equals('y'))
{
String name=c.readLine("Enter name ");
android.add(name);
r=c.readLine("do you want to enter name in android y/n ");
}

HashSet<String> Union = new HashSet<>();
for(String s1: java)
    Union.add(s1);
for(String s2: android )
    Union.add(s2);
System.out.println("Union of java and android is "+Union);

HashSet<String> Diff= new HashSet<>();
for(String s3:java)
   if(android.get(s3)==null)
             Diff.add(s3);
System.out.println("Difference of java and android is :  " +Diff);

HashSet<String> Intersection=new HashSet<>();
for(String s4: java)
   if(android.get(s4)!=null)
        Intersection.add(s4);
System.out.println("Intersection of java and android is "+Intersection);
}
}
