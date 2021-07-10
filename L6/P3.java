import java.io.*;
import java.util.*;
class P3
{
public static void main(String args[])
{
Console c=System.console();
int data[];
int n=Integer.parseInt(c.readLine("Enter how many numbers  "));
data=new int[n];
for(int i=0;i<n;i++)
data[i]=Integer.parseInt(c.readLine("Enter element at position "+i+" "));

Arrays.sort(data);
System.out.println("Maximum= "+data[n-1]);
System.out.println("Minimum= "+data[0]);
}
}
