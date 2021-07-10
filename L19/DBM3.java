// JDBC - net pure java
import java.sql.*;
class DBM3
{
public static void main(String args[])
{
try{
System.getProperty("jdbc.drivers");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
System.out.println("Connection done ..");
con.close();
}
catch(SQLException e)
{
System.out.println(" Issue ..."+e);
}
}
}