import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MainFrame extends JFrame
{
JButton btnView ,btnAdd;
Container c;
MainFrame()
{
c=getContentPane();
c.setLayout(new FlowLayout());
setTitle("Emp Mgt");
btnView = new JButton("View");
btnAdd= new JButton("Add");
c.add(btnView);
c.add(btnAdd);
setSize(200,200);

ActionListener a1 = (ae) ->{
AddFrame a = new AddFrame();
dispose();
};
btnAdd.addActionListener(a1);

ActionListener a2 = (ae) ->
{
ViewFrame b = new ViewFrame();
dispose();
};
btnView.addActionListener(a2);

setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}              //end of const
public static void main(String args[])
{
MainFrame m = new MainFrame();
}             // end of Main()
}            // end of MainFrame
class DbHandler
{
public void addEmployee(int eid , String ename)
{
Connection conn= null;
try{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
String sql = "insert into emp values(?,?)";
PreparedStatement pstm =conn.prepareStatement(sql);
pstm.setInt(1,eid);
pstm.setString(2,ename);
int result = pstm.executeUpdate();
JOptionPane.showMessageDialog(new JDialog(), result +" added");
pstm.close();
}
catch(SQLException e)
{
JOptionPane.showMessageDialog(new JDialog(), "issues : "+ e);
}
finally{
try{
if ( conn != null)
conn.close();
}
catch(SQLException e)
{
JOptionPane.showMessageDialog(new JDialog(), "issues : "+ e);
}
} // fianlly ka close...
} // meth add employee ka close...

public String viewEmployee()
{
Connection conn= null;
StringBuffer sb = new StringBuffer();   // ImP
try{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
Statement stm = conn.createStatement();
String sql = "select * from emp";
ResultSet rs = stm.executeQuery(sql);
while(rs.next())
{
int eid = rs.getInt(1);
String ename = rs.getString(2);
sb.append(" eid = "+eid +" ename= " +ename);
}
rs.close();
stm.close();
}
catch(SQLException e)
{
JOptionPane.showMessageDialog(new JDialog(), "issues : "+ e);
}
finally{
try{
if ( conn != null)
conn.close();
}
catch(SQLException e)
{
JOptionPane.showMessageDialog(new JDialog(), "issues : "+ e);
}
} // fianlly ka close...
return sb.toString();
}
}
