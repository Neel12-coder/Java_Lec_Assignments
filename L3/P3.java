//WAP to read rating and give feedback 5&4 excellent 3&2 Good 1 Poor
class P3
{
public static void main(String args[])
{
int rating=Integer.parseInt(args[0]);
if (rating<0 || rating>5)
System.out.println("Invalid");
else
{
String val = switch(rating){
case 5,4 -> "EXCELLENT";
case 2,3 -> "GOOD";
case 1 -> "POOR";
default -> "InVALID";
};
System.out.println("Your rating is "+val);
}
}
}