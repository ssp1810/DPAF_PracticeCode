/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceProj;

import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SHREYA
 */
public class Jp2 {
    //ResultSetMetaData is used to get information about result setn
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from APP.CUSTOMER");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("----"+rsmd.getColumnName(1));
            System.out.println("----"+rsmd.getColumnTypeName(1));
            System.out.println("----"+rsmd.getColumnCount());
            System.out.println("----"+rsmd.getScale(1));
            
            con.close();
            stmt.close();

        }
        catch(ClassNotFoundException | SQLException e){
        }
       
    }
    
}
