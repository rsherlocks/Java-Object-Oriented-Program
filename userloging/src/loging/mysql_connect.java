
package loging;

import java.sql.Connection;
import java.sql.DriverManager;

public class mysql_connect {

    
   
public static Connection connectDB()    
{
    Connection conn=null;
try
{
Class.forName("com.mysql.jdbc.Driver");

conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?zeroDateTimeBehavior=", "root","");
System.out.print("Database is connected !");
//Statement stt = conn.createStatement();
return conn;
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
return null;
}     
}
}
