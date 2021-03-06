import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.hibernate.*;
import org.hibernate.cfg.*;


class MainFrame extends JFrame
{
JButton btnAdd,btnView;
Container c;

MainFrame()
{
JButton btnAdd = new JButton("ADD");
JButton btnView = new JButton("VIEW");
c= getContentPane();
c.setLayout(new FlowLayout());
c.add(btnAdd);
c.add(btnView);

ActionListener a1 = (ae) ->
{
AddFrame f = new AddFrame();
this.dispose();
};
btnAdd.addActionListener(a1);

ActionListener a2 = (ae) ->
{
ViewFrame v = new ViewFrame();
this.dispose();
};
btnView.addActionListener(a2);

setTitle(" E.M.S");
setSize(250,250);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String args[])
{
MainFrame m = new MainFrame();
}
}

class DbHandler
{
public void AddEmployee(Emp e)
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
session.save(e);
t.commit();
JOptionPane.showMessageDialog(new JDialog(),"record inserted");
}
catch(Exception e1)
{
System.out.println(" issue " + e1);
t.rollback();
}
finally
{
session.close();
System.out.println(" session close");
}
}

public String ViewEmployee()
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
StringBuffer sb = new StringBuffer();

SessionFactory factory = cfg.buildSessionFactory();
Session session = null;
try{
session = factory.openSession();
System.out.println(" session open");
java.util.List<Emp> e = new java.util.ArrayList<>();
e = session.createQuery("from Emp").list();
for(Emp m : e){
System.out.println(m.getEid() + " " +m.getEname());
sb.append(m.getEid() + " " +m.getEname()+"\n");
}
}
catch(Exception e1)
{
System.out.println("issue "+ e1);
}
finally
{
session.close();
System.out.println("session close");
}
return sb.toString();
}
}