import java.util.*;
class P6
{
public static void main(String args[])
{
String s="2,w,3,e,4,d,1,a";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
String data[]=s.split(",");    // it returns array of string
for(int i=0;i<data.length;i+=2)
{
int n=Integer.parseInt(data[i]);
String str=data[i+1];
for(int j=0;j<n;j++)
System.out.print(str);
System.out.println();
}
}
}
