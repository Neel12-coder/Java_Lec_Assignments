// wajp to create a file whose name is provided by the user.
import java.io.*;
import java.util.*;
class P2
{
public static void  main(String args[ ]) throws IOException
{
Console c= System.console();
String fname= c.readLine("Enter File name ");
File f = new File(fname);
if(f.exists())
{
 f.delete();
System.out.println(f +" delected");
}
else
{
System.out.println("YOU are tring To delete File THAT Does NOT ExisT");
}

}
}