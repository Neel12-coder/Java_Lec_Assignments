// Tokenizing -big piece of data into smaller pieces
/* input- 2,a,3,c,4,e,2,d
output- a a
            c c c
            e e e e
            d d */
import java.util.*;
class P5
{
public static void main(String args[])
{
String s="2,a,3,e,4,l,1,w";
Scanner scan=new Scanner(s);
scan.useDelimiter(",");
while(scan.hasNext())//check for token
{
int n=scan.nextInt();
String a=scan.next();
for(int i=0;i<n;i++){
System.out.print(a);}

System.out.println();
}
}

}
