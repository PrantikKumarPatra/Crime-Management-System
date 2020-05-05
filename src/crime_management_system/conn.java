package crime_management_system;

import java.sql.*;

public class conn {
    public Connection c;
    public Statement s;
    
    public conn(){
    try{
        Class.forName("com.mysql.jdbc.driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/crimemanagement","root","");
        s=c.createStatement();
    }
    catch(Exception e){
        e.printStackTrace();
        
    }
}
    
}
