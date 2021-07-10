import java.io.*;
class MakeFile{
public static void main(String args[])
{try{
File directory = new File("d");
directory.mkdir();

File file = new File(directory,"f");
if(!file.exists())
{
file.createNewFile();
}
}
catch(IOException e){ }
}
}