// wajp to write data into the file
import java.io.*;
import java.util.*;
class P4
{
public static void main(String args[])
{
Console c= System.console();
String filenme= c.readLine("Enter Filename from where to read ");
File f= new File(filenme);
if(f.exists())
{
   try(FileReader fr= new FileReader(f);    //Automatic Resourse management  
     BufferedReader br = new BufferedReader(fr);){
    String line =br.readLine();
     while(line != null){
    System.out.println(line);
    line = br.readLine();}
     }
    catch(IOException e){ }
    // pw.close();
}
else
{
System.out.println(" File Does not Exist!!");
}
}
}