// JDBC. Native API
import java.sql.*;
class DBM2
{
public static void main(String args[])
{
try
{
System.setProperty("jdbc.drivers","oracle.jdbc.driver.OracleDriver");
System.getProperty("jdbc.drivers");
System.out.println("Drivers Loaded ");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
System.out.println("Connection Done ");
conn.close();
}
catch(SQLException e)
{
System.out.println(" Issue ..."+e);
}
}
}