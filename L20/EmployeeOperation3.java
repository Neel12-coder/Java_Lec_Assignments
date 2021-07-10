import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class EmployeeOperation3
{
public static void main(String args[])
{
Configuration cfg = new Configuration( );
cfg.configure("hibernate.cfg.xml");

SessionFactory factory = cfg.buildSessionFactory();

Session session = null;
Transaction t = null;
try{
session = factory.openSession();
System.out.println("session open");
t = session.beginTransaction();
Console c = System.console();
int eid = Integer.parseInt(c.readLine(" enter eid "));
Emp e = (Emp)session.get(Emp.class, eid);
if( e != null)
{
String ename = c.readLine(" enter new name ");
e.setEname(ename);
session.save(e);
t.commit();
System.out.println(" record updated ");
}
else
{
System.out.println(" emp does not exist ");
}
}
catch(Exception e1)
{
System.out.println(" issue " + e1);
t.rollback();
}
finally
{
session.close();
System.out.println(" session close ");
}
}
}