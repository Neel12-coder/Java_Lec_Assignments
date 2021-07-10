// wajp to find the age of user
import java.time.*;
import java.io.*;
import java.time.format.*;
import java.text.*;
class P3
{
public static void main(String args[])
{
Console c = System.console();
String s = c.readLine("Enter dob ------ dd/mm/yy  ");
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate dob = LocalDate.parse(s, dtf);
System.out.println(dob);
LocalDate now= LocalDate.now();
Period p = Period.between(dob , now);
System.out.println(p);
}
}
