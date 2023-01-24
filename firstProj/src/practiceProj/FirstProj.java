/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SHREYA
 */
public class FirstProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");    //url for driver class
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");   //database url
            System.out.println("Connection is established");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from APP.CUSTOMER");
            
            while(rs.next())
            {
                System.out.println("===Customer Name: "+rs.getString("Name")+" City: "+rs.getString("City")+" State: "+rs.getString("State"));
            }
            stmt.close();
            con.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }
    
}
