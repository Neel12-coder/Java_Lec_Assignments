// to find a grade 1)m>=70 distinction 2)m>=60 fc 3)m>=50 sc 4)m>=40 pass else fail.
class P2
{
public static void main(String args[])
{
int m=Integer.parseInt(args[0]);
if (m<=0 || m>100)
System.out.println("Please check marks");
else
{
if (m>=70)
System.out.println("DISTINCTION");
else if(m>=60)
System.out.println("FIRST CLASS");
else if(m>=50)
System.out.println("SECOND CLASS");
else
System.out.println("PASS");
}
}
}