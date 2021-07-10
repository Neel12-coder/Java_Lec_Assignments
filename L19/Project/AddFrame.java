import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class AddFrame extends JFrame
{
JButton btnSave,btnBack;
JTextField txtEid,txtEname;
JLabel lblEid,lblEname;
Container c;
AddFrame()
{
c=getContentPane();
lblEid = new JLabel("Eid ");
lblEname = new JLabel("Ename ");
txtEid = new JTextField(15);
txtEname = new JTextField(15);
btnSave = new JButton("Save");
btnBack = new JButton("Back");
c.setLayout(new FlowLayout());
c.add(lblEid);
c.add(txtEid);
c.add(lblEname);
c.add(txtEname);
c.add(btnSave);
c.add(btnBack);

setSize(250,250);
setTitle("Add Emp");
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

ActionListener a1 =(ae) ->
{
int eid = Integer.parseInt(txtEid.getText());
String ename = txtEname.getText();
new DbHandler().addEmployee(eid,ename);
};
btnSave.addActionListener(a1);

ActionListener a2 = (ae) ->{
MainFrame m = new MainFrame();
dispose();
};
btnBack.addActionListener(a2);
}
}