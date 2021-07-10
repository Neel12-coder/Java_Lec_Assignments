//JDBc-ODBC connection
import java.sql.*;
class DBM1
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println(" Driver loaded...");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
System.out.println("Connection done . ");
System.out.println(" Connection closed..");
con.close();
}
catch(SQLException e)
{
System.out.println(" Issue ..."+e);
}
catch(ClassNotFoundException e1)
{
System.out.println(" Issue ..."+e1);
}
}
}