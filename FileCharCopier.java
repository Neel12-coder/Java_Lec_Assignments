import java.io.*;
public class FileCharCopier
{
public static void main(String args[]) throws IOException
{
File in= new File("USER");
FileReader fr = new FileReader(in);

File op = new File("Out");
FileWriter fw= new FileWriter(op);
int c;
while((c=fr.read())!=-1)
fw.write(c);
fr.close();
fw.close();
}
}