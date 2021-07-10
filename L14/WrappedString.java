import java.util.*;
public class WrappedString{
private String s;
public WrappedString(String s){ this.s= s;}
public static void main(String args[])
{
HashSet<Object> hs= new HashSet<>();
WrappedString ws1= new WrappedString("aa");
WrappedString ws2= new WrappedString("aa");
String s1=new String("aa");
String s2=new String("aa");

hs.add(ws1);
hs.add(ws2);
hs.add(s1);
hs.add(s2);

System.out.println(hs.size());

}
}