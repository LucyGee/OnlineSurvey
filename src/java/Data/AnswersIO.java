/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.Answers;
import Business.Surveys;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class AnswersIO {
    public static int insert(Answers answer) throws ClassNotFoundException
    {
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "survey"; 
        String dbUsername = "root"; 
        String dbPassword = "";
        String sql="INSERT INTO answers(sid, q1, a1, q2, a2,q3, a3, q4, a4,q5, a5) "
                                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
         try (Connection con = DriverManager.getConnection(dbURL + dbName, 
             dbUsername,dbPassword); 
            PreparedStatement st = con.prepareStatement(sql)) 
              {
                
                st.setString(1, answer.getSid());
                st.setString(2, answer.getQuestion1());
                st.setString(3, answer.getOption1()); 
                st.setString(4, answer.getQuestion2());
                st.setString(5, answer.getOption2());
                st.setString(6, answer.getQuestion3()); 
                st.setString(7, answer.getOption3());
                st.setString(8, answer.getQuestion4());
                st.setString(9, answer.getOption4()); 
                st.setString(10, answer.getQuestion5());
                st.setString(11, answer.getOption5());
               
                return st.executeUpdate(); 
              }
         catch(Exception e)
        {
            e.printStackTrace(); 
            return 0;
        }
}
}