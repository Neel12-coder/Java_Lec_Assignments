// wajp to write data into the file
import java.io.*;
import java.util.*;
class P3
{
public static void main(String args[])
{
Console c= System.console();
String filenme= c.readLine("Enter Filename ");
File f= new File(filenme);
if(f.exists())
{
   try(FileWriter fw= new FileWriter(f);    //Automatic Resourse management  
     PrintWriter pw = new PrintWriter(fw);){
     String h= c.readLine("Enter data to write  ");
      pw.println(h);}
    catch(IOException e){ }
    // pw.close();
}
else
{
System.out.println(" File Does not Exist!!");
}
}
}