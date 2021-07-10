import java.util.*;
import java.text.*;
import java.io.*;
class PR
{
public static void main(String args[])
{
Console c= System.console();
String lang = c.readLine(" enter your choice en / fr / it / de ");
Locale lo = new Locale(lang);
ResourceBundle rb = ResourceBundle.getBundle("K1",lo);
Date d = new Date();
int h = d.getHours();
String msg;
if(h>=6 && h<12) msg= rb.getString("GM");
else if(h>=12 && h<17) msg= rb.getString("GA");
else msg= rb.getString("GE");
System.out.println(msg);
}
}
