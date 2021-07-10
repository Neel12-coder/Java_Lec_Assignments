import java.sql.*;
import java.io.*;

class PR1
{
public static void main(String args[])
{
Console c= System.console();
Connection con = null;        
while(true)
{
System.out.println("1. to add 2. to view 3. to exit");
int op= Integer.parseInt(c.readLine());
if( op==1)
{
try{
System.out.println("Loding the Driver...");
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
System.out.println("driver loaded ");

System.out.println(" trying to connect ");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
System.out.println("Connected..");

int eid = Integer.parseInt(c.readLine("Enter Employee id "));
String ename= c.readLine("Enter Employee name ");

String sql = "insert into emp values(?, ?)";
PreparedStatement pst = con.prepareStatement(sql);
pst.setInt(1, eid);
pst.setString(2, ename);
int result = pst.executeUpdate();
System.out.println(result + " Records inserted ");
pst.close();
}
catch(SQLException e)
{
System.out.println(" Issues "+ e);
}
finally
{
try{
System.out.println("Trying to close connection ..");
if (con != null)
con.close();
System.out.println("connection closed ");
}
catch(SQLException e)
{
System.out.println("Closing issues " + e);
}
}
}
else if(op==2)
{
try
{
System.out.println("Loding the Driver...");
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
System.out.println("driver loaded ");

System.out.println(" trying to connect ");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
System.out.println("Connected..");

Statement stmt = con.createStatement();
String sql ="select * from emp";
ResultSet rs = stmt.executeQuery(sql);
while(rs.next())
{
int eid = rs.getInt(1);
String ename = rs.getString(2);
System.out.println(" ename = "+ ename + " eid = "+eid);
}
rs.close();
stmt.close();
}
catch (SQLException e)
{
System.out.println("Issuess " +e);
}
finally
{
try{
System.out.println("Trying to close connection ..");
if (con != null)
con.close();
System.out.println("connection closed ");
}
catch(SQLException e)
{
System.out.println("Closing issues " + e);
}
}
}
else if(op==3)
{
break;
}
else
{
System.out.println("Invalid option ");
}
}
}
}