// 100% pure jdbc
import java.sql.*;
class DBM4
{
public static void main(String args[])
{
try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
System.out.println("Connection done ....");
con.close();
}
catch(SQLException e)
{
System.out.println(" Issue ..."+e);
}
}
}