package connect;



import java.sql.*;
import java.awt.event.*;

public class DB {
    public static Connection con;
    
    public static Connection getConnection(){
        try{
            if(con==null){
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3305/CarProject","Roshani", "1235");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    return con;
}
}
