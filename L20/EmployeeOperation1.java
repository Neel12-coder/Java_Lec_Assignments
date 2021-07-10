import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class EmployeeOperation1
{
public static void main(String args[])
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory factory = cfg.buildSessionFactory();

Session session = null;
Transaction t = null;
try{
session = factory.openSession();
System.out.println("session open");
t = session.beginTransaction();
Console c = System.console();
int eid = Integer.parseInt(c.readLine("enter eid "));
String ename = c.readLine(" enter ename ");
Emp e = new Emp();
e.setEid(eid);
e.setEname(ename);
session.save(e);
t.commit();
System.out.println(" record inserted ");
}
catch(Exception e)
{
System.out.println(" issue " + e);
t.rollback();
}
finally
{
session.close();
System.out.println(" session close");
}
}
}