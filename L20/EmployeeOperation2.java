import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

class EmployeeOperation2
{
public static void main(String args[])
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory factory = cfg.buildSessionFactory();
Session session = null;
try{
session = factory.openSession();
System.out.println(" session open");
List<Emp> e = new ArrayList<>();
e = session.createQuery("from Emp").list();
for(Emp m : e)
System.out.println(m.getEid() + " " +m.getEname());
}
catch(Exception e)
{
System.out.println("issue "+ e);
}
finally
{
session.close();
System.out.println("session close");
}
}
}
