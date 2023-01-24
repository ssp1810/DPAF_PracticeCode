package practiceProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHREYA
 */
public class preStmtDemo {
    public static void main(String[] args) {
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app","app");
        String query = "select * from APP.customer where Customer_ID = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, 1);
        
        ResultSet rs = pstmt.executeQuery();
        while(rs.next())
        {
            System.out.println("===Customer ID: "+rs.getString("Name"));
        }
        
        con.close();
        pstmt.close();
    }
    catch(SQLException | ClassNotFoundException e){}
    }
    
}
