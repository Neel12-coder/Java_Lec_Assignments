package p1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class E1 extends JFrame
{
Container c;
JLabel lblNumber;
JTextField txtNumber;
JButton btnFind;
E1()
{
c= getContentPane();
FlowLayout f = new FlowLayout();
c.setLayout(f);
lblNumber = new JLabel("Enter number ");
txtNumber = new JTextField(10);
btnFind = new JButton("Find");

c.add(lblNumber);
c.add(txtNumber);
c.add(btnFind);

ActionListener a1 = (be) -> {
try{
String s = txtNumber.getText();
int number = Integer.parseInt(s);
String ans = "";
if(number % 2 ==0)  ans = "Even";
else                          ans= "Odd";
JOptionPane.showMessageDialog(c, ans);
}
catch(NumberFormatException nfe)
{
JOptionPane.showMessageDialog(c,"Wrong..... Enter Integer");
txtNumber.setText("");
txtNumber.requestFocus();
}
};
btnFind.addActionListener(a1);

setTitle(" Even Odd Finder");
setSize(280,200);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}
}

class E1Test
{
public static void main(String args[])
{
E1 e = new E1();
}}

