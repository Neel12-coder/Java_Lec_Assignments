// wajp to wish the user GM / GA / GE depending on the system time.
import java.text.*;
import java.util.*;
class P1
{
public static void main(String args[])
{
Date dt = new Date();
int h= dt.getHours();
String msg;
if(h>=6 && h<12)
msg = "Good morning";
else if(h>=12 && h<17)
msg = "Good afternoon";
else
msg = "Good evening";
System.out.println(msg);


}
}