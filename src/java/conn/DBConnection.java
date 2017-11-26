/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Amneet kaur
 */
public class DBConnection {
    public static Connection dbconnect()
    {
        Connection con=null;
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Load driver
             con=DriverManager.getConnection("jdbc:odbc:db1","sa","sql123");
        }catch(Exception e)
        {
            System.out.println("exception in dbconnect of dbconnection" +e);
        }
        return con;
    }
}
