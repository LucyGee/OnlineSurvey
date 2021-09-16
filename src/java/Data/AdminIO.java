/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class AdminIO {
    public static int insert(Admin admin) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "survey"; 
        String dbUsername = "root"; 
        String dbPassword = "";
        String sql="INSERT INTO admindetails(FName, LName, Email, PhoneNo, Password) "
                                    + "VALUES(?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
         try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                
                st.setString(1, admin.getFname());
                st.setString(2, admin.getLname());
                st.setString(3, admin.getEmail()); 
                st.setString(4, admin.getPhoneNo());
                st.setString(5, admin.getPassword());

                return st.executeUpdate(); 
              }
         catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
    }
    
    public static Admin selectAdmin(String password, String email) throws ClassNotFoundException, SQLException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "survey"; 
        String dbUsername = "root"; 
        String dbPassword = "";  
        String query="SELECT * FROM admindetails \n" + "WHERE email =? && Password=?;";
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver");
       try (Connection con = DriverManager.getConnection(dbURL + dbName, 
                    dbUsername,
                    dbPassword); 
               PreparedStatement st = con.prepareStatement(query)) 
       {               
                st.setString(1, email);
                st.setString(2, password);
                rs = st.executeQuery();
                Admin admin=null;
                if(rs.next())
                {
                   admin=new Admin();
                   
                    admin.setFname(rs.getString("fName"));
                    admin.setLname(rs.getString("lName"));
                    admin.setPassword(rs.getString("password"));
                    admin.setEmail(rs.getString("email"));
                    admin.setPhoneNo(rs.getString("phoneNo"));



                    
                    con.close();
                    return admin;
                }
                else
                {
                    return null;
                }
                
    }

    
    }

    
}
