/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.Admin;
import Business.Surveys;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SurveysIO {
    public static int insert(Surveys survey) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "survey"; 
        String dbUsername = "root"; 
        String dbPassword = "";
        String sql="INSERT INTO survey(sname, q1, option1a, option1b, q2, option2a, option2b,q3, option3a, option3b,q4, option4a, option4b,q5, option5a, option5b) "
                                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
         try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                
                st.setString(1, survey.getSname());
                st.setString(2, survey.getQuestion1());
                st.setString(3, survey.getOption1a()); 
                st.setString(4, survey.getOption1b());
                st.setString(5, survey.getQuestion2());
                st.setString(6, survey.getOption2a()); 
                st.setString(7, survey.getOption2b());
                st.setString(8, survey.getQuestion3());
                st.setString(9, survey.getOption3a()); 
                st.setString(10, survey.getOption3b());
                st.setString(11, survey.getQuestion4());
                st.setString(12, survey.getOption4a()); 
                st.setString(13, survey.getOption4b());
                st.setString(14, survey.getQuestion5());
                st.setString(15, survey.getOption5a()); 
                st.setString(16, survey.getOption5b());

                return st.executeUpdate(); 
              }
         catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
    }
}