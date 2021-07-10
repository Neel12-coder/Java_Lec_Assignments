//wap to read from user 3 letters of month and return number of days.
class P4
{
public static void main(String args[])
{
String mon=args[0];
int a=switch (mon){   //switch ke baad space hona jaruri hai.....
case "jan","mar","may" ,"jul" ,"aug" ,"oct","dec" -> 31;
case "apr","jun","sep","nov"-> 30;
case "feb"-> 28;
default -> 0;  //default statement is comp in java 12......
};
if(a!=0)
System.out.println("NUMBER OF DAYS IN "+mon+" are "+a);
else
System.out.println("INVALID MONTHH");
}
}