// to read array of marks from user and print how many secured distinction,first class and others.
import java.io.*;
class P1
{
public static void main(String args[])
{
Console c=System.console();
System.out.println("Enter how many elements you want to give");
int n=Integer.parseInt(c.readLine());
int data[];
int c1=0,c2=0,c3=0;
data=new int[n];
for(int i=0;i<n;i++)
data[i]=Integer.parseInt(c.readLine("Enter marks  "));
for(int j:data)
{
if (j>80)
c1++;
else if(j>60)
c2++;
else
c3++;
}
System.out.println("Number of students in distiction are "+c1);
System.out.println("number of students in first class "+c2);
System.out.println("Others "+c3);
}
}
