// wajp to create a file whose name is provided by the user.
import java.io.*;
import java.util.*;
class P1
{
public static void  main(String args[ ]) throws IOException
{
Console c= System.console();
String fname= c.readLine("Enter File name ");
File f = new File(fname);
if(! f.exists())
{
f.createNewFile();
System.out.println(fname+" created");
}
else
{
System.out.println(" Already Exist ");
}

}
}