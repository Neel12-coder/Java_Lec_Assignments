import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class EmployeeOperation4
{
public static void main(String args[])
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory factory = cfg.buildSessionFactory();

Session session = null;
Transaction t = null;
try
{
session = factory.openSession();
System.out.println(" session open ");
t = session.beginTransaction();
Console c = System.console();
int eid = Integer.parseInt(c.readLine(" enter eid "));
Emp e = (Emp)session.get(Emp.class , eid);
if( e != null)
{
session.delete(e);
t.commit();
System.out.println("Record deleted ");
}
else
{
System.out.println(" emp does not exists ");
} 
}
catch(Exception e)
{
System.out.println("issue " + e);
t.rollback();
}
finally
{
session.close();
System.out.println(" session close ");
}
}
}