import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddFrame extends JFrame
{
JTextField txtEid,txtEname;
JButton btnSave,btnBack;
JLabel lblEid,lblEname;
Container c;

AddFrame()
{
c = getContentPane();
c.setLayout(new FlowLayout());
lblEid = new JLabel("Eid ");
lblEname = new JLabel("Ename");
txtEid= new JTextField(10);
txtEname =new JTextField(10);
btnSave = new JButton("Save");
btnBack = new JButton("Back");
c.add(lblEid);
c.add(txtEid);
c.add(lblEname);
c.add(txtEname);
c.add(btnSave);
c.add(btnBack);

ActionListener a1 =(ae) ->
{

DbHandler b = new DbHandler();
Emp e = new Emp();
int eid=Integer.parseInt(txtEid.getText());
e.setEid(eid);
String ename =txtEname.getText();
e.setEname(ename);
b.AddEmployee(e);
};
btnSave.addActionListener(a1);

ActionListener a2 = (ae) ->
{
MainFrame v = new MainFrame();
this.dispose();
};
btnBack.addActionListener(a2);

setTitle("Add S");
setSize(280,280);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}}