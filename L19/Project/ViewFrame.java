import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ViewFrame extends JFrame
{
Container c;
JButton btnBack;
TextArea taData;

ViewFrame()
{
c=getContentPane();
c.setLayout(new FlowLayout());
taData = new TextArea(5,30);
btnBack = new JButton("Back ");
c.add(taData);
c.add(btnBack);
String data= new DbHandler().viewEmployee();
taData.setText(data);

setSize(280,280);
setLocationRelativeTo(null);

ActionListener a1=(ae) ->
{
MainFrame b = new MainFrame();
dispose();
};
btnBack.addActionListener(a1);

setTitle("View Emp");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
} 
}