package bank.managment.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        //jdbc connection;
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Anuj@1023");
            statement=connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
